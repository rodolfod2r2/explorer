package org.framework.rodolfo.freire.git.explorer.view;

import org.framework.rodolfo.freire.git.explorer.model.Archive;

import java.io.IOException;
import java.util.Scanner;

public class Menu {


    private int exit = 0;
    private final Archive archive = new Archive();

    public int getExit() {
        return exit;
    }

    public void setExit(int exit) {
        this.exit = exit;
    }

    public void startMenu() throws IOException {

        Scanner keyboard  = new Scanner(System.in);
        do {
        System.out.println("\nChoose one Option");
        System.out.println("1 - Create File");
        System.out.println("2 - List File(s)");
        System.out.println("3 - Remove File(s)");
        System.out.println("4 - Exit\n");
        options(keyboard.nextInt());
        } while (getExit() != 4);
    }

    public void options(int number) throws IOException {

        if (number == 1) {
            archive.buildFile("nameFile");
        } else if (number == 2) {
            archive.listFile();
        } else if (number == 3) {
            archive.removeFile();
        } else if (number == 4) {
            this.exit = 4;
        }

    }


}
