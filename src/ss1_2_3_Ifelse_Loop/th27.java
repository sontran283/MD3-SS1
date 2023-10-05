import java.util.Scanner;

public class th27 {
    // kiem tra chan le, dung toan tu 3 ngoi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot so nguyen bat ki");
        int number = scanner.nextInt();
        String traloi = (number % 2 == 0) ? "chan" : "le";
        System.out.println("so " + number + " la so : " + traloi);
    }
}
