public class Recursao {

    /**
     * Calcula o fatorial de um número n.
     * 
     * Modelagem:
     * fatorial(0) = 1
     * fatorial(n) = n * fatorial(n-1) para n > 0
     * 
     * @param n o número para calcular o fatorial
     * @return o fatorial de n
     */
    public int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Recursao recursao = new Recursao();
        System.out.println("Fatorial de 5: " + recursao.fatorial(5)); // Output: 120
    }

    public String somatorio(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'somatorio'");
    }
}
