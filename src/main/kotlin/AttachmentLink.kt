package ru.netology

class AttachmentLink (
    val link: Link
) : Attachment {
    override val type: String = "link"
}