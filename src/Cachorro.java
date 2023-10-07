public class Cachorro {
    private String nome;
    private int idade;

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("Au au!");
    }

    public void andar() {
        System.out.println("O cachorro está andando.");
    }
}
