public class BtoD {

    public BtoD() {

    }

    public static int binarytoDecimal(int binary) {
        int number = 0;
        int length = Integer.toString(binary).length();
        int divisor;

        for (int i = 0; i < length; i++) {
            divisor = binary % 10;
            number += (divisor) * (Math.pow(2, i));
            binary /= 10;
        }
        return number;
    }
}
