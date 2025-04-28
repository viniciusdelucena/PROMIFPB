public class Main {
    public static void main(String[] args) {
        Calculadora soma = new Soma();
        Calculadora multiplicacao = new Multiplicacao();

        double resultadoSoma = soma.calcular(5, 5); // 5 + 5
        double resultadoMultiplicacao = multiplicacao.calcular(4, 5); // 4 * 5

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
    }
}
