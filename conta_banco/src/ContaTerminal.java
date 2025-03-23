import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e armazenando os dados da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada
        String mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ")
                .concat(String.valueOf(numero)).concat(" e seu saldo ")
                .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}
