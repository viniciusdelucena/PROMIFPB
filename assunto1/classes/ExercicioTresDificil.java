package assunto1.classes;
/*


Crie uma classe Livro com os seguintes atributos: titulo (String), autor (String) e anoPublicacao (int).
Depois, crie um método chamado exibirInformacoes() que mostre esses dados formatados.
Por fim, crie dois livros diferentes e exiba as informações deles.

R:

public class Livro{

    String titulo;
    String autor;
    int anoPublicacao;

    void exibirInformacoes(){
        System.out.println("O titulo é: " + titulo + "O autor é: " + autor + "O ano de publicação é: " + anoPublicacao);
    }

    public static void main(String[] args){
        Livro crepusculo = new Livro();

        crepusculo.titulo = "crepusculo";
        crepusculo.autor = "hampshire";
        crepusculo.anoPublicacao = 2006;

        crepusculo.exibirInformacoes();

        Livro narnia = new Livro();

        narnia.titulo = "As aventuras de narnia";
        narnia.autor = "yorkshire";
        narnia.anoPublicacao = "1998";
    }

}

Explique com suas palavras a diferença entre atributo e método dentro de uma classe.

R: Atributos são caracteristicas que pertencem a classe(molde), os métodos são ações que a classe(molde) pode fazer.

 */