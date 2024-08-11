import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class hello{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println("------");
        Queue<Integer> q = new LinkedList<>();
        q.add(15);
        q.add(25);

        System.out.println(q.remove());
    }
}