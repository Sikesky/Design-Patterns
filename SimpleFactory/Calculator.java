import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numberA = scanner.nextDouble();
        System.out.println("请选择运算符号（+、-、*、/）、：");
        String operator = scanner.next();
        System.out.println("请输入数字B：");
        double numberB = scanner.nextDouble();
        double result = Operation.GetResult(numberA,numberB,operator);
        System.out.println("运算结果是：" + result);
    }
}
