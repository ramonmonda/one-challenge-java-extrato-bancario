import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Ramon Monda";
        String tipoConta = "Conta Corrente";
        String menuDeOpcoes = """
                \n** Escolha uma opção: **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        double saldo = 0.00;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("\nDados iniciais do cliente:\n");
        System.out.printf("Nome: %s\n", nomeCliente);
        System.out.printf("Tipo de conta: %s\n", tipoConta);
        System.out.printf("Saldo inicial: R$ %.2f\n\n", saldo);
        System.out.println("**********************************************");

        while (opcao != 4) {
            System.out.println(menuDeOpcoes);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("\nO saldo atualizado é: R$ %.2f\n", saldo);

            } else if (opcao == 2) {
                System.out.println("\nQual o valor que deseja transferir?");
                double valorTransferencia = leitura.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("\nSaldo insuficiente!");

                } else {
                    saldo = saldo - valorTransferencia;
                    System.out.printf("\nO saldo atualizado é: R$ %.2f\n", saldo);
                }

            } else if (opcao == 3) {
                System.out.println("\nQual o valor recebido?");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.printf("\nO saldo atualizado é: R$ %.2f\n", saldo);

            } else if (opcao != 4) {
                System.out.println("\nOpção inválida!");
            }
        }
    }
}
