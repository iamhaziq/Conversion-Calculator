public class DtoB {
    private int decimal;
    private int binary;

    public DtoB(int decimal){
        this.decimal = decimal;
    }

    public int dtoBinary(){
        int base = 1;
        binary = 0;
        int rem = 0;
        

        do{
            rem = decimal %2;
            decimal /= 2;
            binary +=  (base *rem);
            base *= 10;


        }while(decimal != 0);


        return binary;
    }
    
}