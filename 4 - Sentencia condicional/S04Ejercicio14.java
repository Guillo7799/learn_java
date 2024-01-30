public class S04Ejercicio14{
    public static void main(String[] args){
        System.out.println("Verificador de un numero si es par y/o divisible para 5");
        System.out.println("Ingrese el numero: ");
        int n = Integer.parseInt(System.console().readLine());
        if((n%2==0)){
            System.out.println("El numero es par");
            if (n % 5 == 0) 
            {
                System.out.println("El numero tambien es divisible para 5");
            } else {
                System.out.println("Pero no es divisible para 5");
            }
        }else{
            System.out.println("El numero no es par y tampoco divisible para 5");
        }
    }
}