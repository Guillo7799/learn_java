public class S04Ejercicio03{
    public static void main(String[] args){
        System.out.println("Ingrese el numero del dia (del 1-7): ");
        int num = Integer.parseInt(System.console().readLine());
        String nombreDia;

        switch(num){
            case 1:
                nombreDia="lunes";
                break;
            case 2:
                nombreDia="Martes";
                break;
            case 3:
                nombreDia="Miercoles";
                break;
            case 4:
                nombreDia="Jueves";
                break;
            case 5:
                nombreDia="Viernes";
                break;
            case 6:
                nombreDia="Sabado";
                break;
            case 7:
                nombreDia="Domingo";
                break;
            default:
                nombreDia = "No existe ese dia";
                break;
        }
        System.out.println("El dia es: " + nombreDia);
    }
}