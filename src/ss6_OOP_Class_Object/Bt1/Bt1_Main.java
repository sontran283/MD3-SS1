package ss6_OOP_Class_Object.Bt1;

public class Main {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(5);
        double radius = hinhTron.getRadius();
        System.out.println(hinhTron); // thuoc tinh
        System.out.println(hinhTron.chuVi());  // phuong thuc, thuc hien hanh dong nao do
        System.out.println(hinhTron.dienTich());
    }
}
