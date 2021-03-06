package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.treatments.AnalyzeSplitTreatment;
import dev.senzalla.rectify.treatments.NumberField;
import dev.senzalla.rectify.treatments.PopUp;
import dev.senzalla.rectify.treatments.TxtTreatment;
import dev.senzalla.theme.TreatmentTheme;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class AnalyzeSplitFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmLabSplit
     */
    public AnalyzeSplitFrame() {
        initComponents();
        TreatmentTheme.initTheme(pnlSplit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSplit = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblOil = new javax.swing.JLabel();
        txtOil = new javax.swing.JFormattedTextField();
        lblSludge = new javax.swing.JLabel();
        txtSludge = new javax.swing.JFormattedTextField();
        lblGlycerin = new javax.swing.JLabel();
        txtGlycerin = new javax.swing.JFormattedTextField();
        lblTrash = new javax.swing.JLabel();
        txtTrash = new javax.swing.JFormattedTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setPreferredSize(new java.awt.Dimension(1000, 680));

        pnlSplit.setMaximumSize(new java.awt.Dimension(998, 658));
        pnlSplit.setMinimumSize(new java.awt.Dimension(998, 658));
        pnlSplit.setPreferredSize(new java.awt.Dimension(998, 658));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblTitle.setText("Analise Cisão");

        lblOil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblOil.setText("Oleo");

        txtOil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtOil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtOil.setPreferredSize(new java.awt.Dimension(150, 32));
        txtOil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOilKeyTyped(evt);
            }
        });

        lblSludge.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSludge.setText("Borra");

        txtSludge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSludge.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSludge.setPreferredSize(new java.awt.Dimension(150, 32));
        txtSludge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSludgeKeyTyped(evt);
            }
        });

        lblGlycerin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGlycerin.setText("Glicerina");

        txtGlycerin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtGlycerin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtGlycerin.setPreferredSize(new java.awt.Dimension(150, 32));
        txtGlycerin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGlycerinKeyTyped(evt);
            }
        });

        lblTrash.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTrash.setText("Impureza");

        txtTrash.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTrash.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTrash.setPreferredSize(new java.awt.Dimension(150, 32));
        txtTrash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrashKeyTyped(evt);
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

        javax.swing.GroupLayout pnlSplitLayout = new javax.swing.GroupLayout(pnlSplit);
        pnlSplit.setLayout(pnlSplitLayout);
        pnlSplitLayout.setHorizontalGroup(
            pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSplitLayout.createSequentialGroup()
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSplitLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSludge)
                            .addComponent(lblOil)
                            .addComponent(lblGlycerin)
                            .addComponent(lblTrash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSludge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGlycerin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSplitLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSplitLayout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblTitle)))
                .addContainerGap())
        );
        pnlSplitLayout.setVerticalGroup(
            pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSplitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(72, 72, 72)
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOil)
                    .addComponent(txtOil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSludge)
                    .addComponent(txtSludge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGlycerin)
                    .addComponent(txtGlycerin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrash)
                    .addComponent(txtTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtOilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOilKeyTyped
        NumberField.txtNumberInt(evt);
    }//GEN-LAST:event_txtOilKeyTyped

    private void txtSludgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSludgeKeyTyped
        NumberField.txtNumberInt(evt);
    }//GEN-LAST:event_txtSludgeKeyTyped

    private void txtGlycerinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGlycerinKeyTyped
        NumberField.txtNumberInt(evt);
    }//GEN-LAST:event_txtGlycerinKeyTyped

    private void txtTrashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrashKeyTyped
        NumberField.txtNumberInt(evt);
    }//GEN-LAST:event_txtTrashKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (TxtTreatment.isTextFieldEmpty(pnlSplit)) {
            new AnalyzeSplitTreatment().checkAnalyzeSplit(txtOil.getText(), txtSludge.getText(), txtGlycerin.getText(), txtTrash.getText());
            TxtTreatment.cleanTextField(pnlSplit);
        } else {
            PopUp.fieldIsEmpty();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        TxtTreatment.cleanTextField(pnlSplit);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblGlycerin;
    private javax.swing.JLabel lblOil;
    private javax.swing.JLabel lblSludge;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrash;
    private javax.swing.JPanel pnlSplit;
    private javax.swing.JFormattedTextField txtGlycerin;
    private javax.swing.JFormattedTextField txtOil;
    private javax.swing.JFormattedTextField txtSludge;
    private javax.swing.JFormattedTextField txtTrash;
    // End of variables declaration//GEN-END:variables

}
