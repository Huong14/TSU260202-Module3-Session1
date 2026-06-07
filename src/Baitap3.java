import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
         System.out.printf("Diện tích hình tròn có bán kính %.2f là %.2f%n",radius,area);
    }
}
