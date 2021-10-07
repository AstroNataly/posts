package ru.netology

class AttachmentPhoto (
    override val type: String = "photo",
    val photo: Photo
) : Attachment