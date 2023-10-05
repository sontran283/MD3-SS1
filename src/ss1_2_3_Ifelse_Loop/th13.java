import java.util.Scanner;

public class th13 {
    // viet phuong trinh giai pt bac 2
    // ax^2 + bx + c =0  (a#0)
    // delta =b2-4ac

    // So sánh delta với 0
    // delta < 0 => phương trình vô nghiệm
    // delta = 0 => phương trình có nghiệm kép x1 =x2 = -b/(2*a)
    // delta > 0 => phương trình có 2 nghiệm phân biệt, ta dùng công thức nghiệm sau:
    // x1 =(-b + can delta) / 2*a) và x2 = ((-b + can delta) / 2*a)

    // Mẹo nhẩm nghiệm phương trình bậc 2 nhanh:
    // Nếu a+b+c=0 thì x1 = 1, x2 = c/a
    // Nếu a-b+c=0 thì x1 = -1, x2 = -c/a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap vao b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap vao c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("pt vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println(" pt co nghiem kep x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("phương trình có 2 nghiệm phân biệt");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }


    }
}
