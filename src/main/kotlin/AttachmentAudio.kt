package ru.netology

class AttachmentAudio (
    val audio: Audio
) : Attachment {
    override val type: String = "audio"
}
