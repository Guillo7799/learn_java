import java.util.Scanner;

public class S03Ejercicio03{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        double euro=0.006;

        System.out.println("Ingrese la cantidad de pesetas(puede ser decimal): ");
        double pesetas=s.nextDouble();

        double total = pesetas*euro;

        System.out.print("La cantidad de euros que tiene es: ");
        System.out.print("\n");
        System.out.print(total+" euros");

    }
}