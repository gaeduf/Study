package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Administrator
 */
public class CustomQueue {

    private static Queue<String> queue = new LinkedList<String>();

    public static void producer(){
        queue.add("first message");
        queue.add("second message");
        queue.add("third message");
    }

    public static void consumer(){
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        producer();
        consumer();
    }
}
