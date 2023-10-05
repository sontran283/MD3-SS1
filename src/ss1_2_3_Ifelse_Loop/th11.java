import java.util.Scanner;

public class th11 {
    // viet chuong trinh nhap vao mot nam duong lich, kiem tra nam do co phai nam nhuan hay ko
    // nam nhuan la nam chia het cho 4, ko chia het cho 100 or chia het cho 400
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot nam duong lich: ");
        int nam = scanner.nextInt();
        if (((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))) {
            System.out.println("nam " + nam + " la nam nhuan");
        } else {
            System.out.println("nam " + nam + " khong phai la nam nhuan");
        }
    }
}
