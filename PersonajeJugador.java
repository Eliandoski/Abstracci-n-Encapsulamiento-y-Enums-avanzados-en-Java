public class PersonajeJugador {

    private String nombre;
    private int salud;
    private TipoPersonaje tipo;

    public PersonajeJugador(String nombre, int salud, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public TipoPersonaje getTipo() { return tipo; }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Acción principal del personaje
    public void atacar(CriaturaEnemiga enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre());
        enemigo.recibirDaño(20);
    }

    @Override
    public String toString() {
        return " | Personaje: " + nombre +
                " | Salud: " + salud +
                " | Rol: " + tipo.getRol() +
                " | Estilo: " + tipo.getDescripcion();
    }
}
