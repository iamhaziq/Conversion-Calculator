public class HtoB{
    
    

    public HtoB(){
        

    }

    public static String htoBinary( String hexaDecimal){
           
        int decimal = HtoD.htoDecimal(hexaDecimal);
        return DtoB.dtoBinary(decimal);
        
    }



}