import java.util.Scanner;

public class MaiorMenosNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numRecebido = new int[5];
        int maiorNum = numRecebido[0];
        int menorNum = numRecebido[0];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numRecebido[i] = scanner.nextInt();

            if (numRecebido[i] > maiorNum) {
                maiorNum = numRecebido[i];
            }

            if (numRecebido[i] < menorNum) {
                menorNum = numRecebido[i];
            }
        }

        System.out.println("O maior número digitado foi " + maiorNum);
        System.out.println("O menor número digitado foi " + menorNum);

        scanner.close();

    }
}
