public class BtoD {
    private int binary;
    private int length; // lenght of binary

    public BtoD(int binary) {
        this.binary = binary;
        

        
    }
    private static int getLength(int binary){
        return Integer.toString(binary).length();
        
    }


    public int toDecimal(){
        length = getLength(binary);
        return binarytoDecimal(binary);
    }

    public static int binarytoDecimal(int binary){
       int number = 0;
        int length = getLength(binary);
        int divisor;

        
        for ( int i = 0 ; i < length; i ++){
            divisor = binary%10;
            number += (divisor) *(Math.pow(2, i)); 
            binary /= 10;
        }
        return number;

    }
    

}