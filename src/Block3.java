public class Block3 {
    // 3.1 Модуль числа
    public static int abs(int x) {
        if (x < 0) {
            x *= -1;
        }
        return x;
    }

    // 3.2 Безопасное деление
    public static int safeDiv(int x, int y) {
        return y == 0 ? 0 : x / y;
    }

    // 3.3 Максимум
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    // 3.4 Строка сравнения
    public static String makeDecision(int x, int y) {
        String result;
        if (x > y) {
            result = " > ";
        } else if (x < y) {
            result = " < ";
        } else {
            result = " == ";
        }
        return x + result + y;
    }

    // 3.5 Тройной максимум
    public static int max3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    // 3.6 Тройная сумма
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        if (x + z == y) {
            return true;
        }
        return y + z == x;
    }

    // 3.7 Двойная сумма
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }

    // 3.8 Тридцать пять
    public static boolean is35(int x) {
        boolean result = false;
        if ((x % 3 == 0) && (x % 5 != 0)) {
            result = true;
        }
        if ((x % 5 == 0) && (x % 3 != 0)) {
            result = true;
        }
        return result;
    }

    // 3.9 Волшебная шестерка
    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6;
    }

    // 3.10 Возраст
    public static String age(int x) {
        String result = " лет";
        if (x % 10 == 1 && x != 11) {
            result = " год";
        }
        if ((x % 10 == 2 && x != 12) || (x % 10 == 3 && x != 13) || (x % 10 == 4 && x != 14)) {
            result = " года";
        }
        return x + result;
    }

    // 3.11 День недели
    public static String day(int x) {
        String result = switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
        return result;
    }

    // 3.12 Вывод дней недели
    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}
