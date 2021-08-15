package ru.netology

data class Likes (
    val count: Int = 10,
    val userLikes: Boolean = true,
    val canLikes: Boolean = true,
    val canPublish: Boolean = true
)