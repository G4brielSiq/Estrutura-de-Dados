package ifba.edu.model;

import java.util.Scanner;

public class BinarioDecimal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número binário: ");

        String binario = in.nextLine();

        int decimal = converterBinarioParaDecimal(binario, binario.length() - 1);

        System.out.println("O número decimal equivalente é: " + decimal);
        
        in.close();
    }

    public static int converterBinarioParaDecimal(String binario, int indice) {

        if (indice < 0) {

            return 0;
        }

        int digito = Character.getNumericValue(binario.charAt(indice));
        
        int valor = digito * (int) Math.pow(2, (binario.length() - 1 - indice));

        return valor + converterBinarioParaDecimal(binario, indice - 1);
    }

}
