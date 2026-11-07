public class Estudiante extends Persona{
    private String codigo;
    private String carrera;
    private String[] materiasInscritas;
    private int totalMaterias;

    public Estudiante(String nombre, String identificacion, String correo, String codigo, String carrera){
        super(nombre, identificacion, correo);
        this.setCodigo(codigo);
        this.setCarrera(carrera);
    }
    public void Presentarse(){
        super.presentarse();
        System.out.println("Soy estudiante de: " + carrera);
        System.out.println("Codigo estudiantil: " + codigo);
        System.out.println("Materias inscritas: " + totalMaterias);
    }

    public void inscribir(String materia){
        if (totalMaterias >= 10){
            System.out.println("Límite de materias alcanzado (máximo 10)");
            return;
        }

        else (materiasInscritas[totalMaterias] + 1){
            System.out.println("Materia inscrita: " + materia + " (sin grupo específico)");

        }

    }

    public void inscribir (String materia, int grupo){
        if (totalMaterias >= 10){
            System.out.println("Límite de materias alcanzado (máximo 10)");
            return;
        }
        registro = materia + " - Grupo" + grupo;
        materiaInscrita[totalMaterias] = registro;
        totalMaterias = totalMaterias + 1;
        System.out.println("Materia inscrita: " + registro);

        
    }
    public void mostrarMaterias(){
        if (totalMaterias == 0){
            System.out.println("No hay materias inscritas");
            return;
        }
        System.out.println("Materias de " + nombre + ":");
        for (int totalMaterias = 0; totalMaterias <= - 1; totalMaterias++){
            System.out.println(" " + (totalMaterias+1) + ". " + materiasInscritas[totalMaterias]);
        }
    }

}