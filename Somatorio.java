public class Somatorio {
       /**
     * Calcula o somatório de um número n até 0.
     * 
     * Modelagem:
     * somatorio(0) = 0
     * somatorio(n) = n + somatorio(n-1) para n > 0
     * 
     * @param n o número para calcular o somatório
     * @return o somatório de n até 0
     */
    public int somatorio(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + somatorio(n - 1);
        }
    }

    public static void main(String[] args) {
        Somatorio somatorio = new Somatorio();
        System.out.println("Somatório de 5: " + somatorio.somatorio(5)); // Output: 15
    } 
}
