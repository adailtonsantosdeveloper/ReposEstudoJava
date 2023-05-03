package operadores_relacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        System.out.println("Operadores relacionais são operadores \"binários\", ou seja, executa uma comparação entre um" + 
        " valor à esquerda com um valor à direita e retorna um valor booleano.");
        System.out.println("Os operadores são os seguintes:");
        System.out.println(">, >=, <, <=, != e ==");
        System.out.println("A > B [A maior que B];");
        int A = 5;
        int B = 8;
        System.out.printf("A vale %d e B vale %d, A > B ? [true/false] = %b %n",A,B,(A > B));
        System.out.println("A >= B [A maior ou igual B];");
        A = 6;
        B = 5;
        System.out.printf("A vale %d e B vale %d, A >= B ? [true/false] = %b %n",A,B,(A >= B));
        System.out.println("A < B [A menor que B];");
        ++A;
        B = (int)A/2;
        System.out.printf("A vale %d e B vale %d, A <>> B ? [true/false] = %b %n",A,B,(A < B));
        System.out.println("A <= B [A menor ou igual B];");
        A /= B;
        B += A;
        System.out.printf("A vale %d e B vale %d, A <= B ? [true/false] = %b %n",A,B,(A <= B));
        System.out.println("A != B [A diferente de B];");
        A = 2;
        B = 2;
        System.out.printf("A vale %d e B vale %d, A != B ? [true/false] = %b %n",A,B,(A != B));
        System.out.println("A == B [A igual B].");
        A = (int)Math.pow(A,2);
        B = A * 2;
        System.out.printf("A vale %d e B vale %d, A == B ? [true/false] = %b %n",A,B,(A == B));
    }
    
}
