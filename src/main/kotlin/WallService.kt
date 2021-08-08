package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Int {
        posts += post
        return if (posts.isNotEmpty()) posts.last().id + 1 else 0 // возвращает только ID, всех остальных полей нет!!!

    }

    fun update(post: Post): Boolean {
       //return if (posts.contains(Post(id = 11))) true else false // содержит пост
        TODO()

    }
}