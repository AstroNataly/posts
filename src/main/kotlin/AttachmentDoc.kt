package ru.netology

class AttachmentDoc (
    override val type: String = "doc",
    val doc: Doc
) : Attachment