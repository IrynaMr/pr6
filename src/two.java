import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть п’ять довільних слів:");
        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();
        String w4 = sc.next();
        String w5 = sc.next();
        System.out.println("Перші літери введених слів:");
        System.out.println(w1.substring(0, 1));
        System.out.println(w2.substring(0, 1));
        System.out.println(w3.substring(0, 1));
        System.out.println(w4.substring(0, 1));
        System.out.println(w5.substring(0, 1));
    }
}