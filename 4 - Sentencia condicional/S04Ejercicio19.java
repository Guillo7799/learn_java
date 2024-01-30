public class S04Ejercicio19{
    public static void main(String[] args){
        //String valor = "negativo";
        System.out.println("Calculo de digitos de un numero");
        System.out.println("Ingrese un numero: ");
        int valor = Integer.parseInt(System.console().readLine());
        if (valor > 0) 
        {
            if((valor<10)){
                System.out.println("El valor es de 1 digito");
            }else if((valor<100)){
                System.out.println("El valor es de 2 digitos");
            }else if((valor<1000)){
                System.out.println("El valor es de 3 digitos");
            }else if((valor<10000)){
                System.out.println("El valor es de 4 digitos");
            }else if((valor<100000)){
                System.out.println("El valor es de 5 digitos");
            }else{
                System.out.println("El valor tiene digitos superiores");
            }
        } else if(valor<0){
            if((valor>-10)){
                System.out.println("El valor es de 1 digito");
            }else if((valor>-100)){
                System.out.println("El valor es de 2 digitos");
            }else if((valor>-1000)){
                System.out.println("El valor es de 3 digitos");
            }else if((valor>-10000)){
                System.out.println("El valor es de 4 digitos");
            }else if((valor>-100000)){
                System.out.println("El valor es de 5 digitos");
            }else{
                System.out.println("El valor tiene digitos superiores");
            }
        }
        
    }
}