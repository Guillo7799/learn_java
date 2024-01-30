public class S04Ejercicio06{
    public static void main(String[] args){
        double gravedad = 9.81;
        System.out.println("Calculo del tiempo en caer de un objeto");
        System.out.println("Ingrese el valor de la altura (puede ser en decimales): ");
        double altura = Double.parseDouble(System.console().readLine());
        double tiempo = Math.sqrt(((2 * altura) / gravedad) );
        System.out.println("El valor del tiempo es: "+tiempo);
    }
}