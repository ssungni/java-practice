package chap_06;

public class _03_Return {
    // 호텔 전화번호
    // ... void: 반환값이 없는 메소드임을 알려준 것!
    // 반환할 메소드의 형태를 작성해줘야함
    public static String getPhoneNumber() {
        String phonenumber = "02-1234-5678";
        return phonenumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 엑티비티 : " + getActivity());
    }
}
