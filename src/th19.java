import java.util.Scanner;

public class th19 {
    // Tính số ngày trong tháng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang duong lich bat ki");
        int thang = scanner.nextInt();

        switch (thang) {
            case 2:
                System.out.println("moi nhap vao nam");
                double nam = scanner.nextDouble();
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    System.out.println(" thang " + thang + " nam " + nam + " co 29 ngay ");
                } else {
                    System.out.println(" thang " + thang + " nam " + nam + " co 28 ngay ");
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang" + thang + "co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang" + thang + "co 30 ngay");
                break;
            default:
                System.out.println("khong hop le");
                break;
        }
    }
}
