package dev.senzalla.rectify.treatments;

import dev.senzalla.rectify.entitys.Product;
import dev.senzalla.rectify.entitys.StockTank;
import dev.senzalla.rectify.entitys.Tank;
import dev.senzalla.rectify.frame.StockTankTableFrame;
import dev.senzalla.rectify.request.StockTankRequest;
import dev.senzalla.rectify.request.TankRequest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class StockTankTreatment {

    public static void initTable(JTable tableStockTank) {
        List<StockTank> stockTanks = new StockTankRequest().select(null,null);
        fillTable(tableStockTank, stockTanks);
    }

    public static void setTableFilters(JTable tableStockTank, Object tank, Object product, Date dateOf, Date dateUntil) {
        List<String> clause = new ArrayList<>();
        StockTank stockTank = new StockTank();
        if (!tank.equals("Tanque")) {
            clause.add("nameTank =");
            stockTank.setTank((Tank) tank);
        }
        if (!product.equals("Produto")) {
            clause.add("nameProduct =");
            stockTank.setProduct((Product) product);
        }
        if (dateOf != null && dateUntil != null) {
            clause.add("dtStkTq between");
            stockTank.setDateStockTank(dateOf);
            clause.add("");
            stockTank.setDateBetween(dateUntil);
        } else {
            if (dateOf != null) {
                clause.add("dtStkTq =");
                stockTank.setDateStockTank(dateOf);
            }
            if (dateUntil != null) {
                clause.add("dtStkTq =");
                stockTank.setDateStockTank(dateUntil);
            }
        }
        List<StockTank> stockTanks = new StockTankRequest().select(clause, stockTank);
        if (!stockTanks.isEmpty()) {
            fillTable(tableStockTank, stockTanks);
        } else {
            PopUp.searchNoResults("Estoque");
        }
    }

    private static void fillTable(JTable tableStockTank, List<StockTank> stockTanks) {
        StockTankTableFrame.queryFilter(stockTanks);
        DefaultTableModel tankModel = (DefaultTableModel) tableStockTank.getModel();
        tankModel.setNumRows(0);
        stockTanks.forEach(stock ->
                tankModel.addRow(new Object[]{
                        stock.getTank(),
                        stock.getProduct(),
                        stock.getLiterProduct()
                }));
    }

    public void saveStockTank(JTable tableStockTank) {
        final int colummProduct = 1;
        for (int i = 0; i < tableStockTank.getRowCount(); i++) {
            if (!tableStockTank.getValueAt(i, colummProduct).equals("Produto")) {
                Tank tank = (Tank) (tableStockTank.getValueAt(i, 0));
                StockTank stockTank = new StockTank();
                stockTank.setTank(tank);
                stockTank.setProduct((Product) (tableStockTank.getValueAt(i, 1)));
                stockTank.setLiterProduct(litter(tableStockTank, i, tank));
                new StockTankRequest().insert(stockTank);
            }
        }
        this.initTableAddStock(tableStockTank);
    }

    public void initTableAddStock(JTable tableStockTankAdd) {
        DefaultTableModel model = (DefaultTableModel) tableStockTankAdd.getModel();
        model.setNumRows(0);
        new TankRequest().select().forEach(tank
                -> model.addRow(new Object[]{
                tank,
                "Produto"
        }));
    }

    private int litter(JTable tableStockTankAdd, int i, Tank tank) {
        final int colummLiter = 2;
        Object litterTbl = tableStockTankAdd.getValueAt(i, colummLiter);
        int litter = 0;
        if (litterTbl != null) {
            litter = Integer.parseInt(litterTbl.toString());
            return Math.min(litter, tank.getCapacityTank());
        }
        return litter;
    }
}
