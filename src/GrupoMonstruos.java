import java.util.*;
import java.util.stream.Collectors;

public class GrupoMonstruos {

    private List<Monstruo> monstruos = new ArrayList<>();


    public void addMonstruo(Collection<Monstruo> monstruos) {
        monstruos.addAll(monstruos);
    }

    public void addMonstruo(Monstruo monstruos) {
        this.monstruos.add(monstruos);
    }


    public void atacarZona(Zona zona) {
        List<Monstruo> monstruosAptos = new ArrayList<Monstruo>(aptosParaElAtaque(zona));

        if (!monstruosAptos.isEmpty()) {
            Ataque ataque = new Ataque(monstruosAptos);
            zona.recibeAtaque(ataque);
        } else {
            System.out.println("Ningún monstruo está apto para atacar");
        }
    }

    private List<Monstruo> aptosParaElAtaque(Zona zona) {
        return monstruos
                .stream()
                .filter(monstruo -> zona.cumpleRestriccones(monstruo))
                .collect(Collectors.toList());
    }


}
