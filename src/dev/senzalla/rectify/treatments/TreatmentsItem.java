package dev.senzalla.rectify.treatments;

import java.awt.Component;
import javax.swing.JPanel;

/**
 * @author Bomsalvez
 * @e-mail blackburncyber@gmail.com
 * @github github.com/BlackBurnCybernetic
 */
public class TreatmentsItem {

    public static void visiblePanel(JPanel pnl) {
        for (Component c : pnl.getComponents()) {
            if (c instanceof JPanel) {
                JPanel panel = (JPanel) c;
                panel.setVisible(false);
            }
        }
    }
}
