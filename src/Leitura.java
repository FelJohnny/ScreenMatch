import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano do lançamento:");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("digite a nota do filme:(utilize virgula)");
        double notaFilme = leitura.nextDouble();



        System.out.println("O filme: " + filme +" Foi lançado no ano de: " + anoDeLancamento + " E possui a nota: " + notaFilme + " No IMDB");

    }
}
