package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(number); // 메인 함수에서 쓰는 변수를 쓰면 안 됨
        // System.out.println(result); // methodB에서 쓰는 변수를 쓰면 안 됨
    }

    public static void methodB() {
        int result = 1; // 지역변수
    }
    public static void main(String[] args) {
        int number = 3;
        // System.out.println(result); // methodB에서 쓰는 변수를 쓰면 안 됨

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);
    }
}
