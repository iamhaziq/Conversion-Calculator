import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Conversion Program!");

        while (true) {
            System.out.println("Please select a conversion:");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Binary to Hexadecimal");
            System.out.println("3. Decimal to Binary");
            System.out.println("4. Decimal to Hexadecimal");
            System.out.println("5. Hexadecimal to Binary");
            System.out.println("6. Hexadecimal to Decimal");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.println("Enter the value to convert:");
            String value = scanner.nextLine();

            switch (choice) {
                case 1:
                    int binary = Integer.parseInt(value);
                    int decimal = BtoD.binarytoDecimal(binary);
                    System.out.println("Decimal value: " + decimal);
                    break;
                case 2:
                    binary = Integer.parseInt(value);
                    String hexadecimal = BtoH.btoHex(binary);
                    System.out.println("Hexadecimal value: " + hexadecimal);
                    break;
                case 3:
                    int decimalValue = Integer.parseInt(value);
                    String binaryValue = DtoB.dtoBinary(decimalValue);
                    System.out.println("Binary value: " + binaryValue);
                    break;
                case 4:
                    decimalValue = Integer.parseInt(value);
                    hexadecimal = DtoH.dtoHex(decimalValue);
                    System.out.println("Hexadecimal value: " + hexadecimal);
                    break;
                case 5:
                    String hexValue = value;
                    binaryValue = HtoB.htoBinary(hexValue);
                    System.out.println("Binary value: " + binaryValue);
                    break;
                case 6:
                    hexValue = value;
                    decimal = HtoD.htoDecimal(hexValue);
                    System.out.println("Decimal value: " + decimal);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
