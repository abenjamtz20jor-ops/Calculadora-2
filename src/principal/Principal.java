package principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("De cual quiere sacar el area");
        System.out.println("Del rombo o del trapecio:");
        String respuesta=sc.next();
        
        if(respuesta.equals("rombo"))
        {System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = sc.nextInt();
        
        //Suma = new Suma();
        //System.out.println("El area del rombo es: "+suma.calculadora(a,b));
        }
        
        if(respuesta.equals("trapecio"))
        System.out.println("Ingrese la Base mayor: ");
        int c = sc.nextInt();
        System.out.println("Ingresa la base menor: ");
        int d = sc.nextInt();
        System.out.println("Ingresa la altura ");
        int e = sc.nextInt();
        
        //Resta resta = new Resta();
        //System.out.println("El area del trapecio es: "+resta.calculadora(c,d,e));
    }
}