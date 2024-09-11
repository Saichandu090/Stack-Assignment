import java.util.*;
public class BalancedParanthesis
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String question=sc.next();

        boolean rs=isBalanced(question);
        if(rs)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    public static boolean isBalanced(String st)
    {
        if(st.length()%2==1)
            return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==']'||ch=='}'||ch==')')
            {
                switch (ch)
                {
                    case '}' : if(stack.pop()!='{')
                                   return false;
                               break;
                    case ']' : if(stack.pop()!='[')
                                   return false;
                               break;
                    case ')' : if(stack.pop()!='(')
                                   return false;
                               break;
                }
            }
        }
        return stack.isEmpty();
    }
}
