package com.forthreal.application.classes

import com.forthreal.exceptions.QueueIsEmptyException
import javax.xml.ws.Holder

class SimpleQueue : ISimpleQueue
{
    val elem: Holder<QueueNode> = Holder()
    val last: Holder<QueueNode> = Holder()
    val currentSize: Holder<Long> = Holder()

    constructor()
    {
        currentSize.value = 0
    }

    override fun dequeue(): QueueNode
    {
        if( elem.value == null )
        {
            throw QueueIsEmptyException()
        }

        val toReturn = elem.value

        if( elem.value.nextIsNull() )
        {
            elem.value = null
        }
        else
        {
            elem.value = elem.value.getNext()
        }

        currentSize.value--

        return toReturn
    }

    override fun enqueue(node: QueueNode)
    {
        if( elem.value == null )
        {
            elem.value = node
        }
        else
        {
            last.value.setNext( node )
        }

        last.value = node
        node.setNext( null )

        currentSize.value++
    }

    override fun size(): Long = currentSize.value
}