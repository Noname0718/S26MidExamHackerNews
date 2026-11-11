package kr.ac.kumoh.ce.s20220565.s26midexamhackernews.repository

import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Path

interface NewsApi {
    /**
     * 현재 가장 인기 있는 스토리(Top Stories)의 ID 리스트
     * 반환 값 예시: [50242870, 50215997, ...]
     */
    @GET("topstories.json")
    suspend fun getTopStoryIds(): List<Long>

    /**
     * 특정 ID를 가진 아이템(Story 또는 Comment)의 상세 정보
     * @param id 글 또는 댓글의 고유 ID
     */
    @GET("item/{id}.json")
    suspend fun getItemDetail(
        @Path("id") id: Long
    ): HackerNewsDto
}

@Serializable
data class HackerNewsDto(
    val id: Long,
    val type: String,
    val by: String? = null,
    val time: Long,
    val kids: List<Long> = emptyList(),
    val title: String? = null,
    val url: String? = null,
    val score: Int = 0,
    val descendants: Int = 0,
    val text: String? = null,
    val deleted: Boolean = false,
    val dead: Boolean = false
)