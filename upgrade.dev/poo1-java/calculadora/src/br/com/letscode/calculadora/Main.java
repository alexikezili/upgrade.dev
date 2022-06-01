package br.com.letscode.calculadora;
import br.com.letscode.model.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.entrada(5);
        calculadora.setOperador("+");
        calculadora.calcular(2);
        System.out.println(calculadora.getValor());


    }
}
