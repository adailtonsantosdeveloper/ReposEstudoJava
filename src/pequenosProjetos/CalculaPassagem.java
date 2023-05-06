package pequenosProjetos;
import java.util.Scanner;

public class CalculaPassagem {

    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao calculador de passagem Java!!!");
        System.out.println("*******************************************");
        
        String opcao = "";
        double valPassagem = 0;
        int quantPass = 0;
        do {
            System.out.println("Deseja calcular algum valor de passagem em quantidade? [S/N]");
            opcao = entrada.nextLine();
            if (opcao.equalsIgnoreCase("S")) {

                System.out.println("Por gentileza, informe o valor unitário da passagem: ");
                valPassagem = Double.parseDouble(entrada.next());
                System.out.printf("Valor unitário informado foi R$ %2.2f %n",valPassagem);
                System.out.println();
                System.out.println("Quer que eu lhe mostre até quantas passagens?");
                quantPass = Integer.parseInt(entrada.next());
                System.out.printf("A quantidade informada foi %d passagens %n", quantPass);

                for(int cont = 0; cont < quantPass; cont++) {
                    System.out.printf("R$ %2.2f X %d = %2.2f", valPassagem, (cont + 1), valPassagem * (cont + 1));
                    System.out.println();
                }
                System.out.println("Deseja calcular outra passagem? [s/n]");
                opcao = entrada.nextLine();

            } else {
                System.out.println("Já que não digitou S, vou assumir como se você tivesse digitado N.");
                opcao = "n";
            }
            
            if (!opcao.equalsIgnoreCase("s")) {
                System.out.println("Obrigado por usar nosso programa.");
                opcao = "n";
            }
            
        } while (!opcao.equalsIgnoreCase ("n"));
        entrada.close();
        System.out.println("Fim do programa!!!");
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }



}