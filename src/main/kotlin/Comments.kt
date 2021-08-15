package ru.netology

data class Comments (
    val count: Int = 1,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)