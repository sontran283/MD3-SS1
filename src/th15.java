import java.util.Scanner;

public class th15 {
    // Tính tổng các số chẵn trong khoảng cho trước
    // Bước 1: Khai báo 2 biến giá trị đầu và giá trị cuối cho phép người dùng nhập vào từ bàn phím và 1 biến để tính tổng các số chẵn trong khoảng vừa nhập(giá trị tổng mặc định ban đầu là 0).
    // Bước 2: Sử dụng vòng lặp for i để tìm ra các số chẵn nằm trong khoảng người dùng vừa nhập và thực hiện tính tổng các số tìm được.
    // Bước 3: Kết thúc vòng lặp hiển thị tổng ra màn hình và đối chiếu :
    //ví dụ người dùng nhập khoảng (2-10) thì tổng thu được là 2+4+6+8+10 = 30
    //ví dụ người dùng nhập khoảng (5-13) thì tổng thu được là 6+8+10+12 = 36
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri dau cua khoang: ");
        int dau = scanner.nextInt();
        System.out.println("nhap gia tri cuoi cua khoang: ");
        int cuoi = scanner.nextInt();
        // tính tổng các số chẵn trong khoảng đã cho
        int sum = 0;

        for (int number = dau; number <= cuoi; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(" tong cac so chan trong khoang tu " + dau + " den " + cuoi + " la " + sum);
    }
}
