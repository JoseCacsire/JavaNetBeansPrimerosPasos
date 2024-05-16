package Facade_Ejemplo;

public class Principal {

    public static void main(String[] args) {
        
        FacadeMovil facade = new FacadeMovil();
        System.out.println("\n------- ON --------");
        Movil movil = facade.encendido();

        System.out.println("\n\n------- OFF --------");

        facade.apagado(movil);
    }
}
