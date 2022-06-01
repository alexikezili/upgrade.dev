public class ConverterF {
    public static void main(String[] args) {

        float grauf = 80;
        int ajuste = 32;
        float fator = 5/9F;
        float celcius = (grauf - ajuste) * fator;
    
        System.out.println("Graus Fahrenheit: " + grauf + " °F");
        System.out.println("Graus Celcius: " + celcius + " °C");
        
            
        }
}
