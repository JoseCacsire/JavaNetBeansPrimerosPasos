package Facade_Ejemplo;
import java.util.List;

public class Movil {
    private final Bateria bateria;
    private final CPU cpu;
    private final List<ServicioMovil> servicioMovil;

    public Movil(Bateria bateria, CPU cpu, List<ServicioMovil> servicioMovil) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.servicioMovil = servicioMovil;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public List<ServicioMovil> getServicioMovil() {
        return servicioMovil;
    }    
}
