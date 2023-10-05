import java.util.Scanner;

public class th23 {
    // Tạo ứng dụng tính chu vi và diện tích các loại hình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao lua chon cua ban (a-Tính chu vi và diện tích hình chữ nhật): ");
        System.out.println("nhap vao lua chon cua ban (b-Tính chu vi và diện tích hình tam giác): ");
        System.out.println("nhap vao lua chon cua ban (x-Tính chu vi và diện tích hình tròn): ");
        String text = scanner.nextLine();

        switch (text) {
            // Tính chu vi và diện tích hình chữ nhật .
            // chu vi = 2 * chiều dài * chiều rộng
            // diện tích = chiều dài * chiều rộng.
            case "a":
                System.out.println("nhap vao chieu dai hinh chu nhat: ");
                int chieudai = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap vao chieu dong hinh chu nhat: ");
                int chieudong = Integer.parseInt(scanner.nextLine());
                if (chieudai > 0 && chieudong > 0) {
                    int chuViHcn = 2 * (chieudai + chieudong);
                    int dienTichHcn = chieudai * chieudong;
                    System.out.println("chu vi hinh chu nhat la: " + chuViHcn);
                    System.out.println("dien tich hinh chu nhat la: " + dienTichHcn);
                } else {
                    System.out.println("nhap khong hop le");
                }
                break;

            // Tính chu vi và diện tích hình tam giác
            // P = a + b + c         (a, b, c là độ dài của các cạnh của tam giác)
            // S = ( a x h) /2       (a là chiều dài đáy, h là chiều cao của tam giác)
            case "b":
                System.out.println("nhap canh a: ");
                int canha = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh b: ");
                int canhb = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh c: ");
                int canhc = Integer.parseInt(scanner.nextLine());

                if (canha > 0 && canhb > 0 && canhc > 0) {
                    if (canha + canhb > canhc && canha + canhc > canhb && canhb + canhc > canha) {
                        double p = (canha + canhb + canhc) / 2;
                        double s = Math.sqrt(p * ((p - canha) + (p - canhb) + (p - canhc)));
                        System.out.println("chu vi hinh tam giac la: " + p * 2);
                        System.out.println("dien tich hinh tam giac la: " + s);
                    } else {
                        System.out.println(" khong phai mot tam giac");
                    }
                } else {
                    System.out.println("nhap khong hop le");
                }
                break;

            // Tính chu vi và diện tích hình tròn.
            // chu vi = 2 * PI * R
            // diện tích = PI *( R ^ 2)
            case "x":
                System.out.println("nhap ban kinh hinh tron: ");
                int banKinh = Integer.parseInt(scanner.nextLine());

                if (banKinh > 0) {
                    double Phcn = 2 * Math.PI * banKinh;
                    double Shcn = Math.PI * (banKinh * banKinh);
                    System.out.println("chu vi hinh tron la: " + Phcn);
                    System.out.println("dien tich hinh tron la: " + Shcn);
                } else {
                    System.out.println("nhap khong hop le");
                }
                break;
        }
    }
}
