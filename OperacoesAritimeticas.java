public class Questao1 {
    public static void main(String[] args) {
        
    //Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma,
    //subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados.
        
        int num1 = Integer.parseInt(System.console().readLine("Digite o primeiro número: "));
        int num2 = Integer.parseInt(System.console().readLine("Digite o segundo número: "));
        
        System.out.println("\nOperações:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) );
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );

        
    }
}
