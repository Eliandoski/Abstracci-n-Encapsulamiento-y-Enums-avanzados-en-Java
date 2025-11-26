public class ObjetoRecolectable {

    private String nombre;
    private RarezaObjeto rareza;

    public ObjetoRecolectable(String nombre, RarezaObjeto rareza){
        this.nombre = nombre;
        this.rareza = rareza;
    }

    public String getNombre(){
        return nombre;
    }

    public RarezaObjeto getRareza(){
        return rareza;
    }

    // Acción principal
    public void recolectar(PersonajeJugador jugador){
        System.out.println(jugador.getNombre() + " ha recolectado el objeto: " + nombre);
    }

    @Override
    public String toString(){
        return "| Objeto: " + nombre +
                " | Probabilidad: " + rareza.getProbabilidad() +
                " | Descripcion: " + rareza.getDescripcion();
    }
}
