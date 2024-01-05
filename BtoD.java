public class BtoD {
    private int binary;
    private int length; // lenght of binary

    public BtoD(int binary) {
        this.binary = binary;
        

        
    }
    private int getLength(int binary){
        return Integer.toString(binary).length();
        
    }


    public int toDecimal(){
        int number = 0;
        length = getLength(binary);
        int tempBinary = binary;
        int divisor;
        
        for ( int i = 0 ; i < length; i ++){
            divisor = tempBinary%10;
            number += (divisor) *(Math.pow(2, i)); 
            tempBinary /= 10;
        }

        return number;
    }
    

}