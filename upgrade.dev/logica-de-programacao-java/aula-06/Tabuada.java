public class Tabuada {      
    public static void main(String[] args) {
        //Montar um programa que receba um número e gere a tabuada do 1 à 10

        int num = Integer.parseInt(System.console().readLine("Digite um número: "));

        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%d x %d = %d\n", num, i, num * i);
            /*System.out.print(num + " x " + i); 
            System.out.print(" = " + num * i);
            System.out.print("\n");
            */
            
        }

        /*
        int valorUsuario;
        int multiplicador = 0;
        int total = 0;


        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        valorUsuario = ler.nextInt();

        for (int x = 0; x < 10; x++) {
                total = valorUsuario * ++multiplicador;
                System.out.println(num + " x " + i + " = " + (num * i));
            }

        }
        */

    }
    
}
