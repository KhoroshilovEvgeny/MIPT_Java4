public class Main {
    public static void main(String[] args) {
        // Многократный вызов lastNumSum . Последовательное сложение пяти чисел: 5, 11, 123, 14, 1,
        System.out.println(Block2.lastNumSum(Block2.lastNumSum(Block2.lastNumSum(Block2.lastNumSum(5, 11),
                123), 14), 1));
    }
}