import java.util.Stack;

public class Stackmethod
{
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public Stackmethod()
    {
        this.stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int item)
    {
        stack.push(item);
        System.out.println("Pushed " + item + " onto the stack");
    }

    // Method to pop an element from the stack
    public Integer pop()
    {
        if (isEmpty())
        {
            System.out.println("Cannot pop from an empty stack");
            return null;
        }
        int poppeditem = stack.pop();
        System.out.println("Popped " + poppeditem + " from the stack");
        return poppeditem;
    }

    // Method to check if the stack is empty
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args)
    {
        Stackmethod s = new Stackmethod();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());  // Should print 20 and then "20"
        System.out.println(s.pop());  // Should print 10 and then "10"
        System.out.println(s.isEmpty());  // Should print true
        System.out.println(s.pop());  // Should print "Cannot pop from an empty stack" and then null
    }
}
