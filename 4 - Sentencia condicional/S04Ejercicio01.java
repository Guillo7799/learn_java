public class S04Ejercicio01{
    public static void main(String[] args){
        System.out.println("Ingrese el numero de dia que desee: ");
        int valor=Integer.parseInt(System.console().readLine());

        switch(valor){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese dia");
        }
    }
}