package Models;

import Enuns.Generos;

public class ClienteModel {

    private String nome;

    private String documento;

    private int idade;

    private Generos genero;

    public ClienteModel(String nome, String documento, int idade, Generos genero) {
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, documento: %s, idade: %d, gênero: %s",
                nome, documento, idade, genero.toString());
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public int getIdade() {
        return idade;
    }

    public Generos getGenero() {
        return genero;
    }
}
