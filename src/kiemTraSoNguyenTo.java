import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen bat ki");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " khong phai la so nguyen ");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " la so nguyen ");
            } else {
                System.out.println(number + " khong phai la so nguyen ");
            }
        }
    }
}
