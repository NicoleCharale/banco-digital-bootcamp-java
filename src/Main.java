import Enuns.Generos;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BancoModel banco = new BancoModel("Banco Okumura");

        ClienteModel nicole = new ClienteModel(
                "Nicole Okumura Charale",
                "123456",
                20,
                Generos.Feminino
        );

        ClienteModel rebeca = new ClienteModel(
                "Rebeca Okumura Charale",
                "7891012",
                12,
                Generos.Feminino
        );

        double taxaRendimento = 0.5;

        ContaCorrenteModel contaNicole = new ContaCorrenteModel(nicole);
        ContaPoupancaModel contaRebeca = new ContaPoupancaModel(rebeca);

        contaNicole.depositar(100);
        contaNicole.sacar(50);
        contaNicole.transferir(contaNicole, 50);
        contaNicole.exibirInformacoes();

        contaRebeca.depositar(300);
        contaRebeca.sacar(100);
        contaRebeca.renderSaldo(taxaRendimento);
        contaRebeca.exibirInformacoes();
    }
}
