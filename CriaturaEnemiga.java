public class CriaturaEnemiga {

    private String nombre;
    private int salud;
    private TipoCriaturaEnemiga tipo;

    public CriaturaEnemiga(String nombre, int salud, TipoCriaturaEnemiga tipo){
        this.nombre = nombre;
        this.salud = salud;
        this.tipo = tipo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getSalud(){
        return salud;
    }

    public TipoCriaturaEnemiga getTipo(){
        return tipo;
    }

    public void recibirDaño(int daño){
        salud -= daño;
        System.out.println(nombre + " recibió " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public String toString(){
        return "| Enemigo: " + nombre +
                " | Salud: " + salud +
                " | Amenaza: " + tipo.getAmenaza() +
                " | Descripcion del enemigo: " + tipo.getDescripcion();
    }
}
