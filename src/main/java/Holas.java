import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contadorPositivos=0, contadorNegativos=0; 
        double promedioPositivos=0, promedioNegativos=0;
        System.out.println("Calcula promedio arreglo numeros positivos y negativos.\n");
        System.out.println("¿Cuantos numeros quieres usar?");
        int cant = sc.nextInt();
        int numeros[] = new int[cant];
        
        //Se guardan numeros positivos y numeros negativos.
        System.out.println("Guardar Numeros:");  
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero: ");
            numeros[i]=sc.nextInt();
        }
        
        System.out.println("\nLos numeros positivos son:");
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] > 0){
                contadorPositivos++;
                System.out.println(numeros[i]);
                promedioPositivos = promedioPositivos + numeros[i];
            }
        }
        promedioPositivos = promedioPositivos/contadorPositivos;
        System.out.println("El promedio de numeros positivos es: "+promedioPositivos);
        
        
        
        System.out.println("\nLos numeros negativos son: ");
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] < 0){
                contadorNegativos++;
                System.out.println(numeros[i]);
                promedioNegativos = promedioNegativos + numeros[i];
            }
        }
        promedioNegativos = promedioNegativos/contadorNegativos;
        System.out.println("El promedio de numeros negativos es: " +promedioNegativos );
        
    }
}