package ifba.edu.view;

import ifba.edu.model.Recursividade;

public class Principal {
    public static void main(String[] args) throws Exception {

        System.out.println("Sequência Fibonacci");

        for(int i = 1; i < 10; i++){

            System.out.println(Recursividade.Fibonacci(i));
        }
    
    }
}
