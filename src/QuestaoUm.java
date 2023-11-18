import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int valorEmprestimo = 0;
        float taxaDeJuros = 0;
        int tempoParaPagamento = 0;


        String[] textos = {"Qual o valor do empréstimo?", "Qual a taxa de juros do empréstimo?", "Qual o tempo (em meses) para pagamento?"};

        for(int i = 0; i < 3; i++){
            System.out.println(textos[i]);
            if(i == 0){
                valorEmprestimo = scan.nextInt();
            } else if (i == 1) {
                taxaDeJuros = scan.nextFloat();
            } else {
                tempoParaPagamento = scan.nextInt();
            }
        }
        int amortizacao = valorEmprestimo / tempoParaPagamento;
        double juros_mensal = valorEmprestimo * taxaDeJuros;
        double parcela_mensal = juros_mensal + amortizacao;
        int saldo_devedor_atual = valorEmprestimo - amortizacao;

        for(int i = 1; i <= tempoParaPagamento; i++){
            System.out.println("Parcela " + i + " | Juros: R$ " + juros_mensal + " | Prestação: R$ " + parcela_mensal + " | Saldo devedor: R$ " + saldo_devedor_atual);


            saldo_devedor_atual = saldo_devedor_atual - amortizacao;
            juros_mensal = saldo_devedor_atual * taxaDeJuros;
            parcela_mensal = juros_mensal + amortizacao;

        }




    }
}
