import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ataque {

    private static final int MINIMO_MONSTRUOS_MALOS = 3;
    private LocalDate fecha;
    private List<Monstruo> monstruos;


    public Ataque(LocalDate fecha, List<Monstruo> monstruos) {
        this.fecha = fecha;
        this.monstruos = new ArrayList<>(monstruos);
    }

    public Ataque(List<Monstruo> monstruos) {
        this.fecha = LocalDate.now();
        this.monstruos = new ArrayList<>(monstruos);
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public List<Monstruo> getMonstruos() {
        return monstruos;
    }


    public Optional<Monstruo> monstruoMasPeligroso() {
        return monstruos.stream().max(Comparator.comparingInt(Monstruo::peligrosidad)); // Preguntar por Optinal
    }

    public List<Monstruo> monstruosRapidos() {
        return monstruos.stream().filter(monstruo -> monstruo.esRapido()).collect(Collectors.toList());
    }

    public Boolean fueSerio() {
        return monstruosPeoresQueKraken()
                .size() >= MINIMO_MONSTRUOS_MALOS;
    }

    private List<Monstruo> monstruosPeoresQueKraken() {
        return monstruos
                .stream()
                .filter(monstruo -> monstruo.esMasMaloQueKraken())
                .collect(Collectors.toList());
    }

    // Saber nivel de devastacion
    protected Integer nivelDeDevastacion() {
        return monstruos.stream().mapToInt(monstruo -> monstruo.peligrosidad()).sum();
    }


    protected void esPatetico() {
        monstruos.forEach(monstruo -> monstruo.setEsPatetico());
    }


}
