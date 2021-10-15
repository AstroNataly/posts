package ru.netology

class AttachmentPhoto (
    val photo: Photo
) : Attachment {
    override val type: String = "photo"
}