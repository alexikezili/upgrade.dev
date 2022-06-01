package br.com.letscode.model;

public class Calculadora {
    private double valor;
    private String operador = "";

    public void entrada(double valor) {
        this.valor = valor;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getValor() {
        return valor;
    }

    public void calcular(double num){
        switch (operador){
            case "+" :
                this.valor = this.valor + num;
                break;
            case "-" :
                this.valor = this.valor - num;
                break;
            case "*" :
                this.valor = this.valor * num;
                break;
            case "/" :
                this.valor = this.valor / num;
                break;
        }
        operador = "";
    }
}
