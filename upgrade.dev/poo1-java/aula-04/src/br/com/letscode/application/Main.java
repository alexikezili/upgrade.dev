package br.com.letscode.application;
import br.com.letscode.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pA = new Pessoa("Razh", null , null);
        Pessoa pB = new Pessoa("Talia", pA, null);


        Pessoa p1 = new Pessoa("Thomas", null, null);
        Pessoa p2 = new Pessoa("Martha", null, null);

        Pessoa p3 = new Pessoa("Bruce", p1, p2);

        Pessoa p3B = new Pessoa("Damian", p3, pB);

        p3B.imprimeAncestrais(p3B);
//        imprimePessoa(p3B);

    }

//    public static void imprimePessoa(Pessoa pessoa){
//        if(pessoa != null){
//            System.out.println("Nome: " + pessoa);
//            System.out.println("Pai: " + pessoa.getPai());
//            System.out.println("Mãe: " + pessoa.getMae());
//            System.out.println();
//            imprimePessoa(pessoa.getPai());
//            imprimePessoa(pessoa.getMae());
//        }
//    }

}
