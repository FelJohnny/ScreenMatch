public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Interestelar";
        filme1.anoDeLancamento= 2020;
        filme1.duracaoEmMinutos= 310;
        filme1.incluidoNoPlano= true;

        filme1.exibeFixaTecnica();
        filme1.avalia(10);
        filme1.avalia(5);
        System.out.println("A media das avaliações são: " + filme1.getPegaMedia());
        System.out.println("total de avaliações: " + filme1.getTotalDeAvaliacoes());
    }
}
