package Collections.List;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<String>();
        v1.add("Venkat 1");
        v1.add("Venkat 2");
        v1.add("Venkat 3");
        v1.add("Venkat 4");

        System.out.println(v1);

        v1.removeFirst();
        v1.removeLast();
        System.out.println(v1);
    }
}
