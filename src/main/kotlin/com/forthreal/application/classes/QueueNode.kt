package com.forthreal.application.classes

import javax.xml.ws.Holder

class QueueNode
{
    val myNumber: Long
    val prev: Holder<QueueNode?> = Holder()

    constructor(number: Long)
    {
        myNumber = number
    }

    fun setPrev(prevNode: QueueNode?)
    {
        prev.value = prevNode
    }

    fun prevIsNull() = prev.value == null

    fun getPrev() = prev.value

    fun printVal()
    {
        println("${myNumber}")
    }
}