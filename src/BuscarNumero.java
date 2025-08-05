import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] totalNum = new int[8];

        System.out.println("Digite 8 números ");
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            totalNum[i] = scanner.nextInt();
        }

        System.out.println("Agora digite o número que deseja procurar: ");
        int procurarNum = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 8; i++) {
            if (procurarNum == totalNum[i]) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + procurarNum + " está na lista.");
        } else{
            System.out.println("O número " + procurarNum + " não está na lista.");
        }

        scanner.close();

    }
}
