/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.ini;

import javax.swing.JOptionPane;

/**
 *
 * @author Abel Bima Wiratama
 */
public class BankService extends javax.swing.JFrame {
    String str,strl;
    int choice, z, pin=1234, a=3;
    int t,s,tab=0;
    /**
     * Creates new form BankService
     */
    public BankService() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CBService = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        CBService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "1. Informasi Saldo", "2. Penarikan", "3. Penyetoran", "4. Petunjuk", "5. Keluar" }));
        CBService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBServiceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Bertransaksi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(CBService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(333, 257));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CBServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBServiceActionPerformed
        // TODO add your handling code here:
        setmenu();
    }//GEN-LAST:event_CBServiceActionPerformed

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
            java.util.logging.Logger.getLogger(BankService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setmenu() {
        //To change body of generated methods, choose Tools | Templates.
         if(CBService.getSelectedItem().equals("1. Informasi Saldo")){
             this.setVisible(false);
             JOptionPane.showMessageDialog(null, "Saldo Anda Saat Ini Sebesar : "+ tab); // informasi saldo
             z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BNI SYARIAH-KEDIRI", JOptionPane.YES_NO_OPTION,3); // konfirmasi transaksi lain
                    if(z==0)
                    {
                        this.setVisible(true);
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH-KEDIRI, ambil kartu ATM Anda.");
                    System.exit(0);
                    }
            }
            else if(CBService.getSelectedItem().equals("2. Penarikan")){
                    this.setVisible(false);
                    strl = JOptionPane.showInputDialog(null,"Msukan jumlah penarikan : "); // pengambilan
                    t = Integer.parseInt(strl);
                    tarik mengambil = new tarik();
                    mengambil.ambil(tab,t);
                    tab = mengambil.getsaldo();
            
                    z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ? ", "ATM BANK INI-KEDIRI", JOptionPane.YES_NO_OPTION,3); // konfirmasi transaksi lain
                         if(z==0){
                             this.setVisible(true);
                        }
                         else{
                            JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BANK INI, ambil kartu ATM Anda.");
                            System.exit(0);
                        }                                                         
            }
            else if(CBService.getSelectedItem().equals("3. Penyetoran")){
                    this.setVisible(false);
                    strl = JOptionPane.showInputDialog(null,"Masukan jumlah penyetoran : "); //menabung
                    s = Integer.parseInt(strl);
                    setor hasil = new setor();
                    hasil.menabung(tab, s);
                    tab = hasil.getsaldo();
                
                    z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BANK INI-KEDIRI", JOptionPane.YES_NO_OPTION,3); //konfirmasi transaksi lain
                       if(z==0){
                           this.setVisible(true);
                       }
                       else{
                            JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BANK INI, ambil kartu ATM Anda.");
                            System.exit(0);
                       }
            }
            else if(CBService.getSelectedItem().equals("4. Petunjuk")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Cara Penggunaan Aplikasi \n [1] Masukkan PIN dengan benar \n [2] Bertansaksilah dengan benar sesuai pilihan \n [3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung \n ","INFO",1);
                this.setVisible(true);
            }
            else if(CBService.getSelectedItem().equals("5. Keluar")){
                this.setVisible(false);
                z=JOptionPane.showConfirmDialog(null, "Anda ingin keluar ? ","Keluar", JOptionPane.YES_NO_OPTION,0);
                    if(z==0){
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BANK INI, ambil kartu ATM Anda");
                        System.exit(0);
                    }else{
                        this.setVisible(true);
                    }
            }
    }
}
