import java.util.ArrayList;

public class NivelZona {

    private String nombre;
    private ArrayList<CriaturaEnemiga> enemigos = new ArrayList<>();
    private ArrayList<ObjetoRecolectable> objetos = new ArrayList<>();

    public NivelZona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarEnemigo(CriaturaEnemiga enemigo){
        enemigos.add(enemigo);
    }

    public void agregarObjeto(ObjetoRecolectable objeto){
        objetos.add(objeto);
    }

    public void mostrarContenido(){
        System.out.println("\n=== Nivel: " + nombre + " ===");

        System.out.println("\nEnemigos en el nivel:");
        for(CriaturaEnemiga e : enemigos){
            System.out.println(e);
        }

        System.out.println("\nObjetos en el nivel:");
        for(ObjetoRecolectable o : objetos){
            System.out.println(o);
        }
    }
}
