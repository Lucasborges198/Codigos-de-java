public class mano {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        double conta = (double) y / x; // Convertendo y para double para evitar truncamento de inteiros
        
        System.out.println("O resultado da conta e: " + conta); // Corrigindo a chamada ao println
    }
}
