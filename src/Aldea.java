import java.util.ArrayList;
import java.util.Collection;

public class Aldea extends Zona{

    Collection<Casa> casas = new ArrayList<>();


    @Override
    public Integer resistencia() {
        return casas.stream().mapToInt(casa -> casa.getResistencia()).sum();
    }

    @Override
    protected Boolean cumpleRestriccones(Monstruo monstruo) {
        return !monstruo.esPatetico();
    }


}
