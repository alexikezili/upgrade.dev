package modelo;

public class Titular {

    private String nome;
    private String setCpf;
    private String profissao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String setCpf) {
        this.setCpf = setCpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getSetCpf() {
        return setCpf;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, CPF: %s", nome, setCpf);
    }
}
