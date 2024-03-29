package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) { // 메소드 안에 메소드 선언 가능
        return getPower(number,2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        System.out.println(getPower(5));

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4
//        int result = 1;
//        for (int i = 0; i < 2; i++) { // n번
//            result *= 2;
//        }
//        System.out.println(result); // 2 * 2 = 4

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
//        result = 1;
//        for (int i = 0; i < 3; i++) { // n번
//            result *= 3;
//        }
//        System.out.println(result); // 3 * 3 * 3 = 27

        // 4의 2승
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
//        result = 1;
//        for (int i = 0; i < 2; i++) { // n번
//            result *= 4;
//        }
//        System.out.println(result); // 4 * 4 = 16
    }
}
