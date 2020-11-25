/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.senzalla.rectify.canvas;

import dev.senzalla.rectify.canvas.panel.PnlMatter;
import dev.senzalla.rectify.canvas.panel.PnlReactTrans;
import dev.senzalla.rectify.treatments.TankTreatment;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Black Burn Cybernetic
 * @e-mail blackburncyber@gmail.com
 * @github github.com/BlackBurnCybernetic
 */
public class FrmTrans extends javax.swing.JInternalFrame {

    private int count;
    private int countMatter = 1;
    private int countReact = 1;
    private BoxLayout layoutMatter;
    private BoxLayout layoutReact;
    private List<PnlMatter> pnlMatter;
    private List<PnlReactTrans> pnlReact;

    /**
     * Creates new form FrmLabTqTbl
     */
    public FrmTrans() {
        initComponents();
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

        rollTrans = new javax.swing.JScrollPane();
        pnlTrans = new javax.swing.JPanel();
        pnlMakeTrans = new javax.swing.JPanel();
        lblTransTitle = new javax.swing.JLabel();
        lblTransTank = new javax.swing.JLabel();
        cbxTransTank = new javax.swing.JComboBox<>();
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
        lblTransObs = new javax.swing.JLabel();
        rollTransObs = new javax.swing.JScrollPane();
        txtEsterObs = new javax.swing.JTextArea();
        btnTransSave = new javax.swing.JButton();
        btnTransClear = new javax.swing.JButton();
        btnTransCancel = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(598, 460));
        setMinimumSize(new java.awt.Dimension(598, 460));
        setPreferredSize(new java.awt.Dimension(598, 460));

        rollTrans.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlMakeTrans.setMaximumSize(new java.awt.Dimension(563, 32767));
        pnlMakeTrans.setMinimumSize(new java.awt.Dimension(563, 0));

        lblTransTitle.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTransTitle.setText("Esterificação");

        lblTransTank.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTransTank.setText("Tanque");

        cbxTransTank.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        pnlMatterTrans.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlMatterTrans.setLayout(new javax.swing.BoxLayout(pnlMatterTrans, javax.swing.BoxLayout.Y_AXIS));

