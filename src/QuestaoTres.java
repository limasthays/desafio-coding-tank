import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int quantidade = scan.nextInt();
        scan.close();
        String acumulador = "*";

        for(int i = 1; i < quantidade + 1; i++){
            for(int j = quantidade - i; j >= 0; j--){
                System.out.print(" ");
            }
                System.out.print(acumulador);
                acumulador+= "**";
            System.out.println();
        }


    }
}
