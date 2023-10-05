package br.com.felipejohnny.screenmatch.calculos;
import br.com.felipejohnny.screenmatch.modelos.Titulo;

public class calculadoraDeTempo {
    private  int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal(){
        return tempoTotal;
    }
}
