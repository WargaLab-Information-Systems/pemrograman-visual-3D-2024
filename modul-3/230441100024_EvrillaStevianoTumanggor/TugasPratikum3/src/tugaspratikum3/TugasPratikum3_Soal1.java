/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspratikum3;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author evril
 */
public class TugasPratikum3_Soal1 extends javax.swing.JFrame {
    private int jumlah = 0;

    /**
     * Creates new form TugasPratikum3_Soal1
     */
    public TugasPratikum3_Soal1() {
        initComponents();
        jumlahobat.setText(String.valueOf(jumlah));
    }
    
    private void showDetail(String namaObat) {
        String detail = "";
        ImageIcon icon = null;
        switch (namaObat) {
            case "IbuProfen":
                detail = "Ibuprofen adalah obat untuk meredakan nyeri dan peradangan.";
                 icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/ibuprofen.png"));
                break;
            case "Oseltamivir":
                detail = "Oseltammivir adalah obat resep yang digunakan untuk mengobati flu (influenza).";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/oseltamivir_flu.png"));
                break;
            case "Antangin":
                detail = "Antangin membantu untuk gejala masuk angin.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/antangin_masuk angin.jpg"));
                break;
            case "Panadol":
                detail = "Panadol digunakan untuk meringankan rasa sakit pada sakit kepala, sakit gigi.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Panadol_Migrain.jpg"));
                break;
            case "Feminax":
                detail = "Feminanx digunakan untuk mengurangi rasa sakit pada waktu haid (dismenorea).";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Feminax_Haid.jpg"));
                break;
            case "Paramex":
                detail = "Paramex digunakan untuk meringankan sakit kepala.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/paramex_pusing.jpg"));
                break;
            case "Inhaler":
                detail = "Inhaler adalah alat genggam kecil yang menyalurkan obat langsung ke paru-paru Anda.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/inhaler_asma.jpg"));
                break;
            case "Alleron":
                detail = "Alleron digunakan untuk membantu mengatasi gejala alergi, seperti bersin, ruam kulit, hidung tersumbat, dan gatal.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/alleron_alergi.jpg"));
                break;
            case "Promag":
                detail = "Promag digunakan untuk mengurangi gejala-gejala yang berhubungan dengan kelebihan asam lambung, gastritis, tukak lambung.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/promag_maag.jpg"));
                break;
            case "Betadine":
                detail = "Betadine untuk mencegah pertumbuhan dan membunuh kuman penyebab infeksi.";
                icon = new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Betadine_.jpg"));
                break;
            default:
                detail = "Detail tidak tersedia untuk obat ini.";
        }
        javax.swing.JOptionPane.showMessageDialog(this, detail, "Informasi Obat", javax.swing.JOptionPane.INFORMATION_MESSAGE,icon);
    }
    
    private void showGejala(String namaObat) {
    String gejala = "";
    switch (namaObat) {
        case "IbuProfen":
            gejala = "Mual, Sakit kepala, Lelah";
            break;
        case "Oseltamivir":
            gejala = "Batuk, Demam, Kelelahan";
            break;
        case "Antangin":
            gejala = "Masuk angin, Kembung, Meriang";
            break;
        case "Panadol":
            gejala = "Sakit kepala, Demam, Nyeri ringan";
            break;
        case "Feminax":
            gejala = "Nyeri haid, Kram perut";
            break;
        case "Paramex":
            gejala = "Sakit kepala, Migrain";
            break;
        case "Inhaler":
            gejala = "Sesak nafas, Rasa berat di dada";
            break;
        case "Alleron":
            gejala = "Alergi makanan, Biduran";
            break;
        case "Promag":
            gejala = "Sakit maag, Asam lambung, Mual";
            break;
        case "Betadine":
            gejala = "Luka Kecil, Luka Bakar, Infeksi Kulit";
            break;
        default:
            gejala = "Gejala tidak tersedia untuk obat ini.";
    }
    penyakit.setText(gejala);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panelatas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panelbawah = new javax.swing.JPanel();
        btnreset = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        Paneltengah = new javax.swing.JPanel();
        btnibuprofen = new javax.swing.JButton();
        btnoseltamivir = new javax.swing.JButton();
        btnparamex = new javax.swing.JButton();
        btnantangin = new javax.swing.JButton();
        btnalleron = new javax.swing.JButton();
        btninhaler = new javax.swing.JButton();
        btnpromag = new javax.swing.JButton();
        btnbetadine = new javax.swing.JButton();
        btnpanadol = new javax.swing.JButton();
        btnfeminax = new javax.swing.JButton();
        promag = new javax.swing.JRadioButton();
        aleron = new javax.swing.JRadioButton();
        inhaler = new javax.swing.JRadioButton();
        paramex = new javax.swing.JRadioButton();
        betadine = new javax.swing.JRadioButton();
        ibuprofen = new javax.swing.JRadioButton();
        oseltamivir = new javax.swing.JRadioButton();
        antangin = new javax.swing.JRadioButton();
        panadol = new javax.swing.JRadioButton();
        feminax = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pengurangan = new javax.swing.JButton();
        jumlahobat = new javax.swing.JTextField();
        Penjumlahan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        namaobat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        penyakit = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 505));
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        Panelatas.setBackground(new java.awt.Color(255, 255, 255));
        Panelatas.setPreferredSize(new java.awt.Dimension(50, 100));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("APOTEK MINI NGAWI UTARA");
        Panelatas.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Apotek hd.jpg"))); // NOI18N
        Panelatas.add(jLabel2);

        getContentPane().add(Panelatas, java.awt.BorderLayout.PAGE_START);

        Panelbawah.setLayout(new java.awt.GridLayout(1, 0));

        btnreset.setBackground(new java.awt.Color(51, 51, 51));
        btnreset.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        Panelbawah.add(btnreset);

        btnbatal.setBackground(new java.awt.Color(51, 51, 51));
        btnbatal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnbatal.setForeground(new java.awt.Color(255, 255, 255));
        btnbatal.setText("BATAL BEROBAT");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        Panelbawah.add(btnbatal);

        getContentPane().add(Panelbawah, java.awt.BorderLayout.PAGE_END);

        Paneltengah.setBackground(new java.awt.Color(204, 204, 204));
        Paneltengah.setPreferredSize(new java.awt.Dimension(440, 222));
        Paneltengah.setLayout(new java.awt.GridBagLayout());

        btnibuprofen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/ibuprofen.png"))); // NOI18N
        btnibuprofen.setMaximumSize(new java.awt.Dimension(106, 107));
        btnibuprofen.setMinimumSize(new java.awt.Dimension(106, 107));
        btnibuprofen.setPreferredSize(new java.awt.Dimension(106, 107));
        btnibuprofen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnibuprofenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnibuprofen, gridBagConstraints);

        btnoseltamivir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/oseltamivir_flu.png"))); // NOI18N
        btnoseltamivir.setMaximumSize(new java.awt.Dimension(106, 107));
        btnoseltamivir.setMinimumSize(new java.awt.Dimension(106, 107));
        btnoseltamivir.setPreferredSize(new java.awt.Dimension(106, 107));
        btnoseltamivir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoseltamivirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnoseltamivir, gridBagConstraints);

        btnparamex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/paramex_pusing.jpg"))); // NOI18N
        btnparamex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparamexActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnparamex, gridBagConstraints);

        btnantangin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/antangin_masuk angin.jpg"))); // NOI18N
        btnantangin.setMaximumSize(new java.awt.Dimension(106, 107));
        btnantangin.setMinimumSize(new java.awt.Dimension(106, 107));
        btnantangin.setPreferredSize(new java.awt.Dimension(106, 107));
        btnantangin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnantanginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnantangin, gridBagConstraints);

        btnalleron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/alleron_alergi.jpg"))); // NOI18N
        btnalleron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalleronActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnalleron, gridBagConstraints);

        btninhaler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/inhaler_asma.jpg"))); // NOI18N
        btninhaler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninhalerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btninhaler, gridBagConstraints);

        btnpromag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/promag_maag.jpg"))); // NOI18N
        btnpromag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpromagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnpromag, gridBagConstraints);

        btnbetadine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Betadine_.jpg"))); // NOI18N
        btnbetadine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbetadineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnbetadine, gridBagConstraints);

        btnpanadol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Panadol_Migrain.jpg"))); // NOI18N
        btnpanadol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpanadolActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnpanadol, gridBagConstraints);

        btnfeminax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugaspratikum3/Feminax_Haid.jpg"))); // NOI18N
        btnfeminax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfeminaxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(btnfeminax, gridBagConstraints);

        buttonGroup1.add(promag);
        promag.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        promag.setText("Klik");
        promag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(promag, gridBagConstraints);

        buttonGroup1.add(aleron);
        aleron.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        aleron.setText("Klik");
        aleron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleronActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(aleron, gridBagConstraints);

        buttonGroup1.add(inhaler);
        inhaler.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        inhaler.setText("Klik");
        inhaler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inhalerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(inhaler, gridBagConstraints);

        buttonGroup1.add(paramex);
        paramex.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        paramex.setText("Klik");
        paramex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paramexActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(paramex, gridBagConstraints);

        buttonGroup1.add(betadine);
        betadine.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        betadine.setText("Klik");
        betadine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betadineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(betadine, gridBagConstraints);

        buttonGroup1.add(ibuprofen);
        ibuprofen.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ibuprofen.setText("Klik");
        ibuprofen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibuprofenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(ibuprofen, gridBagConstraints);

        buttonGroup1.add(oseltamivir);
        oseltamivir.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        oseltamivir.setText("Klik");
        oseltamivir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oseltamivirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(oseltamivir, gridBagConstraints);

        buttonGroup1.add(antangin);
        antangin.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        antangin.setText("Klik");
        antangin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antanginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(antangin, gridBagConstraints);

        buttonGroup1.add(panadol);
        panadol.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        panadol.setText("Klik");
        panadol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panadolActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(panadol, gridBagConstraints);

        buttonGroup1.add(feminax);
        feminax.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        feminax.setText("Klik");
        feminax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feminaxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 15;
        Paneltengah.add(feminax, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penghitungan Obat dan Gejala");

        Pengurangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Pengurangan.setText("-");
        Pengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenguranganActionPerformed(evt);
            }
        });

        jumlahobat.setEditable(false);
        jumlahobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahobatActionPerformed(evt);
            }
        });

        Penjumlahan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Penjumlahan.setText("+");
        Penjumlahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjumlahanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Obat :");

        namaobat.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penyakit :");

        penyakit.setEditable(false);

        btnsimpan.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnsimpan.setText("Show");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsimpan)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaobat)
                            .addComponent(penyakit)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Pengurangan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlahobat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Penjumlahan)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pengurangan)
                    .addComponent(jumlahobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Penjumlahan))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsimpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        Paneltengah.add(jPanel2, gridBagConstraints);

        getContentPane().add(Paneltengah, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        jumlahobat.setText("0");
        namaobat.setText("");
        penyakit.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Apakah anda ingin Keluar?, jika batal tekan YES dan jika lanjut tekan NO",
                "Informasi!", JOptionPane.YES_NO_OPTION);
        
        if (result == JOptionPane.YES_OPTION){
         System.exit(0);   
        }
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String namaObat = namaobat.getText();
        String gejala = penyakit.getText();
        int jumlahObat = jumlah;
        
        if (namaObat.isEmpty() || gejala.isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih obat terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else if (jumlahObat <= 0 ){
            JOptionPane.showMessageDialog(null, "Dimohon untuk memasukkan jumlah obat", "Informasi", JOptionPane.WARNING_MESSAGE);
        }else{
            String struk = "Struk Pengambilan obat\n" +
                       "---------------------\n" +
                       "Nama Obat : " + namaObat + "\n" +
                       "Penyakit : " + gejala + "\n" +
                       "Jumlah obat : " + jumlahObat + "\n" +
                       "---------------------\n" +
                       "Terima Kasih telah Mampir ke Apotek mini Kami";
        JOptionPane.showMessageDialog(null, struk, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void PenguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenguranganActionPerformed
        // TODO add your handling code here:
        if (jumlah > 0) {
            jumlah--; 
            jumlahobat.setText(String.valueOf(jumlah)); 
        }else{
            JOptionPane.showMessageDialog(this, "jumlah tidak boleh kurang 0", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PenguranganActionPerformed

    private void PenjumlahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjumlahanActionPerformed
        // TODO add your handling code here:
        
        jumlah++;
        
        jumlahobat.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_PenjumlahanActionPerformed

    private void jumlahobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahobatActionPerformed

    private void btnibuprofenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnibuprofenActionPerformed
        // TODO add your handling code here:
        showDetail("IbuProfen");
    }//GEN-LAST:event_btnibuprofenActionPerformed

    private void btnoseltamivirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoseltamivirActionPerformed
        // TODO add your handling code here:
        showDetail("Oseltamivir");
    }//GEN-LAST:event_btnoseltamivirActionPerformed

    private void btnantanginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnantanginActionPerformed
        // TODO add your handling code here:
        showDetail("Antangin");
    }//GEN-LAST:event_btnantanginActionPerformed

    private void btnpanadolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpanadolActionPerformed
        // TODO add your handling code here:
        showDetail("Panadol");
    }//GEN-LAST:event_btnpanadolActionPerformed

    private void btnfeminaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfeminaxActionPerformed
        // TODO add your handling code here:
        showDetail("Feminax");
    }//GEN-LAST:event_btnfeminaxActionPerformed

    private void btnparamexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparamexActionPerformed
        // TODO add your handling code here:
        showDetail("Paramex");
    }//GEN-LAST:event_btnparamexActionPerformed

    private void btninhalerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninhalerActionPerformed
        // TODO add your handling code here:
        showDetail("Inhaler");
    }//GEN-LAST:event_btninhalerActionPerformed

    private void btnalleronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalleronActionPerformed
        // TODO add your handling code here:
        showDetail("Alleron");
    }//GEN-LAST:event_btnalleronActionPerformed

    private void btnpromagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpromagActionPerformed
        // TODO add your handling code here:
        showDetail("Promag");
    }//GEN-LAST:event_btnpromagActionPerformed

    private void btnbetadineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbetadineActionPerformed
        // TODO add your handling code here:
        showDetail("Betadine");
    }//GEN-LAST:event_btnbetadineActionPerformed

    private void ibuprofenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibuprofenActionPerformed
        // TODO add your handling code here:
        namaobat.setText("IbuProfen");
        showGejala("IbuProfen");
    }//GEN-LAST:event_ibuprofenActionPerformed

    private void oseltamivirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oseltamivirActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Oseltamivir");
        showGejala("Oseltamivir");
    }//GEN-LAST:event_oseltamivirActionPerformed

    private void antanginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antanginActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Antangin");
        showGejala("Antangin");
    }//GEN-LAST:event_antanginActionPerformed

    private void panadolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panadolActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Panadol");
        showGejala("Panadol");
    }//GEN-LAST:event_panadolActionPerformed

    private void feminaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feminaxActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Feminax");
        showGejala("Feminax");
    }//GEN-LAST:event_feminaxActionPerformed

    private void paramexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paramexActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Paramex");
        showGejala("Paramex");
    }//GEN-LAST:event_paramexActionPerformed

    private void inhalerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inhalerActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Inhaler");
        showGejala("Inhaler");
    }//GEN-LAST:event_inhalerActionPerformed

    private void aleronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleronActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Alleron");
        showGejala("Alleron");
    }//GEN-LAST:event_aleronActionPerformed

    private void promagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promagActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Promag");
        showGejala("Promag");
    }//GEN-LAST:event_promagActionPerformed

    private void betadineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betadineActionPerformed
        // TODO add your handling code here:
        namaobat.setText("Betadine");
        showGejala("Betadine");
    }//GEN-LAST:event_betadineActionPerformed

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
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasPratikum3_Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasPratikum3_Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelatas;
    private javax.swing.JPanel Panelbawah;
    private javax.swing.JPanel Paneltengah;
    private javax.swing.JButton Pengurangan;
    private javax.swing.JButton Penjumlahan;
    private javax.swing.JRadioButton aleron;
    private javax.swing.JRadioButton antangin;
    private javax.swing.JRadioButton betadine;
    private javax.swing.JButton btnalleron;
    private javax.swing.JButton btnantangin;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnbetadine;
    private javax.swing.JButton btnfeminax;
    private javax.swing.JButton btnibuprofen;
    private javax.swing.JButton btninhaler;
    private javax.swing.JButton btnoseltamivir;
    private javax.swing.JButton btnpanadol;
    private javax.swing.JButton btnparamex;
    private javax.swing.JButton btnpromag;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton feminax;
    private javax.swing.JRadioButton ibuprofen;
    private javax.swing.JRadioButton inhaler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jumlahobat;
    private javax.swing.JTextField namaobat;
    private javax.swing.JRadioButton oseltamivir;
    private javax.swing.JRadioButton panadol;
    private javax.swing.JRadioButton paramex;
    private javax.swing.JTextField penyakit;
    private javax.swing.JRadioButton promag;
    // End of variables declaration//GEN-END:variables
}
