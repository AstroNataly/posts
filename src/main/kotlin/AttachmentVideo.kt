package ru.netology

class AttachmentVideo(
    val video: Video
) : Attachment {
    override val type: String = "video"
}