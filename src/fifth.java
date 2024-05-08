import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 1-ий рядок:");
        String line1 = scanner.nextLine();
        System.out.println("Введіть 2-ий рядок");
        String line2 = scanner.nextLine();
        if (line1.length() > line2.length()) {
            System.out.println("Перший рядок має більше символів");
        } else if (line1.length() < line2.length()) {
            System.out.println("Другий рядок має більше символів");
        } else {
            System.out.println("Рядки мають однакову к-сть.символів");
        }
    }
}
