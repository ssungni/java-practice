package chap_01;

public class _06_constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호 (빨리)
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PT = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년 월일
    }
}

// 변수는 변하는 수 -> 변수를 집어넣었다가 다시 만들 수 있음.
// 상수는 한 번 정의하면 수정 불가
// final은 수정 불가 상수를 의미하게 됨!
