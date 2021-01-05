package dev.senzalla.rectify.frame.panel;

import dev.senzalla.rectify.entitys.Product;
import dev.senzalla.theme.TreatmentTheme;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class MatterPanelDetail extends javax.swing.JPanel {

    public MatterPanelDetail(Product product, int liter) {
        initComponents();
        TreatmentTheme.initTheme(pnlMatter);
        lblProduct.setText(product.getNameProduct());
        lblLiter.setText(String.valueOf(liter));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMatter = new javax.swing.JPanel();
        jlabelProduct = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        jlabelLiter = new javax.swing.JLabel();
        lblLiter = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(600, 60));
        setMinimumSize(new java.awt.Dimension(600, 60));
        setPreferredSize(new java.awt.Dimension(600, 60));

        pnlMatter.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));
        pnlMatter.setMaximumSize(new java.awt.Dimension(476, 48));
        pnlMatter.setMinimumSize(new java.awt.Dimension(476, 48));
        pnlMatter.setPreferredSize(new java.awt.Dimension(476, 48));

        jlabelProduct.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlabelProduct.setText("Produto");

        lblProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProduct.setText("Produto");

        jlabelLiter.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlabelLiter.setText("Litros");

        lblLiter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLiter.setText("Litros");

        javax.swing.GroupLayout pnlMatterLayout = new javax.swing.GroupLayout(pnlMatter);
        pnlMatter.setLayout(pnlMatterLayout);
        pnlMatterLayout.setHorizontalGroup(
            pnlMatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMatterLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jlabelProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jlabelLiter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLiter)
                .addGap(89, 89, 89))
        );
        pnlMatterLayout.setVerticalGroup(
            pnlMatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatterLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlMatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelProduct)
                    .addComponent(jlabelLiter)
                    .addComponent(lblProduct)
                    .addComponent(lblLiter))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMatter, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMatter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabelLiter;
    private javax.swing.JLabel jlabelProduct;
    private javax.swing.JLabel lblLiter;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JPanel pnlMatter;
    // End of variables declaration//GEN-END:variables

}