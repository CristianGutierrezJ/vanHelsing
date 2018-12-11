public class Vampiro extends Monstruo {

    private  Integer velocidad;

    public Vampiro(Integer vitalidad) {
        super(vitalidad);
        velocidad = 100;
    }


    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }


    @Override
    public Integer velocidad() {
        return velocidad;
    }

    @Override
    public Boolean esMasMaloQueKraken() {
        return false;
    }


}
