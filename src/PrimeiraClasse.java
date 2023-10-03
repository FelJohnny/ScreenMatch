public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Esse é o Sreen Match");
        System.out.println("Filme: Interistelar");

        int anoDeLancamento = 2022;
        System.out.println("O Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // media calculada para nota
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Johnny
                Filme magnifico mostrnado o futuro da humanidade
                Muito bom!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media /2;
    }
}