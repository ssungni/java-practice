package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);

        System.out.println("예시 1====================");
        b1.record(true, false, 3);

        System.out.println("에시 2====================");
        b1.record(true, true, 5);

        System.out.println("====================");
        System.out.println("====================");
        b1.record();
    }

}
