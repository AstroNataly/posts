package ru.netology

data class Post(
    val id: Int,
    val ownerId: Int = 23,
    val fromId: Int = 56,
    val createdBy: Int = 698,
    val date: Int = 1628000467,
    val text: String = "Офигенный отдых на море",
    val replyOwnerId: Int = 89,
    val replyPostId: Int = 91,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String = "post",
    val signerId: Int = 21,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut = Donut(),
    val postponedId: Int = 96873

)