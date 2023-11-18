import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor total:");
        int valorTotal = scan.nextInt();
        scan.close();
        int parcelas;

        if(valorTotal < 1000){
            System.out.print("Esse valor é muito baixo para parcelar. Digite um valor maior ou igual 1000 reais.");
        }else{
            if(valorTotal % 1000 == 0){
                parcelas = valorTotal/1000;
                System.out.println("Você pode parcelar em até " + parcelas + " parcelas de 1000 reais");
            }else{
                parcelas = valorTotal/1000;
                double parcelaQuebrada = valorTotal / parcelas;
                System.out.println("Você pode parcelar em até " + parcelas + " parcelas de " + parcelaQuebrada + " reais.");

            }

        }
    }
}
