/*
 * A queue is an abstract data type that maintains the order in which elements were added 
 * to it, allowing the oldest elements to be removed from the front and new elements to be 
 * added to the rear. This is called a First-In-First-Out (FIFO) data structure because the
 *  first element added to the queue (i.e., the one that has been waiting the longest) is 
 *  always the first one to be removed.

 * A basic queue has the following operations:

 * Enqueue: add a new element to the end of the queue.
 * Dequeue: remove the element from the front of the queue and return it.
 * In this challenge, you must first implement a queue using two stacks. Then process q 
 * queries, where each query is one of the following  types:

 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 */
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
       Stack<Integer> s1=new Stack<Integer>();
       Stack<Integer> s2=new Stack<Integer>();
       for(int i=0;i<q;i++)
       {
           int op=sc.nextInt();int val=0;
           if(op==1){
               val=sc.nextInt();
               s1.push(val);
           }
           else if(op==2)
           {
               if(s2.empty())
               {
                   while(!s1.empty())
                   {
                       s2.push(s1.pop());
                   }
                   s2.pop();
               }
               else
               {
                    s2.pop();
               }
           }
           else
           {
               if(s2.empty())
               {
                   while(!s1.empty())
                   {
                       s2.push(s1.pop());
                   }
                   System.out.println(s2.peek());
               }
               else
               {
                    System.out.println(s2.peek());
               }
           }

       }
       sc.close();
    }
}

