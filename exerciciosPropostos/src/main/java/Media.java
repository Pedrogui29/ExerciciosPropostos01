import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        System.out.println("Entre com suas notas NP1 e NP2");
        Scanner teclado = new Scanner(System.in);
        System.out.print("NP1: ");
        int NP1 = teclado.nextInt();
        System.out.print("NP2: ");
        int NP2 = teclado.nextInt();
        System.out.println("Sua media final foi de: "+ (NP1+NP2)/2);

       //Extra

        if((NP1+NP2)/2 >= 60){
            System.out.println("Aprovado");
        }

        else if((NP1+NP2)/2 < 60 && (NP1+NP2)/2 >= 30 ){
            System.out.println("NP3");
        }
        else if ((NP1+NP2)/2 < 30){
            System.out.println("Reprovado");
        }



    }

}
