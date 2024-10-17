/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspraktikum3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class apotekdio extends javax.swing.JFrame {


    public apotekdio() {
        initComponents();
        tfBayar.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                bayar();
        }
        });
    }
   private void bayar() {
        try {
            int pembayaran = Integer.parseInt(tfBayar.getText().trim());
            int total = Integer.parseInt(tfTotal.getText().trim());
            int kembalian = pembayaran - total;

            if (pembayaran < total) {
                tfKembalian.setText("Uang Tidak Cukup");
            } else {
                tfKembalian.setText("Rp. "+ kembalian);
            }
        } catch (NumberFormatException e) {
            tfKembalian.setText("Input Tidak Sesuai");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnKepala = new javax.swing.JButton();
        btnLambung = new javax.swing.JButton();
        btnFlu = new javax.swing.JButton();
        btnBatuk = new javax.swing.JButton();
        btnNyeri = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbPseudoephedrine = new javax.swing.JCheckBox();
        cbSyrup = new javax.swing.JCheckBox();
        cbParacetamol = new javax.swing.JCheckBox();
        cbIbuprofen = new javax.swing.JCheckBox();
        cbOmeprazole = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbTheraflu = new javax.swing.JCheckBox();
        cbRelief = new javax.swing.JCheckBox();
        cbPain = new javax.swing.JCheckBox();
        cbAntasida = new javax.swing.JCheckBox();
        cbDrops = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        tfBayar = new javax.swing.JTextField();
        tfKembalian = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/k24jam-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(0, 153, 51));
        jPanel7.setLayout(new java.awt.GridLayout(5, 1, 6, 6));

        btnKepala.setBackground(new java.awt.Color(255, 51, 51));
        btnKepala.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKepala.setForeground(new java.awt.Color(255, 255, 255));
        btnKepala.setText("Sakit Kepala");
        btnKepala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKepalaActionPerformed(evt);
            }
        });
        jPanel7.add(btnKepala);

        btnLambung.setBackground(new java.awt.Color(255, 51, 51));
        btnLambung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLambung.setForeground(new java.awt.Color(255, 255, 255));
        btnLambung.setText("Lambung");
        btnLambung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLambungActionPerformed(evt);
            }
        });
        jPanel7.add(btnLambung);

        btnFlu.setBackground(new java.awt.Color(255, 51, 51));
        btnFlu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFlu.setForeground(new java.awt.Color(255, 255, 255));
        btnFlu.setText("Flu");
        btnFlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFluActionPerformed(evt);
            }
        });
        jPanel7.add(btnFlu);

        btnBatuk.setBackground(new java.awt.Color(255, 51, 51));
        btnBatuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatuk.setForeground(new java.awt.Color(255, 255, 255));
        btnBatuk.setText("Batuk");
        btnBatuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatukActionPerformed(evt);
            }
        });
        jPanel7.add(btnBatuk);

        btnNyeri.setBackground(new java.awt.Color(255, 51, 51));
        btnNyeri.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNyeri.setForeground(new java.awt.Color(255, 255, 255));
        btnNyeri.setText("Nyeri");
        btnNyeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyeriActionPerformed(evt);
            }
        });
        jPanel7.add(btnNyeri);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pilihan Gejala ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/kecil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/Cough Syrup.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel3, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/PARACETAMOL.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel4, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/IBUPROFEN-removebg-preview-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/PSEUDOE-removebg-preview (1).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel6, gridBagConstraints);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/OMEPRAZOLE-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel7, gridBagConstraints);

        cbPseudoephedrine.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbPseudoephedrine.setForeground(new java.awt.Color(0, 0, 0));
        cbPseudoephedrine.setText("Pseudoephedrine");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbPseudoephedrine, gridBagConstraints);

        cbSyrup.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbSyrup.setForeground(new java.awt.Color(0, 0, 0));
        cbSyrup.setText("   Cough Syrup");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbSyrup, gridBagConstraints);

        cbParacetamol.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbParacetamol.setForeground(new java.awt.Color(0, 0, 0));
        cbParacetamol.setText("Paracetamol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbParacetamol, gridBagConstraints);

        cbIbuprofen.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbIbuprofen.setForeground(new java.awt.Color(0, 0, 0));
        cbIbuprofen.setText("Ibuprofen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbIbuprofen, gridBagConstraints);

        cbOmeprazole.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbOmeprazole.setForeground(new java.awt.Color(0, 0, 0));
        cbOmeprazole.setText("Omeprazole");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbOmeprazole, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/ANTACID-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel2, gridBagConstraints);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/PAINRALIEF-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel8, gridBagConstraints);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/HEADACHERELIEF-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel9, gridBagConstraints);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/THERAFKU-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel10, gridBagConstraints);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspraktikum3/COUGHDROUPS-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(jLabel11, gridBagConstraints);

        cbTheraflu.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbTheraflu.setForeground(new java.awt.Color(0, 0, 0));
        cbTheraflu.setText("Theraflu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbTheraflu, gridBagConstraints);

        cbRelief.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbRelief.setForeground(new java.awt.Color(0, 0, 0));
        cbRelief.setText("Headache Relief");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbRelief, gridBagConstraints);

        cbPain.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbPain.setForeground(new java.awt.Color(0, 0, 0));
        cbPain.setText("PainReliefCream");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbPain, gridBagConstraints);

        cbAntasida.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbAntasida.setForeground(new java.awt.Color(0, 0, 0));
        cbAntasida.setText("Antasida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbAntasida, gridBagConstraints);

        cbDrops.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbDrops.setForeground(new java.awt.Color(0, 0, 0));
        cbDrops.setText("CoughDrops");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel6.add(cbDrops, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Jumlah :");

        tfJumlah.setBackground(new java.awt.Color(0, 153, 51));
        tfJumlah.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfJumlah.setForeground(new java.awt.Color(255, 255, 255));
        tfJumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJumlahActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total  :");

        btnTotal.setBackground(new java.awt.Color(255, 51, 51));
        btnTotal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnTotal.setText("total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        tfBayar.setBackground(new java.awt.Color(0, 153, 51));
        tfBayar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfBayar.setForeground(new java.awt.Color(255, 255, 255));
        tfBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfKembalian.setBackground(new java.awt.Color(0, 153, 51));
        tfKembalian.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfKembalian.setForeground(new java.awt.Color(255, 255, 255));
        tfKembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfTotal.setBackground(new java.awt.Color(0, 153, 51));
        tfTotal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfTotal.setForeground(new java.awt.Color(255, 255, 255));
        tfTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Bayar :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Kembalian :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Pembayaran Obat");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBayar)
                            .addComponent(tfKembalian)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotal)
                            .addComponent(tfJumlah))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel18)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahActionPerformed

    
    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
    int totalHarga = 0;
    int jumlah = 0;

    if (tfJumlah.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Mohon isi jumlah yang ingin dibeli.");
        return;
    }

    try {
        jumlah = Integer.parseInt(tfJumlah.getText());

        if (cbSyrup.isSelected()) {
            totalHarga += 16000 * jumlah;
        }
        if (cbParacetamol.isSelected()) {
            totalHarga += 5000 * jumlah;
        }
        if (cbIbuprofen.isSelected()) {
            totalHarga += 5000 * jumlah;
        }
        if (cbPseudoephedrine.isSelected()) {
            totalHarga += 12000 * jumlah;
        }
        if (cbOmeprazole.isSelected()) {
            totalHarga += 30000 * jumlah;
        }
        if (cbAntasida.isSelected()) {
            totalHarga += 20000 * jumlah;
        }
        if (cbDrops.isSelected()) {
            totalHarga += 18000 * jumlah;
        }
        if (cbRelief.isSelected()) {
            totalHarga += 7000 * jumlah;
        }
        if (cbPain.isSelected()) {
            totalHarga += 18000 * jumlah;
        }
        if (cbTheraflu.isSelected()) {
            totalHarga += 17000 * jumlah;
        }

        tfTotal.setText("" + totalHarga);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Mohon masukkan jumlah yang valid (angka).");
    } 


    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnKepalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKepalaActionPerformed
     String detailObat = "Paracetamol: \nHarga: 5.000\nDeskripsi: Mengurangi nyeri kepala dan demam\nDosis: 500 mg hingga 1000 mg setiap 4-6 jam sesuai kebutuhan\n\n"
               + "Headache Relief: \nHarga: 7.000\nDeskripsi: Obat untuk meredakan sakit kepala\nDosis:500 mg hingga 1000 mg setiap 4-6 jam, sesuai kebutuhan. Dosis maksimal per hari adalah 4000 mg.";
    
        JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnKepalaActionPerformed

    private void btnBatukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatukActionPerformed
    String detailObat = "Cough Syrup: \nHarga: 16.000\nDeskripsi: Digunakan untuk meredakan batuk kering\nDosis: 10-20 ml setiap 4-6 jam, tidak lebih dari 4 dosis per hari\n\n"
               + "Cough Drops: \nHarga: 8.000\nDeskripsi: Mengurangi iritasi tenggorokan dan batuk\nDosis:1 tablet hisap setiap 2 hingga 3 jam, atau sesuai dengan petunjuk pada kemasan atau saran dokter.";
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBatukActionPerformed

    private void btnLambungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLambungActionPerformed
    String detailObat = "Omeprazole: \nHarga: 30.000\nDeskripsi: Mengatasi asam lambung, GERD, dan tukak lambung\nDosis: 20-40 mg sekali sehari\n\n"
               + "Antasida: \nHarga: 20.000\nDeskripsi: Mengatasi asam lambung berlebih, dan gangguan pencernaan\nDosis: 1-2 tablet saat gejala muncul";
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnLambungActionPerformed

    private void btnNyeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyeriActionPerformed
    String detailObat = "Ibuprofen: \nHarga: 5.000\nDeskripsi: Obat antiinflamasi untuk mengatasi nyeri dan peradangan\nDosis: 200 mg hingga 400 mg setiap 4-6 jam sesuai kebutuhan. Dosis maksimal per hari adalah 1200 mg (tanpa resep dokter).\n\n"
               + "Pain Relief Cream: \nHarga: 18.000\nDeskripsi: Krim untuk mengurangi nyeri otot dan sendi\nDosis:Oleskan krim dengan kandungan menthol 1% hingga 5% sesuai petunjuk pada kemasan, biasanya 3-4 kali sehari.";
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnNyeriActionPerformed

    private void btnFluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFluActionPerformed
    String detailObat = "cbTheraflu: \nHarga: 17.000\nDeskripsi: Meredakan hidung tersumbat akibat flu.\nDosis:  60 mg setiap 4-6 jam (maksimal 240 mg per hari).\n\n"
               + "Pseudoephedrine: \nHarga: 12.000\nDeskripsi: Membantu meredakan gejala flu dan pilek.\nDosis:60 mg setiap 4-6 jam (maksimal 240 mg per hari).";
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnFluActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfBayar.setText("");
        tfJumlah.setText("");
        tfKembalian.setText("");
        tfTotal.setText("");
        cbAntasida.setSelected(false);
        cbDrops.setSelected(false);
        cbIbuprofen.setSelected(false);
        cbOmeprazole.setSelected(false);
        cbPain.setSelected(false);
        cbParacetamol.setSelected(false);
        cbPseudoephedrine.setSelected(false);
        cbRelief.setSelected(false);
        cbSyrup.setSelected(false);
        cbTheraflu.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

   
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
            java.util.logging.Logger.getLogger(apotekdio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apotekdio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apotekdio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apotekdio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apotekdio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatuk;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFlu;
    private javax.swing.JButton btnKepala;
    private javax.swing.JButton btnLambung;
    private javax.swing.JButton btnNyeri;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox cbAntasida;
    private javax.swing.JCheckBox cbDrops;
    private javax.swing.JCheckBox cbIbuprofen;
    private javax.swing.JCheckBox cbOmeprazole;
    private javax.swing.JCheckBox cbPain;
    private javax.swing.JCheckBox cbParacetamol;
    private javax.swing.JCheckBox cbPseudoephedrine;
    private javax.swing.JCheckBox cbRelief;
    private javax.swing.JCheckBox cbSyrup;
    private javax.swing.JCheckBox cbTheraflu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
