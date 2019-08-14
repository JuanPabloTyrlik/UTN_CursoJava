package clase10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;

public class AlumnoWriter {
    public void writeAlumno(Alumno alumno) throws IOException {
        for (String materia : alumno.getMaterias().keySet()) {
            File aprobados = new File(Path.OUTPUT_FOLDER.getPath() + Year.now().toString() + materia + "-Aprobados.txt");
            File desaprobados = new File(Path.OUTPUT_FOLDER.getPath() + Year.now().toString() + materia + "-Desaprobados.txt");
            BufferedWriter brAprobados = new BufferedWriter(new FileWriter(aprobados, true));
            BufferedWriter brDesaprobados = new BufferedWriter(new FileWriter(desaprobados, true));
            if (alumno.getMaterias().get(materia) >= 4) {
                brAprobados.write(alumno.getApellido() + ", " + alumno.getNombre());
                brAprobados.newLine();
                brAprobados.flush();
            } else {
                brDesaprobados.write(alumno.getApellido() + ", " + alumno.getNombre());
                brDesaprobados.newLine();
                brDesaprobados.flush();
            }
        }
    }
}
