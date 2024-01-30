public class S04Ejercicio02{
    public static void main(String[] args){
        System.out.println("Ingrese la hora la hora (solo se permite las horas mas no los minutos): ");
        int hora = Integer.parseInt(System.console().readLine());

        if((6<=hora) && (hora<=12)){
            System.out.println("Buenos dias Guillo");
        }if((13<=hora) && (hora<=20)){
            System.out.println("Buenas tardes Guillo");
        }if((0<hora && hora<=5) || (hora>=21 && hora<24) ){
            System.out.println("Buenas noches Guillo");
        }if(hora<0 || hora>=25){
            System.out.println("No existe saludo para usted.");
        }
    }
}