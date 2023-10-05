import java.util.Scanner;

public class th16 {
    // ax + b = 0   (a ≠ 0)
    // Nếu a = 0 và b = 0: phương trình có vô số nghiệm
    // Nếu a = 0 và b # 0: phương trình vô nghiệm
    // Nếu a # 0: phương trình có nghiệm duy nhất x = -b / a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao canh a ");
        double a = scanner.nextDouble();
        System.out.println("nhap vao canh b ");
        double b = scanner.nextDouble();

        if (a == 0 && b == 0) {
            System.out.println("phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (a != 0) {
            double x = (-b / (2 * a));
            System.out.println("phuong trinh co nghiem duy nhat " + x);
        }
    }
}
