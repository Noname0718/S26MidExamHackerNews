package kr.ac.kumoh.ce.s20220565.s26midexamhackernews.repository

import kr.ac.kumoh.ce.s20220565.s26midexamhackernews.model.NewsItem

interface NewsRepository {
    suspend fun getTopStories(limit: Int): List<NewsItem>
    suspend fun getComments(kids: List<Long>): List<NewsItem>?
}
