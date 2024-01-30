public class S03Ejercicio11{
    public static void main(String[] args){
        
        System.out.println("Ingrese la cantidad de kilobites a convertir a megas: ");
        double kilo=Double.parseDouble(System.console().readLine());
        System.out.println("El valor en megas es : "+(kilo/1024)+" mgs");
    }
}