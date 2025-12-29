package Day4;

public class Employee {

    // encapsulated fields
    private String name;
    private double salary;

    // validate and set name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    // validate and set salary
    public void setSalary(double s) {
        if (s < 10000 || s > 500000) {
            System.out.println("Invalid salary");
        } else {
            this.salary = s;
        }
    }

    // raise salary by percentage
    public void raise(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid raise percentage");
            return;
        }

        double increase = salary * percent / 100;
        salary += increase;
    }

    // optional getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // test
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("");             // Invalid name
        e.setSalary(9000);         // Invalid salary
        e.setSalary(120000);       // valid

        e.raise(10);               // salary -> 132000
        System.out.println(e.getSalary());

        e.raise(200);              // Invalid raise percentage
    }
}
