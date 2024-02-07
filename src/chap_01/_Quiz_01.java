package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보
        String bus_number = "상암08"; // busno라고 변수를 지정함.
        int remain_time = 3; // minute라고 변수를 지정함.
        double remain_distance = 1.5; // distance라고 변수를 지정함

        System.out.println(bus_number + "번 버스");
        System.out.println("약 " + remain_time + "분 후 도착");
        System.out.println("남은 거리 " + remain_distance + "km");
    }
}
