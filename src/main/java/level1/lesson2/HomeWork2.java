package level1.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(RorF(3, 12));
        doFour(9);
        System.out.println(TorF(-7));
        WordNumber("Evg", 3);
        Year(1989);
    }

    //1. Написать метод, принимающий на вход два целых числа
    // и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае
    // – false.
    public static boolean RorF(int a, int b) {
        return a + b <= 10 && a + b <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается
    // целое число, метод должен напечатать в консоль, положительное
    // ли число передали или отрицательное. Замечание: ноль считаем
    // положительным числом.
    public static void doFour(int a) {
        System.out.println();
        if (a >= 0) {
            System.out.println(a + "положительное");
        } else {
            System.out.println(a + " отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается
    // целое число. Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean TorF(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    //4. Написать метод, которому в качестве аргументов передается
    // строка и число, метод должен отпечатать в консоль указанную
    // строку, указанное количество раз;
    public static void WordNumber(String word, int a) {
        for (int b = 0; b < a; b++) {
            System.out.println(word);
        }
    }

    //5. * Написать метод, который определяет, является ли год
    // високосным, и возвращает boolean (високосный - true, не
    // високосный - false). Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void Year(int year) {
        System.out.println();
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + "г. не високосный");
        } else System.out.println(year + "г. високосный");
    }
}






