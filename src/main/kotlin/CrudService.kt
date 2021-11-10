package ru.netology

abstract class CrudService<E> {
    private val elements = mutableListOf<E>()

    fun add(elem: E): E {
        elements += elem
        return elements.last()
    }

    fun update(elem: E): E {

    }

    fun delete(elem: E): E{
        
    }

}