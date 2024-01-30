import java.util.Scanner;

public class S04Ejercicio09{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Calculadora de ecuaciones de segundo grado del tipo: ax^2 + bx + c = 0");
        System.out.println("Ingrese los valores de a, b y c separados (pueden ser decimales): ");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();

        if (a == 0)
        {
            System.out.println("No existe solucion para la ecuacion con los valores ingresados");
        }
        if ((b == 0) && (c == 0)) {
            System.out.println("No existe solucion para la ecuacion con los valores ingresados");
        }
        double discriminante = ((b * b) - (4 * a * c));

        if (discriminante < 0 || a<0) {
            System.out.println("No existe resultados para el desciminante en cuestion y raíz infinita");
        } else {
            double x1 = ((-b) + (Math.sqrt(discriminante)) / (2 * a));
            double x2 = ((-b) - (Math.sqrt(discriminante)) / (2 * a));
            System.out.println("El primer valor de x es: "+x1);
            System.out.println("El segundo valor de x es: "+x2);
        }

        System.out.println("GRACIAS...");
    }
}