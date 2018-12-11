public class Dragon extends Monstruo {

    private Integer velocidad;
    private Boolean esMasMaloQueKraken;

    public Dragon(Integer vitalidad, Integer velocidad, Boolean esMasMaloQueKraken) {
        super(vitalidad);
        this.velocidad = velocidad;
        this.esMasMaloQueKraken = esMasMaloQueKraken;
    }

    @Override
    public Integer velocidad() {
        return velocidad;
    }

    @Override
    public Boolean esMasMaloQueKraken() {
        return esMasMaloQueKraken;
    }


}
