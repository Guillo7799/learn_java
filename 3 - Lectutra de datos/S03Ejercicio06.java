import java.util.Scanner;

public class S03Ejercicio06{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println(".:: Calculo del area del triangulo ::.");
        System.out.println("Ingrese el valor de la base del triangulo (puede ser con decimales) y el valor de la altura (puede ser decimales) ambos separados por un espacio: ");
        double base = s.nextDouble();
        double altura = s.nextDouble();
        
        double area=(base*altura)/2;

        System.out.print("\n");
        System.out.println("El area del triangulo es: "+area);
    }
}