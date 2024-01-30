public class S04Ejercici20{
    public static void main(String[] args){
        System.out.println("Verificacion de que un numero sea capicua");
        System.out.println("Ingrese un numero de maximo 5 digitos");
        double val=Double.parseDouble(System.console().readLine());
        double numero = (val % 10);
        if ((val / 100) == (val % 10)) {
            System.out.println("Iguales");
        } else {
            System.out.println("No son iguales");
        }
        System.out.println("El valor es: "+numero);
    }
}