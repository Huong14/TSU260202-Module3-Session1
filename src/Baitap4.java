public class Baitap4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int du = a % b;

        System.out.printf("Giá trị a: %d%n", a);
        System.out.printf("Giá trị b: %d%n", b);
        System.out.printf("Tổng của a cộng b: %d%n", tong);
        System.out.printf("Hiệu của a trừ b: %d%n", hieu);
        System.out.printf("Tích của a nhân b: %d%n", tich);
        System.out.printf("Thương của a chia b: %d%n", thuong);
        System.out.printf("Số dư của a chia b: %d%n", du);
    }
}
