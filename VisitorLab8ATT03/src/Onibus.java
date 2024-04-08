public class Onibus implements Veiculo {
    int lugares;
    int anoFabricacao;
    public Onibus(int lugares, int anoFabricacao) {
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }
    public int getLugares() {
        return lugares;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }


}