public class MensagemVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Favor atualizar dados do IPVA para o carro.");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Atenção para atualização das licenças para o ônibus.");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Comemore no parque o dia do ciclismo para a bicicleta.");
    }
}
