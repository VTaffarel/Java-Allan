package Questao5;

public class Pessoa {
    private String nome;
    protected int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}