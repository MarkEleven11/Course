public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                null,
                new Employee("Mark", 2, 120000),
                new Employee("Alexander", 4, 150000),
                new Employee("Anastasia", 3, 95500),
                new Employee("Nikita", 3, 100000),
                new Employee("Ludmila", 2, 71800),
                null,
                new Employee("Irina", 2, 125000),
                new Employee("Olga", 1, 68000),
                new Employee("Andrei",1,88200)
        };
        ///Базовый блок задач
        Methods.printList(employees);
        System.out.println();
        Methods.totalSalary(employees);
        System.out.println();
        Methods.minSalary(employees);
        System.out.println();
        Methods.maxSalary(employees);
        System.out.println();
        Methods.aveSalary(employees);

 }
}