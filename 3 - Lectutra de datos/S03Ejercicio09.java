import java.util.Scanner;

public class S03Ejercicio09{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        double pi=3.1416;
        double fraccion=0.333;
        System.out.println(".::Calculo del volumen de un cono::.");
        System.out.println("Ingrese el valor del radio(puede ser decimales) y el valor de la altura(tambien en decimales) separados por espacios: ");
        double radio=s.nextDouble();
        double altura = s.nextDouble();
        
        System.out.print(fraccion);

        double total=fraccion*pi*(radio*radio)*altura;

        System.out.println("El valor del volumen del cono es: "+total);
    }
}