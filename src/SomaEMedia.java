import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int[] numTotal = new int[6];
        int soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numTotal[i] = scanner1.nextInt();
            soma += numTotal[i];
        }

        double media = soma / 6.0;
        String mediaFormatada = String.format("%.2f", media);

        System.out.println(soma + " é a soma");
        System.out.println(mediaFormatada + " é a média");

        scanner1.close();

    }
}
