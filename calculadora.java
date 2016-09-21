package principal;

import java.util.Scanner;
import modulo.Calculo;

public class calculadora {

    public static void main(String[] args) {
        Calculo calculo = new Calculo(pedir(), pedir());
        System.out.println("La suma es: " + calculo.Sumar());
                comprobarResta(calculo);
    }

    public static int pedir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());
        return num;
    }
    
    public static void comprobarResta (Calculo calculo){
        int resta;
        resta = calculo.Restar();
    if (resta>=0) {
        System.out.println("La resta es: "+resta);
    } else {
        System.out.println("El resultado no es un número natural, por favor introduzca otros valores");
    }
    }
}
