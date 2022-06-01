public class Operadores {
    public static void main(String[] args) {
        
        // Operadores Aritiméticos (Matemáticos)
        // + - / * %
        int x = 10;
        int y = 20;

        // Operando + Operador + Operando
        int soma = x + y;
        System.out.println("10 + 20 = " + soma);

        int subtracao = x - y;
        System.out.println("10 - 20 = " + subtracao);
    
        int divisao = y / x;
        System.out.println("20 / 10 = " + divisao);
    
        int multiplicacao = x * y;
        System.out.println("10 * 20 = " + multiplicacao);
    
        int resto = y % x;
        System.out.println("20 % 10 = " + resto);
    
        // double potencia = x ^ 1;
        // System.out.println(potencia);
    
        // Operadores de Atribuição
        int a = 10; // atribuição simples
        int b = 2; // atribuição simples
        System.out.println("A:" + a); // 10
        
        // System.out.println(a + b); // 12
        a += b; // atribuição -> soma
        System.out.println("A:" + a); // 12
    
        a -= b; // atribuição -> subtração
        System.out.println("A:" + a); // 10
    
        a *= b; // atribuição -> multiplicação
        System.out.println("A:" + a); // 20
    
        a /= b; // atribuição -> divisão
        System.out.println("A:" + a); // 10
    
        // Operadores Incrementais / Decrementais
        int z = 0;
        System.out.println("\nZ:" + z);
        
        z = z + 1; // incremento
        System.out.println("Z:" + z);
        
        z += 1; // incremento
        System.out.println("Z:" + z);
        
        z++; // incremento
        System.out.println("Z:" + z);
    
        z = z - 1; // decremento
        System.out.println("Z:" + z);
    
        z -= 1; // decremento
        System.out.println("Z:" + z);
    
        z--; // decremento
        System.out.println("Z:" + z);
    
        System.out.println(z++); // 0 (pós incremento)
        System.out.println(z); // 1
        System.out.println(++z); // 2 (pré incremento)
        System.out.println(z--); // 2 (pós decremento)
        System.out.println(z); // 1
        System.out.println(--z); // 0 (pré decremento)
    
        // Operadores de Comparação
        System.out.println("\n Operadores de Comparação");
        int c = 1;
        int d = 2;
        boolean result;
        
        result = c > d; // maior que 
        System.out.println("\n 1 > 2 = " + result); // false
    
        result = c < d; // menor que
        System.out.println("\n 1 < 2 = " + result); // true
        
        result = c >= d; // maior ou igual
        System.out.println("\n 1 >= 2 = " + result); // false
    
        result = c <= d; // menor ou igual
        System.out.println("\n 1 <= 2 = " + result); // true
    
        result = c == d; // igualdade
        System.out.println("\n 1 == 2 = " + result); // false
    
        result = c != d; // diferente
        System.out.println("\n 1 != 2 = " + result); // true
    
        // Operadores Lógicos
        int n1 = 2;
        int n2 = 3;
    
        System.out.println("\nOperadores Lógicos");
        System.out.println("\nOU (OR): ");
        System.out.println( n1 > n2 || n1 < n2 ); // false || true =====> true
    
        System.out.println("\nE (AND): ");
        System.out.println( n1 > n2 && n1 < n2 ); // false && true =====> false
    
        System.out.println("\nNÃO (NOT): ");
        System.out.println( !(n1 != n2) ); // false
        System.out.println( !(n1 == n2) ); // true

        

    }
}
