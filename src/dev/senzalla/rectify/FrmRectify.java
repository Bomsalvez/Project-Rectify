/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.senzalla.rectify;

import dev.senzalla.rectify.canvas.FrmAbout;
import dev.senzalla.rectify.canvas.FrmCalcAcid;
import dev.senzalla.rectify.canvas.FrmCalcSoap;
import dev.senzalla.rectify.canvas.FrmCalcTrans;
import dev.senzalla.rectify.canvas.FrmChargeTbl;
import dev.senzalla.rectify.canvas.FrmDchargeTbl;
import dev.senzalla.rectify.canvas.FrmEsterTbl;
import dev.senzalla.rectify.canvas.FrmLabBioTbl;
import dev.senzalla.rectify.canvas.FrmLabCarTbl;
import dev.senzalla.rectify.canvas.FrmLabSplitTbl;
import dev.senzalla.rectify.canvas.FrmLabTqTbl;
//import dev.senzalla.rectify.canvas.FrmProductTbl;
import dev.senzalla.rectify.canvas.FrmProviderTbl;
import dev.senzalla.rectify.canvas.FrmSealTbl;
import dev.senzalla.rectify.canvas.FrmSolution;
import dev.senzalla.rectify.canvas.FrmStkTk;
import dev.senzalla.rectify.canvas.FrmTankTbl;
import dev.senzalla.rectify.canvas.FrmTheme;
import dev.senzalla.rectify.canvas.FrmTransTbl;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import dev.senzalla.rectify.treatments.TreatmentsItem;
import javax.swing.JInternalFrame;

/**
 * @author Black Burn Cybernetic
 * @e-mail blackburncyber@gmail.com
 * @github github.com/BlackBurnCybernetic
 */
public class FrmRectify extends JFrame {

