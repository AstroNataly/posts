package ru.netology

class AttachmentDoc (
    val doc: Doc
) : Attachment {
    override val type: String = "doc"
}