package 
public class HtoD{
    private String hex;
    

    public HtoD(String hex){
        this.hex = hex;
        
    }

    public static int htoDecimal( String hexaDecimal){
        
        StringBuilder hexa = new StringBuilder(hexaDecimal);
        hexa.reverse();

        int placevalue ;
        int base = 0;
        int decimal = 0;

        int len = hexa.length();
        for(int i = 0 ; i < len; i++){
            placevalue = (int) hexa.charAt(i);
            if (placevalue >= 48 && placevalue <= 57){
                placevalue -= 48;
            }
            else if (placevalue >= 65 && placevalue <=70) {
                placevalue -= 55;
            }
            else {
                continue;
            }
            decimal += (placevalue * Math.pow(16, base));
            
            
            base++;
        }
        
        

        return decimal;
    }
}