    /**
     * Creates new form FrmRectify
     */
    public FrmRectify() {
        initComponents();
        Access.setDktMain(dktMain);
        TreatmentsItem.visiblePanel(pnlMenu);
//        this.goToCanvas(new FrmStkTk());
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
        btnBarHide = new javax.swing.JButton();
        btnBarExit = new javax.swing.JButton();
        lblBarTitle = new javax.swing.JLabel();
        dktMain = new javax.swing.JDesktopPane();
        pnlMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        pnlLab = new javax.swing.JPanel();
        btnLabCar = new javax.swing.JButton();
        btnLabTq = new javax.swing.JButton();
        btnLabBio = new javax.swing.JButton();
        btnLabSplit = new javax.swing.JButton();
        btnSeal = new javax.swing.JButton();
        btnTransp = new javax.swing.JButton();
        pnlTransp = new javax.swing.JPanel();
        btnCharge = new javax.swing.JButton();
        btnDcharge = new javax.swing.JButton();
        btnStk = new javax.swing.JButton();
        pnlStk = new javax.swing.JPanel();
        btnStkPr = new javax.swing.JButton();
        btnStkMonthly = new javax.swing.JButton();
        btnMake = new javax.swing.JButton();
        pnlMake = new javax.swing.JPanel();
        btnMakeEster = new javax.swing.JButton();
        btnMakeTrans = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        pnlCalc = new javax.swing.JPanel();
        btnCalcAcid = new javax.swing.JButton();
        btnCalcSoap = new javax.swing.JButton();
        btnCalcTrans = new javax.swing.JButton();
        btnSetup = new javax.swing.JButton();
        pnlSetup = new javax.swing.JPanel();
        btnProvider = new javax.swing.JButton();
        btnTank = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnSol = new javax.swing.JButton();
        btnTheme = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setName("FrmRectify"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnlBar.setBackground(new java.awt.Color(102, 102, 102));
        pnlBar.setMaximumSize(new java.awt.Dimension(750, 40));
        pnlBar.setMinimumSize(new java.awt.Dimension(750, 40));

        btnBarHide.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        btnBarHide.setText("-");
        btnBarHide.setFocusable(false);
        btnBarHide.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBarHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarHideActionPerformed(evt);
            }
        });

        btnBarExit.setBackground(new java.awt.Color(255, 0, 0));
        btnBarExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBarExit.setText("X");
        btnBarExit.setFocusable(false);
        btnBarExit.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBarExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarExitActionPerformed(evt);
            }
        });

        lblBarTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBarTitle.setText("Controle de Retifica Bio Diesel");

        javax.swing.GroupLayout pnlBarLayout = new javax.swing.GroupLayout(pnlBar);
        pnlBar.setLayout(pnlBarLayout);
        pnlBarLayout.setHorizontalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblBarTitle)
                .addGap(109, 109, 109)
                .addComponent(btnBarHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBarExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarLayout.setVerticalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarLayout.createSequentialGroup()
                .addGroup(pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBarExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBarHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBarTitle)))
                .addGap(0, 0, 0))
        );

        dktMain.setMaximumSize(new java.awt.Dimension(600, 460));
        dktMain.setMinimumSize(new java.awt.Dimension(600, 460));

        javax.swing.GroupLayout dktMainLayout = new javax.swing.GroupLayout(dktMain);
        dktMain.setLayout(dktMainLayout);
        dktMainLayout.setHorizontalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        dktMainLayout.setVerticalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlMenu.setMaximumSize(new java.awt.Dimension(153, 460));
        pnlMenu.setPreferredSize(new java.awt.Dimension(153, 460));

        btnHome.setText("Inicio");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLab.setText("Laboratorio");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        btnLabCar.setText("Analise de Caminhão");
        btnLabCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabCarActionPerformed(evt);
            }
        });

        btnLabTq.setText("Analise de Tanque");
        btnLabTq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabTqActionPerformed(evt);
            }
        });

        btnLabBio.setText("Analise Biodiesel");
        btnLabBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabBioActionPerformed(evt);
            }
        });

        btnLabSplit.setText("Analise Cisão");
        btnLabSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabSplitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLabLayout = new javax.swing.GroupLayout(pnlLab);
        pnlLab.setLayout(pnlLabLayout);
        pnlLabLayout.setHorizontalGroup(
            pnlLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLabCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLabTq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLabBio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLabSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLabLayout.setVerticalGroup(
            pnlLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLabCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLabTq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLabBio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLabSplit))
        );

        btnSeal.setText("Amostra");
        btnSeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSealActionPerformed(evt);
            }
        });

        btnTransp.setText("Transporte");
        btnTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranspActionPerformed(evt);
            }
        });

        btnCharge.setText("Carregamento");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        btnDcharge.setText("Descarregamento");
        btnDcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDchargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTranspLayout = new javax.swing.GroupLayout(pnlTransp);
        pnlTransp.setLayout(pnlTranspLayout);
        pnlTranspLayout.setHorizontalGroup(
            pnlTranspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDcharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTranspLayout.setVerticalGroup(
            pnlTranspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTranspLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnCharge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDcharge))
        );

        btnStk.setText("Estoque");
        btnStk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStkActionPerformed(evt);
            }
        });

        btnStkPr.setText("Estoque Produto");
        btnStkPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStkPrActionPerformed(evt);
            }
        });

        btnStkMonthly.setText("Estoque Mensal");
        btnStkMonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStkMonthlyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStkLayout = new javax.swing.GroupLayout(pnlStk);
        pnlStk.setLayout(pnlStkLayout);
        pnlStkLayout.setHorizontalGroup(
            pnlStkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnStkPr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStkMonthly, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlStkLayout.setVerticalGroup(
            pnlStkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStkLayout.createSequentialGroup()
                .addComponent(btnStkPr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStkMonthly)
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

        btnCalcAcid.setText("Acidez");
        btnCalcAcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcAcidActionPerformed(evt);
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
            .addComponent(btnCalcAcid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalcSoap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalcTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCalcLayout.setVerticalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcLayout.createSequentialGroup()
                .addComponent(btnCalcAcid)
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

        btnSol.setText("Solução");
        btnSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolActionPerformed(evt);
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
            .addComponent(btnSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnSol)
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
            .addComponent(pnlLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlStk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(dktMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dktMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarHideActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnBarHideActionPerformed

    private void btnBarExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnBarExitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        retractPanel();
        this.goToCanvas(new FrmStkTk());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        expandPanel(pnlLab, btnLab);
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnLabCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabCarActionPerformed
        this.goToCanvas(new FrmLabCarTbl());
    }//GEN-LAST:event_btnLabCarActionPerformed

    private void btnLabTqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabTqActionPerformed
        this.goToCanvas(new FrmLabTqTbl());
    }//GEN-LAST:event_btnLabTqActionPerformed

    private void btnLabBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabBioActionPerformed
        this.goToCanvas(new FrmLabBioTbl());
    }//GEN-LAST:event_btnLabBioActionPerformed

    private void btnLabSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabSplitActionPerformed
        this.goToCanvas(new FrmLabSplitTbl());
    }//GEN-LAST:event_btnLabSplitActionPerformed

    private void btnSealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSealActionPerformed
        retractPanel();
        this.goToCanvas(new FrmSealTbl());
    }//GEN-LAST:event_btnSealActionPerformed

    private void btnTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranspActionPerformed
        expandPanel(pnlTransp, btnTransp);
    }//GEN-LAST:event_btnTranspActionPerformed

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        this.goToCanvas(new FrmChargeTbl());
    }//GEN-LAST:event_btnChargeActionPerformed

    private void btnDchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDchargeActionPerformed
        this.goToCanvas(new FrmDchargeTbl());
    }//GEN-LAST:event_btnDchargeActionPerformed

    private void btnStkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStkActionPerformed
        expandPanel(pnlStk, btnStk);
    }//GEN-LAST:event_btnStkActionPerformed

    private void btnStkPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStkPrActionPerformed
