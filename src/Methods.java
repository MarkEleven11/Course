public class Methods {

    ///Выведение на экран списка людей.
    public static void printList(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    ///Расчет заработной платы за месяц.
    public static int totalSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на заработную плату за месяц составила: " + sum + " рублей.");
        return sum;
    }

    ///Расчет минимальной заработной платы.
    public static int minSalary(Employee[] employees) {
        int count = 0;
        int min = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (employees[count].getSalary() < min) {
                min = employees[count].getSalary();
            }
        }
        System.out.println("Минимальная зарплата в отделе составляет " + min + " рублей.");
        return count;
    }

    ///Расчет максимальной заработной платы.
    public static int maxSalary(Employee[] employees) {
        int count = 0;
        int max = employees[count].getSalary();
        for (count++; count > employees.length; count++) {
            if (employees[count].getSalary() > max) {
                max = employees[count].getSalary();
            }
        }
        System.out.println("Максимальная зарплата в отделе " + max + " рублей.");
        return count;
    }

    public static int aveSalary(Employee[] employees) {
        int average = 0;
        for (int i = 0; i < employees.length; i++) {
            average += employees[i].getSalary() / employees.length;
        }
        System.out.println(average);
        return average;
    }

}