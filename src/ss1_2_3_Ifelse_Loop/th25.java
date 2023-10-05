import java.util.Scanner;

public class th25 {
    // Số_tiền_lãi = Số_tiền_gửi * tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien gui");
        int soTienGui = scanner.nextInt();
        System.out.println("nhap so thang gui");
        int soThangGui = scanner.nextInt();

        double soTienLai = soTienGui * 0.5 / (12 * soThangGui);
        System.out.println(" so tien lai la: " + soTienLai);
    }
}
