package ifba.edu.view;

import java.util.Scanner;
import ifba.edu.model.BinarioDecimal;

public class Principal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número binário: ");

        String binario = in.nextLine();

        int decimal = BinarioDecimal.converterBinarioParaDecimal(binario, binario.length() - 1);

        System.out.println("O número decimal equivalente é: " + decimal);

        in.close();
    }
}