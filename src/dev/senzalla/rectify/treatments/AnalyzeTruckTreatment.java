package dev.senzalla.rectify.treatments;

import dev.senzalla.rectify.entitys.AnalyzeSplit;
import dev.senzalla.rectify.entitys.AnalyzeTruck;
import dev.senzalla.rectify.entitys.AnalyzeTruckSplit;
import dev.senzalla.rectify.entitys.Product;
import dev.senzalla.rectify.enuns.Collect;
import dev.senzalla.rectify.request.AnalyzeTruckRequest;
import dev.senzalla.rectify.request.AnalyzeTruckSplitRequest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

import static dev.senzalla.rectify.treatments.DateTreatment.convertDateUtil;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class AnalyzeTruckTreatment {

    public static void initComboBoxCollect(JComboBox<Object> cbxCollect) {
        cbxCollect.removeAllItems();
        cbxCollect.addItem("Coleta");
        Arrays.stream(Collect.values()).map(Collect::getDescricao).forEach(cbxCollect::addItem);
    }

    public static void initComboBoxAnalyze(JComboBox<Object> cbx) {
        cbx.removeAllItems();
        cbx.addItem("Cod. Analise");
        new AnalyzeTruckRequest().select(null, null).forEach(cbx::addItem);
    }
    
    
    public static void setFilterComboBox(JComboBox<Object> cbxTank, Product product) {
        cbxTank.removeAllItems();
        cbxTank.addItem("Cod. Analise");
        new AnalyzeTruckRequest().select(Collections.singletonList("nameProduct ="), new AnalyzeTruck(product)).forEach(cbxTank::addItem);
    }

    public static void initTable(JTable tableAnalyzeTruck) {
        fillTable(tableAnalyzeTruck, new AnalyzeTruckRequest().select(null, null));
    }

    public static void setTableFilters(JTable tableAnalyzeTruck, Long idAnalyzeTruck, Date dateOf, Date dateUntil) {
        List<String> clause = new ArrayList<>();
        AnalyzeTruck analyzeTruck = new AnalyzeTruck();
        if (idAnalyzeTruck > 0) {
            clause.add("idAnalyzeTruck =");
            analyzeTruck.setIdAnalyzeTruck(idAnalyzeTruck);
        }

        if (dateUntil != null && dateOf != null) {
            clause.add("dateAnalyzeTruck between");
            analyzeTruck.setDateAnalyzeTruck(dateOf);
            clause.add("");
            analyzeTruck.setDateBetween(dateUntil);

        } else {
            if (dateOf != null) {
                clause.add("dateAnalyzeTruck =");
                analyzeTruck.setDateAnalyzeTruck(dateOf);
            }
            if (dateUntil != null) {
                clause.add("dateAnalyzeTruck =");
                analyzeTruck.setDateAnalyzeTruck(dateUntil);
            }
        }

        List<AnalyzeTruck> analyzeTrucks = new AnalyzeTruckRequest().select(clause, analyzeTruck);
        if (!analyzeTrucks.isEmpty()) {
            fillTable(tableAnalyzeTruck, analyzeTrucks);
        } else {
            PopUp.searchNoResults("Analise");
        }
    }

    private static void fillTable(JTable tableAnalyzeTruck, List<AnalyzeTruck> analyzeTrucks) {
        DefaultTableModel tableModel = (DefaultTableModel) tableAnalyzeTruck.getModel();
        tableModel.setNumRows(0);
        analyzeTrucks.forEach(analyzeTruck
                -> tableModel.addRow(new Object[]{
            analyzeTruck.getIdAnalyzeTruck(),
            analyzeTruck.getProduct().getNameProduct(),
            analyzeTruck.getAcidityTruck(),
            analyzeTruck.getSaponityTruck(),
            analyzeTruck.getTrashTruck(),
            analyzeTruck.getDensityTruck(),
            convertDateUtil(analyzeTruck.getDateAnalyzeTruck()),
            analyzeTruck.getTimeAnalyzeTruck()
        }));
    }


    public void saveAnalyzeTruck(String acidity, String Saponity, String density, String trash, int collect, Product product) {
        AnalyzeTruck analyzeTruck = new AnalyzeTruck();
        analyzeTruck.setAcidityTruck(Double.parseDouble(acidity));
        analyzeTruck.setSaponityTruck(Double.parseDouble(Saponity));
        analyzeTruck.setDensityTruck(Double.parseDouble(density));
        analyzeTruck.setTrashTruck(Integer.parseInt(trash));
        analyzeTruck.setCollect(collect);
        analyzeTruck.setProduct(product);
        new AnalyzeTruckRequest().insert(analyzeTruck);
    }

    public void saveAnalyzeTruckSplit(Long idAnalyzeSplit) {
        AnalyzeTruckSplit analyzeTruckSplit = new AnalyzeTruckSplit();
        analyzeTruckSplit.setAnalyzeSplit(new AnalyzeSplit(idAnalyzeSplit));
        new AnalyzeTruckSplitRequest().insert(analyzeTruckSplit);
    }

}
