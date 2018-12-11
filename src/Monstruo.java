public abstract class Monstruo {

    private Integer vitalidad;
    private Boolean esPatetico;


    public Monstruo() {
    }

    public Monstruo(Integer vitalidad) {
        this.vitalidad = vitalidad;
        this.esPatetico = false;
    }


    public void setEsPatetico() {
        this.esPatetico = true;
    }


    public Integer getVitalidad() {
        return vitalidad;
    }


    public abstract Integer velocidad();

    public Integer peligrosidad() {
        return getVitalidad() * velocidad();
    }


    public Boolean esRapido() {
        return velocidad() > 100;
    }

    public abstract Boolean esMasMaloQueKraken();

    public Boolean esPatetico() {
        return esPatetico;
    }



}
