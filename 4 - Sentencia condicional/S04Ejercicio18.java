public class S04Ejercicio18{
    public static void main(String[] args){
        int valor=0;
        System.out.println("Ingrese un valor: ");
        int num=Integer.parseInt(System.console().readLine());
        if(num<10){
            valor = num;
            System.out.println("La primera cifra del numero es: "+valor);
        }else if((num>=10)&& (num<100)){
            valor = (num / 10);
            System.out.println("La primera cifra del numero es: "+valor);
        }else if((num>=100)&&(num<1000)){
            valor = (num / 100);
            System.out.println("La primera cifra del numero es: "+valor);
        }else if((num>=1000)&&(num<100000)){
            valor = (num / 1000);
            System.out.println("La primera cifra del numero es: "+valor);
        }else{
            System.out.println("Error");
        }
    }
}