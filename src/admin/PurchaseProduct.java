
package admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class PurchaseProduct extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    
    public static void storeObject(ViewProduct ob,String filename) throws FileNotFoundException, IOException{
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
          out.writeObject(ob);
          out.close();
          }
    
    
    public PurchaseProduct() {
        initComponents();
        File file = new File("Product");
        file.mkdir();
        model=(DefaultTableModel) jTable1.getModel();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TFname = new javax.swing.JTextField();
        TFid = new javax.swing.JTextField();
        TFexdate = new javax.swing.JTextField();
        TFprice = new javax.swing.JTextField();
        TFquan = new javax.swing.JTextField();
        jjj = new javax.swing.JLabel();
        fsdf = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jlll = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2300, 1000));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase Product");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(169, 60, 182, 42);

        jButton1.setText("add product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1022, 403, 98, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "price", "expire date", "quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(52, 123, 701, 347);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(25, 17, 63, 35);
        getContentPane().add(TFname);
        TFname.setBounds(975, 183, 145, 37);
        getContentPane().add(TFid);
        TFid.setBounds(975, 123, 145, 37);
        getContentPane().add(TFexdate);
        TFexdate.setBounds(975, 293, 145, 37);
        getContentPane().add(TFprice);
        TFprice.setBounds(975, 238, 145, 37);
        getContentPane().add(TFquan);
        TFquan.setBounds(975, 348, 145, 37);

        jjj.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jjj.setForeground(new java.awt.Color(255, 255, 255));
        jjj.setText("Product Name");
        getContentPane().add(jjj);
        jjj.setBounds(816, 185, 129, 32);

        fsdf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fsdf.setForeground(new java.awt.Color(255, 255, 255));
        fsdf.setText("Id");
        getContentPane().add(fsdf);
        fsdf.setBounds(816, 125, 129, 32);

        j.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("Expire Date");
        getContentPane().add(j);
        j.setBounds(816, 295, 129, 32);

        f.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("Price");
        getContentPane().add(f);
        f.setBounds(816, 240, 129, 32);

        jlll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlll.setForeground(new java.awt.Color(255, 255, 255));
        jlll.setText("Quantity");
        getContentPane().add(jlll);
        jlll.setBounds(816, 350, 129, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\pharmacy\\image\\136920.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1390, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageProduct ob = new ManageProduct();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         

        ViewProduct ob = new ViewProduct(TFid.getText(), TFname.getText(),
                TFprice.getText(), TFexdate.getText(),TFquan.getText());
        
       if(ob.getId().equals("")||ob.getName().equals("")||ob.getPrice().equals("")||
        ob.getExPireDate().equals("")||ob.getQuantity().equals("")){
        JOptionPane.showMessageDialog(null, "complete all field ","Add Product",JOptionPane.PLAIN_MESSAGE);
        }
        else{
         model.addRow(new Object[]{ob.getId(),ob.getName(),ob.getPrice(),
         ob.getExPireDate(),ob.getQuantity()});
         
         TFname.setText("");
         TFquan.setText("");
         TFexdate.setText("");
         TFprice.setText("");
         TFid.setText("");
        
        File file = new File("Product\\"+ob.getId()+".txt");
        
        try {
             file.createNewFile();
         } catch (IOException ex) {
             
         }
        
         try {
            
           ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file));
           out.writeObject(ob);
           out.close();
            
         } catch (FileNotFoundException ex) {
             

         } catch (IOException ex) {
             
         }
         try {
         file.createNewFile();
         } catch (IOException ex) {
    }
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
            java.util.logging.Logger.getLogger(PurchaseProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFexdate;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFprice;
    private javax.swing.JTextField TFquan;
    private javax.swing.JLabel f;
    private javax.swing.JLabel fsdf;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jjj;
    private javax.swing.JLabel jlll;
    // End of variables declaration//GEN-END:variables
}
