package ejercicio_11;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double promedio=0.0;

        System.out.println("INTRODUZCA NOTA DE EJERCICIOS ENTREGABLES: ");
        double nota1 = sc.nextDouble();
        System.out.println("INTRODUZCA NOTA DE POUS AVALUABLES: ");
        double nota2 = sc.nextDouble();
        System.out.println("INTRODUZCA NOTA DE EXAMEN FINAL: ");
        double nota3 = sc.nextDouble();
        System.out.println("INTRODUZCA NOTA DE PRACTICA FINAL: ");
        double nota4 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("NOTA PROMEDIO ES:" + promedio);

        if (promedio < 5 ){
            System.out.println("DESAPROBADO");
        }else {
            System.out.println("aprobado");
        }
    }
}
