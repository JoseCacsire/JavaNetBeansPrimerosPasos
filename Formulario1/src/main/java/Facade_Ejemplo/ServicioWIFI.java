package Facade_Ejemplo;

public class ServicioWIFI implements ServicioMovil{
    @Override
    public void empezar() {
        System.out.println("servicio WIFI activado");
    }

    @Override
    public void cerrar() {
        System.out.println("servicio WIFI desactivado");
    }
}
