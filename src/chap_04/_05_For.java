package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세오. 나코입니다.");
        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");

        System.out.println("#2");
        // 반복문 사용 For
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다. " + i);
        }

        // fori만 적으면 for문 만들어줌.
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 홀수만 출력
        // 1, 3, 5, 7, 8
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1 + 2 + 3 + ... + 10
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
