
package principal;

import java.util.Scanner;
import modulo.Calculo;


public class calculadora {

  
    public static void main(String[] args) {
      Calculo calculo = new Calculo(pedir(),pedir());
        System.out.println("La suma es: "+calculo.Sumar());
    }
    
    public static int pedir (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());
    return num;
    }
}
