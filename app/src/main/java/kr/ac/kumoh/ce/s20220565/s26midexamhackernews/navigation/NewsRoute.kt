package kr.ac.kumoh.ce.s20220565.s26midexamhackernews.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface NewsRoute : NavKey {
    @Serializable
    data object TopNews : NewsRoute

    @Serializable
    data class NewsComment(
    val text: String,
    val kids: List<Long>
    ) : NewsRoute
}