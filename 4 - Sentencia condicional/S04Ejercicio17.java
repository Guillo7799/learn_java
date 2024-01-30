public class S04Ejercicio17{
    public static void main(String[] args) {
        
        System.out.println("Introduzca un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        int cifra = (num % 10);
        System.out.println("La ultima cifra es: " + cifra);
    }
}