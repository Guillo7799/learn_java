import java.util.Scanner;

public class S03Ejercicio05{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println(".:: Calculo del area del rectangulo ::.");
        System.out.println("Ingrese el diametro del lado del rectángulo (puede ser con decimales): ");
        double lado = s.nextDouble();
        
        double area=lado*lado;

        System.out.print("\n");
        System.out.println("El area del rectangulo es: "+area);


    }
}