package ru.netology

class AttachmentAudio (
    override val type: String = "audio",
    val audio: Audio
) : Attachment
