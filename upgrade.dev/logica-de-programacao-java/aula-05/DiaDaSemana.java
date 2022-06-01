public class DiaDaSemana {
    public static void main(String[] args) {
        
        
        // Entrada
        int diaDaSemana = Integer.parseInt(System.console().readLine("Digite o dia da semana: "));
        String diaPorExtenso;

        switch (diaDaSemana) {
            case 1:
                diaPorExtenso = "DOM";
                break;
            
            case 2:
                diaPorExtenso = "SEG";
                break;

            case 3:
                diaPorExtenso = "TER";
                break;

            case 4:
                diaPorExtenso = "QUA";
                break;

            case 5:
                diaPorExtenso = "QUI";
                break;

            case 6:
                diaPorExtenso = "SEX";
                break;
                
            case 7:
                diaPorExtenso = "SAB";
                break;
            
            default:
                diaPorExtenso = "Nenhum";
                break;
        }
        
        // Saída
        System.out.println(diaDaSemana);
        System.out.printf("O dia %d é %s!", diaDaSemana, diaPorExtenso);

    }    
}
