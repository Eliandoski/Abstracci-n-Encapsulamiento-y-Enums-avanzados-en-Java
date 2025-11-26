public enum TipoCriaturaEnemiga {

    OGRO("Alta amenaza", "Ataca con fuerza bruta"),
    ESPECTRO("Amenaza media", "Se mueve sigilosamente"),
    SLIME("Baja amenaza", "Aparece en grupos");

    private final String amenaza;
    private final String descripcion;

    TipoCriaturaEnemiga(String amenaza, String descripcion){
        this.amenaza = amenaza;
        this.descripcion = descripcion;
    }

    public String getAmenaza(){
        return amenaza;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
