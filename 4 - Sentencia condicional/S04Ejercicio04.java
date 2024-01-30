public class S04Ejercicio04{
    public static void main(String[] args){
        System.out.println("Calculo del salario");
        System.out.println("Ingrese la cantidad de dias (sin decimales): ");
        int horas = Integer.parseInt(System.console().readLine());
        int total;
        if(horas<=40){
            total = horas * 12;
            
        } else {
            total = (40*12) + ((horas -40)*16);
        }
        System.out.println("La cantidad de horas trabajadas: "+horas+" su remuneracion es: "+total);
    }
}