        btnMatterTransAdd.setText("Adicionar Produto");
        btnMatterTransAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatterTransAddActionPerformed(evt);
            }
        });

        btnMatterTransRmv.setText("Eliminar Produto");
        btnMatterTransRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatterTransRmvActionPerformed(evt);
            }
        });

        lblTransAmount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTransAmount.setText("Quantidade Total");

        txtTransAmount.setEditable(false);
        txtTransAmount.setBackground(new java.awt.Color(69, 73, 74));
        txtTransAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransAmount.setDragEnabled(true);
        txtTransAmount.setPreferredSize(new java.awt.Dimension(120, 27));

        pnlReactTrans.setLayout(new javax.swing.BoxLayout(pnlReactTrans, javax.swing.BoxLayout.LINE_AXIS));

        btnReactTransAdd.setText("Adicionar Reação");
        btnReactTransAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactTransAddActionPerformed(evt);
            }
        });

        btnReactTransRmv.setText("Eliminar Reação");
        btnReactTransRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactTransRmvActionPerformed(evt);
            }
        });

        lblTransTrash.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTransTrash.setText("Residuo");

        txtTransTrash.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransTrash.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTransTrash.setPreferredSize(new java.awt.Dimension(100, 23));

        lblTransProduced.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTransProduced.setText("Total Produzido");

        txtTransProduced.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTransProduced.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTransProduced.setPreferredSize(new java.awt.Dimension(100, 23));

        lblTransObs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTransObs.setText("Observação");

        txtEsterObs.setColumns(20);
        txtEsterObs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEsterObs.setRows(5);
        txtEsterObs.setPreferredSize(new java.awt.Dimension(220, 100));
        rollTransObs.setViewportView(txtEsterObs);

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

        javax.swing.GroupLayout pnlMakeTransLayout = new javax.swing.GroupLayout(pnlMakeTrans);
        pnlMakeTrans.setLayout(pnlMakeTransLayout);
        pnlMakeTransLayout.setHorizontalGroup(
                pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlMatterTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                .addGap(229, 229, 229)
                                                                .addComponent(lblTransTitle))
                                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                .addComponent(btnMatterTransAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnMatterTransRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                .addComponent(btnReactTransAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnReactTransRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 18, Short.MAX_VALUE))
                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pnlReactTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblTransObs)
                                                                                .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                                        .addComponent(lblTransAmount)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(txtTransAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(rollTransObs, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMakeTransLayout.createSequentialGroup()
                                                                                                .addGap(53, 53, 53)
                                                                                                .addComponent(lblTransTrash)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtTransTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(113, 113, 113)
                                                                                                .addComponent(lblTransProduced)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtTransProduced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                                                                .addGap(52, 52, 52)
                                                                                .addComponent(btnTransSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnTransClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(59, 59, 59)
                                                                                .addComponent(btnTransCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTransTank)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTransTank, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMakeTransLayout.setVerticalGroup(
                pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMakeTransLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTransTitle)
                                .addGap(18, 18, 18)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTransTank)
                                        .addComponent(cbxTransTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlMatterTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMatterTransAdd)
                                        .addComponent(btnMatterTransRmv))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTransAmount)
                                        .addComponent(txtTransAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlReactTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnReactTransAdd)
                                        .addComponent(btnReactTransRmv))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTransTrash)
                                        .addComponent(txtTransTrash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTransProduced)
                                        .addComponent(txtTransProduced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTransObs)
                                        .addComponent(rollTransObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(pnlMakeTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTransClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTransCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTransSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout pnlTransLayout = new javax.swing.GroupLayout(pnlTrans);
        pnlTrans.setLayout(pnlTransLayout);
        pnlTransLayout.setHorizontalGroup(
                pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlMakeTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
        );
        pnlTransLayout.setVerticalGroup(
                pnlTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransLayout.createSequentialGroup()
                                .addComponent(pnlMakeTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        rollTrans.setViewportView(pnlTrans);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rollTrans, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rollTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatterTransAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatterTransAddActionPerformed
        PnlMatter panel = new PnlMatter(txtTransAmount, ++count);
        pnlMatterTrans.setLayout(layoutMatter);
        if (countMatter <= 1) {
            pnlMatter = new ArrayList<>();
            defineButton(btnMatterTransRmv, true);
        } else if (countMatter >= 6) {
            defineButton(btnMatterTransAdd, false);
        }
        this.pnlMatter.add(panel);
        pnlMatterTrans.add(panel).setVisible(true);
        countMatter++;
    }//GEN-LAST:event_btnMatterTransAddActionPerformed

    private void btnMatterTransRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatterTransRmvActionPerformed
        count--;
        countMatter--;
        pnlMatter.get(countMatter - 1).minusLitters();
        if (countMatter <= 1) {
            defineButton(btnMatterTransRmv, false);
        } else if (countMatter <= 6) {
            defineButton(btnMatterTransAdd, true);
        }
        pnlMatter.get(countMatter - 1).setVisible(false);
        pnlMatter.remove(countMatter - 1);
    }//GEN-LAST:event_btnMatterTransRmvActionPerformed

    private void btnReactTransAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactTransAddActionPerformed
        PnlReactTrans panel = new PnlReactTrans();
        pnlReactTrans.setLayout(layoutReact);
        if (countReact <= 1) {
            pnlReact = new ArrayList<>();
            defineButton(btnReactTransRmv, true);
        } else if (countReact >= 6) {
            defineButton(btnReactTransAdd, false);
        }
        this.pnlReact.add(panel);
        pnlReactTrans.add(panel).setVisible(true);
        countReact++;
    }//GEN-LAST:event_btnReactTransAddActionPerformed

    private void btnReactTransRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactTransRmvActionPerformed
        countReact--;
        if (countReact <= 1) {
            defineButton(btnReactTransRmv, false);
        } else if (countReact <= 6) {
            defineButton(btnReactTransAdd, true);
        }
        pnlReact.get(countReact - 1).setVisible(false);
        pnlReact.remove(countReact - 1);
    }//GEN-LAST:event_btnReactTransRmvActionPerformed


    private void btnTransSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransSaveActionPerformed
    }//GEN-LAST:event_btnTransSaveActionPerformed

    private void btnTransClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransClearActionPerformed
    }//GEN-LAST:event_btnTransClearActionPerformed

    private void btnTransCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTransCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatterTransAdd;
    private javax.swing.JButton btnMatterTransRmv;
    private javax.swing.JButton btnReactTransAdd;
    private javax.swing.JButton btnReactTransRmv;
    private javax.swing.JButton btnTransCancel;
    private javax.swing.JButton btnTransClear;
    private javax.swing.JButton btnTransSave;
    private javax.swing.JComboBox<Object> cbxTransTank;
    private javax.swing.JLabel lblTransAmount;
    private javax.swing.JLabel lblTransObs;
    private javax.swing.JLabel lblTransProduced;
    private javax.swing.JLabel lblTransTank;
    private javax.swing.JLabel lblTransTitle;
    private javax.swing.JLabel lblTransTrash;
    private javax.swing.JPanel pnlMakeTrans;
    private javax.swing.JPanel pnlMatterTrans;
    private javax.swing.JPanel pnlReactTrans;
    private javax.swing.JPanel pnlTrans;
    private javax.swing.JScrollPane rollTrans;
    private javax.swing.JScrollPane rollTransObs;
    private javax.swing.JTextArea txtEsterObs;
    private javax.swing.JFormattedTextField txtTransAmount;
    private javax.swing.JFormattedTextField txtTransProduced;
    private javax.swing.JFormattedTextField txtTransTrash;
    // End of variables declaration//GEN-END:variables

    private void addPanelMatter() {
        layoutMatter = new BoxLayout(pnlMatterTrans, countMatter);
        pnlMatterTrans.setLayout(layoutMatter);
        pnlMatterTrans.add(new PnlMatter(txtTransAmount, count)).setVisible(true);
    }

    private void addPanelReact() {
        layoutReact = new BoxLayout(pnlReactTrans, countReact);
        pnlReactTrans.setLayout(layoutReact);
        pnlReactTrans.add(new PnlReactTrans()).setVisible(true);
    }

    private void defineButton(JButton btn, boolean b) {
        btn.setEnabled(b);
        btn.setVisible(b);
    }

    private void initContainers() {
        addPanelMatter();
        addPanelReact();
        defineButton(btnMatterTransRmv, false);
        defineButton(btnReactTransRmv, false);

        new TankTreatment().addComboBox(cbxTransTank);
    }
}
