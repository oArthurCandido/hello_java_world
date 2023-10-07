public class Gato {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void miar() {
        System.out.println("Miau!");
    }

    public void andar() {
        System.out.println("O gato está andando.");
    }
}
