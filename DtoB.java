public class DtoB {

    public DtoB() {

    }

    public static String dtoBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        int rem = 0;

        do {
            rem = decimal % 2;
            decimal /= 2;
            binary.append(rem);

        } while (decimal != 0);

        binary.reverse();
        return binary.toString();
    }

}