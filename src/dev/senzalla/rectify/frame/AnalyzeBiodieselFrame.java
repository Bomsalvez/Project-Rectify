package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.treatments.*;
import dev.senzalla.theme.TreatmentTheme;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class AnalyzeBiodieselFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmLabBio
     */
    public AnalyzeBiodieselFrame() {
        initComponents();
        TreatmentTheme.initTheme(pnlLabBio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLabBio = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblAcid = new javax.swing.JLabel();
        txtAcid = new javax.swing.JTextField();
        btnAcid = new javax.swing.JButton();
        lblDens = new javax.swing.JLabel();
        txtDens = new javax.swing.JTextField();
        lblDens20 = new javax.swing.JLabel();
        txtDens20 = new javax.swing.JTextField();
        lblTemp = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        lblFactor = new javax.swing.JLabel();
        txtFactor = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setPreferredSize(new java.awt.Dimension(1000, 680));

        pnlLabBio.setMaximumSize(new java.awt.Dimension(998, 658));
        pnlLabBio.setMinimumSize(new java.awt.Dimension(998, 658));
        pnlLabBio.setPreferredSize(new java.awt.Dimension(998, 658));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTitle.setText("Analise Biodiesel");

        lblAcid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAcid.setText("Acidez");

        txtAcid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAcid.setPreferredSize(new java.awt.Dimension(130, 27));
        txtAcid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcidKeyTyped(evt);
            }
        });

        btnAcid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/calculadora.png"))); // NOI18N
        btnAcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcidActionPerformed(evt);
            }
        });

        lblDens.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDens.setText("Densidade");

        txtDens.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDens.setPreferredSize(new java.awt.Dimension(130, 27));
        txtDens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDensKeyTyped(evt);
            }
        });

        lblDens20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDens20.setText("Densidade a 20° C");

        txtDens20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDens20.setPreferredSize(new java.awt.Dimension(130, 27));
        txtDens20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDens20KeyTyped(evt);
            }
        });

        lblTemp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTemp.setText("Temperatura");

        txtTemp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTemp.setPreferredSize(new java.awt.Dimension(130, 27));
        txtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTempKeyTyped(evt);
            }
        });

        lblFactor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFactor.setText("Fator de Correção");

        txtFactor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFactor.setPreferredSize(new java.awt.Dimension(130, 27));
        txtFactor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFactorKeyTyped(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setPreferredSize(new java.awt.Dimension(120, 60));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnClear.setText("Limpar");
        btnClear.setPreferredSize(new java.awt.Dimension(120, 60));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setPreferredSize(new java.awt.Dimension(120, 60));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLabBioLayout = new javax.swing.GroupLayout(pnlLabBio);
        pnlLabBio.setLayout(pnlLabBioLayout);
        pnlLabBioLayout.setHorizontalGroup(
            pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabBioLayout.createSequentialGroup()
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLabBioLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDens20)
                            .addComponent(lblAcid)
                            .addComponent(lblDens)
                            .addComponent(lblTemp)
                            .addComponent(lblFactor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLabBioLayout.createSequentialGroup()
                                .addComponent(txtAcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAcid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDens20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLabBioLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLabBioLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(lblTitle)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        pnlLabBioLayout.setVerticalGroup(
            pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabBioLayout.createSequentialGroup()
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLabBioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle)
                        .addGap(115, 115, 115)
                        .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAcid)
                            .addComponent(txtAcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLabBioLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAcid)))
                .addGap(34, 34, 34)
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDens)
                    .addComponent(txtDens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDens20)
                    .addComponent(txtDens20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFactor)
                    .addComponent(txtFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(pnlLabBioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLabBio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlLabBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAcidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcidKeyTyped
        NumberField.addNumber(txtAcid.getText(), evt);
    }//GEN-LAST:event_txtAcidKeyTyped

    private void btnAcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcidActionPerformed
        CalcAcidityFrame frmCalcAcidity = new CalcAcidityFrame(txtAcid);
        frmCalcAcidity.setRbt();
        Access.goToInternalFrame(frmCalcAcidity);
    }//GEN-LAST:event_btnAcidActionPerformed

    private void txtDensKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDensKeyTyped
        NumberField.addNumber(txtDens.getText(), evt);
    }//GEN-LAST:event_txtDensKeyTyped

    private void txtDens20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDens20KeyTyped
        NumberField.addNumber(txtDens20.getText(), evt);
    }//GEN-LAST:event_txtDens20KeyTyped

    private void txtTempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempKeyTyped
        NumberField.addNumber(txtTemp.getText(), evt);
    }//GEN-LAST:event_txtTempKeyTyped

    private void txtFactorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactorKeyTyped
        NumberField.addNumber(txtFactor.getText(), evt);
    }//GEN-LAST:event_txtFactorKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (TxtTreatment.isTextFieldEmpty(pnlLabBio)) {
            new AnalyzeBiodieselTreatment().saveAnalyzeBiodiesel(txtAcid.getText(), txtDens.getText(), txtDens20.getText(), txtTemp.getText(), txtFactor.getText());
        } else {
            PopUp.fieldIsEmpty();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        TxtTreatment.cleanTextField(pnlLabBio);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcid;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAcid;
    private javax.swing.JLabel lblDens;
    private javax.swing.JLabel lblDens20;
    private javax.swing.JLabel lblFactor;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlLabBio;
    private javax.swing.JTextField txtAcid;
    private javax.swing.JTextField txtDens;
    private javax.swing.JTextField txtDens20;
    private javax.swing.JTextField txtFactor;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables

}
