public class Programa {
    public static void main(String[] args) {
        
       boolean exec = true;
       while (exec) {
           
       
        
            System.out.println("BEM VINDO!");

            System.out.println("\n1 - JOGO");
            System.out.println("2 - SAIR");

            int opcao = Integer.parseInt(System.console().readLine("Escolha sua opção:"));

            if (opcao == 2) {
                System.out.println("Tchau!");
                exec = false;   
            }
        }

    }
    
}
