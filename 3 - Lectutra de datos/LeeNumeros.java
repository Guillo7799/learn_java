public class LeeNumeros{
    public static void main(String[] args){

        System.out.println("Por favor introduce un numero: ");
        int primerNumero;
        primerNumero = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce otro, por favor: ");
        int segundoNumero;
        segundoNumero = Integer.parseInt(System.console().readLine());

        int total = (2*primerNumero) + segundoNumero;

        System.out.println("El primer numero introducido es: "+primerNumero);
        System.out.print("y el segundo es: "+segundoNumero);
        System.out.println("El doble del primer número más el segundo es: ");
        System.out.println(total);
    }
}