package Models;

public class ContaModel implements Interfaces.IConta {

    public static final int AGENCIA_PADRAO = 77;

    public static int SEQUENCIAL = 1;

    private int agencia;

    private int numero;

    private ClienteModel cliente;

    private double saldo;

    public ContaModel(ClienteModel cliente) {
        agencia = ContaModel.AGENCIA_PADRAO;
        numero = ContaModel.SEQUENCIAL + 1;
        this.cliente = cliente;
        saldo = 0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoes() {
        System.out.println("\n---------------------");
        System.out.println("\nInformações da conta: ");
        System.out.printf("\nAgência: %d", agencia);
        System.out.printf("\nNúmero: %d", numero);
        System.out.printf("\nSaldo: %.2f", saldo);

        System.out.println("\n---------------------");
        System.out.println("\nInformações do titular: ");
        System.out.println(cliente.toString());
    }
}
