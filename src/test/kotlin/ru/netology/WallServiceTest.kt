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
    }
}