package Facade_Ejemplo;

import java.util.Arrays;
import java.util.List;
public class FacadeMovil {
    
    public Movil encendido() {

        Bateria bateria = new Bateria();
        bateria.encendido();

        CPU cpu = new CPU();
        cpu.arranqueCPU();

        ServicioMovil gps = new ServicioGPS();
        gps.empezar();

        ServicioMovil wifi = new ServicioWIFI();
        wifi.empezar();

        List<ServicioMovil> servicioMovil = Arrays.asList(gps, wifi);

        Movil movil = new Movil(bateria, cpu, servicioMovil);
        return movil;
    }
    public void apagado(Movil movil) {

        ServicioMovil gps = new ServicioGPS();
        gps.cerrar();

        ServicioMovil wifi = new ServicioWIFI();
        wifi.cerrar();
        movil.getCpu().apagadoCPU();
        movil.getBateria().apagado();
    }    
}
