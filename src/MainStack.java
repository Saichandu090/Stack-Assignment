public class MainStack
{
    public static void main(String[] args) {

        MyStack<Integer> ms=new MyStack<Integer>();
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.isEmpty());
        //  System.out.println(ms.contains(85));
        System.out.println("Size is : "+ms.size());
        ms.push(52);
        System.out.println(ms.isEmpty());
        ms.push(85);
        ms.push(789);
        ms.push(78);
        System.out.println(ms);
        System.out.println(ms.contains(37));
        System.out.println(ms.contains(789));
        System.out.println("Size is : "+ms.size());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms);
        System.out.println(ms.peek());
        System.out.println(ms.peek());
        System.out.println(ms);
        System.out.println(ms.isEmpty());
        //System.out.println(ms.contains(52));
        System.out.println("Size is : "+ms.size());
        ms.clear();
        System.out.println(ms);
        System.out.println(ms.isEmpty());
    }
}
