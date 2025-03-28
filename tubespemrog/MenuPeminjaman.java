package tubespemrog;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MenuPeminjaman extends javax.swing.JFrame {

    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "ID", "Nama", "Ruangan", "Tanggal", "Waktu", "Jenis Kegiatan"
            });

    private String tgl;

    public MenuPeminjaman() {
        initComponents();
        tblRuangDipinjam.setModel(tableModel);
        setLocationRelativeTo(this);
        tampilkanData();

    }

//public void setAwalForm(){
//        nama.setText("");
//        nim.setText("");
//        prodi.setText("");
//        no_hp.setText("");
//        asal_peminjam.setText("");
//        ruangan.setText("");
//        tgl.setText(tanggal);
//        tgl.setDate(null);
//        tgl.setString("");
//        waktu.setText("");
//        jenis_kegiatan.setText("");
//        //kodeProduk.setEnabled(true);
//        btnSimpan.setEnabled(true);
//        btnUbah.setEnabled(false);
//        btnHapus.setEnabled(false);        
//    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        sqlDateModel1 = new org.jdatepicker.impl.SqlDateModel();
        jDatePickerUtil3 = new org.jdatepicker.util.JDatePickerUtil();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPeminjaman = new rojerusan.RSMaterialButtonRectangle();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnRuanganYangDipinjam = new rojerusan.RSMaterialButtonRectangle();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLaporan1 = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane2 = new javax.swing.JScrollPane();
        layerForm = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSimpan = new rojerusan.RSMaterialButtonRectangle();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        nim = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        prodi = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        no_hp = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        asal_peminjam = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        ruangan = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jenis_kegiatan = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        waktu = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();
        btnLihat = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRuangDipinjam = new javax.swing.JTable();
        btnUbah = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnReset = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 369));

        jPanel1.setBackground(new java.awt.Color(83, 194, 139));
        jPanel1.setMaximumSize(new java.awt.Dimension(606, 369));
        jPanel1.setMinimumSize(new java.awt.Dimension(606, 369));
        jPanel1.setPreferredSize(new java.awt.Dimension(606, 369));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 173, 119));
        jLabel1.setText("Peminjaman");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/peminjaman.png"))); // NOI18N

        btnPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        btnPeminjaman.setForeground(new java.awt.Color(29, 173, 119));
        btnPeminjaman.setText("Peminjaman");
        btnPeminjaman.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPeminjaman.setRippleColor(new java.awt.Color(29, 173, 119));
        btnPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeminjamanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(90, 120));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pengembalian.png"))); // NOI18N

        btnRuanganYangDipinjam.setBackground(new java.awt.Color(255, 255, 255));
        btnRuanganYangDipinjam.setForeground(new java.awt.Color(29, 173, 119));
        btnRuanganYangDipinjam.setText("Ruangan yang Dipinjam");
        btnRuanganYangDipinjam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRuanganYangDipinjam.setRippleColor(new java.awt.Color(29, 173, 119));
        btnRuanganYangDipinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuanganYangDipinjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnRuanganYangDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(btnRuanganYangDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/laporan.png"))); // NOI18N

        btnLaporan1.setBackground(new java.awt.Color(255, 255, 255));
        btnLaporan1.setForeground(new java.awt.Color(29, 173, 119));
        btnLaporan1.setText("Laporan");
        btnLaporan1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLaporan1.setRippleColor(new java.awt.Color(29, 173, 119));
        btnLaporan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLaporan1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaporan1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layerForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(29, 173, 119));
        jLabel8.setText("Form Peminjaman");

        btnSimpan.setBackground(new java.awt.Color(29, 173, 119));
        btnSimpan.setText("Simpan");
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setFocusCycleRoot(true);
        btnSimpan.setFocusTraversalPolicyProvider(true);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(29, 173, 119));
        jLabel9.setText("Nama");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(29, 173, 119));
        jLabel10.setText("NIM");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(29, 173, 119));
        jLabel11.setText("Prodi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(29, 173, 119));
        jLabel12.setText("No HP");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(29, 173, 119));
        jLabel13.setText("Asal Peminjam");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(29, 173, 119));
        jLabel14.setText("Ruangan");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(29, 173, 119));
        jLabel15.setText("Tanggal");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(29, 173, 119));
        jLabel16.setText("Waktu");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(29, 173, 119));
        jLabel17.setText("Jenis Kegiatan");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nama)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nim)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prodi)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prodi, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(no_hp)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(no_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(asal_peminjam)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(asal_peminjam, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruangan)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruangan, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jenis_kegiatan, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jenis_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 194, 139)));

        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(waktu)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tanggal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tanggalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        btnLihat.setBackground(new java.awt.Color(29, 173, 119));
        btnLihat.setText("Lihat Data");
        btnLihat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihat.setFocusCycleRoot(true);
        btnLihat.setFocusTraversalPolicyProvider(true);
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        tblRuangDipinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRuangDipinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRuangDipinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRuangDipinjam);

        btnUbah.setBackground(new java.awt.Color(29, 173, 119));
        btnUbah.setText("ubah");
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.setFocusCycleRoot(true);
        btnUbah.setFocusTraversalPolicyProvider(true);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(29, 173, 119));
        btnHapus.setText("hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setFocusCycleRoot(true);
        btnHapus.setFocusTraversalPolicyProvider(true);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(29, 173, 119));
        btnReset.setText("reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setFocusCycleRoot(true);
        btnReset.setFocusTraversalPolicyProvider(true);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layerFormLayout = new javax.swing.GroupLayout(layerForm);
        layerForm.setLayout(layerFormLayout);
        layerFormLayout.setHorizontalGroup(
            layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerFormLayout.createSequentialGroup()
                .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layerFormLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel8))
                    .addGroup(layerFormLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layerFormLayout.createSequentialGroup()
                                .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                            .addGroup(layerFormLayout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLihat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layerFormLayout.setVerticalGroup(
            layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerFormLayout.createSequentialGroup()
                .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layerFormLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layerFormLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(layerFormLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLihat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(layerForm);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void ruanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruanganActionPerformed

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String sql = "INSERT INTO peminjaman "
                    + "(nama,nim,prodi,no_hp,asal_peminjam,ruangan,tanggal,waktu,jenis_kegiatan)"
                    + " VALUES ("
                    + "'" + nama.getText() + "',"
                    + "'" + nim.getText() + "',"
                    + "'" + prodi.getText() + "',"
                    + "'" + no_hp.getText() + "',"
                    + "'" + asal_peminjam.getText() + "',"
                    + "'" + ruangan.getText() + "',"
                    //+ "'"+tanggal.getDateFormatString()+"',"
                    + "'" + tgl + "',"
                    + "'" + waktu.getText() + "',"
                    + "'" + jenis_kegiatan.getText() + "'"
                    + ")";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();

//            String tampilan ="yyyy-MM-dd" ; 
//            SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
//            String tgl = String.valueOf(fm.format(tanggal.getDate()));
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy ");
//            String date = sdf.format(tanggal.getDate());
//            pst.setString(7,date);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            //tampilkanData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnRuanganYangDipinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuanganYangDipinjamActionPerformed
        // Panggil method untuk menampilkan menu RUANGAN YANG DIPINJAM di sini
        showBorrowMenuRuanganDipinjam();
    }//GEN-LAST:event_btnRuanganYangDipinjamActionPerformed

    private void btnLaporan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporan1ActionPerformed
        // TODO add your handling code here:
        // Panggil method untuk menampilkan menu LAPORAN di sini
        showBorrowMenuLaporan();
    }//GEN-LAST:event_btnLaporan1ActionPerformed

    private void btnPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeminjamanActionPerformed
        // Panggil method untuk menampilkan menu PEMINJAMAN di sini
        showBorrowMenuPinjam();
    }//GEN-LAST:event_btnPeminjamanActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        if (tanggal.getDate() != null) {
            SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyy-MM-dd");
            tgl = format_tanggal.format(tanggal.getDate());
        }
    }//GEN-LAST:event_tanggalPropertyChange

    private void tanggalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tanggalAncestorAdded

    }//GEN-LAST:event_tanggalAncestorAdded

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        // Panggil method untuk menampilkan menu RUANGAN YANG DIPINJAM di sini
        showBorrowMenuRuanganDipinjam();
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            int selectedRow = this.tblRuangDipinjam.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tidak ada data untuk diubah!");
                return;
            }
            
            int id = (int) this.tableModel.getValueAt(selectedRow, 0);
            String nama = this.nama.getText();
            long nim = Long.parseLong(this.nim.getText());
            String prodi = this.prodi.getText();
            long noHp = Long.parseLong(this.no_hp.getText());
            String asalPeminjam = this.asal_peminjam.getText();
            String ruangan = this.ruangan.getText();
            Date tanggal = this.tanggal.getDate();
            String waktu = this.waktu.getText();
            String jenis_kegiatan = this.jenis_kegiatan.getText();
            
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalDalamString = dateFormatter.format(tanggal);
            
            String sql = "UPDATE peminjaman set "
                        + "nama='" + nama + "',"
                        + "nim=" + nim + ","
                        + "prodi='" + prodi + "',"
                        + "no_hp=" + noHp + ","
                        + "asal_peminjam='" + asalPeminjam + "'," 
                        + "ruangan='" + ruangan + "',"
                        + "tanggal='" + tanggalDalamString + "',"
                        + "waktu='" + waktu + "',"
                        + "jenis_kegiatan='" + jenis_kegiatan + "' "
                        + "WHERE id_pinjam='" + id + "';";
            
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            tampilkanData();
            JOptionPane.showMessageDialog(null, "Data Berhasil di ubah");

            //setAwalForm();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR di Query IsiTable " + ex.getMessage());
            //System.out.println("ERROR di Queri IsiTable" + ex.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tblRuangDipinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRuangDipinjamMouseClicked
        int selectedRow = tblRuangDipinjam.getSelectedRow();
        if (selectedRow != -1) {
            try {
                System.out.println("HII");
                int id = (int) this.tableModel.getValueAt(selectedRow, 0);
                String sql = "select * from peminjaman WHERE id_pinjam = " + id + ";";
                java.sql.Connection conn = (Connection) koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {
                    nama.setText(rs.getString("nama"));
                    nim.setText(rs.getString("nim"));
                    prodi.setText(rs.getString("prodi"));
                    no_hp.setText(rs.getString("no_hp"));
                    asal_peminjam.setText(rs.getString("asal_peminjam"));
                    ruangan.setText(rs.getString("ruangan"));
                    tanggal.setDate(rs.getDate("tanggal"));
                    waktu.setText(rs.getString("waktu"));
                    jenis_kegiatan.setText(rs.getString("jenis_kegiatan"));
                }
            } catch (SQLException ex) {
                System.out.println("ERROR di Queri IsiTable" + ex.getMessage());
            }

        }
        //    String val = (String) tableModel.getValueAt(row, 0);

