import java.util.Scanner;

public class S04Ejercicio05{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Resolución de ecuaciones de primer grado del tipo ax+b=0");
        System.out.println("Ingrese el valor de a y el valor de b (pueden ser decimales pero los valores deben estar separados por un espacio): ");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double x=-(b/a);
        System.out.println("El valor de su ecuacion es: "+ x);

    }
}