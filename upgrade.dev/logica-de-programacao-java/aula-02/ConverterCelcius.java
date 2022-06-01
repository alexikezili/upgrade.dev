public class ConverterCelcius {
    public static void main(String[] args) {

        float celcius = Float.parseFloat(System.console().readLine("Digite a temperatura em graus Celcius: "));
        float fator = 9/5F;
        float ajuste = 32;
        float grauf = (celcius * fator) + ajuste;

        System.out.println("Graus Celcius: " + celcius);
        System.out.println("Graus Fahrenheit: " + grauf + " °F");
        
        }
}