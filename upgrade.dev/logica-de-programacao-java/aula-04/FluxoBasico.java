import java.util.Date;


public class FluxoBasico {
    public static void main(String[] args) {
        
        // Entrada de Dados
        String nome = System.console().readLine("Digite seu nome: ");

        System.out.print("Digite sua idade: "); // System.out.prints
        int idade = Integer.parseInt(System.console().readLine());

        // Processamento
        Date data = new Date();
        int ano = data.getYear();
        int anoNascimento =  ano - idade; 

        // Saída
        System.out.println(nome);
        System.out.printf("\nSeu nome é: %s", nome);
        System.out.printf("\nSua idade é: %d", idade);
        System.out.printf("\nVocê nasceu no ano: %d ", anoNascimento);

    }
}