//        JDateChooser dateChooser = new JDateChooser();
//        Calendar calendar = Calendar.getInstance();
//        //dateChooser.setCalendar(calendar);
//        
//        btnSimpan.setEnabled(false);
//        //kodeProduk.setEnabled(false);
//        btnUbah.setEnabled(true);
//        btnHapus.setEnabled(true);
//        Object data[] = new Object[5];
//        int row = tblRuangDipinjam.getSelectedRow();
//    try {
//            String sql = "select * from peminjaman'"+tableModel.getValueAt(row, 0).toString()+"' ";
//            java.sql.Connection conn=(Connection)koneksi.configDB();
//            java.sql.Statement stm=conn.createStatement();
//            java.sql.ResultSet rs=stm.executeQuery(sql);
//        while (rs.next()) {
//            nama.setText(rs.getString("nama"));
//            nim.setText(rs.getString("nim"));
//            prodi.setText(rs.getString("prodi"));
//            no_hp.setText(rs.getString("no_hp"));
//            asal_peminjam.setText(rs.getString("asal_peminjam"));
//            ruangan.setText(rs.getString("ruangan"));
//            waktu.setText(rs.getString("waktu"));
//            jenis_kegiatan.setText(rs.getString("jenis_kegiatan"));
//            //tgl.setCalendar(rs.getDate(sql));
//            tgl(rs.getString("'"));
//
//        }
//
//    } catch (SQLException ex) {
//        System.out.println("ERROR di Queri IsiTable"
//                + ex.getMessage());
//    }
    }//GEN-LAST:event_tblRuangDipinjamMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            int selectedRow = this.tblRuangDipinjam.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih");
                return;
            }

            int id = (int) this.tableModel.getValueAt(selectedRow, 0);
            String sql = "DELETE FROM peminjaman "
                    + "WHERE id_pinjam='" + id + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tampilkanData();
            //setAwalForm();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR di Query IsiTable " + ex.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //setAwalForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void showBorrowMenuPinjam() {
        MenuPeminjaman menuPinjam = new MenuPeminjaman();
        menuPinjam.setVisible(true);
        this.dispose(); // Menutup frame welcome setelah beralih ke menu PEMINJAMAN
    }

    private void showBorrowMenuRuanganDipinjam() {
        CekKetersediaan menuRuanganYangDipinjam = new CekKetersediaan();
        menuRuanganYangDipinjam.setVisible(true);
        this.dispose(); // Menutup frame welcome setelah beralih ke menu RUANGAN YANG DIPINJAM
    }

    private void showBorrowMenuLaporan() {
        Laporan menuLaporan = new Laporan();
        menuLaporan.setVisible(true);
        this.dispose(); // Menutup frame welcome setelah beralih ke menu LAPORAN 
    }

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
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asal_peminjam;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnLaporan1;
    private rojerusan.RSMaterialButtonRectangle btnLihat;
    private rojerusan.RSMaterialButtonRectangle btnPeminjaman;
    private rojerusan.RSMaterialButtonRectangle btnReset;
    private rojerusan.RSMaterialButtonRectangle btnRuanganYangDipinjam;
    private rojerusan.RSMaterialButtonRectangle btnSimpan;
    private rojerusan.RSMaterialButtonRectangle btnUbah;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenis_kegiatan;
    private javax.swing.JPanel layerForm;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField no_hp;
    private javax.swing.JTextField prodi;
    private javax.swing.JTextField ruangan;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tblRuangDipinjam;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
    // private final List<PeminjamanObject> data = new ArrayList<>();

    public void bersihTable() {
        int row = tblRuangDipinjam.getRowCount() - 1;
        while (row >= 0) {
            tableModel.removeRow(row);
            row--;
        }
    }

    public void tampilkanData() {
        bersihTable();
        Object tbl[] = new Object[6];

        try {
            String sql = "select * from peminjaman";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                tbl[0] = rs.getInt("id_pinjam");
                tbl[1] = rs.getString("nama");
                tbl[2] = rs.getString("ruangan");
                tbl[3] = rs.getDate("tanggal");
                tbl[4] = rs.getString("waktu");
                tbl[5] = rs.getString("jenis_kegiatan");
                tableModel.addRow(tbl);
            }

        } catch (SQLException ex) {
            System.out.println("ERROR di Queri IsiTable"
                    + ex.getMessage());
        }
    }
//    private void tampilkanData() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private void tgl(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
