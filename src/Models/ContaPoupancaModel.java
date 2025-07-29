package Models;

public class ContaPoupancaModel extends ContaModel {

    public ContaPoupancaModel(ClienteModel cliente) {
        super(cliente);
    }

    public void renderSaldo(double taxaRendimento) {
        double valor = super.getSaldo() * taxaRendimento;

        super.depositar(valor);
    }
}
