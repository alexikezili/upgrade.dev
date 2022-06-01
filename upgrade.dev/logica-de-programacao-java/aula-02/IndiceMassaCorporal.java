public class IndiceMassaCorporal {
    public static void main(String[] args) {
        
        // Armazenar Dados (Variáveis)
        // tipo chave = valor;
        int peso = 99;
        float altura = 1.88F;

        float imc = peso / (altura * altura); 

        // Executar Tarefas
        // comando();
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + imc);

        //javac IndiceMassaCorporal.java = compila o código, criando o arquivo.class
        //java IndiceMassaCorporal = roda o código compilado .class
    }

}