package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도 코딩"; /* name이라는 문자열 변수를 선언 */
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 발문 예정입니다");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; /* 한 글자 */
        name = "강백호";
        System.out.println(name + "님의 평균 점순는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.1412345678; /* float보다 정밀도가 높다 */
        float f = 3.14123456789F;

        System.out.println(d); /* 3.1412345678 */
        System.out.println(f); /* 3.1412346 */

        int i = 10000000; /* -1억 ~ 1억 까지 */
        long l = 1000000000000000L;
        l = 1_000_000_000_000_000L;
        System.out.println(i);
        System.out.println(l);
    }
}

/* 스타벅스에느 tall, grande, venti 사이즈가 있다.
이렇듯 각각 사이즈에 맞는 용량을 넣어줘야 넘치지 않듯, 각 사이즈에 맞는 자료형이 필요하다 */