import java.util.Stack;

public class SortStack
{
    public static void insertInSortedOrder(Stack<Integer> stack, int element)
    {
        if (stack.isEmpty() || stack.peek() <= element)
        {
            stack.push(element);
            return;
        }

        int topElement = stack.pop();
        insertInSortedOrder(stack, element);

        stack.push(topElement);
    }

    public static void sortStack(Stack<Integer> stack)
    {
        if (stack.isEmpty())
        {
            return;
        }
        int topElement = stack.pop();
        sortStack(stack);

        insertInSortedOrder(stack, topElement);
    }

    public static void printStack(Stack<Integer> stack)
    {
        for (int element : stack)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        printStack(stack);

        sortStack(stack);

        System.out.println("Sorted Stack:");
        printStack(stack);
    }
}
