import java.util.Scanner;
public class th14 {
    // viet chuong trinh nhap vao thang trong nam, cho biet thang do thuoc quy may
    // 1 nam co 4 quy, moi quy co 3 thang
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao thang trong nam");
        int thang = scanner.nextInt();

        if (thang == 1 || thang == 2 || thang == 3) {
            System.out.println("thang" + thang + "thuoc quy 1");
        } else if (thang == 4 || thang == 5 || thang == 6) {
            System.out.println("thang" + thang + "thuoc quy 2");
        } else if (thang == 7 || thang == 8 || thang == 9) {
            System.out.println("thang" + thang + "thuoc quy 3");
        } else {
            System.out.println("thang" + thang + "thuoc quy 4");
        }
    }
}
