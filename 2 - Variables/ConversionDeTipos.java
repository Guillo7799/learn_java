public class ConversionDeTipos{
    public static void main(String[] args){
        int x=2;
        int y=9;
        double division;

        //division=y/x;
        //System.out.println("El resultado es: "+division);

        division = (double) y / (double) x;
        System.out.println("El resultado es: "+division);
    }
}