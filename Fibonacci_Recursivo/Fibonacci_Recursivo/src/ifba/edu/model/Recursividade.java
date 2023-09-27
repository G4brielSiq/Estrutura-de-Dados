package ifba.edu.model;

public class Recursividade {
    
    public static int Fibonacci(int num) {

        if (num == 1 || num == 2) {

            return 1;

        } else {

            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }
}