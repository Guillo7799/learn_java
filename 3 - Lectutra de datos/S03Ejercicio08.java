import java.util.Scanner;

public class S03Ejercicio08{
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        double horax=12;

        System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");
        double cantidad=s.nextDouble();

        double total=cantidad*horax;
        System.out.println("Su salario es: "+total);
        
    }
}