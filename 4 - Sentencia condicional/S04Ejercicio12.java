public class S04Ejercicio12{
    public static void main(String[] args){
        int contador=1;
        System.out.println("Test de conocimientos generales.");
        System.out.println("Indicaciones: Se le mostrará un cuestionario de 10 preguntas debe responder una por una, cuando termine se le mostrará su califcacion");
        System.out.println("1.- Cuanto es la raiz cuadrada de 25?");
        int raiz = Integer.parseInt(System.console().readLine());
        if(raiz==5){
            contador=contador + 1;
        } else {
            contador = 0;
        }
        System.out.println("2.- Quién escribió la Iliada?");
        String iliada=System.console().readLine();
        if(iliada == "homero"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("3.- Quién escribió Miguel Strogoff?");
        String verne=System.console().readLine();
        if(verne == "verne"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("4.- Cuál es el río más grande del mundo?");
        String amazonas=System.console().readLine();
        if(amazonas == "amazonas"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("5.- Qué tipo de animal es la Ballena?");
        String mamifero=System.console().readLine();
        if(mamifero == "mamifero"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("6.- En que anio llego Cristobal Colon?");
        int cristobal=Integer.parseInt(System.console().readLine());
        if(cristobal == 1492){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("7.- Cual es el oceano mas grande del mundo?");
        String oceano=System.console().readLine();
        if(oceano == "pacifico"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("8.- Cuantos anios duro la primera guerra mundial?");
        int guerra=Integer.parseInt(System.console().readLine());
        if(guerra == 4){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("9.- Jeff Bezos fundo?");
        String bezos=System.console().readLine();
        if(bezos == "amazon"){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("10.- Cuantos huesos tiene el cuerpo?");
        int cuerpo=Integer.parseInt(System.console().readLine());
        if(cuerpo == 206){
            contador=contador+1;
        }else {
            contador = 0;
        }
        System.out.println("Su puntaje es: "+(contador-1));
    }
}