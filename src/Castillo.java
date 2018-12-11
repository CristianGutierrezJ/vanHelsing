
public class Castillo extends Zona {

    private Integer plusResistencia;


    public Castillo(Integer plusResistencia) {
        this.plusResistencia = plusResistencia;
    }


    @Override
    public Integer resistencia() {
        return 3000 + plusResistencia;
    }

    @Override
    protected Boolean cumpleRestriccones(Monstruo monstruo) {
        return monstruo.peligrosidad() > 256;
    }


}
