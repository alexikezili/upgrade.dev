public class Questao4 {
    public static void main(String[] args) {
    
        double dolar = Double.parseDouble(System.console().readLine("Insira a cotação atual do dólar: "));
        double real = Double.parseDouble(System.console().readLine("Quantos reais você deseja converter em dólares: "));
        double result = (real/dolar);

        System.out.printf("\nCotação do dólar: U$ %.2f", dolar);
        System.out.printf("\nValor em real: R$ %.2f", real);
        System.out.printf("\nValor em dólar: R$ %.2f", result);
        
    }
    
}
