
public class Main {
    public static void main(String[] args) {
        int numeroInteiro = 22;
        float numeroReal = 3.14159f;
        char letra = 'F';
        boolean terminou = false;

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("Lógico: " + terminou);
        System.out.println("==============================");

        System.out.printf("O valor do float: %.4f\n", numeroReal);

        System.out.println("==============================");
        String nome = "Mateus";
        Float media = 8.9f;
        System.out.printf("A nota de %s é %.2f \n", nome, media);
        System.out.format("A nota de %s é %.2f \n", nome, media);

    }
}