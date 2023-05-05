import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверный оператор");
                return;
        }
        System.out.println("Результат: " + result);
    }
}
