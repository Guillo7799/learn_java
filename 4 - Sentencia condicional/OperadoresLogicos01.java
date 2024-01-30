public class OperadoresLogicos01{
    public static void main(String[] args){
        System.out.println("Adivina el numero que estoy pensando.");
        System.out.println("Introduce un numero entre el 1 y el 100: ");
        String linea = System.console().readLine();
        int n = Integer.parseInt(linea);

        if((n<1) || (n>100)){
            System.out.println("El numero introducido debe estar en el intervalo 1 - 100.");
            System.out.println("Tienes otra oportunidad, introduce un numero: ");
            linea = System.console().readLine();
            n=Integer.parseInt(linea);
        }
        if(n==24){
            System.out.println("¡Enhorabuena!, ¡has acertado!");
        }else{
            System.out.println("Lo siento, ese no es el numero que estoy pensando.");
        }
    }
}