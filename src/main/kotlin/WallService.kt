package ru.netology

object WallService {


    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val newPost = post.copy(id = post.id + 1)
        posts += newPost
        return posts.last()
    }

    fun updatingAnOldPost(post: Post): Boolean {
        for ((index, newPost) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }
    private var attachments = emptyArray<Attachment>()

    fun addAttachments(attachment: Attachment) : Attachment {
        if (attachment !is AttachmentDoc || attachment !is AttachmentPhoto || attachment !is AttachmentAudio ||
            attachment !is AttachmentVideo || attachment !is AttachmentLink) {
            TODO()
        }
        val attachmentDoc = attachment.doc
        val attachmentLink = attachment.link
        val attachmentVideo = attachment.video
        val attachmentAudio = attachment.audio
        val attachmentPhoto = attachment.photo

        attachments += attachment
        return attachments.last()

    }



}