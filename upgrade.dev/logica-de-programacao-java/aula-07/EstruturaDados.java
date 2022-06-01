public class EstruturaDados {
    public static void main(String[] args) {
        
        //tipo chave = valor;
        //String carro1 = "Civic";
        //String carro2 = "Corolla";
        //String carro3 = "Cactus";

        // Matriz / Array / Lista
        // Declarar array e alocar espaço na memória
        // tipo[] chave = valor;
        String[] carros = new String[10];

        // Adicionar dados ao array
        // chave[indice] = valor;
        carros [0] = "Civic";
        carros [1] = "Corolla";
        carros [2] = "Cactus";
        carros [3] = "Opala";


        // Lendo dados do array
        // chave[indice];
        // System.out.println(carros[0]);
        // System.out.println(carros[1]);
        // System.out.println(carros[2]);
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null) {
                System.out.println(i + " - " + carros[i]);
            }
        }

        // Outro exemplo
        int[] idades = new int[5];
        idades[0] = 15;
        idades[1] = 25;
        idades[2] = 35;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] != 0) {                
                System.out.println(i + " - " + idades[i]);
            }
        }

        // Declarar e inicializar um array
        int[] ages = {27 ,32 ,44, 88, 66, 99, 100};

        for (int i : ages) {
            System.out.println(i);
        }
    }
}
