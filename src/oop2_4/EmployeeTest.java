package oop2_4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Piter", "Tan", 2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id: " + e1.getId());
        System.out.println("ismi: " + e1.getFirstName());
        System.out.println("familiya: " + e1.getLastName());
        System.out.println("ish haqi: " + e1.getSalary());
        System.out.println("ism: " + e1.getName());
        System.out.println("yillik ish haqi: " + e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

    }
}
