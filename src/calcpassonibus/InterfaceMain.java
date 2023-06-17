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
        System.out.println();
        System.out.println("Com base nas informações fornecidas serão realizados os devidos cálculos...");

        /* chama o método para multiplicar as passagens pela quantidade e armazena o valor na variável totalPassagem */
        double totalPassagem = qPass.calcPassagem(quant_passagem, passagemFormatada);

        /* Exibe o resultado */
        System.out.printf("%d passagens a R$ %2.2f é = [ R$ %2.2f ]", quant_passagem, passagemFormatada, totalPassagem);

        System.out.println("Informe quanto em dinheiro o cliente pagou:");
        String valPago = entrada.nextLine();
        String valPagoFormatado = vPass.verificaVirgula(valPago); // Se houver vírgula substituirá por ponto
        double dinheiroPago = Double.parseDouble(valPagoFormatado);

        if (dinheiroPago < totalPassagem) {
            System.out.println("Está faltando dinheiro: ");
            System.out.printf("%2.2f - 2.2f = %2.2f %n", dinheiroPago, totalPassagem, (dinheiroPago - totalPassagem));
        } else {
            double troco = qPass.calcTroco(dinheiroPago, totalPassagem);
            String trocoFormatadoString = vPass.numberToString(troco);
            trocoFormatadoString = vPass.botaVirgula(trocoFormatadoString);
            System.out.printf("O troco de R$ %s para %d passagens de %s é R$ %s %n", valPago, quant_passagem, vPassagem, trocoFormatadoString);
        }

        entrada.close();
        


    }
}