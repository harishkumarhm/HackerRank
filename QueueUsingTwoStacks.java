import java.util.Scanner;
import java.util.Stack;

/*
 * A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
Input Format

The first line contains a single integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.

Constraints

It is guaranteed that a valid answer always exists for each query of type .
Output Format

For each query of type , print the value of the element at the front of the queue on a new line.
 
 Sample Input

10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2
Sample Output

14
14
 *
 *
 */
public class QueueUsingTwoStacks {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	          MyQueue queue = new QueueUsingTwoStacks().new MyQueue();
	          Scanner scanner = new Scanner(System.in);
	          long q = scanner.nextInt();
	          for(long i=0; i<q; i++)
	              {
	                long n = scanner.nextInt();
	                if(n==1)
	                    queue.enque(scanner.nextInt());
	                 if(n==2)
	                     queue.deque();
	                 if(n==3)
	                     System.out.println(queue.peek());
	              
	              
	          }
	        
	    }
	    public class MyQueue
	        {
	          private Stack<Long> rear = new Stack<Long>();
	          private Stack<Long> front = new Stack<Long>();
	          public void enque(long i)
	              {
	               rear.push(i);
	          }
	        
	          public long deque()
	              {
	                if(front.isEmpty())
	                 emptyStack(rear, front);
	                long i =front.pop();
	              return i;
	          }
	        
	          public long peek()
	              {
	               if(front.isEmpty())
	                 emptyStack(rear, front);
	                long v = front.peek();
	              return v;
	          }
	         public void emptyStack(Stack rear, Stack front)
	             {
	                while(!rear.isEmpty())
	                    front.push(rear.pop());
	         }
	    }
}
