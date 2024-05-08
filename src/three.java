import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести 3 числа: ");
        double n1,n2,n3;
        if (scanner.hasNextDouble()){
            n1= scanner.nextDouble();
        } else {
            System.out.println("Помилка:Введено не дробове число");
            scanner.close();
            return;
        }
        if (scanner.hasNextDouble()) {
            n2 = scanner.nextDouble();
        }
        else {
            System.out.println("Помилка:Введено не дробове число");
            scanner.close();
            return;
        }
        if (scanner.hasNextDouble()){
            n3= scanner.nextDouble();
        }
        else {
            System.out.println("Помилка:Введено не дробове число");
            scanner.close();
            return;
        }
        if (n1>n2 && n1>n3){
            System.out.println("Найбільше дробове число:"+ n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("Найбільше дробове число:"+ n2);
        } else if (n3>n1 && n3>n2) {
            System.out.println("Найбільше дробове число:"+ n3);
        }
        else {
            System.out.println("Усі числа рівні:");
        }
        scanner.close();
    }
}