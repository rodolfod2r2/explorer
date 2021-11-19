package org.framework.rodolfo.freire.git.explorer;

import org.framework.rodolfo.freire.git.explorer.view.Menu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            menu.startMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
