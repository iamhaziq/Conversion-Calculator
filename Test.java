public class Test {
    public static void main(String[] args) {
        BtoD num = new BtoD( 101010010);
        System.out.println(num.toDecimal());
        BtoH numb = new BtoH(1111);
        System.out.println(numb.btoHex());
        DtoB numbD = new DtoB(11);
        System.out.println(numbD.dtoBinary());
        DtoH numDtoH = new DtoH(9999);
        System.out.println(numDtoH.dtoHex());
        HtoD numbH = new HtoD("1A");
        System.out.println(numbH.htoDecimal());

    }
}
