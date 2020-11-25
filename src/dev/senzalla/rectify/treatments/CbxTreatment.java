package dev.senzalla.rectify.treatments;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CbxTreatment {
    private List<Integer> cbxComponent;
    public void cleanCbx(JPanel pnl) {
        for (Component c : pnl.getComponents()) {
            if (c instanceof JComboBox) {
                JComboBox cbx = (JComboBox) c;
                cbx.setSelectedIndex(0);
            }
        }
    }

    public boolean isTxtVoid(JPanel pnl) {
        setTxt(pnl);
        return cbxComponent.stream().noneMatch(cbx -> (cbx==0));
    }

    private void setTxt(JPanel pnl) {
        cbxComponent = new ArrayList<>();
        for (Component c : pnl.getComponents()) {
            if (c instanceof JComboBox) {
                JComboBox cbx = (JComboBox) c;
                cbxComponent.add(cbx.getSelectedIndex());
            }
        }
    }
}
