public class S04Ejercicio15{
    public static void main(String[] args) {
        System.out.println("Creador de pirámides");
        System.out.println("Introduzca el caracter de relleno de su pirámide: ");
        String r = System.console().readLine();
        System.out.println("Seleccione a que punta desea que vaya su piramide: ");
        System.out.println("\na) Arriba, b) Abajo, c) Izquierda, d) Derecha");
        String val = System.console().readLine();
        System.out.println("El valor que escogio es: " + val);
        switch(val){
            case "a":
                System.out.println("Escogiste punta Arriba");
                System.out.println("   "+r);
                System.out.println("  "+r+r+r);
                System.out.println(" "+r+r+r+r+r);
                break;
            case "b":
                System.out.println("Escogiste punta Abajo");
                System.out.println(" " + r + r + r + r + r);
                System.out.println("  " + r + r + r);
                System.out.println("   "+r);
                break;
            case "c":
                System.out.println("Escogiste punta Izquierda");
                System.out.println("  " + r);
                System.out.println(" "+r + r);
                System.out.println(r+ r + r);
                System.out.println(" "+ r + r);
                System.out.println("  " + r);
                break;
            case "d":
                System.out.println("Escogiste punta Derecha");
                System.out.println(r + "  ");
                System.out.println(r + r+" ");
                System.out.println(r + r + r);
                System.out.println(r + r+" ");
                System.out.println(r + "  ");
                break;
            default:
                System.out.println("Gracias por participar...");
        }
    }
}