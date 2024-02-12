package chap_04;

public class _Quiz_04 {
/*    public static void main(String[] args) {
        int hour_parking_fee = 4000;
        int max = 30000;

        int hour = 10; // 주차 시간

        double parking_fee = hour_parking_fee * hour; // 주차비 = 시간당 비용 * 시간
        double sale_parking_fee = hour_parking_fee * hour * 0.5; // 50%

        boolean formal = false; // formal: 일반 차량
        boolean small = false; // small: 경차
        boolean disable = true; // disable: 장야인

        double total = 0;

        if(formal) {
            total = parking_fee;
        } else if (small || disable) {
            total = sale_parking_fee;
        }

        if ((parking_fee >= max) || (sale_parking_fee >= max)) {
            total = max * 0.5;
        }
        System.out.println("주차 요금은 " + total + "원 입니다.");
    }*/

    public static void main(String[] args) {
        int hour = 10;

        // boolean formal = false; // formal: 일반 차량
        boolean small = false; // small: 경차
        boolean disable = true; // disable: 장야인

        int parking_fee = 4000 * hour; // 주차비 = 시간당 비용 * 시간

        if (parking_fee > 30000) {
            parking_fee = 30000;
        }

        if (small || disable) {
            parking_fee /= 2;
        }

        System.out.println("주차 요금은 " + parking_fee + "원 입니다.");

    }
}
