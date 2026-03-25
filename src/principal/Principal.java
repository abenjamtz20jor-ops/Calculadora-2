package principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("De cual quiere sacar el area");
        System.out.println("Del Triangulo o del circulo:");
        String respuesta=sc.next();
        
        if(respuesta.equalsIgnoreCase("triangulo"))
        {System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = sc.nextInt();
        
        //Suma = new Suma();
        //System.out.println("El area del triangulo es: "+suma.calculadora(a,b));
        }
        
        if(respuesta.equalsIgnoreCase("circulo"))
        System.out.println("Ingresa el radio: ");
        int e = sc.nextInt();
        
        //Resta resta = new Resta();
        //System.out.println("El area del circulo es: "+resta.calculadora(c,d,e));
    }
}