import java.util.Scanner;

public class th20 {
    // Kiểm tra năm nhuận
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nam bat ki");
        double nam = scanner.nextDouble();

        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0){
            System.out.println("nam " + nam + "la nam nhuan");
        } else {
            System.out.println("nam " + nam + "khong phai la nam nhuan");
        }
    }
}
