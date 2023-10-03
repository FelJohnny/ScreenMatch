public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoplano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("lancamento que os clientes estao gostando");
        }else{
            System.out.println("filme retro");
        }

        if(incluidoNoPlano || tipoplano.equals("plus")){
            System.out.println("Filme dispoinvel");
        }else{
            System.out.println("filme indisponivel, adquira o plano ou alugue o filme");
        }
    }
}
