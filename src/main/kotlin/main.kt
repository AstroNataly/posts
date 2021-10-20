package ru.netology

fun main() {

    val originalPost = Post(id = 11)

    println(originalPost)

    val nextPost = WallService.add(originalPost)
    println(nextPost)

    val newtPost = WallService.updatingAnOldPost(nextPost)
    println(newtPost)

    val comment = Comment(110, 12)
    println(comment)

    val commentCreate = WallService.createComment(comment)
    println(commentCreate)


}


