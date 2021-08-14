

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        for ((index, post) in posts.withIndex()) {
            if (posts.isNotEmpty()) {
                posts[index] = post.copy(id = post.id + 1)
            } else 0
        }
        return posts.last()
    }

    fun updatingAnOldPost(post: Post): Post {
        for ((index, post) in posts.withIndex()) {
            if (post.id == post.id) {
                posts[index] = post.copy(
                    id = post.id + 1,
                    ownerId = post.ownerId,
                    fromId = post.fromId + 1,
                    createdBy = post.createdBy + 1,
                    date = post.date,
                    text = post.text + "Еще!",
                    replyOwnerId = post.replyOwnerId + 1,
                    replyPostId = post.replyPostId + 1,
                    friendsOnly = false,
                    comments = Comments(17, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
                    copyright = Copyright(5689, "hhhj", "oooooo", "OOOO"),
                    likes = Likes(6987, true, canLikes = true, canPublish = true),
                    reposts = Reposts(count = 1, true),
                    views = Views(25),
                    postType = post.postType + "new",
                    signerId = post.signerId + 1,
                    canPin = false,
                    canDelete = false,
                    canEdit = false,
                    isPinned = false,
                    markedAsAds = true,
                    isFavorite = false,
                    donut = Donut(false, 124, Placeholder("g"), false, "opkj" + "k"),
                    postponedId = post.postponedId + 1
                )

            } else {
                post
            }
        }
        return posts.last()
    }





}