package level1.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Koles Anton Victorovich", "Boss", "koles@mail.ru", 2588555, 250000, 43);
        Employee employee2 = new Employee("Marcinov Petr Vadimovich", "Zam.bossa", "petr@mail.ru", 849925635, 200000, 45);
        Employee employee3 = new Employee("Agapeeva Anna Sergeevna", "manager", "anna@mail.ru", 849522235, 120000, 33);
        Employee employee4 = new Employee("Savin Dmitrii Sergeevich", "ingener", "ing@mail.ru", 849533235, 180000, 40);
        Employee employee5 = new Employee("Klimova Veronika Ivanovna", "manager", "manag@mail.ru", 849565412, 120000, 33);




        employee1.info();
        employee2.info();
        employee3.info();
        employee4.info();
        employee5.info();

        Employee[] Employees = new Employee[5];
        Employees[0] = new Employee("Koles Anton Victorovich", "Boss", "koles@mail.ru", 2588555, 250000, 43);
        Employees[1] = new Employee("Marcinov Petr Vadimovich", "Zam.bossa", "petr@mail.ru", 849925635, 200000, 45);
        Employees[2] = new Employee("Agapeeva Anna Sergeevna", "manager", "anna@mail.ru", 849522235, 120000, 33);
        Employees[3] = new Employee("Savin Dmitrii Sergeevich", "ingener", "ing@mail.ru", 849533235, 180000, 40);
        Employees[4] = new Employee("Klimova Veronika Ivanovna", "manager", "manag@mail.ru", 849565412, 120000, 33);

        System.out.println(Arrays.toString(Employees));


        for (Employee employee : Employees) {
            if (employee.age >= 40) {
                System.out.println(employee);

            }
        }
    }
}





