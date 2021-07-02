package level1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static int SIZE = 5;
    static final char DOT_TO_WIN = 4;
    static final char DOT_EMPTY = '•';
    static final char DOT_x = 'x';
    static final char DOT_o = 'o';
    static final char DOT_d = 'd';
    static final char DOT_a = 'a';
    static char[][] map;
    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_d)) {
                System.out.println("Победа");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_o)) {
                System.out.println("Победил комп");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;

            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("input y x");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_x;
        map[y][x] = DOT_a;
        map[y][x] = DOT_d;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {

            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_o;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c && map[0][3] == c && map[0][4] == c) {
            return true;
        }
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c && map[1][3] == c && map[1][4] == c) {
            return true;
        }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c && map[2][3] == c && map[2][4] == c) {
            return true;
        }
        if (map[3][0] == c && map[3][1] == c && map[3][2] == c && map[3][3] == c && map[3][4] == c) {
            return true;
        }
        if (map[4][0] == c && map[4][1] == c && map[4][2] == c && map[4][3] == c && map[4][4] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c && map[3][0] == c && map[4][0] == c) {
            return true;
        }
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c && map[3][1] == c && map[4][1] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c && map[3][2] == c && map[4][2] == c) {
            return true;
        }
        if (map[0][3] == c && map[1][3] == c && map[2][3] == c && map[3][3] == c && map[4][3] == c) {
            return true;
        }
        if (map[0][4] == c && map[1][4] == c && map[2][4] == c && map[3][4] == c && map[4][4] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c && map[3][3] == c && map[4][4] == c) {
            return true;
        }
        if (map[0][4] == c && map[1][3] == c && map[2][2] == c && map[3][1] == c && map[4][0] == c) {
            return true;
        }
        return false;
    }
}
