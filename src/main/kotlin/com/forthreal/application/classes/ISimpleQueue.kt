package com.forthreal.application.classes

interface ISimpleQueue
{
    abstract fun dequeue() : QueueNode

    abstract fun enqueue(node: QueueNode)

    abstract fun size() : Long
}