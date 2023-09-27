package ifba.edu.model;

public class BinarioDecimal {

    public static int converterBinarioParaDecimal(String binario, int indice) {

        if (indice < 0) {

            return 0;
        }

        int digito = Character.getNumericValue(binario.charAt(indice));

        int valor = digito * (int) Math.pow(2, (binario.length() - 1 - indice));

        return valor + converterBinarioParaDecimal(binario, indice - 1);
    }
}