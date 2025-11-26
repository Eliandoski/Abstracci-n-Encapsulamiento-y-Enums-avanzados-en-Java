public class Main {
    public static void main(String[] args) {

        PersonajeJugador jugador =
                new PersonajeJugador("Salomon", 100, TipoPersonaje.GUERRERO);

        System.out.println("=== PERSONAJE SELECCIONADO ===");
        System.out.println(jugador);

        CriaturaEnemiga ogro =
                new CriaturaEnemiga("Ogro Verde", 100, TipoCriaturaEnemiga.OGRO);

        ObjetoRecolectable arco =
                new ObjetoRecolectable("Arco Antiguo", RarezaObjeto.RARO);

        NivelZona bosque = new NivelZona("Dunas Carmesí");
        bosque.agregarEnemigo(ogro);
        bosque.agregarObjeto(arco);

        bosque.mostrarContenido();

        System.out.println("\n--- ACCIONES DEL JUGADOR ---");
        jugador.atacar(ogro);
        arco.recolectar(jugador);
    }
}
