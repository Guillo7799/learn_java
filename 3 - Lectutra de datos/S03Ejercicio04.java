import java.util.Scanner;

public class S03Ejercicio04{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los dos numeros (pueden ser con decimales separados por .) con espacio entre los valores: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();

        double sum = x1 + x2;
        double rest = x1 - x2;
        double mult = x1 * x2;
        double div = x1 / x2;

        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + rest);
        System.out.println("El resultado de la multiplicacion es: " + mult);
        System.out.println("El resultado de la division es: " + div);

    }
}