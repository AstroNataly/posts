package ru.netology

class AttachmentVideo (
    override val type: String = "video",
    val video: Video
) : Attachment