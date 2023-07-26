package fresher;


import java.util.Queue;
import java.util.LinkedList;
public class Queues {
   public static void main(String[] args) {
      System.out.println("The required packages have been imported");
      Queue<Integer> input_queue = new LinkedList<>();
      input_queue.add(150);
      input_queue.add(300);
      input_queue.add(450);
      input_queue.add(600);
      System.out.println("The queue is defined as: " + input_queue);
      System.out.println("After removing an element, the elements of the queue are: " +input_queue);
   }
}


