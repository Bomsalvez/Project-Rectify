package dev.senzalla.rectify.treatments;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DtcTreatment {
    private List<Date> dtcChooser;
    public void cleanDtc(JPanel pnl) {
        for (Component c : pnl.getComponents()) {
            if (c instanceof JComboBox) {
                JDateChooser dtc = (JDateChooser) c;
                dtc.setDate(null);
            }
        }
    }

    public boolean isTxtVoid(JPanel pnl) {
        setTxt(pnl);
        return dtcChooser.stream().noneMatch(Objects::nonNull);
    }

    private void setTxt(JPanel pnl) {
        dtcChooser = new ArrayList<>();
        for (Component c : pnl.getComponents()) {
            if (c instanceof JDateChooser) {
                JDateChooser dtc = (JDateChooser) c;
                dtcChooser.add(dtc.getDate());
            }
        }
    }
}