package org.framework.rodolfo.freire.git.explorer.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Archive {

    public static final String EXT_FILE = ".txt";
    public static final String OUTPUT_FILE = "C:\\explorer\\";

    public void createdDirectory(String directory) {
        new File(directory).mkdir();
    }

    public boolean checkedDirectory(String directory) {
        return (new File(directory)).exists();
    }

    public void buildFile(String name) throws IOException {
        Random random = new Random();
        String archive = name + random.nextInt() + EXT_FILE;
        File file = new File(OUTPUT_FILE, archive);
        if (!checkedDirectory(OUTPUT_FILE)) {
            createdDirectory(OUTPUT_FILE);
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.close();

    }

    public void listFile() {
        try {
            File file = new File(OUTPUT_FILE);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File fileTmp : listFiles) {
                    System.out.println(fileTmp.getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void removeFile() {
        try {
            File file = new File(OUTPUT_FILE);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File fileTmp : listFiles) {
                    fileTmp.delete();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
