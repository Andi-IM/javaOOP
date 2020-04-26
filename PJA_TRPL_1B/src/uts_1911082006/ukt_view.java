/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_1911082006;

import uts_1911082006.controller.ukt_controller;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Andi
 */
public class ukt_view extends javax.swing.JFrame {
    ButtonGroup group = new ButtonGroup();
    /**
     * Creates new form ukt_view
     */
    ukt_controller controller;
    public ukt_view() {
        initComponents();
        controller = new ukt_controller(this);
        controller.clear();
        controller.disable();
        controller.viewTable();
    }
    
     public JTable getTblMhs() {
        return tblMhs;
    }

    public JTextField getTxtJumlah() {
        return txtJumlah;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtNoBP() {
        return txtNoBP;
    }

    public JTextField getTxtTA() {
        return txtTA;
    }

    public JComboBox<String> getCbPembayaran() {
        return cbPembayaran;
    }

    public JComboBox<String> getComboJurusan() {
        return comboJurusan;
    }

    public JComboBox<String> getComboProdi() {
        return comboProdi;
    }

    public JRadioButton getRbGanjil() {
        return rbGanjil;
    }

    public JRadioButton getRbGenap() {
        return rbGenap;
    }

    public JButton getBtnBayar() {
        return btnBayar;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbNama = new javax.swing.JLabel();
        panelPembayaran = new javax.swing.JPanel();
        lbJenisPemb = new javax.swing.JLabel();
        cbPembayaran = new javax.swing.JComboBox<>();
        lbJumlah = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        lbRP = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        panelDataPribadi = new javax.swing.JPanel();
        lbNama2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lbNoBP = new javax.swing.JLabel();
        txtNoBP = new javax.swing.JTextField();
        lbJurusan = new javax.swing.JLabel();
        comboJurusan = new javax.swing.JComboBox<>();
        lbProdi = new javax.swing.JLabel();
        comboProdi = new javax.swing.JComboBox<>();
        lbSemester = new javax.swing.JLabel();
        rbGenap = new javax.swing.JRadioButton();
        rbGanjil = new javax.swing.JRadioButton();
        txtTA = new javax.swing.JTextField();
        lbTA = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbNama.setText("Nama");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pembayaran Uang Kuliah");
        setBackground(new java.awt.Color(170, 170, 170));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("Uang Kuliah App"); // NOI18N
        setSize(new java.awt.Dimension(15, 15));

        panelPembayaran.setBackground(new java.awt.Color(170, 170, 170));
        panelPembayaran.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pembayaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 11))); // NOI18N
        panelPembayaran.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N

        lbJenisPemb.setText("Jenis Pembayaran");

        cbPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih--", "Tunai", "Transfer Bank", "e-Wallet" }));
        cbPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPembayaranActionPerformed(evt);
            }
        });

        lbJumlah.setText("Jumlah");

        txtJumlah.setText("0");
        txtJumlah.setEnabled(false);
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        lbRP.setText("Rp.");

        btnBayar.setText("Bayar");
        btnBayar.setEnabled(false);
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPembayaranLayout = new javax.swing.GroupLayout(panelPembayaran);
        panelPembayaran.setLayout(panelPembayaranLayout);
        panelPembayaranLayout.setHorizontalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbJenisPemb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPembayaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addComponent(lbRP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBayar))
                    .addComponent(lbJumlah))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPembayaranLayout.setVerticalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJenisPemb)
                    .addComponent(lbJumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRP)
                    .addComponent(btnBayar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelDataPribadi.setBackground(new java.awt.Color(170, 170, 170));
        panelDataPribadi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pribadi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Constantia", 2, 12))); // NOI18N
        panelDataPribadi.setForeground(new java.awt.Color(94, 120, 108));

        lbNama2.setText("Nama");

        txtNama.setText("1911082006");

        lbNoBP.setText("No. BP");

        txtNoBP.setText("1911082006");

        lbJurusan.setText("Jurusan");

        comboJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih--", "Teknologi Informasi", "Teknik Mesin", "Teknik Sipil", "Teknik Elektro", "Administrasi Niaga", "Akuntansi", "Bahasa Inggris" }));
        comboJurusan.setAutoscrolls(true);
        comboJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJurusanActionPerformed(evt);
            }
        });

        lbProdi.setText("Prodi");

        comboProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih--" }));
        comboProdi.setAutoscrolls(true);
        comboProdi.setEnabled(false);

        lbSemester.setText("Semester");

        group.add(rbGenap);
        rbGenap.setText("Genap");
        rbGenap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGenapActionPerformed(evt);
            }
        });

        group.add(rbGanjil);
        rbGanjil.setText("Ganjil");

        txtTA.setText("2020/2021");

        lbTA.setText("Tahun Ajaran");

        javax.swing.GroupLayout panelDataPribadiLayout = new javax.swing.GroupLayout(panelDataPribadi);
        panelDataPribadi.setLayout(panelDataPribadiLayout);
        panelDataPribadiLayout.setHorizontalGroup(
            panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataPribadiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNama2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProdi)
                    .addComponent(comboProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJurusan)
                    .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataPribadiLayout.createSequentialGroup()
                        .addComponent(lbSemester)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDataPribadiLayout.createSequentialGroup()
                        .addComponent(rbGenap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbGanjil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96))
                    .addGroup(panelDataPribadiLayout.createSequentialGroup()
                        .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTA)
                            .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDataPribadiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNoBP)
                        .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(606, Short.MAX_VALUE)))
        );
        panelDataPribadiLayout.setVerticalGroup(
            panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPribadiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNama2)
                .addGap(0, 0, 0)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelDataPribadiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDataPribadiLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbGenap)
                            .addComponent(rbGanjil))
                        .addGap(18, 18, 18)
                        .addComponent(lbTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataPribadiLayout.createSequentialGroup()
                        .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJurusan)
                            .addComponent(lbSemester))
                        .addGap(3, 3, 3)
                        .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbProdi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(panelDataPribadiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDataPribadiLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lbNoBP)
                    .addGap(0, 0, 0)
                    .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(170, 170, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblMhs.setAutoCreateRowSorter(true);
        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Tahun Ajaran", "Semester", "Jurusan", "Prodi", "Jumlah"
            }
        ));
        tblMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblMhs.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jScrollPane2.setViewportView(tblMhs);
        if (tblMhs.getColumnModel().getColumnCount() > 0) {
            tblMhs.getColumnModel().getColumn(0).setResizable(false);
            tblMhs.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblMhs.getColumnModel().getColumn(1).setResizable(false);
            tblMhs.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblMhs.getColumnModel().getColumn(2).setResizable(false);
            tblMhs.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblMhs.getColumnModel().getColumn(3).setResizable(false);
            tblMhs.getColumnModel().getColumn(3).setPreferredWidth(250);
            tblMhs.getColumnModel().getColumn(4).setResizable(false);
            tblMhs.getColumnModel().getColumn(4).setPreferredWidth(250);
            tblMhs.getColumnModel().getColumn(5).setResizable(false);
            tblMhs.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDataPribadi, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDataPribadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addGap(2, 2, 2)
                .addComponent(panelPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPembayaranActionPerformed
        controller.bayarActionPerformed(evt);
    }//GEN-LAST:event_cbPembayaranActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        controller.jumlahActionPerformed(evt);
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        controller.btnBayarAction(evt);
    }//GEN-LAST:event_btnBayarActionPerformed

    private void comboJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJurusanActionPerformed
        int pilih;
        String TI[] = {"D4 Rekayasa Perangkat Lunak", "D3 Manajeman Informatika","D3 Teknik Komputer"};
        String M[] = {"D3 Teknik Mesin", "D3 Teknik Alat Berat", "D4 Teknik Manufaktur"};
        String E[] = {"D3 Teknik Listrik", "D3 Teknik Elektro", "D3 Teknik Telekomunikasi",
            "D4 Teknik Elektro", "D4 Teknik Telekomunikasi"};
        String S[] = {"D3 Teknik Sipil","D4 Perencanaan Irigasi Rawa",
            "D4 Manajemen Rekayasa Konsturksi", "D4 Perancangan Jalan dan Jembatan"};
        String AN[] = {"D3 Adm Bisnis", "D3 Usaha Perjalanan Wisata"};
        String AK[] = {"D3 Akuntansi", "D4 Akuntansi"};
        String BI[] = {"D3 Bahasa Inggris"};
        pilih = comboJurusan.getSelectedIndex();
        switch (pilih){
            case 0:
            comboProdi.setEnabled(false);
            comboProdi.removeAllItems();
            comboProdi.addItem("--pilih--");
            break;
            case 1:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < TI.length; i++) {
                comboProdi.addItem(TI[i]);
            }
            break;
            case 2:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < M.length; i++) {
                comboProdi.addItem(M[i]);
            }
            break;
            case 3:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < S.length; i++) {
                comboProdi.addItem(S[i]);
            }
            break;
            case 4:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < E.length; i++) {
                comboProdi.addItem(E[i]);
            }
            break;
            case 5:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < AN.length; i++) {
                comboProdi.addItem(AN[i]);
            }
            break;
            case 6:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < AK.length; i++) {
                comboProdi.addItem(AK[i]);
            }
            break;
            case 7:
            comboProdi.setEnabled(true);
            comboProdi.removeAllItems();
            for (int i = 0; i < BI.length; i++) {
                comboProdi.addItem(BI[i]);
            }
            break;
            default:
            JOptionPane.showMessageDialog(null, "Pilih Prodi");
            break;
        }

    }//GEN-LAST:event_comboJurusanActionPerformed

    private void rbGenapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGenapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGenapActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        if (txtNama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Input nama tidak boleh kosong!");
        } else
        if (txtNoBP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Input Nomor BP tidak boleh kosong!");
        } else
        if (comboJurusan.getSelectedItem() == "--pilih--") {
            JOptionPane.showMessageDialog(null, "Pilih Jurusan terlebih dahulu!");
        } else
        if (!rbGanjil.isSelected() && !rbGenap.isSelected()) {
            JOptionPane.showMessageDialog(null, "Pilih Semester terlebih dahulu!");
        } else
        if (txtTA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih Semester terlebih dahulu!");
        } else
        if (txtJumlah.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda harus membayar terlebih dahulu!");
        }
        else {
            controller.insert();
            controller.viewTable();
            controller.clear();
            controller.disable();

        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        controller.enable();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.update();
        controller.viewTable();
        controller.clear();
        controller.disable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.delete();
        controller.viewTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(ukt_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ukt_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ukt_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ukt_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ukt_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbPembayaran;
    private javax.swing.JComboBox<String> comboJurusan;
    private javax.swing.JComboBox<String> comboProdi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbJenisPemb;
    private javax.swing.JLabel lbJumlah;
    private javax.swing.JLabel lbJurusan;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNama2;
    private javax.swing.JLabel lbNoBP;
    private javax.swing.JLabel lbProdi;
    private javax.swing.JLabel lbRP;
    private javax.swing.JLabel lbSemester;
    private javax.swing.JLabel lbTA;
    private javax.swing.JPanel panelDataPribadi;
    private javax.swing.JPanel panelPembayaran;
    private javax.swing.JRadioButton rbGanjil;
    private javax.swing.JRadioButton rbGenap;
    private javax.swing.JTable tblMhs;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtTA;
    // End of variables declaration//GEN-END:variables
}
