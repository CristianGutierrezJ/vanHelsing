public class SapoPepe extends Monstruo{

    private static final Integer VELOCIDAD = 150000;
    private static final Integer PELIGROSIDAD = 2000000;
    private Integer vitalidad = Integer.MAX_VALUE;


    public SapoPepe() {
    }

    @Override
    public Integer getVitalidad() {
        return vitalidad;
    }

    @Override
    public Integer velocidad() {
        return VELOCIDAD;
    }

    @Override
    public Integer peligrosidad() {
        return PELIGROSIDAD;
    }

    @Override
    public Boolean esMasMaloQueKraken() {
        return true;
    }

    @Override
    public Boolean esPatetico() {
        return true;
    }


}