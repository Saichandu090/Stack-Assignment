import java.util.Stack;

public class ReverseStack
{

    public static void insertAtBottom(Stack<Integer> stack, int element)
    {
        if (stack.isEmpty())
        {
            stack.push(element);
            return;
        }

        int topElement = stack.pop();
        insertAtBottom(stack, element);

        stack.push(topElement);
    }

    public static void reverseStack(Stack<Integer> stack)
    {
        if (stack.isEmpty())
        {
            return;
        }

        int topElement = stack.pop();
        reverseStack(stack);

        insertAtBottom(stack, topElement);
    }

    public static void printStack(Stack<Integer> stack)
    {
        for (Integer element : stack)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack:");
        printStack(stack);

        reverseStack(stack);

        System.out.println("Reversed Stack:");
        printStack(stack);
    }
}

