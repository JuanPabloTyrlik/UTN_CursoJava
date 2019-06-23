package clase11;

import org.apache.commons.lang3.*;

import java.io.IOException;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //Exceptions, Archivos, DB
        Calculator c = new Calculator();
        LogWriter log = new LogWriter();
        DBWriter DBLog = new DBWriter();
        for (int i = 0; i < 5; i++) {
            int a = new Random().nextInt(10);
            int b = new Random().nextInt(10);
            try {
                log.writeLog("Addition","Arguments:", Integer.toString(a), Integer.toString(b), "Result:", Float.toString(c.sum(a, b)));
                DBLog.writeLog("Addition",a,b,c.sum(a,b));
                log.writeLog("Multiplication","Arguments:", Integer.toString(a), Integer.toString(b), "Result:", Float.toString(c.multiply(a, b)));
                DBLog.writeLog("Multiplication",a,b,c.multiply(a,b));
                log.writeLog("Division","Arguments:", Integer.toString(a), Integer.toString(b), "Result:", Float.toString(c.divide(a, b)));
                DBLog.writeLog("Division",a,b,c.divide(a,b));
            } catch (ArithmeticException e) {
                try {
                    log.writeLog(e, "Division by Zero");
                    DBLog.writeLog("Division",a,b,"Division by Zero");
                } catch (IOException ex) {
                    System.out.println("Couldn't write log");
                }
            } catch (IOException e) {
                System.out.println("Couldn't write log");
            }
        }
    }
}
