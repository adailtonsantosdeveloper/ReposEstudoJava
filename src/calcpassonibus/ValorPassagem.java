
public class ValorPassagem {
    String verificaVirgula(String preco) {
        
        if (preco.indexOf(',')) {
            preco.replaceAll(",", ".");
        }
        String precoCorrigido = preco;

        return precoCorrigido;
    }

    String botaVirgula (String preco) {
        if (preco.indexOf('.')) {
            preco.replaceAll(".", ",");
        }
        String precoComVirgula = preco;

        return precoComVirgula;
    }

    double stringToNumber ( String preco) {
        double valorPass = Double.parseDouble(preco);
        return valorPass;
    }

    String numberToString (double valor) {
        String precoFormatado = Double.toString(valor);

        return precoFormatado;
    }
}