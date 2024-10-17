/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasPratikum3_ke2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList; 
import java.util.List; 

/**
 *
 * @author evril
 */
public class TugasPratikum3_Soal2 extends javax.swing.JFrame {
    private DefaultTableModel model;
    private int hargaSPP = 300000;
    
    public TugasPratikum3_Soal2() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAtas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panelbawah = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Panelkiri = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        januari = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        hitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pembayaran = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        Panelkanan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAtas.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("SPP SMK SEMEN GRESIK");
        PanelAtas.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasPratikum3_ke2/SMKsemengresik.png"))); // NOI18N
        PanelAtas.add(jLabel2);

        getContentPane().add(PanelAtas, java.awt.BorderLayout.PAGE_START);

        Panelbawah.setLayout(new java.awt.GridLayout(1, 0));

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        Panelbawah.add(reset);

        batal.setBackground(new java.awt.Color(51, 51, 51));
        batal.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        Panelbawah.add(batal);

        getContentPane().add(Panelbawah, java.awt.BorderLayout.PAGE_END);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        Panelkiri.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NISN : ");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA SISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel10)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        januari.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        januari.setText("JANUARI");

        februari.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        februari.setText("FEBRUARI");

        maret.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        maret.setText("MARET");

        april.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        april.setText("APRIL");

        mei.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        mei.setText("MEI");

        juni.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        juni.setText("JUNI");

        juli.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        juli.setText("JULI");

        agustus.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        agustus.setText("AGUSTUS");

        september.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        september.setText("SEPTEMBER");

        oktober.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        oktober.setText("OKTOBER");

        november.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        november.setText("NOVEMBER");

        desember.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        desember.setText("DESEMBER");

        hitung.setBackground(new java.awt.Color(102, 102, 102));
        hitung.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        hitung.setForeground(new java.awt.Color(255, 255, 255));
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel6.setText("SPP");

        spp.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel7.setText("PEMBAYARAN");

        pembayaran.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setText("KEMBALIAN");

