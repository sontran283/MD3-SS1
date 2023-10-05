import java.util.Scanner;

public class th2 {
    //ứng dụng chuyển đổi tiền tệ
    public static void main(String[] args) {
        // Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD
        double rate = 23000;
        double usdAmount;
        double vndAmount;

        // Khai báo biến giá trị USD và cho người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri tien USD:");
        // nextDouble() là một phương thức trong lớp Scanner trong Java
        // được sử dụng để đọc và trả về một giá trị kiểu double từ nguồn đầu vào
        usdAmount = scanner.nextDouble();

        // tinh gia tri USD
        vndAmount = usdAmount * rate;

        // hien thi ket qua
        System.out.println("gia tri tuong ung trong vnd: " + vndAmount + "VND");
        scanner.close();
    }
}

