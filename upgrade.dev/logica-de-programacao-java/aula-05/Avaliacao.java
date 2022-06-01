public class Avaliacao {
    public static void main(String[] args) {
        
        // Entrada
        String nome = "Alex";
        String disciplina = "Matemática";
        double bim1 = 9.00;
        double bim2 = 2.00;
        double bim3 = 6.00;
        double bim4 = 7.00;
        String resultado = "Reprovado!";  

        // Processamento
        double media = (bim1 + bim2 + bim3 + bim4) / 4;

        if (media >= 5.00 ) {
            resultado = "Recuperação!";
        }

        
        if (media >= 7.00 ) {     
            resultado = "Aprovado!";
        }
            
        // Saída
        System.out.printf("\nNome: %s ", nome);
        System.out.printf("\nDisciplina: %s ", disciplina);
        System.out.printf("\n1 BIM: %.2f", bim1);
        System.out.printf("\n2 BIM: %.2f", bim2);
        System.out.printf("\n3 BIM: %.2f", bim3);
        System.out.printf("\n4 BIM: %.2f", bim4);
        System.out.printf("\nMédia: %.2f", media);
        System.out.printf("\nResultado: %s", resultado);




    }
}
