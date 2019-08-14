package clase11;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

    public void writeLog(String... args) throws IOException {
        File log = new File("D:\\Java\\log.txt");
        BufferedWriter bwLog = new BufferedWriter(new FileWriter(log, true));
        for (String arg : args) {
            bwLog.write(arg + "\t");
        }
        bwLog.newLine();
        bwLog.flush();
        bwLog.close();
    }

    public void writeLog(Exception e, String... args) throws IOException {
        File log = new File("D:\\Java\\log.txt");
        BufferedWriter bwLog = new BufferedWriter(new FileWriter(log, true));
        for (String arg : args) {
            bwLog.write(arg + "\t");
        }
        bwLog.newLine();
        bwLog.write(ExceptionUtils.getStackTrace(e));
        bwLog.newLine();
        bwLog.flush();
        bwLog.close();
    }
}
