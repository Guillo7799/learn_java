import java.util.Scanner;

public class S04Ejercicio13{
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int menor;
        int medio;
        int mayor;
        System.out.println("Introduzca 3 numeros separados por un espacio (no decimales, enteros): ");
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        System.out.println("Los tres numeros son: " + num1 + ", " + num2 + ", " + num3);
        if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {
            System.out.println("El orden es: " + num1 + "," + num2 + "," + num3);
        } else if ((num1 < num2) && (num1 > num3) && (num2 > num3)) {
            System.out.println("El orden es: "+num3+","+num1+","+num2);
        } else if ((num1 > num2) && (num1 < num3)) {
            System.out.println("El orden es: "+num2+","+num1+","+num3);
        } else if ((num1 > num2) && (num1 > num3) && (num3<num2)) {
            System.out.println("El orden es: "+num3+","+num2+","+num1);
        } else if ((num2 < num1) && (num2 < num3) && (num3 < num1)) {
            System.out.println("El orden es: "+num2+","+num3+","+num1);
        }
        
    }
}