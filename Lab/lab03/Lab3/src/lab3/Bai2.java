package lab3;

public class Bai2 {

    public static void MultiTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Multiplication Table");
        MultiTable();
    }
}
