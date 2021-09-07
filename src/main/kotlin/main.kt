package ru.netology

fun main() {

    val originalPost = Post(id = 11)

    println(originalPost)

    val nextPost = WallService.add(originalPost)
    println(nextPost)

    val newtPost = WallService.updatingAnOldPost(nextPost)
    println(newtPost)


}


