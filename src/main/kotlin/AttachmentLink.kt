package ru.netology

class AttachmentLink (
    override val type: String = "link",
    val link: Link
) : Attachment