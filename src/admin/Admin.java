package admin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lg.Lg;
public class Admin extends user.User implements Serializable{
 
    
    
    public Admin() {
        
        initComponents();
        
    }
     public static void storeObject(Object ob,String filename) throws FileNotFoundException, IOException{
         
              File file = new File(filename);
        
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
     public static Admin getObjects(String name){
         ObjectInputStream in = null;
         try {
             in = new ObjectInputStream(new FileInputStream(name));
         } catch (FileNotFoundException ex) {
             /*Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);*/
         } catch (IOException ex) {
             /*Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);*/
         }
         Admin p = null;
         try {
             p = (Admin) in.readObject();
         } catch (IOException ex) {
             /*Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);*/
         } catch (ClassNotFoundException ex) {
             /*Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);*/
         }
         return p;
     }

    public Admin(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JLabel jLabel1, JPanel jPanel1, String name, String username, String password) {
        super(name, username, password);
        this.jButton1 = jButton1;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(null);

        jButton7.setBackground(new java.awt.Color(72, 91, 43));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("manage Product");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(170, 250, 230, 50);

        jButton4.setBackground(new java.awt.Color(75, 59, 11));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Manage Pharmacist");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(170, 160, 230, 50);

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1080, 20, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\pharmacy\\image\\admin.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 660);

        jLabel1.setBackground(new java.awt.Color(0, 19, 8));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("     ADMIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 20, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ManageProduct object = new ManageProduct();
        object.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManagePharmacist ob = new ManagePharmacist();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Lg lg = new Lg();
        lg.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    void changePass(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
