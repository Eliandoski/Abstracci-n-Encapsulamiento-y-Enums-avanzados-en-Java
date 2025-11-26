public enum RarezaObjeto {

    COMUN(0.70, "Objeto común, fácil de encontrar"),
    RARO(0.25, "Objeto raro, algo difícil de obtener"),
    LEGENDARIO(0.05, "Objeto legendario, extremadamente valioso");

    private final double probabilidad;
    private final String descripcion;

    RarezaObjeto(double probabilidad, String descripcion){
        this.probabilidad = probabilidad;
        this.descripcion = descripcion;
    }

    public double getProbabilidad(){
        return probabilidad;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
