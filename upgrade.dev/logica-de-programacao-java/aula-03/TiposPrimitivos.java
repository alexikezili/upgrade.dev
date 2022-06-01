public class TiposPrimitivos {
    public static void main(String[] args) {
        
        // Armazenamento de Dados (Variáveis)
        // tipo chave = valor;

        // Tipos primitivos de variáveis

        // São 6 tipos numéricos
        // 4 inteiros
        byte numByte = 1; // -128 até 127
        short numShort = 2; // -32.768 até 32.767
        int numInt = 4; // -2.147.483.648 até 2.147.483.647
        long numLong = 8; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 Precisa colocar L no final

        // 2 pontos flutuantes
        float numFloat = 1.5F; // +- 3.40282347E+38F Precisa colocar F no final
        double numDouble = 2.25; // +- 1.797691313486231570E+308

        long valor = 274;
        int outroValor = (int) valor; // coersão (casting)
    
        // 2 valores lógicos
        boolean magro = false;
        char letra = 'X';


        // Saída
        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Int: " + numInt);
        System.out.println("Long: " + numLong);
        System.out.println("Float: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println(valor + outroValor);
        System.out.println("Magro: " + magro);
        System.out.println("Letra: " + letra);

        
    }
}