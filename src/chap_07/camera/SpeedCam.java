package chap_07.camera;

// SpeedCam is a Camera. (O)
// Camera is a SpeedCam. (X)
public class SpeedCam extends Camera{ // 과속 방지 카메라
    // 자식 클래스
//    public String name;

    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        // 사진 촬영
//        System.out.println("사진을 촬영합니다.");
        super.takePicture(); // 부모의 클래스 내용을 쓰고 추가 기능을 쓸 예정
        checkSpeed();
        recognizedLicensePlate();
    }
//
//    public void recordVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다");
    }

    public void recognizedLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() { // 덭어씀
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
