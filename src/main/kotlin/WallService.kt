package ru.netology

object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

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

    fun createComment(comment: Comment): Boolean {
        for ((index, newPost) in posts.withIndex()) {
            if (comment.fromId == newPost.id) {
                comments += comments
                return true
            }
            throw PostNotFoundException("no post found to comment with id ${comment.fromId}")
        }
        return false
    }


}