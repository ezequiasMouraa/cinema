import java.util.Scanner;

public class MenuController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Lista de filmes disponíveis
        String[] filmes = {"Doutor Estranho no Multiverso da Loucura", "Top Gun: Maverick", "O Homem-Aranha: Sem Volta Para Casa"};

        // Selecionar filme
        System.out.println("Selecione um filme:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i]);
        }
        int opcaoFilme = scanner.nextInt();

        // Selecionar sessão
        System.out.println("Selecione uma sessão:");
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + " - 14h");
            System.out.println((i + 2) + " - 19h");
        }
        int opcaoSessao = scanner.nextInt();

        // Comprar ingressos
        System.out.println("Quantidade de ingressos inteiros:");
        int quantidadeInteiros = scanner.nextInt();
        System.out.println("Quantidade de ingressos meia-entrada:");
        int quantidadeMeias = scanner.nextInt();

        // Calcular valor total
        float valorTotal = (quantidadeInteiros * 24) + (quantidadeMeias * 12);

        // Exibir resultado
        System.out.println("O total a pagar é de R$" + valorTotal);
    }
}
