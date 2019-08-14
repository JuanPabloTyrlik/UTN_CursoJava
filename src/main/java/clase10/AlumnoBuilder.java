package clase10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AlumnoBuilder {
    //lee el archivo, crea el alumno y se lo pasa a AlumnoWriter para que lo escriba en el file de aprobados o desaprobados
    public void buildAlumno(String filePath) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(new File(filePath)));
            String line = file.readLine();
            while (line != null) {
                String[] linea = line.split(",");
                Alumno alumno = new Alumno(linea[0], linea[1]);
                alumno.actualizarNota(linea[2], Double.parseDouble(linea[3]));
                AlumnoWriter alumnoWriter = new AlumnoWriter();
                alumnoWriter.writeAlumno(alumno);
                line = file.readLine();
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Error al leer/modificar el archivo");
        } catch (NullPointerException e) {
            System.out.println("El archivo está vacio");
        }
    }
}
