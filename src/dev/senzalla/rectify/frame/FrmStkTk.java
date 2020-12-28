package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.entitys.StockTank;
import dev.senzalla.rectify.frame.panel.PnlStkTk;
import dev.senzalla.rectify.request.RequestStockTank;
import dev.senzalla.rectify.treatments.TreatmentsItem;
import dev.senzalla.theme.TreatmentTheme;

import java.awt.*;
import java.util.List;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class FrmStkTk extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmStkTk
     */
    public FrmStkTk() {
        initComponents();
        TreatmentTheme.initTheme(pnlStk);
        lblEmpty.setVisible(false);
        showPanel();

    }

    private void showPanel() {
        List<StockTank> stockTank = new RequestStockTank().select();
        if (!stockTank.isEmpty()) {
            GridLayout layout = new GridLayout();
            layout.setRows(stockTank.size()/4);
            jPanel1.setLayout(layout);
            stockTank.forEach(stock -> {
                jPanel1.add(new PnlStkTk(stock.getTank().getNameTank(), stock.getProduct().getNameProduct(), stock.getLiterStkTq())).setVisible(true);
            });
        } else {
            lblEmpty.setVisible(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roll = new javax.swing.JScrollPane();
        pnlStk = new javax.swing.JPanel();
        lblEmpty = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(598, 460));
        setMinimumSize(new java.awt.Dimension(598, 460));
        setPreferredSize(new java.awt.Dimension(598, 460));

        roll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        roll.setMaximumSize(new java.awt.Dimension(598, 460));
        roll.setMinimumSize(new java.awt.Dimension(598, 460));
        roll.setPreferredSize(new java.awt.Dimension(598, 460));
        roll.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                rollMouseWheelMoved(evt);
            }
        });

        pnlStk.setPreferredSize(new java.awt.Dimension(598, 1000));

        lblEmpty.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblEmpty.setText("Não foi cadastrado estoque Hoje!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlStkLayout = new javax.swing.GroupLayout(pnlStk);
        pnlStk.setLayout(pnlStkLayout);
        pnlStkLayout.setHorizontalGroup(
            pnlStkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStkLayout.createSequentialGroup()
                .addGroup(pnlStkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlStkLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblEmpty)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStkLayout.setVerticalGroup(
            pnlStkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStkLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(lblEmpty)
                .addContainerGap())
        );

        roll.setViewportView(pnlStk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_rollMouseWheelMoved
        TreatmentsItem.speedRoll(roll);
    }//GEN-LAST:event_rollMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmpty;
    private javax.swing.JPanel pnlStk;
    private javax.swing.JScrollPane roll;
    // End of variables declaration//GEN-END:variables

}
