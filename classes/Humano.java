/* Estudo de forma simples de classe, objeto e instanciação */

package classes;

public class Humano{
    String nome;
    int idade;
    String genero;

    void pular(){
    System.out.println(nome + " pulouuuu");
    }

    public static void main(String[] args) {
        Humano vinicius = new Humano();
        vinicius.nome = "Vinicius";
        vinicius.pular();
    }
}

