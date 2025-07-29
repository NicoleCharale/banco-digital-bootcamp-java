package Models;

public class ContaCorrenteModel extends ContaModel {

    public ContaCorrenteModel(ClienteModel cliente) {
        super(cliente);
    }

    public void transferir(ContaModel contaTransferir, double valor) {
        super.sacar(valor);

        contaTransferir.depositar(valor);
    }
}
