import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Employee
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        Employeexxx employeesss = new Employeexxx("John Doe", 5000.0, hireDate);

        // Truy cập các thuộc tính
        System.out.println("Tên nhân viên: " + employeesss.getName());
        System.out.println("Mức lương: " + employeesss.getSalary());
        System.out.println("Ngày thuê: " + employeesss.getHireDate());
        System.out.println("Số năm làm việc: " + employeesss.getYearsOfWork());
    }
}