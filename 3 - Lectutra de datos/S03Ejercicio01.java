import java.util.Scanner;

public class S03Ejercicio01{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa dos numeros (pueden ser decimales) con espaciado entre ellos: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();

        double result = x1* x2;

        System.out.println("El resultado de la suma es: ");
        System.out.print("\n");
        System.out.print(result);
    }
}