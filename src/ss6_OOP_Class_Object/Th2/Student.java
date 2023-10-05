package ss6_OOP_Class_Object.Th2;

public class LopSinhVien {
    int id;
    int age;
    boolean gender;
    String name;
    String className;
    String address;

    public LopSinhVien() {

    }

    // phuong thuc khoi tao
    public LopSinhVien(int id, int age, boolean gender, String name, String className, String address) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.className = className;
        this.address = address;
    }

    public void display() {
        System.out.println(
                "ma sinh vien: " + id + "\n"
                        + "tuoi: " + age + "\n"
                        + "gioi tinh: " + gender + "\n"
                        + "ten sinh vien: " + name + "\n"
                        + "ten lop: " + className + "\n"
                        + "dia chi: " + address + "\n"
        );
    }


}
