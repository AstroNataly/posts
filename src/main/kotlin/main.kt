package ru.netology

fun main() {
    /*val originalComments = Comments(count = 1, canPost = true, groupsCanPost = false, canClose = false, canOpen = false)
    val originalCopyright = Copyright(256987, "https://flags.com", "Ivan", "A")
    val originLikes = Likes(count = 10, userLikes = true, canLikes = true, canPublish = true)
    val originReposts = Reposts(1, true)
    val originViews = Views(17)

    val originDonut = Donut(
        isDonut = false,
        paidDuration = 2629743,
        placeholder = Placeholder(),
        canPublishFreeCopy = true,
        editMode = "all"
    )*/

    val originalPost = Post(id = 11)

    println(originalPost)

    val nextPost = WallService.add(originalPost.copy())
    println(nextPost)

    val newtPost = WallService.updatingAnOldPost(nextPost)
    println(newtPost)

}


