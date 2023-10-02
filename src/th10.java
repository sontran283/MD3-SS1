import java.util.Scanner;

public class th10 {
    // viet chuong trinh nhap vao chieu cao, can nang, tinh BMI xuat ra thong bao
    // BMI = cân nặng / (chiều cao * chiều cao)
    public static void main(String[] args) {
        // de nhap vao chung ta dung Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu cao: ");
        double chieucao = scanner.nextDouble();
        System.out.println("nhap vao can nang: ");
        double cannang = scanner.nextDouble();
        double BMI = cannang / (chieucao * chieucao);

        if (BMI < 15) {
            System.out.println("than hinh qua gay");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("than hinh gay");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("than hinh hoi gay");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("than hinh binh thuong");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("than hinh hoi beo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("than hinh beo");
        } else if (BMI >= 35) {
            System.out.println("than hinh qua beo");
        } else {
            System.out.println("khong hop le");
        }
    }
}
