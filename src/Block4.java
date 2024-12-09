public class Block4 {
    // 4.1 Числа подряд
    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.2 Числа наоборот
    public static String reverseListNums(int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.3 Четные числа
    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.4 Степень числа
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // 4.5 Длина числа
    public static int numLen(long x) {
        int result = 0;
        do {
            x /= 10;
            result++;
        } while (x != 0);
        return result;
    }

    // 4.6 Одинаковость
    public static boolean equalNum(int x) {
        int pred, next;
        if (x / 10 == 0) {
            return true;
        }
        pred = x % 10;
        while (x /10 != 0) {
            x /= 10;
            next = x % 10;
            if (pred != next) {
                return false;
            }
            pred = next;
        }
        return true;
    }

    // 4.7 Квадрат
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4.8 Левый треугольник
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4.9 Правый треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }

    // 4.10 Угадайка
    public static void guessGame() {
        int x, randomNum = 3, attempt = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        do {
            attempt++;
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
        } while (x != randomNum);
        System.out.println("Количество использованных попыток: " + attempt);
    }
}