        kembalian.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        show.setBackground(new java.awt.Color(102, 102, 102));
        show.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelkiriLayout = new javax.swing.GroupLayout(Panelkiri);
        Panelkiri.setLayout(PanelkiriLayout);
        PanelkiriLayout.setHorizontalGroup(
            PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelkiriLayout.createSequentialGroup()
                        .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(januari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(februari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mei, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maret, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(april, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitung)
                            .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(juni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelkiriLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(show)
                                    .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(desember, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oktober, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(agustus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(november, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(juli, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(september)
                                        .addComponent(spp)
                                        .addComponent(pembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                            .addGroup(PanelkiriLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7))
                            .addGroup(PanelkiriLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelkiriLayout.setVerticalGroup(
            PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(januari)
                    .addComponent(juli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(februari)
                    .addComponent(agustus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maret)
                    .addComponent(september))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(april)
                    .addComponent(oktober))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mei)
                    .addComponent(november))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desember)
                    .addComponent(juni))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show)
                .addGap(30, 30, 30))
        );

        jPanel7.add(Panelkiri);

        Panelkanan.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TAMPILAN DATA SPP");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BULAN", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PanelkananLayout = new javax.swing.GroupLayout(Panelkanan);
        Panelkanan.setLayout(PanelkananLayout);
        PanelkananLayout.setHorizontalGroup(
            PanelkananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkananLayout.createSequentialGroup()
                .addGroup(PanelkananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelkananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelkananLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel9)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelkananLayout.setVerticalGroup(
            PanelkananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel7.add(Panelkanan);

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi Terlebih dahulu Nama.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (jTextField2.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi Terlebih dahulu NISN.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        List<String> bulanDipilih = new ArrayList<>();
        if (januari.isSelected()) bulanDipilih.add("Januari");
        if (februari.isSelected()) bulanDipilih.add("Februari");
        if (maret.isSelected()) bulanDipilih.add("Maret");
        if (april.isSelected()) bulanDipilih.add("April");
        if (mei.isSelected()) bulanDipilih.add("Mei");
        if (juni.isSelected()) bulanDipilih.add("Juni");
        if (juli.isSelected()) bulanDipilih.add("Juli");
        if (agustus.isSelected()) bulanDipilih.add("Agustus");
        if (september.isSelected()) bulanDipilih.add("September");
        if (oktober.isSelected()) bulanDipilih.add("Oktober");
        if (november.isSelected()) bulanDipilih.add("November");
        if (desember.isSelected()) bulanDipilih.add("Desember");

        if (bulanDipilih.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih setidaknya satu bulan.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int totalBulan = bulanDipilih.size();

        int totalSPP = totalBulan * hargaSPP;

        spp.setText(String.valueOf(totalSPP)); 

        StringBuilder infoBulan = new StringBuilder("Bulan yang dipilih : \n");
        for (String bulan : bulanDipilih) {
            infoBulan.append(bulan).append("\n");
        }
        infoBulan.append("Total yang dibayar : ").append(totalSPP).append(" Rupiah");

        JOptionPane.showMessageDialog(this, infoBulan.toString(), "Informasi Pembayaran", JOptionPane.INFORMATION_MESSAGE);

        pembayaran.setText(""); 
        
    }//GEN-LAST:event_hitungActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().trim().isEmpty()) {
        return; 
        }

        if (jTextField2.getText().trim().isEmpty()) {
            return; 
        }

        String totalSPPStr = spp.getText().trim();
        if (totalSPPStr.isEmpty() || totalSPPStr.equals("0")) {
            return; 
        }

        String jumlahStr = pembayaran.getText().trim();
        if (jumlahStr.isEmpty() || jumlahStr.equals("0")) {
            return; 
        }

        int jumlah;
        try {
            jumlah = Integer.parseInt(jumlahStr); 
        } catch (NumberFormatException e) {
            return; 
        }

        int totalBulan = 0;
        List<String> bulanDipilih = new ArrayList<>();
        List<String> bulanMenunggak = new ArrayList<>();
        
        if (januari.isSelected()) { totalBulan++; bulanDipilih.add("Januari"); }
        if (februari.isSelected()) { totalBulan++; bulanDipilih.add("Februari"); }
        if (maret.isSelected()) { totalBulan++; bulanDipilih.add("Maret"); }
        if (april.isSelected()) { totalBulan++; bulanDipilih.add("April"); }
        if (mei.isSelected()) { totalBulan++; bulanDipilih.add("Mei"); }
        if (juni.isSelected()) { totalBulan++; bulanDipilih.add("Juni"); }
        if (juli.isSelected()) { totalBulan++; bulanDipilih.add("Juli"); }
        if (agustus.isSelected()) { totalBulan++; bulanDipilih.add("Agustus"); }
        if (september.isSelected()) { totalBulan++; bulanDipilih.add("September"); }
        if (oktober.isSelected()) { totalBulan++; bulanDipilih.add("Oktober"); }
        if (november.isSelected()) { totalBulan++; bulanDipilih.add("November"); }
        if (desember.isSelected()) { totalBulan++; bulanDipilih.add("Desember"); }

        int totalSPP = totalBulan * hargaSPP;  
        spp.setText(String.valueOf(totalSPP));

        List<String> bulanSudahDibayar = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (String bulan : bulanDipilih) {
            boolean sudahLunas = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                Object bulanDiTabelObj = model.getValueAt(i, 0);
                Object statusDiTabelObj = model.getValueAt(i, 1);
                if (bulanDiTabelObj != null && statusDiTabelObj != null) {
                    String bulanDiTabel = bulanDiTabelObj.toString();
                    String statusDiTabel = statusDiTabelObj.toString();
                    if (bulan.equals(bulanDiTabel) && statusDiTabel.equals("Sudah Lunas")) {
                        sudahLunas = true;
                        bulanSudahDibayar.add(bulan);
                        break;
                    }
                }
            }
            if (!sudahLunas) {
                bulanMenunggak.add(bulan);
            }
        }

        int sisaSaldo = jumlah;
        String status;

        for (String bulan : bulanMenunggak) {
            if (sisaSaldo >= hargaSPP) {  
                sisaSaldo -= hargaSPP;
                status = "Sudah Lunas";
            } else {
                status = "Menunggak"; 
            }

            boolean bulanSudahAda = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                Object bulanDiTabelObj = model.getValueAt(i, 0);
                if (bulan.equals(bulanDiTabelObj)) {
                    bulanSudahAda = true;
                    model.setValueAt(status, i, 1);
                    break;
                }
            }

            if (!bulanSudahAda) {
                model.addRow(new Object[]{bulan, status});
            }

            if (status.equals("Sudah Lunas")) {
                switch (bulan) {
                    case "Januari": januari.setEnabled(false); break;
                    case "Februari": februari.setEnabled(false); break;
                    case "Maret": maret.setEnabled(false); break;
                    case "April": april.setEnabled(false); break;
                    case "Mei": mei.setEnabled(false); break;
                    case "Juni": juni.setEnabled(false); break;
                    case "Juli": juli.setEnabled(false); break;
                    case "Agustus": agustus.setEnabled(false); break;
                    case "September": september.setEnabled(false); break;
                    case "Oktober": oktober.setEnabled(false); break;
                    case "November": november.setEnabled(false); break;
                    case "Desember": desember.setEnabled(false); break;
                }
            }
        }

        if (sisaSaldo >= 0) {
            kembalian.setText(String.valueOf(sisaSaldo)); 
        } else {
            JOptionPane.showMessageDialog(this, "Uang tidak cukup untuk melunasi semua bulan menunggak. Silakan masukkan uang pas atau lebih.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        pembayaran.setText("");
        
        StringBuilder statusTabel = new StringBuilder("Status Pembayaran:\n");
        for (int i = 0; i < model.getRowCount(); i++) {
            Object bulanDiTabel = model.getValueAt(i, 0);
            Object statusDiTabel = model.getValueAt(i, 1);
            if (bulanDiTabel != null && statusDiTabel != null) {
                statusTabel.append(bulanDiTabel.toString()).append(": ").append(statusDiTabel.toString()).append("\n");
            }
        }

    }//GEN-LAST:event_showActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        spp.setText("");
        pembayaran.setText("");
        kembalian.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        januari.setEnabled(true);
        februari.setEnabled(true);
        maret.setEnabled(true);
        april.setEnabled(true);
        mei.setEnabled(true);
        juni.setEnabled(true);
        juli.setEnabled(true);
        agustus.setEnabled(true);
        september.setEnabled(true);
        oktober.setEnabled(true);
        november.setEnabled(true);
        desember.setEnabled(true);


        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);
    }//GEN-LAST:event_resetActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?",
                "Informasi!", JOptionPane.YES_NO_OPTION);
        
        if (result == JOptionPane.YES_OPTION){
         System.exit(0); 
        }
    }//GEN-LAST:event_batalActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasPratikum3_Soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAtas;
    private javax.swing.JPanel Panelbawah;
    private javax.swing.JPanel Panelkanan;
    private javax.swing.JPanel Panelkiri;
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JButton batal;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JTextField kembalian;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox september;
    private javax.swing.JButton show;
    private javax.swing.JTextField spp;
    // End of variables declaration//GEN-END:variables
}
