import java.util.Scanner;

public class S04Ejercicio07{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese las 3 notas separados por un espacio (solo valores enteros): ");
        int val1=s.nextInt();
        int val2=s.nextInt();
        int val3=s.nextInt();
        int total=((val1+val2+val3)/3);
        System.out.println("El valor de la media de las tres notas es: "+total);
    }
}