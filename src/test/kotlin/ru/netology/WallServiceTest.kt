package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_showAddingNewPost() {
        val service = WallService

        val result = service.add(Post(12))

        assertEquals(result, Post(13))
    }

    @Test
    fun updatingAnOldPost() {
        val service = WallService
        service.add(Post(12))
        service.add(Post(13))
        service.add(Post(14))
        val update = Post(13, 23, 56, 698, 162000467)

        val result = service.updatingAnOldPost(update)

        assertTrue(result)
    }

    @Test
    fun updatingFalse() {
        val service = WallService
        service.add(Post(12))
        service.add(Post(13))
        service.add(Post(14))
        val update = Post(9, 23, 56, 698, 162000467)

        val result = service.updatingAnOldPost(update)

        assertFalse(result)
    }
}