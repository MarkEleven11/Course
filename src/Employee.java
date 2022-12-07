public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int id;


    public Employee(String fullName, int department, int salary){
    this.fullName = fullName;
    this.department = department;
    this.salary = salary;
    id = 1;

    }
        ///getters
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

        ///setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return (id++) + ": " + this.fullName + ", " + this.department + ", " + this.salary + ".";
    }
}

