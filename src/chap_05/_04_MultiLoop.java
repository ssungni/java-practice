package chap_05;

public class _04_MultiLoop {
    public static void main(String[] args) {
        // 다차원 배열 array
        String[][] seats = new String[][] {
                // Alt 누르고 영역 만들면 한 번에 복사됨.
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로 크기
            for (int j = 0; j < 5; j++) { // 가로 크기
                System.out.print(seats[i][j] + " "); // [세로][가로]
            }
            System.out.println();
        }

        System.out.println("================================");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };


        for (int i = 0; i < seats2.length; i++) { // 세로 크기
            for (int j = 0; j < seats2[i].length; j++) { // 가로 크기
                System.out.print(seats2[i][j] + " "); // [세로][가로]
            }
            System.out.println();
        }

        System.out.println("================================");
        // 10 x 15
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for(int i = 0; i < seats3.length; i++){
            for(int j = 0; j < seats3[i].length; j++){
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표 구매
        seats3[7][8] = "__"; // H9
        seats3[7][9] = "___"; // H10

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로 크기
            for (int j = 0; j < seats3[i].length; j++) { // 가로 크기
                System.out.print(seats3[i][j] + " "); // [세로][가로]
            }
            System.out.println();
        }


    }
}
