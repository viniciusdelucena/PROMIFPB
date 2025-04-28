package heranca.exemploSimples;

public class Cachorro extends Animal {
    
    void latir() {
        System.out.println(nome + " está latindo!");
    }

    public static void main(String[] args) {
        
        Cachorro yorkshire = new Cachorro();

        yorkshire.nome = "yorkshire";
        yorkshire.dormir();
        yorkshire.latir();
    }
}
