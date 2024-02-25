package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent) { // 2, 3
        int result = 1;
        for (int i = 0; i < exponent; i++) { // 0 1 2
            result *= number; // 1 * 2 = 2, 2 + 2 = 4, 4 * 2 = 8
        }
        System.out.println(number + "의 " + exponent + "승은 " + result);
    }
    public static void main(String[] args) {
        power(2);
        power(3);
        power(4);
        power(5);

        powerByExp(2, 3);
        powerByExp(3, 3);
        powerByExp(10, 0);
    }
}
