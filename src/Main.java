import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();

        cliente.setNome(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Digite o valor do depositor: ");
        double depositor = sc.nextDouble();
        cc.depositar(depositor);

        System.out.println("Digite o valor do transferencia: ");
        double transferir = sc.nextDouble();
        cc.transferir(transferir, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        sc.close();
    }

}
