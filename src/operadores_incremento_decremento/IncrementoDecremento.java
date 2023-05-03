package operadores_incremento_decremento;

public class IncrementoDecremento {
    public static void main(String[] args) {
        System.out.println("Uma forma de simplificar uma equação de atribuição de uma única unidade \n é utilizar operadores de incremento / decremento.");
        System.out.println("Imagine a variávem A do tipo inteiro cujo valor inicial seja 10.\n Para adicionar mais 1 ou subtrair 1 pode ser feito de três maneiras: ");
        int A = 10;
        System.out.println("A = A + 1;");
        System.out.println("A += 1;");
        System.out.println("A++;");
        System.out.println("Este [++] é justamente o operador de incremento");
        System.out.println("Imagine a Bariável B do tipo inteiro iniciando com valor 20. \n E seja necessário subtrair uma unidade. \n Também pode ser feita de três formas: ");
        int B = 20;
        System.out.println("B = B - 1;");
        System.out.println("B -= 1;");
        System.out.println("B--;");
        System.out.println("Este [--] é justamente o operador de decremento.");
        System.out.println("Os operadores de INCREMENTO e DECREMENTO podem ser pre-fixados ou pós-fixados.\n Os exemplos dados acima são de incremento e decremento pós-fixados");
        System.out.println("ou seja, os operadores ficam após os operandos.");
        System.out.println("para utilizá-los como pré-fixados basta colocá-los antes dos operandos. \n Exemplos: ");
        int C = 15;
        System.out.println("int C = 15; \n ++C;");
        System.out.println(++C);
        int D = 25;
        System.out.println("int D = 25; \n --D;");
        System.out.println(--D);
        System.out.println("Geralmente usa-se esses operadores em laços de repetição.");
        System.out.println("O Java não reconhece [**] como operador de incremento");

    }
    
}
