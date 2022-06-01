public class DesafioIMC {
    public static void main(String[] args) {
        
        // Entrada
        String nome = System.console().readLine("Digite seu nome: ");
        double peso = Double.parseDouble(System.console().readLine("Digite seu peso: ").replace(",", "."));
        double altura = Double.parseDouble(System.console().readLine("Digite sua altura: ").replace(",", "."));
        String avaliacao;

        // Processamento        
        double imc = peso / (altura * altura); 

        if (imc < 17) {
            avaliacao = "Muito abaixo do peso.";            
        } else if (imc < 18.5) {
            avaliacao = "Abaixo do peso.";         
        } else if (imc < 25) {
            avaliacao = "Peso normal.";
        } else if (imc < 30) {
            avaliacao = "Acima do peso.";
        } else if (imc < 35) {
            avaliacao = "Obesidade grau I.";
        } else if (imc <= 40) {
            avaliacao = "Obesidade grau II.";     
        } else {
            avaliacao = "Obesidade grau III.";  
        }
        

        // Saída
        System.out.printf("\nSeu nome é: %s", nome);
        System.out.printf("\nSeu npeso é: %.2f", peso);
        System.out.printf("\nSua altura é: %.2f", altura);
        System.out.printf("\n%s seu IMC é: %.2f", nome, imc);
        System.out.printf("\nAvaliação: %s", avaliacao);

        // usar replace para substituir , por .


    }
}
