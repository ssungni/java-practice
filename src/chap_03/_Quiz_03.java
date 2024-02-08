package chap_03;

/* 김성은 답변

public class _Quiz_03 {
    public static void main(String[] args) {
        String num = "901231-1234567";
        System.out.println(num.substring(num.indexOf("9"), num.lastIndexOf("2")));

    }
}

*/


// another method
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8));
    }
}

