 public class FaixaEtaria {

    public static void main(String[] args) {
    
        // Entrada
        String nome = System.console().readLine("Digite seu nome: ");

        int idade = Integer.parseInt(System.console().readLine("Digite sua idade: "));

        String faixa;   

        //Processamento
        
        
        if (idade <= 12) {
            faixa = "Criança";   
        } else if (idade < 18) {
            faixa = "Adolescente";            
        } else {
            faixa = "Adulto";
        }
        



        // Saída
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\nFaixa Etária: %s", faixa);




    }
}