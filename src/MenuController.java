import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Lista de filmes disponíveis
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Doutor Estranho no Multiverso da Loucura", "Sam Raimi", "Após os eventos de Vingadores: Ultimato, o Dr. Stephen Strange continua sua pesquisa sobre a Pedra do Tempo. Mas um velho amigo que virou inimigo coloca um ponto final nos planos de Strange, fazendo com que ele desencadeie um mal inimaginável. Para restaurar a paz ao mundo, Strange deve viajar para o desconhecido e enfrentar uma nova ameaça.", "Ação, Aventura, Fantasia", 126));
        filmes.add(new Filme("Top Gun: Maverick", "Joseph Kosinski", "Pete 'Maverick' Mitchell está de volta, mais de 30 anos depois do primeiro filme. Agora, ele é um instrutor de voo da Marinha dos Estados Unidos e deve treinar um novo grupo de pilotos para uma missão perigosa.", "Ação, Drama, Aventura", 137));
        filmes.add(new Filme("O Homem-Aranha: Sem Volta Para Casa", "Jon Watts", "Depois de ter sua identidade revelada ao mundo, Peter Parker busca a ajuda de Doutor Estranho para apagar as memórias de todos que sabem que ele é o Homem-Aranha. No entanto, o feitiço dá errado e abre um portal para o multiverso, trazendo vilões de outros universos para o mundo de Peter.", "Ação, Aventura, Fantasia", 148));


        // Mostrar nomes dos filmes enumerados
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i + 1) + " - " + filmes.get(i).getNome());
        }
        int opcaoFilme = scanner.nextInt();
        Filme filme = filmes.get(opcaoFilme - 1);

        // Selecionar sessão
        List<String> horarios = Arrays.asList("14h", "19h");
        System.out.println("Selecione uma sessão:");
        for (int i = 0; i < horarios.size(); i++) {
            System.out.println((i + 1) + " - " + horarios.get(i));
        }
        int opcaoSessao = scanner.nextInt();
        String horario = horarios.get(opcaoSessao - 1);


        // Comprar ingressos
        System.out.println("Quantidade de ingressos inteiros:");
        int quantidadeInteiros = scanner.nextInt();
        System.out.println("Quantidade de ingressos meia-entrada:");
        int quantidadeMeias = scanner.nextInt();

        // Criar ingressos
        List<Ingresso> ingressos = new ArrayList<>();
        for (int i = 0; i < quantidadeInteiros; i++) {
            ingressos.add(new Ingresso(filme, "inteiro", horario));
        }
        for (int i = 0; i < quantidadeMeias; i++) {
            ingressos.add(new Ingresso(filme, "meia-entrada", horario));
        }

        // Calcular valor total
        float valorTotal = 0;
        for (Ingresso ingresso : ingressos) {
            valorTotal += ingresso.getValor();
        }

        // Exibir resultado
        System.out.println("O total a pagar é de R$" + valorTotal);
    }
}
