import java.util.Scanner;

public class PostoCombustivel {

    public static void main(String[] args) {
        System.out.println(" Digite: G para Gasolina e A para Alcool");
        Scanner teclado = new Scanner(System.in);
        String aux = teclado.nextLine();
        char combustivel = aux.charAt(0);

        switch(combustivel){

            case 'G':
                System.out.println("Quantos litros: ");
                int litrosG = teclado.nextInt();
                if(litrosG <= 20){
                    double precoG;
                    precoG = litrosG * 5.76;
                    System.out.println("Valor total de R$"+precoG);
                }
                else{
                    double precoG;
                    precoG = litrosG * 5.64;
                    System.out.println("Valor total de R$"+precoG);
                }
                break;

            case 'A':
                System.out.println("Quantos litros: ");
                int litrosA = teclado.nextInt();
                if(litrosA <= 20){
                    double precoA;
                    precoA = litrosA * 4.75;
                    System.out.println("Valor total de R$"+precoA);
                }
                else{
                    double precoA;
                    precoA = litrosA * 4.65;
                    System.out.println("Valor total de R$"+precoA);
                }
                break;


        }


    }
}
