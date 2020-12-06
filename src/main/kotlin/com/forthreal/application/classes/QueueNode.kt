package com.forthreal.application.classes

import javax.xml.ws.Holder

class QueueNode
{
    val myNumber: Long
    val next: Holder<QueueNode?> = Holder()

    constructor(number: Long)
    {
        myNumber = number
    }

    fun setNext(nextNode: QueueNode?)
    {
        next.value = nextNode
    }

    fun nextIsNull() = next.value == null

    fun getNext() = next.value

    fun printVal()
    {
        println("${myNumber}")
    }
}