import java.util.Scanner;

public class th22 {
    // Tạo menu chức năng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao lua chon cua ban (a,b,x): ");
        String text = scanner.nextLine();

        switch (text) {
            // Kiểm tra tính chẵn lẻ của 1 số.
            case "a":
                System.out.println("nhap so bat ki: ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number % 2 == 0) {
                    System.out.println(number + " la so chan");
                } else {
                    System.out.println(number + " la so le");
                }
                break;

            //Kiểm tra số nguyên tố.
            case "b":
                System.out.println("nhap so bat ki: ");
                int number2 = Integer.parseInt(scanner.nextLine());
                if (number2 < 2) {
                    System.out.println(number2 + "khong phai la so nguyen");
                } else {
                    int i = 2;
                    boolean check = true;
                    while (i < number2) {
                        if (number2 % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check) {
                        System.out.println(number2 + "la so nguyen");
                    } else {
                        System.out.println(number2 + "khong phai la so nguyen");
                    }
                }
                break;

            // Kiểm tra một số có chia hết cho 3 không.
            case "x":
                System.out.println("nhap so bat ki: ");
                int number3 = Integer.parseInt(scanner.nextLine());
                if (number3 % 3 == 0) {
                    System.out.println(number3 + " chia het cho 3");
                } else {
                    System.out.println(number3 + " khong chia het cho 3");
                }
                break;
        }
    }
}
