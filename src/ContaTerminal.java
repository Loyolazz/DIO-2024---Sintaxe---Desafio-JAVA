import java.util.Scanner;

public class ContaTerminal {
    /**
     * O método main serve como ponto de entrada para a aplicação. Ele solicita ao usuário que insira
     * detalhes da conta, como número da conta, número da agência, nome do cliente e saldo. Após coletar
     * as entradas, exibe uma mensagem confirmando a criação da conta com os detalhes fornecidos.
     *
     * @param args Argumentos da linha de comando (não utilizados nesta aplicação).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
}
