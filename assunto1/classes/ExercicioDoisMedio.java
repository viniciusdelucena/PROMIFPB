package assunto1.classes;
/*

 Crie uma classe chamada Aluno que tenha dois atributos: nome (String) e matricula (int).
Depois, crie dois objetos diferentes dessa classe e preencha seus atributos.

R:

public class Aluno{
    String nome;
    int matricula;

    public static void main(String[] args){
        Aluno vini = new Aluno();
        vini.nome = "Vinicius";
        vini.matricula = 202312110028;
    }
}

O que significa "instanciar um objeto"? Dê um exemplo com a classe Aluno.

R: No caso seria criar uma variante a partir do molde Aluno, por exemplo nós podemos pegar o molde Aluno e criar um aluno a partir disso, com seu respectivo nome e matricula.

Complete o código abaixo:

public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + _______ + " e tenho " + _______ + " anos.");
    }
}

class Main {
    public static void main(String[] args) {
        Pessoa p = new _______();
        p.nome = "Carlos";
        p.idade = 25;
        p.apresentar();
    }
}

R:

public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Carlos";
        p.idade = 25;
        p.apresentar();
    }
}

 */