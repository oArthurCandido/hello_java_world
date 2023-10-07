// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void andar(Object obj) {
        if (obj instanceof Cachorro cachorro) {
            cachorro.andar();
        } else if (obj instanceof Gato gato) {
            gato.andar();
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Lassie", 5);
        Gato gato = new Gato("Garfield", 3);

        andar(cachorro); // O cachorro está andando.
        andar(gato); // O gato está andando.
    }
   // public static void main(String[] args) {
      //  Caneta c1 = new Caneta();
      //  c1.modelo = "bic cristal";
       // c1.carga = 60;
       // c1.status();
        //}
    }
