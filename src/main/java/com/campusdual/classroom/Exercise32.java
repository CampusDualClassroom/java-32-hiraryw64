package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.*;

public class Exercise32 {

    public static void main(String[] args) {
        String cadena = generateStringToSave(null);
        printToFile(cadena);
    }

    public static String generateStringToSave(String string) {
        if (string == null || string.equals("")) {
            return generateUserInputToSave();
        }
        return string;
    }

    private static String generateUserInputToSave() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while (!(string = Utils.string()).isEmpty()) {
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        try {
            File file = new File("src/main/resources/data.txt");
            FileWriter fw = new FileWriter(file);
            fw.append(string);
            fw.close();
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo.\n" + e.getMessage());
        }
    }


}
