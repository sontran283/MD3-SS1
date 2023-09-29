import java.util.Scanner;

public class th4 {
    // Tính chu vi và diện tính của hình vuông
    // chu vi = chiều dài + chiều rộng *2
    // diện tích = chiều dài * chiều rộng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai cua hinh chu nhat :");
        double chieuDai = scanner.nextDouble();
        System.out.println("chieu rong cua hinh chu nhat :");
        double chieuRong = scanner.nextDouble();

        System.out.println("chu vi cua hinh chu nhat la: " + ((chieuDai+ chieuRong) *2));
        System.out.println("dien tich cua hinh chu nhat la: " + chieuDai* chieuRong);
    }
}
