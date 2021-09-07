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
}