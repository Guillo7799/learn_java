import java.util.Scanner;

public class S03Ejercicio02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double pesetas = 166;

        System.out.println("Ingrese la cantidad de euros(pueden ser decimales): ");
        double euros = s.nextDouble();

        double total = euros*pesetas;

        System.out.print("La cantidad de pesetas es: ");
        System.out.print("\n");
        System.out.print(total + " pesetas");
    }
}