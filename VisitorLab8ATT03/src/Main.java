public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {new Carro("Azul", "Toyota", "Corolla"),
                new Onibus(50, 2015),
                new Bicicleta("Verde")};

        PrintVisitor imprimirVisitor = new PrintVisitor();
        MensagemVisitor mensagemVisitor = new MensagemVisitor();

        System.out.println("Imprimindo dados dos veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(imprimirVisitor);
        }

        System.out.println("\nEnviando mensagem para os donos dos veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(mensagemVisitor);
        }
    }
}
