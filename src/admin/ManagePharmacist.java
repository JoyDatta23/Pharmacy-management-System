
package admin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pharmacist.Pharmacist;
public class ManagePharmacist extends user.User {
    
    
     DefaultTableModel model;
     
    public ManagePharmacist() {
        initComponents();
        model=(DefaultTableModel) jTable1.getModel();
        jButton3.setEnabled(false);
        File f = new File("PharmacistData");
        f.mkdir();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        TFname = new javax.swing.JTextField();
        TFmobile = new javax.swing.JTextField();
        TFaddress = new javax.swing.JTextField();
        TFid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFdate = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        TFusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFpassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List Of Pharmacist");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(482, 47, 229, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "appoint date ", "id", "name", "mobile", "address", "email", "username", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(482, 93, 711, 339);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Add  Pharmacist");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(222, 444, 142, 35);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(117, 444, 75, 35);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(26, 444, 79, 35);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 183, 95, 24);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 269, 95, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("mobile");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(18, 317, 95, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(18, 135, 95, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(18, 221, 95, 30);
        getContentPane().add(TFemail);
        TFemail.setBounds(119, 226, 180, 24);

        TFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnameActionPerformed(evt);
            }
        });
        getContentPane().add(TFname);
        TFname.setBounds(119, 185, 180, 24);
        getContentPane().add(TFmobile);
        TFmobile.setBounds(119, 322, 180, 24);
        getContentPane().add(TFaddress);
        TFaddress.setBounds(119, 274, 180, 24);
        getContentPane().add(TFid);
        TFid.setBounds(119, 140, 180, 24);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(18, 93, 95, 30);

        TFdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdateActionPerformed(evt);
            }
        });
        getContentPane().add(TFdate);
        TFdate.setBounds(119, 98, 180, 24);

        jButton4.setText("back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(18, 6, 58, 32);
        getContentPane().add(TFusername);
        TFusername.setBounds(119, 370, 180, 24);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(18, 365, 95, 30);
        getContentPane().add(TFpassword);
        TFpassword.setBounds(119, 418, 180, 24);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(18, 413, 95, 30);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(382, 444, 57, 35);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pharmacist Registration ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 50, 234, 33);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("Show data");
        jButton6.setMinimumSize(new java.awt.Dimension(1300, 800));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(789, 47, 246, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\pharmacy\\image\\136930.jpg")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1370, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user.User pharm = new pharmacist.Pharmacist(TFdate.getText(), TFid.getText(),
                TFname.getText(), TFmobile.getText(),TFaddress.getText(), TFemail.getText(),
                TFusername.getText(),TFpassword.getText());
        
         if(pharm.getName().equals("")||pharm.getUsername().equals("")||pharm.getPassword().equals("")||
                 pharm.getId().equals("")||pharm.getAddress().equals("")
        ||pharm.getEmail().equals("")||pharm.getDate().equals("")){
        
        
        JOptionPane.showMessageDialog(null,"complete all field", "pharmacist registration",JOptionPane.ERROR_MESSAGE);
        
        }
         else{
        
         model.addRow(new Object[]{pharm.getDate(),pharm.getId(),pharm.getName(),pharm.getMobile(),
         pharm.getAddress(),pharm.getEmail(),pharm.getUsername(),pharm.getPassword()});
         
         TFdate.setText("");
         TFaddress.setText("");
         TFemail.setText("");
         TFid.setText("");
         TFmobile.setText("");
         TFname.setText("");
         TFusername.setText("");
         TFpassword.setText("");
        
         
         
         
         File file = new File("PharmacistData\\"+pharm.getId()+".txt");
         
         try {
         file.createNewFile();
         } catch (IOException ex) {
         }
         
         try {
         
         ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file));
         out.writeObject(pharm);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       int selectedRow=jTable1.getSelectedRow();
       if (jTable1.getSelectionModel().isSelectionEmpty()){
           JOptionPane.showMessageDialog(null, "Select a row", "Pharmacist Registration", JOptionPane.ERROR_MESSAGE);
       } else {
           int response =JOptionPane.showConfirmDialog(null, "Sure to delete this file ?",
                         "pharmacist Registration",JOptionPane.YES_NO_CANCEL_OPTION);
           if(response==JOptionPane.YES_OPTION){
               String id = model.getValueAt(selectedRow,1).toString();
               String fName="PharmacistData\\"+id+".txt";
               File f = new File(fName);
               model.removeRow(selectedRow);
               f.delete();
               
           }
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnameActionPerformed

    private void TFdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       user.User ob = new Admin();
       ob.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int selectedRow=jTable1.getSelectedRow();
       if (jTable1.getSelectionModel().isSelectionEmpty()){
           JOptionPane.showMessageDialog(null, "Select a row", "Pharmacist Registration", JOptionPane.ERROR_MESSAGE);
       } 
       else {
         TFdate.setText(model.getValueAt(selectedRow,0).toString());
         TFid.setText(model.getValueAt(selectedRow,1).toString());
         TFname.setText(model.getValueAt(selectedRow,2).toString());
         TFmobile.setText(model.getValueAt(selectedRow,3).toString());
         TFaddress.setText(model.getValueAt(selectedRow,4).toString());
         TFemail.setText(model.getValueAt(selectedRow,5).toString());
         TFusername.setText(model.getValueAt(selectedRow,6).toString());
         TFpassword.setText(model.getValueAt(selectedRow,7).toString());
         jButton3.setEnabled(true);
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
       
             int selectedRow=jTable1.getSelectedRow();
             String id = model.getValueAt(selectedRow,1).toString();
             
             model.setValueAt(TFdate.getText(), selectedRow, 0);
             model.setValueAt(TFid.getText(), selectedRow,1);
             model.setValueAt(TFname.getText(), selectedRow, 2);
             model.setValueAt(TFmobile.getText(), selectedRow, 3);
             model.setValueAt(TFaddress.getText(), selectedRow, 4);
             model.setValueAt(TFemail.getText(), selectedRow, 5);
             model.setValueAt(TFusername.getText(), selectedRow, 6);
             model.setValueAt(TFpassword.getText(), selectedRow, 7);
             
             String filename ="PharmacistData\\"+id+".txt";
             Pharmacist ob =Pharmacist.getObjects(filename);
             
             ob.setName(TFname.getText());
             ob.setUsername(TFusername.getText());
             ob.setPassword(TFpassword.getText());
             ob.setEmail(TFemail.getText());
             ob.setMobile(TFmobile.getText());
             ob.setAddress(TFaddress.getText());
             ob.setId(TFid.getText());
             ob.setDate(TFdate.getText());
             
            String NewFile ="PharmacistData\\"+ob.getId()+".txt";
            
            
             File f = new File(filename);
             f.delete();
         try {
             Pharmacist.savePharmacist(ob, NewFile);
             
         } catch (IOException ex) {
             
         }
             
             JOptionPane.showMessageDialog(null, "Successfully updated","pharmacist Registration",
                     JOptionPane.PLAIN_MESSAGE);
             
             TFdate.setText("");
             TFaddress.setText("");
             TFemail.setText("");
             TFid.setText("");
             TFmobile.setText("");
             TFname.setText("");
             TFusername.setText("");
             TFpassword.setText("");
             jButton3.setEnabled(false);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        File f = new File("PharmacistData");
        if(f.list().length == 0){
            JOptionPane.showMessageDialog(null, "No data, Add first ","pharmacist list",JOptionPane.PLAIN_MESSAGE);
        }
        else{
        File [] listOfFile =f.listFiles();
        for (int i = 0; i < listOfFile.length; i++) {
            
        String filename=listOfFile[i].getName();
        Pharmacist p =Pharmacist.getObjects("PharmacistData\\"+filename);
        model.addRow(new Object []{p.getDate(),p.getId(),p.getName(),p.getMobile(),
        p.getAddress(),p.getEmail(),p.getUsername(),p.getPassword()});
        jButton6.setEnabled(false);
        
        }
        
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagePharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFaddress;
    private javax.swing.JTextField TFdate;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFmobile;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
