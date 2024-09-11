import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PostFix Expression : ");
        String st=sc.next();

        double out=getPost(st);
        System.out.println("Expression Output : "+out);
    }

    public static double getPost(String st)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Double> stack=new Stack<>();
        double v1=0,v2=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                System.out.println("Enter the value of "+ch);
                stack.push(sc.nextDouble());
            }
            else {
                switch (ch) {
                    case '+':
                        v1 = stack.pop();
                        v2 = stack.pop();
                        stack.push(v2 + v1);
                        break;
                    case '-':
                        v1 = stack.pop();
                        v2 = stack.pop();
                        stack.push(v2 - v1);
                        break;
                    case '*':
                        v1 = stack.pop();
                        v2 = stack.pop();
                        stack.push(v2 * v1);
                        break;
                    case '/':
                        v1 = stack.pop();
                        v2 = stack.pop();
                        stack.push(v2 / v1);
                        break;
                    case '%':
                        v1 = stack.pop();
                        v2 = stack.pop();
                        stack.push(v2 % v1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
