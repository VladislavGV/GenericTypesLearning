import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 /*       Object o = new Scanner(System.in);




        Scanner scanner = null;
        if(o instanceof Scanner) scanner = (Scanner) o;

        if(scanner != null); {
            scanner.nextInt();
        }

        *//*((String) o ).length();*//*

        Object o1 = new String();

        Object o2 = new Integer(15);
*/


        Object[] objects = {10, "Привет", 3.14}; // здесь происходит автоупаковка

        for(Object o : objects) {
            if(o instanceof String){
                String s = (String) o;
                System.out.println(s);

            }

        }

        ArrayList numbers = new ArrayList(); // Сохраняет Object\

        for(int i = 0; i < 10; i++){ //сохранять коллекцию числа 10, 20 .. 100
            numbers.add(i*10);
//            numbers.add(i*10.f);
        }

        int sum = 0;
        for(Object o : numbers){
            sum = sum + (Integer) o;
        }
        System.out.println(sum);


    }
}
