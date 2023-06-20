import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String name = "Clark Kent";
        String accountType = "Corrente";
        double balance = 1599.99;
        int option = 0;

        System.out.println("***********************");
        System.out.println("\nnome do cliente: " + name);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("balance atual: " + balance);
        System.out.println("\n***********************");

        Scanner leitura = new Scanner(System.in);

        while (option != 4) {

            System.out.println(" ** Digite sua opção** ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Receber valor ");
            System.out.println("4 - Sair");

            option = leitura.nextInt();

            if (option == 1) {
                System.out.println("O saldo atualizado é " + balance);
            } else if (option == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > balance) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    balance -= valor;
                    System.out.println("Novo saldo: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                balance += valor;
                System.out.println("Novo saldo: " + balance);
            } else if (option != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
