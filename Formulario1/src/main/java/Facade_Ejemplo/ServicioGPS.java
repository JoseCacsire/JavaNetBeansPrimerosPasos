package Facade_Ejemplo;

public class ServicioGPS implements ServicioMovil{
    @Override
    public void empezar() {
        System.out.println("servicio GPS activado");
    }

    @Override
    public void cerrar() {
        System.out.println("servicio GPS desactivado");
    }
}