//        goToCanvas(new );
    }//GEN-LAST:event_btnStkPrActionPerformed

    private void btnStkMonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStkMonthlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStkMonthlyActionPerformed

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        expandPanel(pnlMake, btnMake);
    }//GEN-LAST:event_btnMakeActionPerformed

    private void btnMakeEsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeEsterActionPerformed
        this.goToCanvas(new FrmEsterTbl());
    }//GEN-LAST:event_btnMakeEsterActionPerformed

    private void btnMakeTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeTransActionPerformed
        this.goToCanvas(new FrmTransTbl());
    }//GEN-LAST:event_btnMakeTransActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        expandPanel(pnlCalc, btnCalc);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnCalcAcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcAcidActionPerformed
        this.goToCanvas(new FrmCalcAcid());
    }//GEN-LAST:event_btnCalcAcidActionPerformed

    private void btnCalcSoapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcSoapActionPerformed
        this.goToCanvas(new FrmCalcSoap());
    }//GEN-LAST:event_btnCalcSoapActionPerformed

    private void btnCalcTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcTransActionPerformed
       this.goToCanvas(new FrmCalcTrans());
    }//GEN-LAST:event_btnCalcTransActionPerformed

    private void btnSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupActionPerformed
        expandPanel(pnlSetup, btnSetup);
    }//GEN-LAST:event_btnSetupActionPerformed

    private void btnProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviderActionPerformed
       this.goToCanvas(new FrmProviderTbl());
    }//GEN-LAST:event_btnProviderActionPerformed

    private void btnTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankActionPerformed
        this.goToCanvas(new FrmTankTbl());
    }//GEN-LAST:event_btnTankActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
//        this.goToCanvas(new FrmProductTbl());
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolActionPerformed
        this.goToCanvas(new FrmSolution());
    }//GEN-LAST:event_btnSolActionPerformed

    private void btnThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemeActionPerformed
        this.goToCanvas(new FrmTheme());
    }//GEN-LAST:event_btnThemeActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.goToCanvas(new FrmAbout());
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
    private javax.swing.JButton btnBarExit;
    private javax.swing.JButton btnBarHide;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnCalcAcid;
    private javax.swing.JButton btnCalcSoap;
    private javax.swing.JButton btnCalcTrans;
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnDcharge;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnLabBio;
    private javax.swing.JButton btnLabCar;
    private javax.swing.JButton btnLabSplit;
    private javax.swing.JButton btnLabTq;
    private javax.swing.JButton btnMake;
    private javax.swing.JButton btnMakeEster;
    private javax.swing.JButton btnMakeTrans;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProvider;
    private javax.swing.JButton btnSeal;
    private javax.swing.JButton btnSetup;
    private javax.swing.JButton btnSol;
    private javax.swing.JButton btnStk;
    private javax.swing.JButton btnStkMonthly;
    private javax.swing.JButton btnStkPr;
    private javax.swing.JButton btnTank;
    private javax.swing.JButton btnTheme;
    private javax.swing.JButton btnTransp;
    private javax.swing.JDesktopPane dktMain;
    private javax.swing.JLabel lblBarTitle;
    private javax.swing.JPanel pnlBar;
    private javax.swing.JPanel pnlCalc;
    private javax.swing.JPanel pnlLab;
    private javax.swing.JPanel pnlMake;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlSetup;
    private javax.swing.JPanel pnlStk;
    private javax.swing.JPanel pnlTransp;
    // End of variables declaration//GEN-END:variables

    private JButton button;
    private JPanel panel;
    private JInternalFrame frame;

    private void expandPanel(JPanel pnl, JButton btn) {
        if (!pnl.isVisible()) {
            retractPanel();
        }
        button = btn;
        panel = pnl;
        pnl.setVisible(!pnl.isVisible());
        btn.setBackground(pnl.isVisible() ? Color.BLUE : new Color(187, 187, 187));
        btn.setForeground(pnl.isVisible() ? Color.WHITE : new Color(60, 63, 65));
    }

    private void retractPanel() {
        try {
            panel.setVisible(false);
            button.setBackground(new Color(187, 187, 187));
            button.setForeground(new Color(60, 63, 65));
        } catch (NullPointerException e) {
        }
    }

    private void goToCanvas(JInternalFrame frame) {
        if (this.frame == null) {
            Access.goToCanvas(frame);
        } else if (this.frame != null) {
            Access.goToCanvas(this.frame, frame);
        }
        this.frame = frame;
    }
}
