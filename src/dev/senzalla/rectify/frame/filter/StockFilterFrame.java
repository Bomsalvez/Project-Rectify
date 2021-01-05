package dev.senzalla.rectify.frame.filter;

import dev.senzalla.rectify.treatments.ProductTreatment;
import dev.senzalla.rectify.treatments.StockProductTreatment;
import dev.senzalla.rectify.treatments.StockTankTreatment;
import dev.senzalla.rectify.treatments.TankTreatment;
import dev.senzalla.theme.TreatmentTheme;

import javax.swing.*;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class StockFilterFrame extends javax.swing.JFrame {

    private JTable tableStock;
    private boolean flagProduct;

    /**
     * Creates new form FrmFilterSeal
     */
    public StockFilterFrame() {
        initComponents();
        TreatmentTheme.initTheme(pnlStock);
        TankTreatment.initComboBox(cbxTank);
        ProductTreatment.initComboBox(cbxProduct);
    }

    public StockFilterFrame(JTable tableStock) {
        initvariable(tableStock, false);
        initComponents();
        initPanel();
        hideContainer();
    }

    public StockFilterFrame(JTable tableStock, boolean flagProduct) {
        initvariable(tableStock, flagProduct);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlStock = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTank = new javax.swing.JLabel();
        cbxTank = new javax.swing.JComboBox<>();
        lblProduct = new javax.swing.JLabel();
        cbxProduct = new javax.swing.JComboBox<>();
        lblDateOf = new javax.swing.JLabel();
        dtcDateOf = new com.toedter.calendar.JDateChooser();
        lblDateUntil = new javax.swing.JLabel();
        dtcDateUntil = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("FrmFilterSeal"); // NOI18N
        setResizable(false);

        pnlStock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTitle.setText("Filtro de Estoque");

        lblTank.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTank.setText("Tanque");

        cbxTank.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxTank.setPreferredSize(new java.awt.Dimension(34, 27));

        lblProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblProduct.setText("Produto");

        cbxProduct.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxProduct.setPreferredSize(new java.awt.Dimension(34, 27));

        lblDateOf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDateOf.setText("De");

        dtcDateOf.setDateFormatString("dd/MM/yyyy");
        dtcDateOf.setMaxSelectableDate(new java.util.Date(253370782899000L));

        lblDateUntil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDateUntil.setText("Ate");

        dtcDateUntil.setDateFormatString("dd/MM/yyyy");
        dtcDateUntil.setMaxSelectableDate(new java.util.Date(253370782899000L));

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setPreferredSize(new java.awt.Dimension(97, 35));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClean.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnClean.setText("Limpar");
        btnClean.setPreferredSize(new java.awt.Dimension(97, 35));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStockLayout = new javax.swing.GroupLayout(pnlStock);
        pnlStock.setLayout(pnlStockLayout);
        pnlStockLayout.setHorizontalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockLayout.createSequentialGroup()
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProduct)
                            .addComponent(lblTank)
                            .addComponent(lblDateOf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxProduct, 0, 200, Short.MAX_VALUE)
                            .addComponent(dtcDateOf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlStockLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblTitle))
                    .addGroup(pnlStockLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlStockLayout.createSequentialGroup()
                                .addComponent(lblDateUntil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtcDateUntil, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlStockLayout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        pnlStockLayout.setVerticalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTank)
                    .addComponent(cbxTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(cbxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDateOf)
                    .addComponent(dtcDateOf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDateUntil)
                    .addComponent(dtcDateUntil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (flagProduct) {
            StockProductTreatment.initTableWithFilter(tableStock, cbxProduct.getSelectedItem(), dtcDateOf.getDate(), dtcDateUntil.getDate());
        } else {
            StockTankTreatment.setTableFilters(tableStock, cbxTank.getSelectedItem(), cbxProduct.getSelectedItem(), dtcDateOf.getDate(), dtcDateUntil.getDate());
        }
        this.dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        if (flagProduct) {
            StockProductTreatment.initTable(tableStock);
        } else {
            StockTankTreatment.initTable(tableStock);
        }
        this.dispose();
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockFilterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StockFilterFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Object> cbxProduct;
    private javax.swing.JComboBox<Object> cbxTank;
    private com.toedter.calendar.JDateChooser dtcDateOf;
    private com.toedter.calendar.JDateChooser dtcDateUntil;
    private javax.swing.JLabel lblDateOf;
    private javax.swing.JLabel lblDateUntil;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblTank;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlStock;
    // End of variables declaration//GEN-END:variables

    private void initPanel() {
        TreatmentTheme.initTheme(pnlStock);
        TankTreatment.initComboBox(cbxTank);
        ProductTreatment.initComboBox(cbxProduct);
    }

    private void initvariable(JTable tableStock, boolean flagProduct) {
        this.tableStock = tableStock;
        this.flagProduct = !flagProduct;
    }

    private void hideContainer() {
        lblTank.setVisible(false);
        cbxTank.setVisible(false);
    }

}
