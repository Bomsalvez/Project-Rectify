package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.entitys.Tank;
import dev.senzalla.rectify.frame.panel.MatterPanel;
import dev.senzalla.rectify.frame.panel.ReactionBiodieselPanel;
import dev.senzalla.rectify.treatments.*;
import dev.senzalla.theme.TreatmentTheme;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class FrmTrans extends javax.swing.JInternalFrame {

    private int countMatter;
    private int countReact;
    private BoxLayout layoutMatter;
    private BoxLayout layoutReact;
    private List<MatterPanel> pnlMatter;
    private List<ReactionBiodieselPanel> pnlReact;

    /**
     * Creates new form FrmTrans
     */
    public FrmTrans() {
        initComponents();
        TreatmentTheme.initTheme(pnlTrans);
        initContainers();
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
        pnlTrans = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTank = new javax.swing.JLabel();
        cbxTank = new javax.swing.JComboBox<>();
        pnlMatterTrans = new javax.swing.JPanel();
        btnMatterTransAdd = new javax.swing.JButton();
        btnMatterTransRmv = new javax.swing.JButton();
        lblTransAmount = new javax.swing.JLabel();
        txtTransAmount = new javax.swing.JFormattedTextField();
        pnlReactTrans = new javax.swing.JPanel();
        btnReactTransAdd = new javax.swing.JButton();
        btnReactTransRmv = new javax.swing.JButton();
        lblTransTrash = new javax.swing.JLabel();
        txtTransTrash = new javax.swing.JFormattedTextField();
        lblTransProduced = new javax.swing.JLabel();
        txtTransProduced = new javax.swing.JFormattedTextField();
        btnTransSave = new javax.swing.JButton();
        btnTransClear = new javax.swing.JButton();
        btnTransCancel = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setPreferredSize(new java.awt.Dimension(1000, 680));

        roll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        roll.setMaximumSize(new java.awt.Dimension(990, 32767));
        roll.setMinimumSize(new java.awt.Dimension(990, 658));
        roll.setPreferredSize(new java.awt.Dimension(990, 658));
        roll.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                rollMouseWheelMoved(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Transesterificação");

        lblTank.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTank.setText("Tanque");

        cbxTank.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N

        pnlMatterTrans.setMaximumSize(new java.awt.Dimension(616, 420));
        pnlMatterTrans.setMinimumSize(new java.awt.Dimension(616, 0));

        javax.swing.GroupLayout pnlMatterTransLayout = new javax.swing.GroupLayout(pnlMatterTrans);
        pnlMatterTrans.setLayout(pnlMatterTransLayout);
        pnlMatterTransLayout.setHorizontalGroup(
                pnlMatterTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlMatterTransLayout.setVerticalGroup(
                pnlMatterTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMatterTransAdd.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMatterTransAdd.setText("Adicionar Produto");
        btnMatterTransAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatterTransAddActionPerformed(evt);
            }
        });

        btnMatterTransRmv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMatterTransRmv.setText("Eliminar Produto");
        btnMatterTransRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatterTransRmvActionPerformed(evt);
            }
        });

        lblTransAmount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTransAmount.setText("Quantidade Total");

        txtTransAmount.setEditable(false);
        txtTransAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransAmount.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTransAmount.setPreferredSize(new java.awt.Dimension(120, 27));

        javax.swing.GroupLayout pnlReactTransLayout = new javax.swing.GroupLayout(pnlReactTrans);
        pnlReactTrans.setLayout(pnlReactTransLayout);
        pnlReactTransLayout.setHorizontalGroup(
                pnlReactTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 616, Short.MAX_VALUE)
        );
        pnlReactTransLayout.setVerticalGroup(
                pnlReactTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        btnReactTransAdd.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnReactTransAdd.setText("Adicionar Reação");
        btnReactTransAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactTransAddActionPerformed(evt);
            }
        });

        btnReactTransRmv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnReactTransRmv.setText("Eliminar Reação");
        btnReactTransRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactTransRmvActionPerformed(evt);
            }
        });

        lblTransTrash.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTransTrash.setText("Residuo");

        txtTransTrash.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransTrash.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtTransTrash.setMaximumSize(new java.awt.Dimension(100, 28));
        txtTransTrash.setMinimumSize(new java.awt.Dimension(100, 28));
        txtTransTrash.setPreferredSize(new java.awt.Dimension(100, 28));

        lblTransProduced.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTransProduced.setText("Total Produzido");

        txtTransProduced.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransProduced.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtTransProduced.setMaximumSize(new java.awt.Dimension(100, 28));
        txtTransProduced.setMinimumSize(new java.awt.Dimension(100, 28));
        txtTransProduced.setPreferredSize(new java.awt.Dimension(100, 28));

        btnTransSave.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnTransSave.setText("Salvar");
        btnTransSave.setPreferredSize(new java.awt.Dimension(120, 60));
        btnTransSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransSaveActionPerformed(evt);
            }
        });

        btnTransClear.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnTransClear.setText("Limpar");
        btnTransClear.setPreferredSize(new java.awt.Dimension(120, 60));
        btnTransClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransClearActionPerformed(evt);
            }
        });

        btnTransCancel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnTransCancel.setText("Cancelar");
        btnTransCancel.setPreferredSize(new java.awt.Dimension(120, 60));
        btnTransCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTransLayout = new javax.swing.GroupLayout(pnlTrans);
        pnlTrans.setLayout(pnlTransLayout);
        pnlTransLayout.setHorizontalGroup(
                pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransLayout.createSequentialGroup()
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(pnlReactTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTransLayout.createSequentialGroup()
                                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                                .addGap(238, 238, 238)
                                                                .addComponent(lblTransAmount)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtTransAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                                .addGap(261, 261, 261)
                                                                .addComponent(btnTransSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(61, 61, 61)
                                                                .addComponent(btnTransClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(62, 62, 62)
                                                                .addComponent(btnTransCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                .addGap(190, 190, 190)
                                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTransLayout.createSequentialGroup()
                                                                .addComponent(pnlMatterTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTransLayout.createSequentialGroup()
                                                                .addComponent(btnMatterTransAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnMatterTransRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lblTransTrash)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtTransTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(141, 141, 141)
                                                                .addComponent(lblTransProduced)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtTransProduced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26))
                                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                                .addComponent(btnReactTransAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnReactTransRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(181, 181, 181))
                        .addGroup(pnlTransLayout.createSequentialGroup()
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                .addGap(276, 276, 276)
                                                .addComponent(lblTank)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxTank, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlTransLayout.createSequentialGroup()
                                                .addGap(388, 388, 388)
                                                .addComponent(lblTitle)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTransLayout.setVerticalGroup(
                pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle)
                                .addGap(30, 30, 30)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTank)
                                        .addComponent(cbxTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(pnlMatterTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMatterTransRmv)
                                        .addComponent(btnMatterTransAdd))
                                .addGap(24, 24, 24)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTransAmount)
                                        .addComponent(txtTransAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(pnlReactTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnReactTransAdd)
                                        .addComponent(btnReactTransRmv))
                                .addGap(24, 24, 24)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTransTrash)
                                        .addComponent(txtTransTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTransProduced)
                                        .addComponent(txtTransProduced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTransSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTransClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTransCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );

        roll.setViewportView(pnlTrans);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatterTransAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatterTransAddActionPerformed
        if (countMatter <= 1) {
            defineButton(btnMatterTransRmv, true);
        } else if (countMatter >= 6) {
            defineButton(btnMatterTransAdd, false);
        }
        addPanelMatter();
    }//GEN-LAST:event_btnMatterTransAddActionPerformed

    private void btnMatterTransRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatterTransRmvActionPerformed
        pnlMatter.get(--countMatter).minusLitters();
        if (countMatter <= 1) {
            defineButton(btnMatterTransRmv, false);
        } else if (countMatter <= 6) {
            defineButton(btnMatterTransAdd, true);
        }
        pnlMatter.get(countMatter).setVisible(false);
        pnlMatter.remove(countMatter);
    }//GEN-LAST:event_btnMatterTransRmvActionPerformed

    private void btnReactTransAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactTransAddActionPerformed
        if (countReact <= 1) {
            defineButton(btnReactTransRmv, true);
        } else if (countReact >= 6) {
            defineButton(btnReactTransAdd, false);
        }
        addPanelReact();
    }//GEN-LAST:event_btnReactTransAddActionPerformed

    private void btnReactTransRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactTransRmvActionPerformed
        countReact--;
        if (countReact <= 1) {
            defineButton(btnReactTransRmv, false);
        } else if (countReact <= 6) {
            defineButton(btnReactTransAdd, true);
        }
        this.pnlReact.get(countReact).setVisible(false);
        this.pnlReact.remove(countReact);
    }//GEN-LAST:event_btnReactTransRmvActionPerformed

    private void btnTransSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransSaveActionPerformed
        boolean matter = checkMatter();
        boolean react = checkReact();
        if (matter && react && TxtTreatment.isTextFieldEmpty(pnlTrans)) {
            new MakeTransTreatment().saveMakeBiodiesel((Tank) cbxTank.getSelectedItem(), txtTransAmount.getText(), txtTransProduced.getText(), txtTransTrash.getText(), pnlReact.get(0).getDate());
            pnlMatter.forEach(MatterPanel::saveMatter);
            pnlReact.forEach(ReactionBiodieselPanel::saveReact);
            Access.goToInternalFrame(this, new FrmTrans());
        }
    }//GEN-LAST:event_btnTransSaveActionPerformed


    private void btnTransClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransClearActionPerformed
        Access.goToInternalFrame(this, new FrmTrans());
    }//GEN-LAST:event_btnTransClearActionPerformed

    private void btnTransCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTransCancelActionPerformed

    private void rollMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_rollMouseWheelMoved
        ItemTreatment.speedRoll(roll);
    }//GEN-LAST:event_rollMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatterTransAdd;
    private javax.swing.JButton btnMatterTransRmv;
    private javax.swing.JButton btnReactTransAdd;
    private javax.swing.JButton btnReactTransRmv;
    private javax.swing.JButton btnTransCancel;
    private javax.swing.JButton btnTransClear;
    private javax.swing.JButton btnTransSave;
    private javax.swing.JComboBox<Object> cbxTank;
    private javax.swing.JLabel lblTank;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTransAmount;
    private javax.swing.JLabel lblTransProduced;
    private javax.swing.JLabel lblTransTrash;
    private javax.swing.JPanel pnlMatterTrans;
    private javax.swing.JPanel pnlReactTrans;
    private javax.swing.JPanel pnlTrans;
    private javax.swing.JScrollPane roll;
    private javax.swing.JFormattedTextField txtTransAmount;
    private javax.swing.JFormattedTextField txtTransProduced;
    private javax.swing.JFormattedTextField txtTransTrash;
    // End of variables declaration//GEN-END:variables

    private void initPanelMatter() {
        this.layoutMatter = new BoxLayout(pnlMatterTrans, 1);
        this.pnlMatter = new ArrayList<>();
        addPanelMatter();

    }

    private void addPanelMatter() {
        MatterPanel panel = new MatterPanel(txtTransAmount, countMatter++);
        this.pnlMatterTrans.setLayout(layoutMatter);
        this.pnlMatter.add(panel);
        this.pnlMatterTrans.add(panel).setVisible(true);
    }

    private void initPanelReact() {
        this.layoutReact = new BoxLayout(pnlReactTrans, 1);
        this.pnlReact = new ArrayList<>();
        addPanelReact();
    }

    private void addPanelReact() {
        ReactionBiodieselPanel panel = new ReactionBiodieselPanel(this);
        this.pnlReactTrans.setLayout(layoutReact);
        this.pnlReact.add(panel);
        this.pnlReactTrans.add(panel).setVisible(true);
        this.countReact++;
    }

    private void defineButton(JButton btn, boolean b) {
        btn.setEnabled(b);
        btn.setVisible(b);
    }

    private void initContainers() {
        initPanelMatter();
        initPanelReact();
        defineButton(btnMatterTransRmv, false);
        defineButton(btnReactTransRmv, false);

        TankTreatment.initComboBox(cbxTank);
        PnlMatterTreatment.initEster();
    }

    private boolean checkMatter() {
        return pnlMatter.stream().anyMatch(pnl -> TxtTreatment.isTextFieldEmpty(pnl.getPanel()) || ComboBoxTreatment.isCbxEmpty(pnl.getPanel()));
    }

    private boolean checkReact() {
        return pnlReact.stream().anyMatch(pnl -> TxtTreatment.isTextFieldEmpty(pnl.getNamePanel()) && ComboBoxTreatment.isCbxEmpty(pnl.getNamePanel()) && DateChooserTreatment.isDateChooserNull(pnl.getNamePanel()));
    }
}
