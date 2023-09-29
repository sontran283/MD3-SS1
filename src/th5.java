import java.util.Scanner;

public class th5 {
    // Tính điểm trung bình các môn học và xếp loại
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Khai báo các biến điểm Toán, Lý , Hoá , Văn và Tiếng Anh cho phép người dùng nhập vào
        System.out.println("nhap diem mon toan: ");
        double diemToan = scanner.nextDouble();
        System.out.println("nhap diem mon ly: ");
        double diemLy = scanner.nextDouble();
        System.out.println("nhap diem mon hoa: ");
        double diemHoa = scanner.nextDouble();
        System.out.println("nhap diem mon van: ");
        double diemVan = scanner.nextDouble();
        System.out.println("nhap diem mon tieng anh: ");
        double diemAnh = scanner.nextDouble();

        // biến để tính giá trị trung bình các môn (thang điểm 10)
        double giatritrungbinh = ((diemToan + diemLy + diemHoa + diemVan + diemAnh) / 5);

        // xep loai hoc luc hoc sinh
        if (0 <= giatritrungbinh ) {
            System.out.println("Xếp loại yếu");
        } else if (5 <= giatritrungbinh) {
            System.out.println("Xếp loại trung bình");
        } else if (6.5 <= giatritrungbinh) {
            System.out.println("Xếp loại khá");
        } else if (8 <= giatritrungbinh) {
            System.out.println("Xếp loại giỏi");
        } else if (9 <= giatritrungbinh) {
            System.out.println("Xếp loại xuất sắc");
        }
    }
}
