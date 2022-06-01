public class DesafioCalculoCombustivel {
    public static void main(String[] args) {

    // Seu carro tem um `tanque` de 40 litros. Com gasolina e usando todo o tanque, você fez um `caminhoComGasolina` de `480` quilômetros. Qual é o `consumoDeGasolina`? 

    // Já com álcool, o mesmo `tanque` de 40 litros fez um `caminhoComAlcool` de `300` quilômetros. Qual é o `consumoDeAlcool`?

    // Estabeleça uma condição para que usuário saiba qual combustível é o mais econômico!
        
        int tanque = Integer.parseInt(System.console().readLine("Qual a capacidade do tanque de seu carro? "));
        int caminhoComGasolina = Integer.parseInt(System.console().readLine("\nQuantos Km você rodou usando Gasolina? "));
        int caminhoComAlcool = Integer.parseInt(System.console().readLine("Quantos Km você rodou usando Alcool? "));
        double consumoDeGasolina;
        double consumoDeAlcool;
        String resultado;

        consumoDeGasolina = caminhoComGasolina / tanque;
        consumoDeAlcool = caminhoComAlcool / tanque;
        if (consumoDeAlcool > consumoDeGasolina) {
            resultado = "Alcool";
        } else if (consumoDeAlcool == consumoDeGasolina) {
            resultado = "Gasolina ou Alcool";
        } else {
            resultado = "Gasolina";
        }

        System.out.printf("\nO consumo de gasolina é de %.1fKm/L", consumoDeGasolina);
        System.out.printf("\nO consumo de alcool é de %.1fKm/L", consumoDeAlcool);
        System.out.printf("\nO combustível mais econômico é: %s", resultado);
        
        
        
    
    }
}
