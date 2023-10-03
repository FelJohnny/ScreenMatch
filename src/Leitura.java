import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano do lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("digite a nota do filme(utilize virgula)");
        double notaFilme = leitura.nextDouble();



        System.out.println("O filme: " + filme +" lançado no ano de: " + anoDeLancamento + " Possui a nota: " + notaFilme);

    }
}
