import java.util.*;
import java.util.stream.Collectors;

public abstract class Zona {

    private List<Ataque> ataques = new ArrayList<Ataque>();


    public abstract Integer resistencia();


    protected void recibeAtaque(Ataque ataque) {
        if (estaDestruida()) ataque.esPatetico();
        ataques.add(ataque);
    }


    protected abstract Boolean cumpleRestriccones(Monstruo monstruo);


    protected List<Monstruo> atacantesMasPeligrosos() {
        return ataques
                .stream()
                .map(Ataque::monstruoMasPeligroso)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        // todo: Preguntar por el map(Optional::get)
    }

    // Atacantes mas peligrosos sin repetir
    public Set<Monstruo> nigthmareTeam() {
        return atacantesMasPeligrosos().stream().collect(Collectors.toSet());
    }


    // Atacantes rápidos
    public List<Monstruo> atacantesRapidos() {
        return ataques
                .stream()
                .flatMap(ataque -> ataque.monstruosRapidos().stream()).collect(Collectors.toList());
    }


    // Saber si la Zona fue destruida
    public Boolean estaDestruida() {            // Si NO tiene ataques va a reventar
        return ataques
                .stream()
                .anyMatch(ataque -> ataque.nivelDeDevastacion() > resistencia());
    }


}


