# SimpleQueue

A simple queue (not based on the Iterative interface) that has enqueue() and dequeue() methods.
There's a simple exception thrown when the queue is empty

Outputs:
When main() is run, outputs:
```
size = 7
1
2
3
4
5
6
7
Queue is empty
```
Pay attention that the queue in this example was topped up exactly in the same order, meaning that the FIFO principle of the Queue is assured.

The principle here is simple:
1) An element in the Queue is a Node
2) The Node always points at the next one or at null if there's no next Node
3) The Queue holds the reference to the first Node (from which the chain of Nodes is accessible through the pointers to the next) and to the last Node
4) The reference to the last Node is used to add new Nodes
5) When a Node is dequeued from the Queue, the first element is replaced by the next Node at which the former was pointing