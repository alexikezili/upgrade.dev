public class Alfabeto {
    public static void main(String[] args) {
        
        // Desafio: Imprimir as letras do alfabeto (a - z)
        // Saída: a b c d...z   65 à 90

        System.out.println("Letras do alfabeto:");

        char inicio = 65;
        char fim = 90;

        while (inicio <= fim) {
            System.out.print(inicio + " ");
            inicio ++; 
            
        }

    }
    
}