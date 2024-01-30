import java.util.Scanner;

public class S03Ejercicio13{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        //double porcentaje1=0.4;

        System.out.println("Introduce la nota del primer examen(puedes incluir decimales): ");
        double nota1=s.nextDouble();
        //double nota1Dos=nota1*0.4;
        System.out.println("¿Que nota quieres sacar en el trimestre?(puedes incluir decimales): ");
        double finali = s.nextDouble();
        double total = ((finali*100)-(nota1*40))/60;
        
        System.out.println("Para tener un "+ finali +" en el trimestre necesitas sacar un: "+ total +" en el segundo examen");
    }
}