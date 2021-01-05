package dev.senzalla.rectify.frame;

import dev.senzalla.rectify.entitys.Sample;
import dev.senzalla.rectify.frame.filter.SampleFilterFrame;
import dev.senzalla.rectify.print.SealPrint;
import dev.senzalla.rectify.treatments.Access;
import dev.senzalla.rectify.treatments.SampleTreatment;
import dev.senzalla.theme.TreatmentTheme;

import java.util.List;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class SampleTableFrame extends javax.swing.JInternalFrame {

    private static List<Sample> samples;

    /**
     * Creates new form FrmSealTbl
     */
    public SampleTableFrame() {
        initComponents();
        initPanel();
    }

    public static void query(List<Sample> sampleList) {
        samples = sampleList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSample = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        roll = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setPreferredSize(new java.awt.Dimension(1000, 680));

        pnlSample.setMaximumSize(new java.awt.Dimension(998, 658));
        pnlSample.setMinimumSize(new java.awt.Dimension(998, 658));
        pnlSample.setPreferredSize(new java.awt.Dimension(998, 658));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Etiqueta Biodiesel");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/add.png"))); // NOI18N
        btnAdd.setPreferredSize(new java.awt.Dimension(46, 40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/pdf.png"))); // NOI18N
        btnPrint.setPreferredSize(new java.awt.Dimension(46, 40));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/filter.png"))); // NOI18N
        btnFilter.setPreferredSize(new java.awt.Dimension(46, 40));
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leilão", "Empresa", "Fabrica", "Petrobras", "Cliente", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roll.setViewportView(tbl);

        javax.swing.GroupLayout pnlSampleLayout = new javax.swing.GroupLayout(pnlSample);
        pnlSample.setLayout(pnlSampleLayout);
        pnlSampleLayout.setHorizontalGroup(
            pnlSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSampleLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(pnlSampleLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(roll)
                .addContainerGap())
        );
        pnlSampleLayout.setVerticalGroup(
            pnlSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSampleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitle)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlSample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlSample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        new SealPrint().print(samples);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        Access.goToFrame(new SampleFilterFrame(tbl));
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Access.goToInternalFrame(this, new SampleFrame());
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlSample;
    private javax.swing.JScrollPane roll;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables

    private void initPanel() {
        TreatmentTheme.initTheme(pnlSample);
        TreatmentTheme.initTableTheme(tbl);
        SampleTreatment.initTable(tbl);
        TreatmentTheme.iconDefine(btnAdd, "/static/img/add_white.png");
        TreatmentTheme.iconDefine(btnPrint, "/static/img/pdf_white.png");
        TreatmentTheme.iconDefine(btnFilter, "/static/img/filter_white.png");
    }

}
