package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.treatments.*;
import dev.senzalla.theme.TreatmentTheme;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class FrmAnalyzeTruck extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmLabCar
     */
    public FrmAnalyzeTruck() {
        initComponents();
        TreatmentTheme.initTheme(pnlLabCar);
        AnalyzeTruckTreatment.initComboBoxCollect(cbxCollect);
        new AnalyzeSplitTreatment().initComboBoxSplit(cbxSplit);
    }


    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLabCar = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblAcid = new javax.swing.JLabel();
        txtAcid = new javax.swing.JTextField();
        btnAcid = new javax.swing.JButton();
        lblSoap = new javax.swing.JLabel();
        txtSoap = new javax.swing.JTextField();
        btnSoap = new javax.swing.JButton();
        lblDens = new javax.swing.JLabel();
        txtDens = new javax.swing.JTextField();
        lblTrash = new javax.swing.JLabel();
        txtTrash = new javax.swing.JFormattedTextField();
        lblCollect = new javax.swing.JLabel();
        cbxCollect = new javax.swing.JComboBox<>();
        lblSplit = new javax.swing.JLabel();
        cbxSplit = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(598, 460));
        setMinimumSize(new java.awt.Dimension(598, 460));
        setPreferredSize(new java.awt.Dimension(598, 460));

        pnlLabCar.setMaximumSize(new java.awt.Dimension(596, 438));
        pnlLabCar.setMinimumSize(new java.awt.Dimension(596, 438));
        pnlLabCar.setPreferredSize(new java.awt.Dimension(596, 438));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTitle.setText("Analise Caminhão");

        lblAcid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAcid.setText("Acidez");

        txtAcid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAcid.setPreferredSize(new java.awt.Dimension(150, 27));
        txtAcid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcidKeyTyped(evt);
            }
        });

        btnAcid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/calculadora_b.png"))); // NOI18N
        btnAcid.setToolTipText("");
        btnAcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcidActionPerformed(evt);
            }
        });

        lblSoap.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSoap.setText("Saponidade");

        txtSoap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoap.setPreferredSize(new java.awt.Dimension(150, 27));
        txtSoap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoapKeyTyped(evt);
            }
        });

        btnSoap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/calculadora_b.png"))); // NOI18N
        btnSoap.setToolTipText("");
        btnSoap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoapActionPerformed(evt);
            }
        });

        lblDens.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDens.setText("Densidade");

        txtDens.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDens.setPreferredSize(new java.awt.Dimension(150, 27));
        txtDens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDensKeyTyped(evt);
            }
        });

        lblTrash.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTrash.setText("Impureza");

        txtTrash.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTrash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTrash.setPreferredSize(new java.awt.Dimension(150, 27));
        txtTrash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrashKeyTyped(evt);
            }
        });

        lblCollect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCollect.setText("Coleta");

        cbxCollect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblSplit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSplit.setText("Cod Cisão");

        cbxSplit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout pnlLabCarLayout = new javax.swing.GroupLayout(pnlLabCar);
        pnlLabCar.setLayout(pnlLabCarLayout);
        pnlLabCarLayout.setHorizontalGroup(
                pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(lblTitle))
                                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblSoap)
                                                        .addComponent(lblAcid)
                                                        .addComponent(lblDens)
                                                        .addComponent(lblTrash)
                                                        .addComponent(lblCollect)
                                                        .addComponent(lblSplit)
                                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtSoap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtDens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnSoap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cbxCollect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cbxSplit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLabCarLayout.createSequentialGroup()
                                                                                .addComponent(txtAcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnAcid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(93, 93, 93))
        );
        pnlLabCarLayout.setVerticalGroup(
                pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlLabCarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle)
                                .addGap(28, 28, 28)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAcid)
                                        .addComponent(txtAcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAcid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblSoap)
                                                .addComponent(txtSoap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSoap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDens)
                                        .addComponent(txtDens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTrash)
                                        .addComponent(txtTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCollect)
                                        .addComponent(cbxCollect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSplit)
                                        .addComponent(cbxSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlLabCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(pnlLabCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(pnlLabCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtAcidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcidKeyTyped
        NumberField.addNumber(txtAcid.getText(), evt);
    }//GEN-LAST:event_txtAcidKeyTyped

    private void btnAcidActionPerformed(java.awt.event.ActionEvent evt) {
        Access.goToInternalFrame(new FrmCalcAcidity(txtAcid));
    }

    private void txtSoapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoapKeyTyped
        NumberField.addNumber(txtSoap.getText(), evt);
    }//GEN-LAST:event_txtSoapKeyTyped

    private void btnSoapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoapActionPerformed
        Access.goToInternalFrame(new FrmCalcSoap(txtSoap));
    }//GEN-LAST:event_btnSoapActionPerformed

    private void txtDensKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDensKeyTyped
        NumberField.addNumber(txtDens.getText(), evt);
    }//GEN-LAST:event_txtDensKeyTyped

    private void txtTrashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrashKeyTyped
        NumberField.txtNumberInt(evt);
    }//GEN-LAST:event_txtTrashKeyTyped


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (TxtTreatment.isTextFieldEmpty(pnlLabCar) && cbxCollect.getSelectedIndex() > 0) {
            new AnalyzeTruckTreatment().saveAnalyzeTruck(txtAcid.getText(), txtSoap.getText(), txtDens.getText(), txtTrash.getText(), cbxCollect.getSelectedIndex());
            if (cbxSplit.getSelectedIndex() > 0) {
                new AnalyzeTruckTreatment().saveAnalyzeTruckSplit((Long) cbxSplit.getSelectedItem());
            }
            TxtTreatment.cleanTextField(pnlLabCar);
            ComboBoxTreatment.cleanCbx(pnlLabCar);
        } else {
            PopUp.fieldIsEmpty();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        TxtTreatment.cleanTextField(pnlLabCar);
        ComboBoxTreatment.cleanCbx(pnlLabCar);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcid;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSoap;
    private javax.swing.JComboBox<Object> cbxCollect;
    private javax.swing.JComboBox<Object> cbxSplit;
    private javax.swing.JLabel lblAcid;
    private javax.swing.JLabel lblCollect;
    private javax.swing.JLabel lblDens;
    private javax.swing.JLabel lblSoap;
    private javax.swing.JLabel lblSplit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrash;
    private javax.swing.JPanel pnlLabCar;
    private javax.swing.JTextField txtAcid;
    private javax.swing.JTextField txtDens;
    private javax.swing.JTextField txtSoap;
    private javax.swing.JFormattedTextField txtTrash;
    // End of variables declaration//GEN-END:variables

}
