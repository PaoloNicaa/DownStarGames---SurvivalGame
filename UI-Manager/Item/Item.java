package Item;
import java.awt.*;
import java.util.Random;
//NICA

public abstract class Item {
    private String name;
    private int peso;
    private int valore;
    private String tipoRarita;

    public Item(String name, String tipoRarita, int valore, int peso) {
        this.name = name;
        this.tipoRarita = tipoRarita;
        this.valore = valore;
        this.peso = peso;
    }

    public int getPeso() {
       return this.peso;
    }
      
    public int getValore() {
       return this.valore;
    }

    public String getName() {
        return this.name;
    }

    public String getRarita() {
        return this.tipoRarita;
    }

    public int rndX() {
        int x = 0;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Random random = new Random();
        x = random.nextInt(0, ((int)size.getWidth()));
        if (x > (size.getWidth() - 64)) { // Controllo per evitare che gli item si generino al di fuori della mappa
            x -= 64;
        }
        return x;
    } 

    public int rndY() {
        int y = 0;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Random random = new Random();
        y = random.nextInt(0, ((int)size.getHeight()));
        if (y > (size.getHeight() - 64)) { // Controllo per evitare che gli item si generino al di fuori della mappa
            y -= 64;
        }
        return y;
    }

    public Item spawnItem () {
        return null;
    }
}