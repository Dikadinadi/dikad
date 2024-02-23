import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        String greeting = greet(name);
        System.out.println(greeting);
        scanner.close();
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
