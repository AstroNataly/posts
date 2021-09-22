package ru.netology

interface Attachment {
    val type: String
    val audio: Audio
    val photo: Photo
    val video: Video
    val doc: Doc
    val link: Link
}