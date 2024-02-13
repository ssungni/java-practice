package chap_05;

import java.beans.beancontext.BeanContextChild;
import java.security.spec.RSAOtherPrimeInfo;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노" };

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("================");

        // 배열의 길이를 이용한 순회 -> 일정 범위
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("================");

        // enhanced for (for-each) 반복문 -> 처음부터 끝까지
        for (String coffee : coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");



    }
}
