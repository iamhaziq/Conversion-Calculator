public class DtoH {

    public DtoH() {

    }

    public static String dtoHex(int decimal) {
        int rem;
        StringBuilder hex = new StringBuilder();
        do {
            rem = decimal % 16;
            decimal /= 16;
            if (rem > 9) {
                hex.append((char) ('A' + rem - 10));
            } else {
                hex.append(rem);
            }
        } while (decimal != 0);

        hex.reverse();
        return hex.toString();

    }

}