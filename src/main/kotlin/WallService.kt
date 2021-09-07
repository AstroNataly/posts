package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        for ((index, post) in posts.withIndex()) {
            if (posts.isNotEmpty()) {
                posts[index] = post.copy(id = post.id + 1)
            } else 0
        }
        return posts.last()
    }

    fun updatingAnOldPost(post: Post): Boolean {
        for ((index, newPost) in posts.withIndex()) {
            if (newPost.id == post.id) {
                posts[index] = post.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }



}