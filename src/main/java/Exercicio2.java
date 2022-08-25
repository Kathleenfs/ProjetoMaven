import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();

        List<String> nomes = new ArrayList<>();
        System.out.println("Quantos notas desejam cadastrar");
        int qtd = teclado.nextInt();
        for (int i = 0; i >= qtd; i++) {
            System.out.println("Digite a nota:");
            Double nota1 = teclado.nextDouble();
        }

        double media = nota1 / 2;
        System.out.println("A media do aluno " + nome + "é" + media);

    }

}
