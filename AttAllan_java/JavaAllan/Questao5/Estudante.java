package Questao5;

class Estudante extends Pessoa {
    public Estudante(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do estudante: " + getNome());
        System.out.println("Idade do estudante: " + idade);
    }
}
