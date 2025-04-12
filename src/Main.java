import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        //dados do cliente
        System.out.println("Insira os dados da conta");
        System.out.println("------------------------");

        System.out.print("Nome: ");
        String nome = leitura.nextLine();

        System.out.print("Tipo de conta: ");
        String tipoDeConta = leitura.nextLine();

        System.out.print("Saldo em Conta: ");
        double saldo = leitura.nextInt();

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Dados Iniciais da Conta");
        System.out.println("\nNome:               " + nome);
        System.out.println("Tipo de Conta:      " + tipoDeConta);
        System.out.println("Saldo Inicial:      R$ " + saldo);
        System.out.println("--------------------------------------");

        String menu = """
                \n1- Consultar Saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;

        //loop para operações
        int operacoes = 0;
        while (operacoes !=4) {
            System.out.println(menu);

            System.out.print("\nDigite a opção desejada: ");
            operacoes = leitura.nextInt();

            //consultar saldo
            if (operacoes == 1) {
                System.out.println("\nO saldo atual é de R$ " + saldo);

            //receber valor
            } else if (operacoes == 2) {
                System.out.print("\nInforme o valor a receber: ");
                double receber = leitura.nextInt();

                System.out.println("\nSaldo Recebido!");
                System.out.println("Saldo atualizado R$ " + (saldo += receber));

            //tranferir valor
            } else if (operacoes == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double transferir = leitura.nextInt();

                if (transferir > saldo) {
                    System.out.println("\nSaldo Insuficiente.");

                } else {
                    System.out.println("\nSaldo transferido com sucesso!");
                    System.out.println("Saldo atualizado R$ " + (saldo -= transferir));
                }

            //número inválido
            } else if (operacoes > 4 || operacoes < 1) {
                System.out.println("\nOpção inválida.");

            }
        }
        //finalização do app
        System.out.println("Encerrando...");
        System.out.println("\nObrigado por usar nossos serviços!");

    }
}