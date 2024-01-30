import java.util.Scanner;

public class S03Ejercicio07{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Ingrese el valor de la base imponible (puede incluir decimales): ");
        double sub = s.nextDouble();

        double total=(sub*0.12)+sub;
        System.out.println("El total de su factura es: "+ total);
    }
}