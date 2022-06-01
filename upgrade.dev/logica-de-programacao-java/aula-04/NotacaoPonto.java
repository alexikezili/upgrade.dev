public class NotacaoPonto {
    public static void main(String[] args) {
        
        // Variáveis
        // tipo chave = valor;
        String nome = "Alex";
        /*
        nome = nome.toUpperCase(); 
        nome = nome.replace("AL", "D");
        nome = nome.concat("!!!");
        */

        System.out.println(nome);

        nome = nome
            .replace("Al", "DR")
            .toUpperCase()
            .concat("!!!");

        System.out.println(nome);


        // Variável em letra minúscula é um tipo primitivo e não aceita notação ponto
        // Variável em letra maiúscula é um tipo classe e aceita notação ponto



    }
}
