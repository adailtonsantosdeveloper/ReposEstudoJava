package operadores_atribuicao;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        System.out.println("No Java, assim como em qualquer linguagem de programação" + 
        "Há várias categorias de operadores, entre eles o operador de ATRIBUIÇÃO");
        System.out.println(" em algumas linguagens são adotados \':=\' ou \'<-\' ou \'>>>\' ou \'>>\' e \'<<\'" +
        "No Java o operador de atribuição usado é o \'=\'.");
        System.out.println("Exemplo declarando uma variável: \n <tipoVariavel> <nomeVariavel> = <valor>;");
        System.out.println("Vale lembrar que toda instrução em Java deve ser finalizada com \';\'");
        System.out.println("\t int nInteiro = 10;");
        System.out.println("Foi declarada uma varíável do tipo int com nome de nInteiro e receberá o valor 10");

        int nInteiro = 10;
        System.out.println("Há também os operadores de atribuição compostos: [+=], [-=], [*=], [/=].");
        System.out.printf("%d += 1 =>[%d] %n", nInteiro, nInteiro += 1);
        System.out.printf("%d -= 2 => [%d] %n", nInteiro, nInteiro -= 2);
        System.out.printf("%d *=2 => [%2.2f] %n", nInteiro, (double)(nInteiro *= 2));
        System.out.printf("%d /= 4 => [%2.2f] %n", nInteiro, (double)(nInteiro /= 4));
      /*  int A = 0;
        int B = 15;
        System.out.printf("%d e %d = %b %n", A, B, A^B);
        System.out.printf ("%d >> %d = %d %n",10, 2, 10 >> 2);  */

    }
    
}
