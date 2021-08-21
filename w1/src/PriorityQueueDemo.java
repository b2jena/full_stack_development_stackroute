import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueue<>();

        System.out.println(pq.isEmpty());  //true
        System.out.println(pq.peek());  //will print null since pq is empty()
        System.out.println(pq.poll());  //will print null since pq is empty()

        pq.offer("offering1");
        pq.add("Monday");
        pq.add("Tuesday");
        pq.add("Wednesday");
        pq.add("Thursday");
        pq.add("Friday");
        pq.add("Saturday");
        pq.add("Sunday");
        pq.offer("offering2");

        System.out.println(pq);

        //peek()	Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //poll()	Retrieves and removes the head of this queue, or returns null if this queue is empty.

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());

        System.out.println(pq+"\n\n");

        //--------------------------------------integer trial

        PriorityQueue<Integer> pqi = new PriorityQueue<>(); //we need to add buffer class

        System.out.println(pqi.isEmpty());  //true
        System.out.println(pqi.peek());  //will print null since pq is empty()
        System.out.println(pqi.poll());  //will print null since pq is empty()

        pqi.offer(1);
        pqi.add(2);
        pqi.add(3);
        pqi.add(4);
        pqi.add(5);
        pqi.add(6);
        pqi.add(7);
        pqi.add(8);
        pqi.offer(9);

        System.out.println(pqi);

        //peek()	Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //poll()	Retrieves and removes the head of this queue, or returns null if this queue is empty.

        // Printing the top element of PriorityQueue
        System.out.println(pqi.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pqi.poll());

        // Printing the top element again
        System.out.println(pqi.peek());

        System.out.println(pqi);

        System.out.println(pqi.contains(4));  //true
    }
}
