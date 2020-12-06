import com.forthreal.application.classes.QueueNode
import com.forthreal.application.classes.SimpleQueue
import com.forthreal.exceptions.QueueIsEmptyException

fun main(args: Array<String>)
{
    val queue = SimpleQueue()

    queue.enqueue( QueueNode(1) )
    queue.enqueue( QueueNode(2) )
    queue.enqueue( QueueNode(3) )
    queue.enqueue( QueueNode(4) )
    queue.enqueue( QueueNode(5) )
    queue.enqueue( QueueNode(6) )
    queue.enqueue( QueueNode(7) )

    println( "size = ${queue.size()}" )
    while ( queue.size() > 0 )
    {
        queue.dequeue().printVal()
    }

    try {
        queue.dequeue()
    }
    catch (exc: QueueIsEmptyException)
    {
        println("${exc.message}")
    }
}