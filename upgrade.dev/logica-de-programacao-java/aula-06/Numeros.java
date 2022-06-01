public class Numeros {          
    public static void main(String[] args) {

        // Desafio: Imprimir os números de 1 à 10 (um por linha)

        // Antipadrão EVITAR! System.out.println("1 \n2 \n3 \n4 \n...");

        /* int num = 0;
        while (num < 10) {
            num = num + 1;
            System.out.println(num);
        }
        */  

        int inicial = 1; // valor_inicial
        int fim = 10; // valor_final

        while (inicial <= fim) { //condicao_logica
            System.out.println(inicial); // saida
            inicial ++; // incremento
        }

        // Desafio: Imprimir os números de 0 à 50 (um por linha)
        // Saída: 0 1 2 3...50

        System.out.println("\nNúmeros de 0 à 50: ");

        inicial = 0;
        fim = 50;

        while (inicial <= fim) {
            System.out.print(inicial + " " );
            inicial ++;  
        }

        // Desafio: Imprimir os números de 100 à 25
        // Saída = 100 99 98...25

        System.out.println("\nNúmeros de 100 à 25: ");

        inicial = 100;
        fim = 25;
        
        while (inicial >= fim) {
            System.out.print(inicial + " " );
            inicial --;
        }
 
        // Desafio: Imprimir os números pares de 0 à 100

        System.out.println("\nNúmeros pares de 0 à 100: ");

        inicial = 0;
        fim = 100;

        while (inicial < fim) {
            System.out.print(inicial + " - " );
            inicial += 2;
            if (inicial == fim) {
                System.out.print(fim);
            }  
        }

        //System.out.println("100"); roubando kk


        // Desafio: Imprimir os números impares de 99 à 1

        System.out.println("\nNúmeros impares de 99 à 100: ");

        inicial = 99;
        fim = 1;

        while (inicial > fim) {
            System.out.print(inicial + " - " );
            inicial -= 2; 
            if (inicial == fim) {
                System.out.print(fim);
            }  
        }
          

    }
    
}
