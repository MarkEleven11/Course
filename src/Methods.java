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
            if(employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на заработную плату за месяц составила: " + sum + " рублей.");
        return sum;
    }

    ///Расчет минимальной заработной платы.
    public static int minSalary(Employee[] employees) {
        int count = 0;
        int min = 0;
        for(; count < employees.length; count++){
            if(employees[count] != null) {
                min = employees[count].getSalary();
                break;
            }
        }
        for (count++; count < employees.length; count++) {
        if (employees[count] != null && employees[count].getSalary() < min) {
                min = employees[count].getSalary();
            }
        }
        System.out.println("Минимальная зарплата в отделе составляет " + min + " рублей.");
        return min;
    }

    ///Расчет максимальной заработной платы.
    public static int maxSalary(Employee[] employees) {
        int count = 0;
        int max = 0;
        for(; count < employees.length; count++) {
            if (employees[count] != null) {
                max = employees[count].getSalary();
                break;
            }
        }
        for (count++; count < employees.length; count++) {
            if (employees[count] != null && employees[count].getSalary() > max) {
                max = employees[count].getSalary();
            }
        }
        System.out.println("Максимальная зарплата в отделе " + max + " рублей.");
        return max;
    }

    ///Расчет средней заработной платы.
    public static int aveSalary(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                count++;
            }
        }
        System.out.println("Средняя заработная плата составила: " + totalSalary(employees)/count);
        return totalSalary(employees)/count;
    }
}