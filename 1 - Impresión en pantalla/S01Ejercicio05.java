public class S01Ejercicio05 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(rojo + "\n Lunes\tMartes\tMierco.\tJueves\tViernes");
    System.out.println(" ======\t=======\t======\t======\t=======");
    System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tDAW");
    System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tDAW");
    System.out.println(celeste + " ED" + rojo + "\tDAW\tDAW" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + " FOL" + rojo + "\tDAW\tDAW" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
    System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
  }
}