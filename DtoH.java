public class DtoH{  
    private int decimal;
    private StringBuilder hex = new StringBuilder();

    public DtoH(int decimal){
        this.decimal = decimal;
    }

    public String dtoHex(){
        int rem;
        do{
            rem = decimal %16;
            decimal /= 16;
            if(rem > 9) {
                hex.append((char) ('A' + rem - 10));
            } else {
                hex.append(rem);
            }
        }while (decimal!=0);






        hex.reverse();
        return hex.toString();

    }

}