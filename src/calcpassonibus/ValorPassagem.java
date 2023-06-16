public class ValorPassagem {
    String verificaVirgula(String preco) {
        
        if (preco.indexOf(",")) {
            preco.replaceAll(",", ".");
        }
        String precoCorrigido = preco;

        return precoCorrigido;
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