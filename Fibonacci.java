public class Fibonacci {

    /**
     * Calcula o n-ésimo número da sequência de Fibonacci.
     * 
     * Modelagem:
     * fibonacci(0) = 0
     * fibonacci(1) = 1
     * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2) para n > 1
     * 
     * @param n o índice na sequência de Fibonacci
     * @return o n-ésimo número da sequência de Fibonacci
     */
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci de 5: " + fibonacci.fibonacci(5)); // Output: 5
    }
}