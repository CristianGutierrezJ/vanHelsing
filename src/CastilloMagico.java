import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CastilloMagico extends Castillo {

    private List<Mago> magos = new ArrayList<>();


    public CastilloMagico(Integer plusResistencia) {
        super(plusResistencia);
    }

    public List<Mago> getMagos() {
        return magos;
    }

    public void addMago(Collection<Mago> magos) {
        magos.addAll(magos);
    }

    public void addMago(Mago mago) {
        magos.add(mago);
    }

    private Integer plusDeMagia() {
        if (magos.isEmpty()) return 0;
        else return magos.stream().mapToInt(mago -> mago.getPlusDeMagia()).sum();
    }


    @Override
    public Integer resistencia() {
        return super.resistencia() + plusDeMagia() + 20;
    }


}
