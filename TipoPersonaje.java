public enum TipoPersonaje {

    GUERRERO("Guerrero", "Combatiente cuerpo a cuerpo"),
    ARQUERO("Arquero", "Atacante a distancia"),
    MAGO("Mago","Usuario de magia poderosa");

    private final String rol;
    private final String descripcion;

    TipoPersonaje(String rol, String descripcion) {
        this.rol = rol;
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
