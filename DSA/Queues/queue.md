# queue:

-a linear structure which follows a particular order in which operations are performed

-First In First Out order

-difference between stack and queue is in removing (stacks: item added recently removed first; queue: item added first removed first)

-used in breadth first search

![image-20210514200758364](C:\Users\ishit\AppData\Roaming\Typora\typora-user-images\image-20210514200758364.png)

### -operations:

1. enqueue - adds item to the end; if queue full then 'overflow condition'
2. dequeue - removes item from the front; items popped in the same order in which they are pushed; if queue empty then 'underflow condition'
3. front - get front item from queue
4. rear - get last item from queue

### array implementation of queue:

-keep track of two indices: front and rear

-enqueue(add) an item at the rear

-dequeue(remove) an item from the front

#####  >isFull

looks if the size of the queue at present is equal to the total capacity of the queue when initialized

queue.size = queue.capacity

##### >isEmpty

looks if the size of the queue is zero

queue.size == 0;

#####  >enqueue

we are adding an item to the rear of the queue

-first check if the queue is full
-if full then return 
-if not full: increase the size
-then at that index add the item
-then put the rear pointer at that index

```java
class Queue {
    int front, rear, size;
    int capacity;
    int array[];//act as a queue
    
    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    
    //isFull when size of the queue is equal to capacity
    boolean isFull(Queue queue) {
        return(queue.size == queue.capacity);
    }
    
    //isEmpty when size is zero
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }
    
    //enqueue when adding an item to the end of the queue
    void enqueue(int item) {
        if(isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }
    
    //dequeue when removing an item from the front of queue
    void dequeue() {
        if(isEmpty(this))
            return;
        int item =  this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println(item + " dequeued out of queue");
    }
    
    //front when want the front item of the queue
    int front() {
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        
        return this.array[this.front];
    }
    
    //rear when want the rear item of the queue
    int rear() {
        if(isFull(this))
            return Integer.MIN_VALUE;
        
        return this.array[this.rear];
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        
        queue.dequeu();
        
        System.out.println(queue.front() + " is the front item");
        System.out.println(queue.rear() + " is the rear item"); 
    }
}
```

OUTPUT:

```
Operations              Complexity
Enque(insertion)           O(1)
Deque(deletion)            O(1)
Front(Get front)           O(1)
Rear(Get Rear)             O(1)

Auxiliary Space: O(N). 
N is the size of array for storing elements.
```

### advantages and disadvantages:

-it is easy to implement

-it is a static data structure and have a fixed size
-if queue has a very large size then we might not be able to hold enqueue and dequeue operations even when we might have an empty queue (this problem is solved by using circular queue)

### priority queue:

-an extension of queue
-every item has a priority associated with it
-high priority --> dequeue first
-if two items have same priority then priorities further according to their order in the queue

-can use arrays or linked lists for this implementation. writing the getHighestPriority() and deleteHighestPriority() methods would be easy in LL
-LL and arrays give O(n) time
-heap is generally prefferred for priority queue because they provide better performance

### deque:

