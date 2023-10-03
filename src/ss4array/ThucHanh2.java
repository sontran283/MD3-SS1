package ss4array;

import java.util.Scanner;

public class ThucHanh2 {
    // Tìm giá trị trong mảng
    public static void main(String[] args) {
        // Khai báo mảng chứa danh sách sinh viên
        String[] students = {"luong bang", " tuan anh", "anh duc", "tung nt", "tinh tran"};

        // Khai báo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cua mot hoc sinh");
        String input_name = scanner.nextLine();

        // Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            // equals là một phương thức dùng để so sánh hai đối tượng có giá trị tương đương hay không
            if (students[i].equals(input_name)) {
                System.out.println("vi tri cua sinh vien trong danh sach la: " + i);
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("khong co ten trong danh sach");
        }
    }
}
