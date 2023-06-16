import java.util.Scanner;
public class InterfaceMain {
    public static void main (String [] args) {

        ValorPassagem vPass = new ValorPassagem(); // Objeto para métodos de cálculo de quantidade e troco
        QuantPas qPass = new QuantPas();

        Scanner entrada = new Scanner(System.in);
        String val_passagem = new String(); // Objeto para métodos de conversão entre Strings e números, além de troca de vírgula por ponto
        System.out.println("Informe o valor da passagem em R$: ");
        
        /* Valor da passagem informado pelo usuário */
        val_passagem = entrada.nextLine();

        System.out.printf("Valor informado foi R$ %s %n", val_passagem);

        String vPassagem = vPass.verificaVirgula(val_passagem); // Método para alterar onde houver vírgula por ponto
        double passagemFormatada = Double.parseDouble(vPassagem); // Método para converter String para Double, para utilizar em cálculos

        System.out.println("Agora informe a quantidade de passagem que deseja calcular: ");
        
        int quant_passagem = Integer.parseInt(entrada.next()); // Armazena o que o usuário digitar já convertendo em inteiro
        System.out.printf("%d foi a quantidade informada %n", quant_passagem);
        


    }
}