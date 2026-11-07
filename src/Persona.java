import java.util.Queue;

public abstract class Figura {
    private String nombre;
    private String identificacion;
    private String correo;

    public Persona(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }


    public void presentarse() {
        System.out.println("Hola, soy: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
    }
    public void actualizarCorreo(String correo){
        if (nuevoCorreo){
            nuevoCorreo.contains("@");
            nuevoCorreo.contains(".");
            correo = nuevoCorreo;
            System.out.println("Correo actualizado a " + correo);
            }
        else{
            System.out.println("Correo invalido. No se realizó el camio");

        }
}
    public String getNombre() {
        return nombre;
    }
}