import javax.management.ObjectName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object o = new Scanner(System.in);



        System.out.println(o instanceof Scanner);
        ((String) o ).length();

        Object o1 = new String();

        Object o2 = new Integer(15);

    }
}
