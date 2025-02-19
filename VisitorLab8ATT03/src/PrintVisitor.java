public class PrintVisitor implements Visitor {

    @Override
    public void visit(Carro carro) {
        System.out.println("Carro - Cor: " + carro.getCor() + ", Marca: " + carro.getMarca() + ", Modelo" + carro.getModelo());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus - Lugares: " + onibus.getLugares() + ", Ano de Fabricação: " + onibus.getAnoFabricacao());

    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta - Cor: " + bicicleta.getCor());

    }
}