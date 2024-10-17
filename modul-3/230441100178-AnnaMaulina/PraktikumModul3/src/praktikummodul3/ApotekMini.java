/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikummodul3;

import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author annam
 */
public class ApotekMini extends javax.swing.JFrame {

    private Map<String, String> detailObat;
    private Map<String, String> imagePaths; 
    private Map<String, Double> hargaObat;
    private String selectedMedicineName;
    
    /**
     * Creates new form ApotekMini
     */
    public ApotekMini() {
        initComponents();
        dataObat();
        addMedicineButtonListeners(); 
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gejala = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panadol = new javax.swing.JButton();
        bodrex = new javax.swing.JButton();
        vicks = new javax.swing.JButton();
        tussigon = new javax.swing.JButton();
        theraflu = new javax.swing.JButton();
        promag = new javax.swing.JButton();
        omez = new javax.swing.JButton();
        imodium = new javax.swing.JButton();
        zyrtec = new javax.swing.JButton();
        claritin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(214, 192, 179));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Apotek Mini");

        jLabel2.setText("Jl. Mawar No. 3 Kec. Kayu Kab. Daun");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(228, 224, 225));

        jLabel3.setText("Gejala :");

        gejala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih gejala", "Sakit Kepala", "Batuk", "Demam", "Sakit Perut", "Alergi" }));
        gejala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gejalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(gejala, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gejala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(228, 224, 225));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 20));

        jButton14.setText("Reset");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton16.setText("Beli");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(228, 224, 225));
        jPanel3.setPreferredSize(new java.awt.Dimension(197, 220));
        jPanel3.setLayout(new java.awt.GridLayout(5, 2));

        panadol.setText("Panadol");
        panadol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panadolActionPerformed(evt);
            }
        });
        jPanel3.add(panadol);

        bodrex.setText("Bodrex");
        jPanel3.add(bodrex);

        vicks.setText("Vicks");
        jPanel3.add(vicks);

        tussigon.setText("Tussigon");
        jPanel3.add(tussigon);

        theraflu.setText("Theraflu");
        jPanel3.add(theraflu);

        promag.setText("Promag");
        jPanel3.add(promag);

        omez.setText("Omez");
        jPanel3.add(omez);

        imodium.setText("Imodium");
        imodium.setPreferredSize(new java.awt.Dimension(79, 70));
        jPanel3.add(imodium);

        zyrtec.setText("Zyrtec");
        jPanel3.add(zyrtec);

        claritin.setText("Claritin");
        jPanel3.add(claritin);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(228, 224, 225));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0};
        jPanel4Layout.rowHeights = new int[] {0, 41, 0, 41, 0};
        jPanel4.setLayout(jPanel4Layout);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText(" Solusi Kesehatan Anda!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        jPanel4.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel4.add(jLabel8, gridBagConstraints);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataObat() {
        detailObat = new HashMap<>();
        detailObat.put("Panadol", "Detail obat Panadol: Digunakan untuk meredakan sakit kepala.");
        detailObat.put("Bodrex", "Detail obat Bodrex: Efektif untuk sakit kepala.");
        detailObat.put("Vicks", "Detail obat Vicks: Mengurangi gejala batuk.");
        detailObat.put("Tussigon", "Detail obat Tussigon: Untuk mengatasi batuk kering.");
        detailObat.put("Theraflu", "Detail obat Theraflu: Meredakan flu dan demam.");
        detailObat.put("Promag", "Detail obat Promag: Untuk mengatasi sakit perut.");
        detailObat.put("Omez", "Detail obat Omez: Mengatasi masalah sakit perut.");
        detailObat.put("Imodium", "Detail obat Imodium: Untuk diare, dan sakit perut.");
        detailObat.put("Zyrtec", "Detail obat Zyrtec: Mengatasi alergi.");
        detailObat.put("Claritin", "Detail obat Claritin: Efektif untuk alergi musiman.");

        imagePaths = new HashMap<>();
        imagePaths.put("Panadol", "panadol.jpg");
        imagePaths.put("Bodrex", "bodrex.png");
        imagePaths.put("Vicks", "vicks.png");
        imagePaths.put("Tussigon", "tussigon.jpg");
        imagePaths.put("Theraflu", "theraflu.jpg");
        imagePaths.put("Promag", "promag.png");
        imagePaths.put("Omez", "omez.png");
        imagePaths.put("Imodium", "imodium.png");
        imagePaths.put("Zyrtec", "zyrtec.jpg");
        imagePaths.put("Claritin", "claritin.jpg");
        
        hargaObat = new HashMap<>();
        hargaObat.put("Panadol", 15000.0);
        hargaObat.put("Bodrex", 12000.0);
        hargaObat.put("Vicks", 10000.0);
        hargaObat.put("Tussigon", 20000.0);
        hargaObat.put("Theraflu", 25000.0);
        hargaObat.put("Promag", 18000.0);
        hargaObat.put("Omez", 22000.0);
        hargaObat.put("Imodium", 25000.0);
        hargaObat.put("Zyrtec", 30000.0);
        hargaObat.put("Claritin", 35000.0);
    }
    
    private void addMedicineButtonListeners() {
        ActionListener medicineButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buttonText = ((JButton) e.getSource()).getText();
                selectedMedicineName = buttonText;
                String detail = detailObat.get(buttonText);
                String imagePath = imagePaths.get(buttonText);
                String gejalaYgDipilih = (String) gejala.getSelectedItem();

                boolean valid = false;
                switch (gejalaYgDipilih) {
                    case "Sakit Kepala":
                        valid = buttonText.equals("Panadol") || buttonText.equals("Bodrex");
                        break;
                    case "Batuk":
                        valid = buttonText.equals("Vicks") || buttonText.equals("Tussigon");
                        break;
                    case "Demam":
                        valid = buttonText.equals("Theraflu");
                        break;
                    case "Sakit Perut":
                        valid = buttonText.equals("Promag") || buttonText.equals("Omez") 
                                || buttonText.equals("Imodium");
                        break;
                    case "Alergi":
                        valid = buttonText.equals("Zyrtec") || buttonText.equals("Claritin");
                        break;
                }

                if (valid) {
                    jLabel7.setText("");
                    jLabel7.setIcon(new ImageIcon(getClass().getResource("/praktikummodul3/" 
                            + imagePath)));
                    jLabel8.setText(detail);
                } else {
                    JOptionPane.showMessageDialog(ApotekMini.this, "Obat tidak sesuai "
                            + "untuk gejala yang dipilih.","Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        };

        panadol.addActionListener(medicineButtonListener);
        bodrex.addActionListener(medicineButtonListener); 
        vicks.addActionListener(medicineButtonListener); 
        tussigon.addActionListener(medicineButtonListener); 
        theraflu.addActionListener(medicineButtonListener); 
        promag.addActionListener(medicineButtonListener); 
        omez.addActionListener(medicineButtonListener); 
        imodium.addActionListener(medicineButtonListener); 
        zyrtec.addActionListener(medicineButtonListener); 
        claritin.addActionListener(medicineButtonListener); 
    }
    
    private void gejalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gejalaActionPerformed
        // TODO add your handling code here:
        String gejalaYgDipilih = (String) gejala.getSelectedItem();
        if (gejalaYgDipilih.equals("Sakit Kepala")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih obat Panadol atau Bodrex");
        } else if (gejalaYgDipilih.equals("Batuk")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih obat Vicks atau Tussigon");
        } else if (gejalaYgDipilih.equals("Demam")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih obat Theraflu");
        } else if (gejalaYgDipilih.equals("Sakit Perut")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih obat Promag, Omez, atau Imodium");
        } else if (gejalaYgDipilih.equals("Alergi")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih obat Zyrtec atau Claritin");
        }
    }//GEN-LAST:event_gejalaActionPerformed

    private void panadolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panadolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panadolActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
// TODO add your handling code here:
        String gejalaYgDipilih = (String) gejala.getSelectedItem();
        if (gejalaYgDipilih.equals("Pilih gejala")) {
            JOptionPane.showMessageDialog(ApotekMini.this, 
                "Silakan pilih gejala terlebih dahulu.", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
        } else if (jLabel8.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ApotekMini.this, 
                "Silakan pilih obat terlebih dahulu.", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
        } else {
            Double harga = hargaObat.get(selectedMedicineName);
            JOptionPane.showMessageDialog(ApotekMini.this, 
                "Anda telah membeli " + selectedMedicineName + " dengan harga Rp " 
                + harga + "!","Pembelian Sukses", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        gejala.setSelectedIndex(0); 
        jLabel8.setText(""); 
        jLabel7.setIcon(null); 
        selectedMedicineName = null; 
        jLabel7.setText("Solusi Kesehatan Anda!!");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Keluar Program", 
        "Keluar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ApotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApotekMini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bodrex;
    private javax.swing.JButton claritin;
    private javax.swing.JComboBox<String> gejala;
    private javax.swing.JButton imodium;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton omez;
    private javax.swing.JButton panadol;
    private javax.swing.JButton promag;
    private javax.swing.JButton theraflu;
    private javax.swing.JButton tussigon;
    private javax.swing.JButton vicks;
    private javax.swing.JButton zyrtec;
    // End of variables declaration//GEN-END:variables
}
