package level1.lesson5;

public class Employee {
    private String name;
    private String profession;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public Employee(String name, String profession, String email, int telephone, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public void info() {
        System.out.println("ФИО: " + name + " Профессия: " + profession + " Почта: " + email + " Тел: " + telephone + " Зарплата " + salary + " Возраст " + age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}

