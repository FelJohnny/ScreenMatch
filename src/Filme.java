public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;


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
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
