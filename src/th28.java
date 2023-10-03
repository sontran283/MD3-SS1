import java.util.Scanner;

public class th28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao diem toan");
        int diemToan = scanner.nextInt();
        System.out.println("nhap vao diem ly");
        int diemLi = scanner.nextInt();
        System.out.println("nhap vao diem hoa");
        int diemHoa = scanner.nextInt();

        double diemTrungBinh = (diemLi + diemHoa + diemToan) / 3;

        String traLoi =
                (diemTrungBinh >= 8) ? "gioi" :
                        (diemTrungBinh < 8 && diemTrungBinh >= 6.5) ? "kha" :
                                (diemTrungBinh < 6.5 && diemTrungBinh >= 5) ? "trung binh" :
                                        (diemTrungBinh < 5) ? "yeu" : "khong xac dinh";

        System.out.println("xep loai diem trung binh " + traLoi);
    }
}
