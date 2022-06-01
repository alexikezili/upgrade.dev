package aplicacao;

import modelo.Conta;
import modelo.Titular;

public class CriaConta {

    public static void main(String[] args) {

        Titular titularConta1 = new Titular();
        titularConta1.setNome("João Mascarenhas");
        titularConta1.setCpf("111222333444");
        titularConta1.setProfissao("Desenvolvedor");

        Conta contaA = new Conta(titularConta1, 3342, 609733);
//        contaA.agencia = 3342;
//        contaA.numero = 609733L;
//        contaA.titular = "João Mascarenhas";
//        contaA.saldo = 0.0;
        contaA.depositar(100);

        System.out.println("Titular: " + contaA.getTitular().getNome());
        System.out.println("Agência: " + contaA.getAgencia());
        System.out.println("Saldo: " + contaA.retornarSaldo());

//        contaA.saldo = 100.00;
//        System.out.println("Saldo: " + contaA.saldo);
//
//        contaA.saldo += 50.00;
//        System.out.println("Saldo: " + contaA.saldo);

        contaA.depositar(500);
        System.out.println("Saldo: " + contaA.retornarSaldo());
        System.out.println(contaA);

        Titular titularConta2 = new Titular();
        titularConta2.setNome("Maria Magdala");
        titularConta2.setCpf("111222333445");
        titularConta2.setProfissao("Desenvolvedora");

        Conta contaB = new Conta(titularConta2, 3342, 609734);

        contaA.transferir(150,contaB);

        System.out.println(contaA);
        System.out.println(contaB);

    }
}
