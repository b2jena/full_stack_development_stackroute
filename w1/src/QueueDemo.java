
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
* The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue.
* It follows FIFO concept.
* The Java Queue supports all methods of Collection interface including insertion, deletion etc.
* LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
*/

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new PriorityQueue<>();

        // Adding items to the pQueue
        // using add()
        q1.add(10);
        q1.add(20);
        q1.add(15);
        System.out.println(q1);

        q2.add(10);
        q2.add(20);
        q2.add(15);
        System.out.println(q2);

        //offer(element)->This method is used to insert an element in the queue.
        //This method is preferable to add() method since this method does not throws an exception
        //when the capacity of the container is full since it returns false.
        q1.offer(787);
        q2.offer(1000);
        System.out.println(q1);
        System.out.println(q2);

        //peek()->This method is used to view the head of queue without removing it.
        //It returns Null if the queue is empty.
        System.out.println(q1.peek());
        System.out.println(q1);  //[10, 20, 15, 787]
        System.out.println(q2.peek());
        System.out.println(q2);  //[10, 20, 15, 1000]
        System.out.println();

        //poll()->This method removes and returns the head of the queue. It returns null if the queue is empty.
        System.out.println(q1.poll());
        System.out.println(q1);  //[20, 15, 787]
        System.out.println(q2.poll());
        System.out.println(q2);  //[15, 20, 1000]
        for(Integer i : q1){
            System.out.print(i+ " ");  //20 15 787
        }
        System.out.println();

        for(Integer i : q2){
            System.out.print(i+ " ");  //15 20 1000
        }
        System.out.println();
    }
}
