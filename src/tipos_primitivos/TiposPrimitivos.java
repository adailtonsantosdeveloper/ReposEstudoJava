package tipos_primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Na linguagem Java há 8 tipos de variável: ");
        System.out.println("Tipo boolean [tamanho: 1 bit] => recebe apenas valores lógicos (binários) true/false\n" +
        " equivalente a 1/0 em algumas outras linguagens.");
        System.out.println("Tipo char [tamanho: 16 bits] => aceita caractere alfanumérico, incluindo caracteres especiais." +
         " Cada variável só pode receber um único caractere.");
         System.out.println("Tipo byte [tamanho: 8 bits]=> Pode receber números inteiros desde -128 até 127");
         System.out.println("Tipo short [tamanho: 16 bits]=> Pode receber números inteiros desde -32768 até 32767.");
         System.out.println("Tipo int [tamanho: 32 bits] => recebe número de aproximadamente" + " 2 milhões negativos e positivos");
         System.out.println("Tipo long [tamanho: 64 bits] => armazena números entre -9x10^18 e 9x10^18");
         System.out.println("Tipo float [tamanho: 32 bits] => é a variável do timo numérica com ponto flutuante.");
         System.out.println("Tipo double [tamanho: 64 bits] => Tem o dobro da capacidade da variável float.");
        System.out.println();
        System.out.println("Para declarar uma variável do tipo char é obrigatório atribuir algum valor. Na verdade dentro de \"métodos\" é obrigatório inicializar as variáveis com algum valor no momento em que são declaradas. No caso do tipo char é necessário colocar o valor entre \' e \' .");

    }
    
}
