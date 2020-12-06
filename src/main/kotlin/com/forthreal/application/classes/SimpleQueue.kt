package com.forthreal.application.classes

import com.forthreal.exceptions.QueueIsEmptyException
import javax.xml.ws.Holder

class SimpleQueue : ISimpleQueue
{
    val next: Holder<QueueNode> = Holder()
    val currentSize: Holder<Long> = Holder()

    constructor()
    {
        currentSize.value = 0
    }

    override fun dequeue(): QueueNode
    {
        if( next.value == null )
        {
            throw QueueIsEmptyException()
        }

        val toReturn = next.value

        if( next.value.prevIsNull() )
        {
            next.value = null
        }
        else
        {
            next.value = next.value.getPrev()
        }

        currentSize.value--

        return toReturn
    }

    override fun enqueue(node: QueueNode)
    {
        if( next.value == null )
        {
            next.value = node
            node.setPrev( null )
        }
        else
        {
            node.setPrev( next.value )
            next.value = node
        }

        currentSize.value++
    }

    override fun size(): Long = currentSize.value
}