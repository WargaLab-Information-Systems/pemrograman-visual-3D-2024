/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;
import javax.swing.JOptionPane;

public class apotek extends javax.swing.JFrame {

    public apotek() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gejala = new javax.swing.JComboBox<>();
        check = new javax.swing.JButton();
        detail = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        obat1 = new javax.swing.JCheckBox();
        obat2 = new javax.swing.JCheckBox();
        obat3 = new javax.swing.JCheckBox();
        obat4 = new javax.swing.JCheckBox();
        obat5 = new javax.swing.JCheckBox();
        obat6 = new javax.swing.JCheckBox();
        obat7 = new javax.swing.JCheckBox();
        obat8 = new javax.swing.JCheckBox();
        obat9 = new javax.swing.JCheckBox();
        obat10 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(211, 11, 73));
        jLabel2.setText("Gejala :");
        jPanel3.add(jLabel2);

        gejala.setBackground(new java.awt.Color(255, 153, 153));
        gejala.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        gejala.setForeground(new java.awt.Color(211, 11, 73));
        gejala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "asam lambung", "demam", "sakit kepala", "sakit gigi", "nyeri otot", "sesak nafas", "nyeri haid", "pegal - pegal", "pneumonia", "kolesterol", "infeksi bakteri", "diare" }));
        gejala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gejalaActionPerformed(evt);
            }
        });
        jPanel3.add(gejala);

        check.setBackground(new java.awt.Color(255, 153, 153));
        check.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        check.setForeground(new java.awt.Color(211, 11, 73));
        check.setText("Check obat");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel3.add(check);

        detail.setBackground(new java.awt.Color(255, 153, 153));
        detail.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        detail.setForeground(new java.awt.Color(211, 11, 73));
        detail.setText("lihat detail");
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        jPanel3.add(detail);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\apotek2.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 89, 90));

        jLabel14.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Apotek Kamehameha-Heal");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Sembuhkan semua penyakit dengan jurus kamehameha");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 177, 177));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(211, 11, 73));
        jLabel19.setText("Nama Obat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        jPanel1.add(jLabel19, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(211, 11, 73));
        jLabel23.setText("Gambar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        jPanel1.add(jLabel23, gridBagConstraints);

        obat1.setBackground(new java.awt.Color(255, 177, 177));
        obat1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat1.setForeground(new java.awt.Color(211, 11, 73));
        obat1.setText("Ranitidine");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat1, gridBagConstraints);

        obat2.setBackground(new java.awt.Color(255, 177, 177));
        obat2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat2.setForeground(new java.awt.Color(211, 11, 73));
        obat2.setText("Paracetamol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat2, gridBagConstraints);

        obat3.setBackground(new java.awt.Color(255, 177, 177));
        obat3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat3.setForeground(new java.awt.Color(211, 11, 73));
        obat3.setText("Panadol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat3, gridBagConstraints);

        obat4.setBackground(new java.awt.Color(255, 177, 177));
        obat4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat4.setForeground(new java.awt.Color(211, 11, 73));
        obat4.setText("Neo napacin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat4, gridBagConstraints);

        obat5.setBackground(new java.awt.Color(255, 177, 177));
        obat5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat5.setForeground(new java.awt.Color(211, 11, 73));
        obat5.setText("Ibu profen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat5, gridBagConstraints);

        obat6.setBackground(new java.awt.Color(255, 177, 177));
        obat6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat6.setForeground(new java.awt.Color(211, 11, 73));
        obat6.setText("Azithromycin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat6, gridBagConstraints);

        obat7.setBackground(new java.awt.Color(255, 177, 177));
        obat7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat7.setForeground(new java.awt.Color(211, 11, 73));
        obat7.setText("Atorvastatin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat7, gridBagConstraints);

        obat8.setBackground(new java.awt.Color(255, 177, 177));
        obat8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat8.setForeground(new java.awt.Color(211, 11, 73));
        obat8.setText("Amoxcillin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat8, gridBagConstraints);

        obat9.setBackground(new java.awt.Color(255, 177, 177));
        obat9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat9.setForeground(new java.awt.Color(211, 11, 73));
        obat9.setText("Acetylcysteine");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat9, gridBagConstraints);

        obat10.setBackground(new java.awt.Color(255, 177, 177));
        obat10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        obat10.setForeground(new java.awt.Color(211, 11, 73));
        obat10.setText("Loperamide");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(obat10, gridBagConstraints);

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\ranitidine.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel25, gridBagConstraints);

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\paracetamol.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel26, gridBagConstraints);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\panadol.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel27, gridBagConstraints);

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\neonapacin.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel33, gridBagConstraints);

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\ibuprofen.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel34, gridBagConstraints);

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Azithromycin.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel35, gridBagConstraints);

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Atorvastatin.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel36, gridBagConstraints);

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\amoxcillin.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 8;
        jPanel1.add(jLabel37, gridBagConstraints);

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Acetylcysteine.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel38, gridBagConstraints);

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Loperamide1.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jLabel39, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
        // TODO add your handling code here:
        String selectedOptions = "";
        if (obat1.isSelected()) {
            selectedOptions += "Kamu memilih obat Ranitidine\n" + "Kegunaan : Menurunkan asam lambung dan mengobati tukak lambung serta GERD.";
        }
        if (obat2.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Paracetamol\n" + "Kegunaan : Menurunkan demam dan meriang.";
        }
        if (obat3.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Panadaol\n" + "Kegunaan : meredakan nyeri, seperti sakit kepala, sakit gigi, dan nyeri otot.";
        }
        if (obat4.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Neo napacin\n" + "Kegunaan : Untuk meringankan dan mengatasi penyakit asma bronchial.";
        }
        if (obat5.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Ibu profen\n" + "Kegunaan : untuk berbagai rasa sakit dan pegal pegal, termasuk nyeri punggung , nyeri haid , sakit gigi , dan gejala pilek , flu , atau virus corona (COVID-19) .";
        }
        if (obat6.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Azithromycin\n" + "Kegunaan : untuk infeksi dada seperti pneumonia. infeksi telinga, hidung, tenggorokan dan hidung seperti infeksi sinus (sinusitis)";
        }
        if (obat7.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Atorvastatin\n" + "Kegunaan : untuk mengobati kolesterol tinggi dan sebagai tambahan diet";
        }
        if (obat8.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Amoxicillin\n" + "Kegunaan : sebagai antibiotik yang digunakan dalam pengobatan berbagai infeksi bakteri";
        }
        if (obat9.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Acetylcysteine\n" + "Kegunaan : mengencerkan dahak pada beberapa kondisi, seperti batuk, asma, cystic fibrosis, atau PPOK.";
        }
        if (obat10.isSelected()) {
            selectedOptions += "\n\nKamu memilih obat Loperamide\n" + "Kegunaan : Mengobati diare akut dan kronis dengan memperlambat gerakan usus.";
        }
        if (selectedOptions.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih nama obat", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, selectedOptions, "Detail Obat", JOptionPane.INFORMATION_MESSAGE);
        }
        obat1.setSelected(false);
        obat2.setSelected(false);
        obat3.setSelected(false);
        obat4.setSelected(false);
        obat5.setSelected(false);
        obat6.setSelected(false);
        obat7.setSelected(false);
        obat8.setSelected(false);
        obat9.setSelected(false);
        obat10.setSelected(false);
    }//GEN-LAST:event_detailActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        String gjl = (String) gejala.getSelectedItem();
        String obat = "";
        
        if (gjl.equals("asam lambung")) {
            obat = "ranitidine";
        } else if (gjl.equals("demam")) {
            obat = "paracetamol";
        } else if (gjl.equals("sakit kepala")) {
            obat = "panadol";
        } else if (gjl.equals("sakit gigi")) {
            obat = "panadol";
        } else if (gjl.equals("nyeri otot")) {
            obat = "panadol";
        } else if (gjl.equals("sesak nafas")) {
            obat = "neo napacin";
        } else if (gjl.equals("nyeri haid")) {
            obat = "ibu profen";
        } else if (gjl.equals("pegal - pegal")) {
            obat = "ibu profen";
        } else if (gjl.equals("pneumonia")) {
            obat = "Azithromycin";
        } else if (gjl.equals("kolesterol")) {
            obat = "Atorvastatin";
        } else if (gjl.equals("infeksi bakteri")) {
            obat = "amoxicillin";
        } else if (gjl.equals("diare")) {
            obat = "Loperamide";
        } 
        JOptionPane.showMessageDialog(null, "Rekomendasi obat untuk gejala " + gjl + " adalah : " + obat, "Rekomendasi Obat", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_checkActionPerformed

    private void gejalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gejalaActionPerformed

    }//GEN-LAST:event_gejalaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JButton detail;
    private javax.swing.JComboBox<String> gejala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox obat1;
    private javax.swing.JCheckBox obat10;
    private javax.swing.JCheckBox obat2;
    private javax.swing.JCheckBox obat3;
    private javax.swing.JCheckBox obat4;
    private javax.swing.JCheckBox obat5;
    private javax.swing.JCheckBox obat6;
    private javax.swing.JCheckBox obat7;
    private javax.swing.JCheckBox obat8;
    private javax.swing.JCheckBox obat9;
    // End of variables declaration//GEN-END:variables
}
