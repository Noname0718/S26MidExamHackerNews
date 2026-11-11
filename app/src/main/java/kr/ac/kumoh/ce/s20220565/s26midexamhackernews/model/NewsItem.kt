package kr.ac.kumoh.ce.s20220565.s26midexamhackernews.model

data class NewsItem(
    val id: Long,
    val type: String,
    val by: String,
    val time: Long,
    val kids: List<Long> = emptyList(),

    val title: String = "",
    val url: String = "",
    val score: Int = 0,
    val descendants : Int = 0,

    val text: String = "",
)