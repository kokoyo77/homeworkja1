import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("n-ое треугольное число: " + triangleNumber);

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n! = " + factorial);
    }
}
