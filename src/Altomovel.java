import java.util.Date;

public class Altomovel {

        private String modelo;
        private int anoLancamento;
        private boolean quatroPortas;
        private double somaDasAvaliacoes;
        private int totalAvaliacao;
        private int quilometroRodado;
        private String cor;
        private Date dataAtual = new Date();


        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getQuilometroRodado() {
            return quilometroRodado;
        }

        public void setQuilometroRodado(int quilometroRodado) {
            this.quilometroRodado = quilometroRodado;
        }

        public int getTotalAvaliacao() {
            return totalAvaliacao;
        }


        public int getAnoLancamento() {
            return anoLancamento;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setAnoLancamento(int anoLancamento) {
                this.anoLancamento = anoLancamento;
        }

        public void exibeFichaTecnica() {
            System.out.println("modelo do altomovel: " + modelo);
            System.out.println("Ano de lançamento: " + anoLancamento);
            System.out.println("Quantidade de quilometros rodados: " + quilometroRodado);
            System.out.println("A cor do veiculo é: "+ cor);

        }

        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalAvaliacao++;
        }

        double pegaMedia(){
            return somaDasAvaliacoes / totalAvaliacao;
        }

        int idadeVeiculo(){
            return 2024 - anoLancamento;
        }

    }

