package clase10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AlumnoBuilder {
//lee el archivo, crea el alumno y se lo pasa a AlumnoWriter para que lo escriba en el file de aprobados o desaprobados
    public void buildAlumno (String filePath) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(new File(filePath)));
            String[] linea = file.readLine().split(",");
            while (linea!=null) {
                Alumno alumno = new Alumno(linea[0],linea[1]);
                alumno.actualizarNota(linea[2],linea[3]);
            }
        } catch (IOException e) {

        } finally {

        }

    }
}
