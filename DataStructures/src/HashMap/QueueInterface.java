package HashMap;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void priorityQ() {
	
		PriorityQueue<Integer> pQ = new PriorityQueue<>(new CustomComp());
		pQ.offer(4);
		pQ.offer(2);
		pQ.offer(1);
		pQ.offer(3);
		
		System.out.println(pQ);
		System.out.println(pQ.poll());
		System.out.println(pQ.poll());
		System.out.println(pQ.poll());
		System.out.println(pQ.poll());
//		System.out.println(pQ.remove());
//		System.out.println(pQ.peek());
//		System.out.println(pQ.element()); // Abstract Queue
	}
	
	public static void linkedL() {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.indexOf(1);
		ll.get(0);
		List<Integer> lll = new LinkedList<>();
		Queue<Integer> qll = new LinkedList<>();
		Deque<Integer> name = new LinkedList<>();
	}
	
	public static void arrayD() {
		Deque<Integer> aD = new ArrayDeque<>();
		aD.add(1);
		aD.add(2);
		aD.add(3);
		aD.push(77);
		System.out.println(aD);
		
		System.out.println(aD.peek());
		System.out.println(aD.element());
		
		Queue<Integer> aQ = new PriorityQueue<>();
		aQ.add(1);
		aQ.add(2);
		aQ.add(3);
		aQ.offer(4);
		System.out.println(aQ);
		
		System.out.println(aQ.peek());
		System.out.println(aQ.element());
	}
	
	public static void main(String[] args) {
//		priorityQ();
		arrayD();
	}
}

class CustomComp implements Comparator<Integer>{

	@Override
	public int compare(Integer number1, Integer number2) {
		int value =  number1.compareTo(number2);
		if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
	}
	
}