package Models;

import java.util.List;
import java.util.ArrayList;

public class BancoModel {

    private String nome;

    private List<ContaModel> contasList;

    public BancoModel(String nome) {
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<ContaModel> getContasList() {
        return contasList;
    }
}
