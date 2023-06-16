public class QuantPas {
    double calcPassagem (int quant, double val) {
        double total = quant * val;

        return total;
    }

    double calcTroco(double valorRecebido, double totalPassagem) {
        if (totalPassagem < valorRecebido) {
            return (valorRecebido - totalPassagem);
        } else {
            return 0.0;
        }
    }
}