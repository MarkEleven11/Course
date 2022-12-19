public class Employee {
    private static int counterId = 1;
    private int id;
    private String fullName;
    private int department;
    private int salary;



    public Employee(String fullName, int department, int salary){
    this.fullName = fullName;
    this.department = department;
    this.salary = salary;
    this.id = counterId++;

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

    ///Статический счетчик
    public int countId() {
        return id;
    }

    public String toString() {
        return this.id + ": " + this.fullName + ", " + this.department + ", " + this.salary + ".";
    }
}

