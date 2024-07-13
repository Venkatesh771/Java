package Collections.List;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();
        //Insert.
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(5);
        System.out.println(St);

        //Delete.
        St.pop();
        St.pop();
        System.out.println(St);

        //Peek Element.
        System.out.println(St.peek());

        //Empty Or Not.
        System.out.println(St.empty());

        //Search.
        int Loc = St.search(2);
        System.out.println(Loc);

        //Size.
        System.out.println(St.size());

        //Display.
        for(int N: St){
            System.out.print(N+" ");
        }
    }
}
