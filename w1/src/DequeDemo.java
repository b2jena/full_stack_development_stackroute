import java.util.ArrayDeque;
import java.util.Deque;

//The Deque is related to the double-ended queue that supports addition or
// removal of elements from either end of the data structure. It can either
// be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO).
// Deque is the acronym for double ended queue.
public class DequeDemo {
    public static void main(String[] args){
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("India");
        dq.add("Sri Lanka");  //[India, Sri Lanka]
        dq.addFirst("Brajrajnagar");
        dq.addLast("Norway");
        dq.add("Asgard");
        dq.add("Midgard");
        System.out.println(dq);
        System.out.println(dq.contains("India"));  //true

        //descendingIterator()	This method returns an iterator for the deque.
        //The elements will be returned in order from last(tail) to first(head).
        //System.out.println(dq.descendingIterator());

        //peek() -> This method is used to retrieve the element at the head of the deque
        //but doesn’t remove the element from the deque.
        //This method returns null if the deque is empty.
        System.out.println(dq.peek());  //brajrajnagar
        //peekFirst()	This method is used to retrieve the element at the head of the deque but
        //doesn’t remove the element from the deque. This method returns null if the deque is empty.
        System.out.println(dq.peekFirst());  //brajrajnagar
        //peekLast()	This method is used to retrieve the element at the tail of the deque but
        //doesn’t remove the element from the deque. This method returns null if the deque is empty.
        System.out.println(dq.peekLast());  //midgard
        //poll()	This method is used to retrieve and remove the element at the head of the deque.
        //This method returns null if the deque is empty.
        System.out.println(dq.poll());  //prints Brajrajnagar and then removes it
        System.out.println(dq);  //[India, Sri Lanka, Norway, Asgard, Midgard]
        //pollFirst()	This method is used to retrieve and remove the element at the head of the deque.
        //This method returns null if the deque is empty.
        System.out.println(dq.pollFirst());  //India
        System.out.println(dq);  //[Sri Lanka, Norway, Asgard, Midgard]
        //pollLast()	This method is used to retrieve and remove the element at the tail of the deque.
        //This method returns null if the deque is empty.
        System.out.println(dq.pollLast());  //Midgard
        System.out.println(dq);  //[Sri Lanka, Norway, Asgard]
        //pop()	This method is used to remove an element from the head and return it.
        //dq.pop();
        System.out.println(dq.pop());  //print Sri Lanka and remove it from dq
        //push(element)	This method is used to add an element at the head of the queue.
        dq.push("GMC");  //new head
        System.out.println(dq);  //[GMC, Norway, Asgard]
        //removeFirst()	This method is used to remove an element from the head of the queue.
        dq.removeFirst();  //remove GMC from dq
        System.out.println(dq);  //[Norway, Asgard]
        //removeLast()	This method is used to remove an element from the tail of the queue.
        dq.removeLast();
        System.out.println(dq);  //[Norway]

        dq.offer("Wakanda");
        System.out.println(dq);  //[Norway, Wakanda]
    }
}
