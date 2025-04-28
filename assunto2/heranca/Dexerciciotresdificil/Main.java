package assunto2.heranca.Dexerciciotresdificil;

public class Main {
    public static void main(String[] args) {
        Carro camaro = new Carro();
        Moto cb500 = new Moto();

        camaro.quantidadePortas = 2;
        camaro.exibirInformacoes();
        cb500.cilindradas = 500;
        cb500.exibirInformacoes();
    }
}
