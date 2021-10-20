package ru.netology

data class Comment (
    val id: Int,
    val fromId: Int,
    val date: Int = 1628000467,
    val textComment: String = "That was great!",
    val donut: Donut = Donut(),
    val replyToUser: Int = 1,
    val replyToComment: Int = 1,
    var attachments: Array<Attachment> = emptyArray(),
    var parentsStack: Array<Int> = emptyArray(),
    val thread: Thread = Thread()

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (textComment != other.textComment) return false
        if (donut != other.donut) return false
        if (replyToUser != other.replyToUser) return false
        if (replyToComment != other.replyToComment) return false
        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + fromId
        result = 31 * result + date
        result = 31 * result + textComment.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + replyToUser
        result = 31 * result + replyToComment
        result = 31 * result + attachments.contentHashCode()
        return result
    }
}