package remainder;

public class Remainder {

    public static int compute(int dividend, int divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);

        int r = a % b;

        if (dividend < 0) {
            r = -r;
        }

        return r;
    }
}
