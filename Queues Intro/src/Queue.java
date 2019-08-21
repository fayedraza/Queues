//created by Fayed Raza
import java.util.*;

public class Queue {
	//purpose is to introduce queues
	public static void main(String ...args) {
  PriorityQueue<String> q = new  PriorityQueue<String>();

  q.offer("a");
  q.offer("b");
  q.offer("c");
  q.poll(); //removes the first one to be offered
  System.out.printf("%s ", q); 
  System.out.printf("%s ", q.peek()); //returns the first one to be offered
  

	}
}
