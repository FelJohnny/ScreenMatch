package br.com.felipejohnny.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

//----------------------------SET-----------------------------------//
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int AnoDeLancamento){
        this.anoDeLancamento = AnoDeLancamento;;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    //----------------------------GET-----------------------------------//

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void exibeFixaTecnica(){
        System.out.printf("""
                Filme: %s
                Ano de Lançamento: %d
                Duração em minutos: %d
                incluido no Plano: %b
                """,nome,anoDeLancamento,duracaoEmMinutos, incluidoNoPlano);

    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double PegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return  media;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
