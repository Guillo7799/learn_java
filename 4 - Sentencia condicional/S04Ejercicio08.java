import java.util.Scanner;

public class S04Ejercicio08{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese las 3 notas separados por un espacio (solo valores enteros): ");
        int val1=s.nextInt();
        int val2=s.nextInt();
        int val3=s.nextInt();
        int total=((val1+val2+val3)/3);
        if(total<=5){
            System.out.println("Su nota es insuficiente: ");
        }if(total>5 && total<=6){
            System.out.println("Su nota esta bien");
        }if(total>=7 && total<=8){
            System.out.println("Su nota es notable");
        }if(total>=9 && total<=10){
            System.out.println("Su nota es notable o sobresaliente");
        }if(total > 10 || total<0){
            System.out.println("Su nota no esta dentro del rango calificable");
        }
        System.out.println("El valor de la media de las tres notas es: "+total);
    }
}