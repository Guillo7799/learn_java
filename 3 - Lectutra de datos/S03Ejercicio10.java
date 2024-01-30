import java.util.Scanner;

public class S03Ejercicio10{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        double kilo=1024;
        System.out.println("Ingrese la cantidad de megas (puede ser con decimales): ");
        double megas=s.nextDouble();
        
        double total=megas*kilo;
        System.out.println("La cantidad de megas es: "+total);
    }
}