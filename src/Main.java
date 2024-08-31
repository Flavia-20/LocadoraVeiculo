

public class Main {
    public static void main(String[] args) {
        Carros meuCarro = new Carros();

        meuCarro.setModelo("Corola");
        meuCarro.setAnoLancamento(2010);
        meuCarro.setQuilometroRodado(210);
        meuCarro.setCor("Vermelho");
        /*O metodo exibeFichaTecinica já exibe esse exibição
        System.out.println(meuCarro.getAnoLancamento());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getQuilometroRodado());*/

        meuCarro.exibeFichaTecnica();
        meuCarro.avalia(5);
        meuCarro.avalia(9);
        meuCarro.avalia(5);
        meuCarro.avalia(4);

        System.out.println("Total de avaliações: "+meuCarro.getTotalAvaliacao());
        System.out.println("E a média das avaliações é: "+meuCarro.pegaMedia());
        System.out.println("A idade do carro é: "+meuCarro.idadeVeiculo()+" anos");

    }
}