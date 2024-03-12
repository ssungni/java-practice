package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // 몰라도 되는 디테일한 부분을 가리고, 필요한 정보만 공개
        // abstract
        // 추상 클래스 (아직 완성되지 앟은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera();
        /* 다음과 같이 선언 시 camera는 추상 클래스(즉, 완성되지 않은 클래스)이기 때문에 생성 불가*/
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
