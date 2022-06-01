package br.com.letscode.model;

public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

        public void imprimeAncestrais(Pessoa pessoa){
        if(pessoa != null){
            System.out.println("Nome: " + pessoa);
            System.out.println("Pai: " + pessoa.getPai());
            System.out.println("Mãe: " + pessoa.getMae());
            System.out.println();
            imprimeAncestrais(pessoa.getPai());
            imprimeAncestrais(pessoa.getMae());
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
