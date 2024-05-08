import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 1-ше ім'я:");
        String firstname = scanner.nextLine();
        System.out.println("Введіть 2-ге і'мя");
        String secondname = scanner.nextLine();
        if (firstname.equals(secondname)) {
            System.out.println("Імена ідентичні");
        } else {
            System.out.println("Імена не ідентичні");
        }
    }
}
