public class EstudianteGraduado extends Estudiante{
    private String tituloObtenido;
    private String proyectoGrado;
    private String directorTesis;

    public EstudianteGraduado(String nombre, String identificacion, String correo, String codigo, String carrera, String titulo, String proyecto, String director){
        super(nombre, identificacion, correo);
        
    }
}