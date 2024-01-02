import java.util.Scanner;

public class OddOrEven {
    //Method one by %
    public static String m1(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //By OR operator
    public static String byOR(int a) {
        if ((a | 1) > a) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //By AND operator
    public static String byAND(int a) {
        if ((a & 1) == 1) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    //By XOR operator
    public static String byXOR(int a) {
        if ((a ^ 1) == a + 1) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String byLSB(int a) {
        if (a != 0) {
            if (Integer.toBinaryString(a).endsWith("0")) {
                return "Even";
            } else {
                return "Odd";
            }
        } else return "Zero";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = scanner.nextInt();

        //Method one by %
        System.out.println(m1(a));

        //By OR operator
        System.out.println(byOR(a));

        //By AND operator
        System.out.println(byAND(a));

        //By XOR operator
        System.out.println(byXOR(a));

        //By LSB the least significant Bit operator
        System.out.println(byLSB(a));
    }
}
