package clase10;

import java.time.Year;

public class Main {
    // nombre, apellido, materia, nota
    //leer 10 alumnos por file,generar 2 archivos, uno con los aprobados y otro con los desaprobados. Se aprueba con 4.
    public static void main(String[] args) {
        AlumnoBuilder alumnoBuilder = new AlumnoBuilder();
        alumnoBuilder.buildAlumno(Path.INPUT_FOLDER.getPath());
    }
}
