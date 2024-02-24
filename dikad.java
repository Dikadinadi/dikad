import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        try {
            String greeting = greet(name);
            System.out.println(greeting);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }

    public static String greet(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не указано");
        }
        return "Hello, " + name + "!";
    }
}
