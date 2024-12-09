public class Block2 {
    // 2.1 Дробная часть
    public static double fraction(double x) {
        return x - (int) x;
    }

    // 2.2 Сумма знаков
    public static int sumLastNums(int x) {
        return x % 10 + x / 10 % 10;
    }

    // 2.3 Букву в число
    public static int charToNum(char x) {
        return x - 48;
    }

    // 2.4 Есть ли позитив
    public static boolean isPositive(int x) {
        return x > 0;
    }

    // 2.5 Двузначное
    public static boolean is2Digits(int x) {
        return Math.abs(x) > 9 && Math.abs(x) < 100;
    }

    // 2.6 Большая буква
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // 2.7 Диапазон
    public static boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    // 2.8 Делитель
    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    // 2.9 равенство
    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    // 2.10 Многократный вызов
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
