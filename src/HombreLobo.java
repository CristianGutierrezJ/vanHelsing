public class HombreLobo extends Monstruo {


    public HombreLobo(Integer vitalidad) {
        super(vitalidad);
    }

    public Integer velocidad() {
        return 30 + 2 * getVitalidad();
    }

    @Override
    public Boolean esMasMaloQueKraken() {
        return getVitalidad() > 50;
    }


}
