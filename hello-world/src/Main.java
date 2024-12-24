import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuál es tu nombre?");
        String nombre = input.next();
        System.out.println("Hello, "+nombre+"!");
    }
}