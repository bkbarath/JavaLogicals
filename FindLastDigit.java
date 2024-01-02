import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;

public class FindLastDigit {

    //Simple Method
    public static int simple(long a) {
        return (int) (a % 10);
    }

    static int getLastDigits(String a, String b) {
        if (b.length() == 1 && b.equals("0")) {
            return 1;
        }
        if (a.equals("0"))
            return 1;

        int exponent = (modulo(4, a) == 0 ? 4 : modulo(4, a));
        int res = (int) (Math.pow(a.charAt(a.length() - 1) - '0', exponent));
        return res;
    }

    public static int modulo(int a, String b) {
        int res = 0;

        for (int i = 0; i < b.length(); i++) {
            res = (res * b.charAt(i) - '0') % a;
        }
        return res;
    }

    public static int byBigInt(int a, int b) {
        BigInteger bigA = new BigInteger(String.valueOf(a));
        BigInteger bigB = new BigInteger(String.valueOf(b));

        BigInteger c = bigA.modPow(bigB, BigInteger.TEN);

        return c.intValue();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long a = scanner.nextLong();

        System.out.print("Enter a second Number: ");
        long b = scanner.nextLong();

        //Power Value
        System.out.println((long) Math.pow(a, b));

        //Simple Method
//        System.out.println(simple(a));

        //The accurate value comes in that 3423
        System.out.println(simple((long) Math.pow(a, b)));

        //Simple Method
        System.out.println(getLastDigits(String.valueOf(a), String.valueOf(b)));

        //Using Biginteger
//        System.out.println(byBigInt(a, b));
    }
}
