package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("JAVA"));
        System.out.println(s2.equals("python"));

        // 대소문자 구분 없이 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 노란색 메모지에 1234, 1234

        s1 = new String("1234"); // 노란색 메모지
        s2 = new String("1234"); // 파란색 메모지
        System.out.println(s1.equals(s2)); // true -> 안에 내용이 같니?
        System.out.println(s1 == s2); // false -> 메모지 색이 다름!

    }
}
