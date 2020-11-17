import java.util.Scanner;

public class CalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double price, totalPrice = 0;
        int num;
        price = scanner.nextDouble();
        while (price != 0.0){
            System.out.println("请输入商品数量：");
            num = scanner.nextInt();
            totalPrice += price * num;
            System.out.println("请输入商品价格：");
            price = scanner.nextDouble();
        }
        System.out.println("请输入活动模式(normal=无活动,rebate=打折,return=满减)：");
        String pattern = scanner.next();
        CashSuper cashSuper = CashFactory.cashFactory(pattern);
        double res = cashSuper.acceptCash(totalPrice);
        System.out.println("您需要支付：" + res);
    }
}
