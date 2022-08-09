import java.util.Scanner;

import static java.lang.Math.pow;

public class Calculadora {

    public static void main(String[] args) {


        System.out.println("Entre com dois numeros: ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        System.out.println("Qual operacao gostaria de fazer: + - * / pot ");

        teclado.nextLine();
        String operacao = teclado.nextLine();

        if(operacao.equals("+")){
            System.out.println(num1 + num2);
        }
        else if(operacao.equals("-")){
            System.out.println(num1 - num2);
        }
        else if(operacao.equals("*")){
            System.out.println(num1 * num2);
        }
        else if(operacao.equals("/")){
            System.out.println(num1/num2);
        }
        else if(operacao.equals("pot")){
            System.out.println(pow(num1,num2));
        }
        else{
            System.out.println("Operacao nao existente");

        }








    }
}
