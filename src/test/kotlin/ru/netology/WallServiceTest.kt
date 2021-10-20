package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_showAddingNewPost() {
        val service = WallService

        val result = service.add(Post(11))

        assertEquals(result, Post(12))
    }

    @Test
    fun updatingAnOldPost() {
        val service = WallService
        service.add(Post(123))
        service.add(Post(489))
        service.add(Post(1896))
        val update = Post(124, 23, 57)

        val result = service.updatingAnOldPost(update)

        assertTrue(result)
    }

    @Test
    fun updatingFalse() {
        val service = WallService
        service.add(Post(112))
        service.add(Post(131))
        service.add(Post(154))
        val update = Post(1)

        val result = service.updatingAnOldPost(update)

        assertFalse(result)
    }

    @Test (expected = PostNotFoundException::class)
    fun createComment() {
        val service = WallService
        //service.createComment(Comment(112, 12))
        //service.createComment(Comment(131, 11))
        service.add(Post(11))
        service.add(Post(12))
        val create = Comment(120, 11)

        val result = service.createComment(create)

        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouIdTrow(){
        val service = WallService
        //service.createComment(Comment(112, 12))
        //service.createComment(Comment(131, 11))
        service.add(Post(11))
        service.add(Post(12))
        val create = Comment(120, 110)

        val result = service.createComment(create)

        assertFalse(result)
    }
}