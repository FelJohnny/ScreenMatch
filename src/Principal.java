import br.com.felipejohnny.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Interestelar");
        filme1.setAnoDeLancamento(2020);
        filme1.setDuracaoEmMinutos(310);
        filme1.setIncluidoNoPlano(true);

        filme1.exibeFixaTecnica();
        filme1.avalia(10);
        filme1.avalia(5);
        System.out.println("A media das avaliações são: " + filme1.PegaMedia());
        System.out.println("total de avaliações: " + filme1.getTotalDeAvaliacoes());

    }
}
