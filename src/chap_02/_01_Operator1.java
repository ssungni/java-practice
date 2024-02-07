package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산자
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5 -> 2
        System.out.println(2 / 4); // 0.5 -> 0
        System.out.println(2 % 4); // 나머지

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);


        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println("++val");
        System.out.println(val); // 10
        System.out.println(++val); // 11 더해주고 이 문장 실횅. 즉, 연산 먼저


        val = 10;
        System.out.println("val++");
        System.out.println(val); // 10
        System.out.println(val++); // 10 이 문장을 먼저 실행. 즉, 연산 나중에


    }
}
