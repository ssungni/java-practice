package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그램
        // 유지 보수 용이
        // 높은 재사용성

        // 차량용 블랙박스

        // 우리가 만든 첫 번째 작품
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FND"; // Full HD
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        // 모델명, 해상도, 가격, 색상
        String modelName2 = "하양이";
        String resolution2 = "UHD"; // Full HD
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        BlackBox bbbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbbox2 = new BlackBox();

    }
}
