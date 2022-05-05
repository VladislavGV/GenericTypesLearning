package genericmethods;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alice", "Sam", "Kate", "Bob", "Halen"};
        Integer[] integers = {23, 123, 53, 54, 98, 321};
        printer.<String>print(strings);
        printer.<Integer>print(integers);
    }
}
