package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ASCII): 미국 표준 기준
        char c = 'A'; // 알파벳 대문자(A)는 65부터 시작, 소문자 (a) 97부터 시작, 숫자(0)는 48부터 시작.
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';

        System.out.println("======================");

        for(int i = 0; i < seats3.length; i++){
            for(int j = 0; j < seats3[i].length; j++){
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로 크기
            for (int j = 0; j < seats3[i].length; j++) { // 가로 크기
                System.out.print(seats3[i][j] + " "); // [세로][가로]
            }
            System.out.println();
        }
    }
}
