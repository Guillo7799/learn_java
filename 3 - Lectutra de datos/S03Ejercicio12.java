import java.util.Scanner;

public class S03Ejercicio12{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Introduzca a base imponible: ");
        double base=s.nextDouble();
        System.out.println("Introduzca el tipo de IVA (general, reducido o perreducido): ");
        String ivaIngreso =  System.console().readLine();
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promocional =  System.console().readLine();
        System.out.println("base imponible\t "+base);
        System.out.println("IVA (10%)\t "+(base*0.1));
        System.out.println("Precio con IVA\t "+((base*0.1)+base));
        System.out.println("Cód. promo. (mitad):\t "+"-"+(((base*0.1)+base)/2));
        System.out.println("TOTAL:\t "+(((base*0.1)+base)/2));
    }
}