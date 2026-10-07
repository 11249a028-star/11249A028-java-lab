import java.util.Scanner;

public class LangPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = Math.max(a, b);

        System.out.println("Maximum number: " + result);

        sc.close();
    }
}
