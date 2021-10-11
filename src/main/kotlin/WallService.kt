package ru.netology

object WallService {

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val newPost = post.copy(id = post.id + 1)
        posts += newPost
        return posts.last()
    }

    fun updatingAnOldPost(post: Post): Boolean {
        for ((index, newPost) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }


}