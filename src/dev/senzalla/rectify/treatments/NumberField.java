/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dev.senzalla.rectify.treatments;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * @author Bomsalvez
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */

public class NumberField {
public static void txtNumberInt(KeyEvent evt) {
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    private static void txtNumberDouble(KeyEvent evt) {
        String caracteres = "09876543210.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    public static void addNumber(boolean addLetter, JTextField txt, KeyEvent evt) {
        if (txt.getText().contains(".") || txt.getText().contains(",")) {
            addLetter = false;
        }
        if (addLetter) {
            txtNumberDouble(evt);
        } else {
            txtNumberInt(evt);
        }
    }
}
