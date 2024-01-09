import java.util.List;
import java.util.ArrayList;

public class BtoH {

    private int binary;
    private int length; // length of binary
    private List<Integer> integerList = new ArrayList<>();

    public BtoH() {
        
    }

 

    public static String btoHex(int binary){
        List<Integer> integerList = new ArrayList<>();
        StringBuilder hex = new StringBuilder();
        int tempBinary = binary;
        int length = Integer.toString(binary).length();;

        for (int i = 0; i < length / 4 + 1; i++) {
            integerList.add(BtoD.binarytoDecimal(tempBinary % 10000));
            tempBinary /= 10000;
        }

        for (int i = integerList.size() - 1; i >= 0; i--) {
            int num = integerList.get(i);
            if(i == integerList.size() - 1 && num == 0) {
                continue;
            }
            else if(num > 9) {
                hex.append((char) ('A' + num - 10));
            } else {
                hex.append(num);
            }
        }
        
        return hex.toString();
    }
}