import br.com.felipejohnny.screenmatch.modelos.Filme;
import br.com.felipejohnny.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Interestelar");
        filme1.setAnoDeLancamento(2020);
        filme1.setDuracaoEmMinutos(310);
        filme1.setIncluidoNoPlano(true);
        filme1.setDiretor("Alguem incrivel");

        filme1.exibeFixaTecnica();
        filme1.avalia(10);
        filme1.avalia(5);
        System.out.println("A media das avaliações são: " + filme1.PegaMedia());
        System.out.println("total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Diretor: "+ filme1.getDiretor());


        Serie serie = new Serie();


        serie.setNome("One Piece");
        serie.setAnoDeLancamento(2023);
        serie.exibeFixaTecnica();
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(2);
        serie.setEpisodiosPorTemporadas(10);
        serie.setMinutosPorEpisodio(100);
        System.out.println();



    }
}
