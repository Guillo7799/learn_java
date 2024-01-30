import java.util.Scanner;

public class S04Ejercicio11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        double segundos = 3600;
        double dia = 86400;

        System.out.println("Calculo del tiempo hasta la media noche");
        System.out.println("Ingrese el la hora y los minutos separados por un espacio (Pueden ser decimales)");
        double horas=s.nextDouble();
        double minutos = s.nextDouble();
        
        if (horas > 24 || minutos > 60) {
            System.out.println("No existe calculo para la hora y minutos indicados...");
        } else {
            double totalSegundos = (horas*segundos)+(minutos*60);
            double restante = dia-totalSegundos;
            System.out.println("La cantidad de segundos que restan hasta media noche son: "+restante+" segundos.");
        }
    }
}