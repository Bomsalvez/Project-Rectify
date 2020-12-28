/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.senzalla.rectify;

import dev.senzalla.rectify.frame.*;
import dev.senzalla.rectify.treatments.Access;
import dev.senzalla.rectify.treatments.TreatmentsItem;
import dev.senzalla.theme.TreatmentTheme;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bomsalvez Freitas
 * @e-mail bomsalvez@gmail.com
 * @github github.com/Bomsalvez
 */
public class FrmRectify extends JFrame {

    /**
     * Creates new form FrmRectify
     */
    public FrmRectify() {
        initComponents();
        TreatmentTheme.initTheme(pnlMenu);
        Access.setDktMain(dktMain);
        TreatmentsItem.visiblePanel(pnlMenu);
        Access.checkFrame(new FrmStkTk());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBar = new javax.swing.JPanel();
        btnHide = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnLaboratory = new javax.swing.JButton();
        pnlLaboratory = new javax.swing.JPanel();
        btnanalyzeTruck = new javax.swing.JButton();
        btnAnalyzeTank = new javax.swing.JButton();
        btnAnalyzeBiodiesel = new javax.swing.JButton();
        btnAnalyzeSplit = new javax.swing.JButton();
        btnSample = new javax.swing.JButton();
        btnTransport = new javax.swing.JButton();
        pnlTransport = new javax.swing.JPanel();
        btnCharge = new javax.swing.JButton();
        btnDischarge = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        pnlStock = new javax.swing.JPanel();
        btnProductStock = new javax.swing.JButton();
        btnTankStock = new javax.swing.JButton();
        btnMake = new javax.swing.JButton();
        pnlMake = new javax.swing.JPanel();
        btnMakeEster = new javax.swing.JButton();
        btnMakeTrans = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        pnlCalc = new javax.swing.JPanel();
        btnCalcAcidity = new javax.swing.JButton();
        btnCalcSoap = new javax.swing.JButton();
        btnCalcTrans = new javax.swing.JButton();
        btnSetup = new javax.swing.JButton();
        pnlSetup = new javax.swing.JPanel();
        btnProvider = new javax.swing.JButton();
        btnTank = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnSolution = new javax.swing.JButton();
        btnTheme = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        dktMain = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("FrmRectify"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnlBar.setBackground(new java.awt.Color(102, 102, 102));
        pnlBar.setMaximumSize(new java.awt.Dimension(1280, 40));
        pnlBar.setMinimumSize(new java.awt.Dimension(1280, 40));
        pnlBar.setPreferredSize(new java.awt.Dimension(1280, 40));

        btnHide.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        btnHide.setText("-");
        btnHide.setFocusable(false);
        btnHide.setPreferredSize(new java.awt.Dimension(40, 40));
        btnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(40, 40));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Controle de Retifica Bio Diesel");

        javax.swing.GroupLayout pnlBarLayout = new javax.swing.GroupLayout(pnlBar);
        pnlBar.setLayout(pnlBarLayout);
        pnlBarLayout.setHorizontalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarLayout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarLayout.setVerticalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarLayout.createSequentialGroup()
                .addGroup(pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitle)))
                .addGap(0, 0, 0))
        );

        pnlMenu.setMaximumSize(new java.awt.Dimension(280, 680));
        pnlMenu.setMinimumSize(new java.awt.Dimension(280, 680));
        pnlMenu.setPreferredSize(new java.awt.Dimension(280, 680));

        btnHome.setText("Inicio");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLaboratory.setText("Laboratorio");
        btnLaboratory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratoryActionPerformed(evt);
            }
        });

        btnanalyzeTruck.setText("Analise de Caminhão");
        btnanalyzeTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanalyzeTruckActionPerformed(evt);
            }
        });

        btnAnalyzeTank.setText("Analise de Tanque");
        btnAnalyzeTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeTankActionPerformed(evt);
            }
        });

        btnAnalyzeBiodiesel.setText("Analise Biodiesel");
        btnAnalyzeBiodiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeBiodieselActionPerformed(evt);
            }
        });

        btnAnalyzeSplit.setText("Analise Cisão");
        btnAnalyzeSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeSplitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLaboratoryLayout = new javax.swing.GroupLayout(pnlLaboratory);
        pnlLaboratory.setLayout(pnlLaboratoryLayout);
        pnlLaboratoryLayout.setHorizontalGroup(
            pnlLaboratoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnanalyzeTruck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnAnalyzeTank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAnalyzeBiodiesel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAnalyzeSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLaboratoryLayout.setVerticalGroup(
            pnlLaboratoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLaboratoryLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnanalyzeTruck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnalyzeTank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnalyzeBiodiesel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnalyzeSplit))
        );

        btnSample.setText("Amostra");
        btnSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSampleActionPerformed(evt);
            }
        });

        btnTransport.setText("Transporte");
        btnTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportActionPerformed(evt);
            }
        });

        btnCharge.setText("Carregamento");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        btnDischarge.setText("Descarregamento");
        btnDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTransportLayout = new javax.swing.GroupLayout(pnlTransport);
        pnlTransport.setLayout(pnlTransportLayout);
        pnlTransportLayout.setHorizontalGroup(
            pnlTransportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDischarge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTransportLayout.setVerticalGroup(
            pnlTransportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransportLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnCharge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDischarge))
        );

        btnStock.setText("Estoque");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnProductStock.setText("Estoque Produto");
        btnProductStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductStockActionPerformed(evt);
            }
        });

        btnTankStock.setText("Estoque Tanque");
        btnTankStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStockLayout = new javax.swing.GroupLayout(pnlStock);
        pnlStock.setLayout(pnlStockLayout);
        pnlStockLayout.setHorizontalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTankStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlStockLayout.setVerticalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockLayout.createSequentialGroup()
                .addComponent(btnProductStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTankStock)
                .addGap(0, 0, 0))
        );

        btnMake.setText("Produção");
        btnMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeActionPerformed(evt);
            }
        });

        btnMakeEster.setText("Esterificação");
        btnMakeEster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeEsterActionPerformed(evt);
            }
        });

        btnMakeTrans.setText("Transesterificação");
        btnMakeTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMakeLayout = new javax.swing.GroupLayout(pnlMake);
        pnlMake.setLayout(pnlMakeLayout);
        pnlMakeLayout.setHorizontalGroup(
            pnlMakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMakeEster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMakeTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMakeLayout.setVerticalGroup(
            pnlMakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMakeLayout.createSequentialGroup()
                .addComponent(btnMakeEster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMakeTrans)
                .addGap(0, 0, 0))
        );

        btnCalc.setText("Calculadora");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnCalcAcidity.setText("Acidez");
        btnCalcAcidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcAcidityActionPerformed(evt);
            }
        });

        btnCalcSoap.setText("Saponidade");
        btnCalcSoap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcSoapActionPerformed(evt);
            }
        });

        btnCalcTrans.setText("Transesterificação");
        btnCalcTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalcLayout = new javax.swing.GroupLayout(pnlCalc);
        pnlCalc.setLayout(pnlCalcLayout);
        pnlCalcLayout.setHorizontalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCalcAcidity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalcSoap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalcTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCalcLayout.setVerticalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcLayout.createSequentialGroup()
                .addComponent(btnCalcAcidity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcSoap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcTrans)
                .addGap(0, 0, 0))
        );

        btnSetup.setText("Configuração");
        btnSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupActionPerformed(evt);
            }
        });

        btnProvider.setText("Fornecedor");
        btnProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProviderActionPerformed(evt);
            }
        });

        btnTank.setText("Tanque");
        btnTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankActionPerformed(evt);
            }
        });

        btnProduct.setText("Produto");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnSolution.setText("Solução");
        btnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolutionActionPerformed(evt);
            }
        });

        btnTheme.setText("Tema");
        btnTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemeActionPerformed(evt);
            }
        });

        btnAbout.setText("Sobre");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSetupLayout = new javax.swing.GroupLayout(pnlSetup);
        pnlSetup.setLayout(pnlSetupLayout);
        pnlSetupLayout.setHorizontalGroup(
            pnlSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProvider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTheme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSetupLayout.setVerticalGroup(
            pnlSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetupLayout.createSequentialGroup()
                .addComponent(btnProvider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolution)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTheme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLaboratory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLaboratory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTransport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTransport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSample, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSetup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSetup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaboratory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLaboratory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSample)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSetup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dktMain.setMaximumSize(new java.awt.Dimension(1000, 680));
        dktMain.setMinimumSize(new java.awt.Dimension(1000, 680));

        javax.swing.GroupLayout dktMainLayout = new javax.swing.GroupLayout(dktMain);
        dktMain.setLayout(dktMainLayout);
        dktMainLayout.setHorizontalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        dktMainLayout.setVerticalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(dktMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dktMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnHideActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        retractPanel();
        Access.checkFrame(new FrmStkTk());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLaboratoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratoryActionPerformed
        expandPanel(pnlLaboratory, btnLaboratory);
    }//GEN-LAST:event_btnLaboratoryActionPerformed

    private void btnanalyzeTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanalyzeTruckActionPerformed
        Access.checkFrame(new FrmAnalyzeTruckTbl());
    }//GEN-LAST:event_btnanalyzeTruckActionPerformed

    private void btnAnalyzeTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeTankActionPerformed
        Access.checkFrame(new FrmLabTqTbl());
    }//GEN-LAST:event_btnAnalyzeTankActionPerformed

    private void btnAnalyzeBiodieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeBiodieselActionPerformed
        Access.checkFrame(new FrmLabBioTbl());
    }//GEN-LAST:event_btnAnalyzeBiodieselActionPerformed

    private void btnAnalyzeSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeSplitActionPerformed
        Access.checkFrame(new FrmLabSplitTbl());
    }//GEN-LAST:event_btnAnalyzeSplitActionPerformed

    private void btnSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSampleActionPerformed
        retractPanel();
        Access.checkFrame(new FrmSealTbl());
    }//GEN-LAST:event_btnSampleActionPerformed

    private void btnTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportActionPerformed
        expandPanel(pnlTransport, btnTransport);
    }//GEN-LAST:event_btnTransportActionPerformed

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        Access.checkFrame(new FrmChargeTbl());
    }//GEN-LAST:event_btnChargeActionPerformed

    private void btnDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargeActionPerformed
        Access.checkFrame(new FrmDchargeTbl());
    }//GEN-LAST:event_btnDischargeActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        expandPanel(pnlStock, btnStock);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnProductStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductStockActionPerformed
        Access.checkFrame(new FrmStkProduct());
    }//GEN-LAST:event_btnProductStockActionPerformed

    private void btnTankStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankStockActionPerformed
        Access.checkFrame(new FrmStkTank());
    }//GEN-LAST:event_btnTankStockActionPerformed

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        expandPanel(pnlMake, btnMake);
    }//GEN-LAST:event_btnMakeActionPerformed

    private void btnMakeEsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeEsterActionPerformed
        Access.checkFrame(new FrmEsterTbl());
    }//GEN-LAST:event_btnMakeEsterActionPerformed

    private void btnMakeTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeTransActionPerformed
        Access.checkFrame(new FrmTransTbl());
    }//GEN-LAST:event_btnMakeTransActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        expandPanel(pnlCalc, btnCalc);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnCalcAcidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcAcidityActionPerformed
        Access.checkFrame(new FrmCalcAcidity(null));
    }//GEN-LAST:event_btnCalcAcidityActionPerformed

    private void btnCalcSoapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcSoapActionPerformed
        Access.checkFrame(new FrmCalcSoap(null));
    }//GEN-LAST:event_btnCalcSoapActionPerformed

    private void btnCalcTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcTransActionPerformed
        Access.checkFrame(new FrmCalcTrans());
    }//GEN-LAST:event_btnCalcTransActionPerformed

    private void btnSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupActionPerformed
        expandPanel(pnlSetup, btnSetup);
    }//GEN-LAST:event_btnSetupActionPerformed

    private void btnProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviderActionPerformed
        Access.checkFrame(new FrmProviderTbl());
    }//GEN-LAST:event_btnProviderActionPerformed

    private void btnTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankActionPerformed
        Access.checkFrame(new FrmTankTbl());
    }//GEN-LAST:event_btnTankActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        Access.checkFrame(new FrmProductTbl());
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolutionActionPerformed
        Access.checkFrame(new FrmSolution());
    }//GEN-LAST:event_btnSolutionActionPerformed

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        FrmTheme theme = new FrmTheme();
        theme.setMenu(pnlMenu);
        Access.checkFrame(theme);
    }//GEN-LAST:event_btnThemeActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        Access.checkFrame(new FrmAbout());
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRectify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmRectify().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAnalyzeBiodiesel;
    private javax.swing.JButton btnAnalyzeSplit;
    private javax.swing.JButton btnAnalyzeTank;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnCalcAcidity;
    private javax.swing.JButton btnCalcSoap;
    private javax.swing.JButton btnCalcTrans;
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLaboratory;
    private javax.swing.JButton btnMake;
    private javax.swing.JButton btnMakeEster;
    private javax.swing.JButton btnMakeTrans;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProductStock;
    private javax.swing.JButton btnProvider;
    private javax.swing.JButton btnSample;
    private javax.swing.JButton btnSetup;
    private javax.swing.JButton btnSolution;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnTank;
    private javax.swing.JButton btnTankStock;
    private javax.swing.JButton btnTheme;
    private javax.swing.JButton btnTransport;
    private javax.swing.JButton btnanalyzeTruck;
    private javax.swing.JDesktopPane dktMain;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBar;
    private javax.swing.JPanel pnlCalc;
    private javax.swing.JPanel pnlLaboratory;
    private javax.swing.JPanel pnlMake;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlSetup;
    private javax.swing.JPanel pnlStock;
    private javax.swing.JPanel pnlTransport;
    // End of variables declaration//GEN-END:variables

 
    private JPanel panel;

    private void expandPanel(JPanel pnl, JButton btn) {
        if (!pnl.isVisible()) {
            retractPanel();
        }
        panel = pnl;
        pnl.setVisible(!pnl.isVisible());
        btn.setBackground(pnl.isVisible() ? Color.BLUE : new Color(187, 187, 187));
        btn.setForeground(pnl.isVisible() ? Color.WHITE : new Color(60, 63, 65));
    }

    private void retractPanel() {
        if (panel != null) {
            panel.setVisible(false);
            TreatmentTheme.initTheme(pnlMenu);
        }
    }

    
}
