
/**
 *
 * @author Ramad
 */
import com.mysql.jdbc.Statement;
import com.sun.imageio.stream.StreamCloser;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.DefaultTableModel;


public class Data extends javax.swing.JFrame {
    private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Alamat");
        tbl.addColumn("Tanggal Lahir");
        jTable1.setModel(tbl);
        try {
            Statement statement = (Statement) koneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from data");
            while (res.next())
            {
               tbl.addRow(new Object[] {
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("tanggal_lahir"),
                });
                jTable1.setModel(tbl);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }
   
    private void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }
   
    private void enabled(){
        jTextField1.enable(true);
        jTextField2.enable(true);
        jTextField3.enable(true);
        jTextField4.enable(true);
        jTextField1.requestFocus();
    }
   
    private void desabled(){
        jTextField1.enable(false);
        jTextField2.enable(false);
        jTextField3.enable(false);
        jTextField4.enable(false);

    }

    public Data() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NIM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, -1, -1));

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabel4.setText("Tanggal Lahir");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 166, -1, -1));

        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, -1));

        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 230, -1));

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, -1));

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, -1));

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, -1));

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 80, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 570, 250));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("DATA MAHASISWA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText() == "Tambah"){
            enabled();
            clear();
            jButton1.setText("Simpan");
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }else {
            String nim = jTextField1.getText();
            String nama = jTextField2.getText();
            String alamat = jTextField3.getText();
            String ttl = jTextField4.getText();

            try {
                Statement statement = (Statement) koneksi.GetConnection().createStatement();
                statement.executeUpdate("insert into data values ('"+nim+"','"+nama+"','"+alamat+"','"+ttl+"');");
                statement.close();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                datatable();
                clear();
                desabled();
                jButton1.setText("Tambah");
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
            }catch (Exception t){
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String nim = jTextField1.getText();
        try {
            Statement statement = (Statement) koneksi.GetConnection().createStatement();
            statement.executeUpdate("delete from data where nim= ('"+nim+"');");
            clear();
            desabled();
            datatable();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gaagl dihapus");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          {
            clear();
            desabled();
            jButton1.setText("Tambah");
            jButton2.setText("Update");
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jTextField1.setText((String)jTable1.getValueAt(row, 0));
        jTextField2.setText((String)jTable1.getValueAt(row, 1));
        jTextField3.setText((String)jTable1.getValueAt(row, 2));
        jTextField4.setText((String)jTable1.getValueAt(row, 3));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText() == "Update"){
            enabled();
            jTextField1.enable(false);
            jButton2.setText("Simpan");
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            jTextField1.requestFocus();
        }else {
            String nim = jTextField1.getText();
            String nama = jTextField2.getText();
            String alamat = jTextField3.getText();
            String ttl = jTextField4.getText();

            try {
                Statement statement = (Statement) koneksi.GetConnection().createStatement();
                statement.executeUpdate("UPDATE data " + "SET " + "nama = '" +nama+ "'," + "alamat = '" +alamat+ "'," + "tanggal_lahir = '" +ttl+ "'" + "WHERE " + "nim = '" +nim+ "';");
                statement.close();
                JOptionPane.showMessageDialog(null, "Data berhasil rubah");
                clear();
                desabled();
                jButton2.setText("Update");
                jButton1.setEnabled(true);
                jButton3.setEnabled(true);
            }catch (Exception t){
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
            datatable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
