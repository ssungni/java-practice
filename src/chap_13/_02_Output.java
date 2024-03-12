package chap_13;

import java.util.Arrays;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("=====정수=====");
        System.out.printf("%d%n", 1); // 줄바꿈
        System.out.printf("%d %d %d%n", 1, 2, 3); // 줄바꿈
        System.out.printf("%d%n", 1234); // 줄바꿈
        System.out.printf("%6d%n", 1234); // 줄바꿈
        System.out.printf("%06d%n", 1234); // 6자리 확보 후 1234 출력, 빈공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); // -1234
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 100000000);
        System.out.printf("%-6d%n", 1234); // 6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력

        System.out.println("=====실수=====");
        System.out.printf("%f%n", Math.PI);

    }
}
