
package admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewProduct extends javax.swing.JFrame {

    private String id;
    private String productName;
    private String price;
    private String exPireDate;
    private String quantity;
    DefaultTableModel model1;

    public ViewProduct(String id, String productName,String price, String exPireDate, String quantity) {
        this.id = id;
        this.productName = productName;
        this.price=price;
        this.exPireDate = exPireDate;
        this.quantity = quantity;
    }
    public ViewProduct() {
        initComponents();
        
        model1=(DefaultTableModel) jTableproduct.getModel();
        File f = new File("Product");
        f.mkdir();
        
        /* File file = new File("Product");*/
        if(f.list().length == 0){
            JOptionPane.showMessageDialog(null, "No Product Added ,Add first ","Products",JOptionPane.PLAIN_MESSAGE);
        }
        else{
        File [] listOfFile =f.listFiles();
        for (int i = 0; i < listOfFile.length; i++) {
            
        String filename=listOfFile[i].getName();
        ViewProduct p =ViewProduct.getObjects("Product\\"+filename);
        model1.addRow(new Object []{p.getId(),p.getName(),p.getPrice(),p.getExPireDate(),
        p.getQuantity()});
        }
        
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setExPireDate(String exPireDate) {
        this.exPireDate = exPireDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public String getExPireDate() {
        return exPireDate;
    }

    public String getQuantity() {
        return quantity;
    }
    
     public static ViewProduct getObjects(String name){
     ObjectInputStream in = null;
     try {
     in = new ObjectInputStream(new FileInputStream(name));
     } catch (FileNotFoundException ex) {
     
     } catch (IOException ex) {
}
      ViewProduct p = null;
      try {
      p = (ViewProduct) in.readObject();
      in.close();
      } catch (IOException ex) {
      
}    catch (ClassNotFoundException ex) {
     
}
      return p;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableproduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2300, 1000));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(null);

        jTableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Product name", "price", "expiry date", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableproduct);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 70, 695, 318);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Product list");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(178, 25, 135, 51);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 6, 63, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\pharmacy\\image\\black_background_wood-wallpaper-1600x1200.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManageProduct ob = new ManageProduct();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableproduct;
    // End of variables declaration//GEN-END:variables
}
