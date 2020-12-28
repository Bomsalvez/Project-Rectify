package dev.senzalla.rectify.frame.panel;

import dev.senzalla.theme.TreatmentTheme;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class PnlCalcKoh extends javax.swing.JPanel {

    /**
     * Creates new form PnlCalcKoh
     */
    public PnlCalcKoh() {
        initComponents();
    }

    public PnlCalcKoh(String soap) {
        initComponents();
        TreatmentTheme.initTheme(pnlKoh);
        jComboBox1.setVisible(false);
        lblCalcValue.setText(soap);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKoh = new javax.swing.JPanel();
        lblCalcTitle = new javax.swing.JLabel();
        lblCalcValue = new javax.swing.JLabel();
        lblCalcFixed = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(592, 150));
        setMinimumSize(new java.awt.Dimension(592, 150));
        setPreferredSize(new java.awt.Dimension(592, 150));

        pnlKoh.setMaximumSize(new java.awt.Dimension(590, 146));
        pnlKoh.setMinimumSize(new java.awt.Dimension(590, 146));
        pnlKoh.setPreferredSize(new java.awt.Dimension(590, 146));

        lblCalcTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCalcTitle.setText("ACIDEZ ÁCIDO GRAXO E BIODEISEL ESTEREFICADO");

        lblCalcValue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCalcValue.setText("Acidez");

        lblCalcFixed.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCalcFixed.setText("I.A (mg de KOH)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlKohLayout = new javax.swing.GroupLayout(pnlKoh);
        pnlKoh.setLayout(pnlKohLayout);
        pnlKohLayout.setHorizontalGroup(
            pnlKohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKohLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(pnlKohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlKohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlKohLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lblCalcValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCalcFixed))
                        .addComponent(lblCalcTitle)))
                .addGap(53, 53, 53))
        );
        pnlKohLayout.setVerticalGroup(
            pnlKohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKohLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCalcTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlKohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalcValue)
                    .addComponent(lblCalcFixed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKoh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKoh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblCalcFixed;
    private javax.swing.JLabel lblCalcTitle;
    private javax.swing.JLabel lblCalcValue;
    private javax.swing.JPanel pnlKoh;
    // End of variables declaration//GEN-END:variables

}
