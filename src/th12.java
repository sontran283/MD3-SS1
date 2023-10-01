import java.util.Scanner;

public class th12 {
    // viet chuong trinh cho nguoi dung nhap vao 1 thang bat ki trong nam, sau do hien thong bao thang do co bn ngay
    // goi y
    // thang 1,3,5,7,8,10,12 co 31 ngay
    // thang 4,6,9,11 co 30 ngay
    // neu thang 2 thi yeu cau nhap them nam
    // neu nam nhuan thi thang 2 co 29 ngay
    // neu ko nhuan thi t2 co 28 ngay
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot thang duong lich ");
        int thang = scanner.nextInt();

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("thang" + thang + "co 31 ngay");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("thang" + thang + "co 30 ngay");
        } else if (thang == 2) {
            System.out.println("moi nhap vao nam: ");
            int nam = scanner.nextInt();
            if (((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))) {
                System.out.println("thang " + thang + "nam " + nam + "co 29 ngay");
            } else {
                System.out.println("thang " + thang + "nam " + nam + "co 28 ngay");
            }
        } else {
            System.out.println("khong hop le");
        }
    }
}
