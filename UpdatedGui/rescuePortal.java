/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safecity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modal.Category;
import modal.Notification;
import modal.NotificationFeed;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class rescuePortal extends javax.swing.JFrame {

    ArrayList<Integer> notificationIds=new ArrayList<>();
    
    /**
     * Creates new form rescuePortal
     */
    public rescuePortal() {
        
        super("Rescue Portal / Safe City");
        
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    ArrayList<Integer> getNotificationIds()
    {
        return notificationIds;
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 91, 133));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setPreferredSize(new java.awt.Dimension(225, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 37, 55));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Notifications");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 248, 168, 33));

        jButton4.setBackground(new java.awt.Color(0, 37, 55));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Check Route");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 287, 168, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safecity/icons8_Wall_Mount_Camera_96px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 75, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 37, 55));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log Out");
        jButton5.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 326, 168, 32));

        jButton2.setBackground(new java.awt.Color(0, 37, 55));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 209, 168, 33));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(2, 91, 133));
        jPanel3.setPreferredSize(new java.awt.Dimension(735, 650));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(735, 650));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, "card4");

        jPanel4.setBackground(new java.awt.Color(2, 91, 133));
        jPanel4.setPreferredSize(new java.awt.Dimension(735, 650));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(2, 91, 133));

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Notification Type", "Description", "Location", "Reporter's Phone/Department", "Status"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 650));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 724, 650));

        jPanel3.add(jPanel4, "card2");

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(735, 650));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, "card3");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 0, 724, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new GoogleMapsSample().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.add(jPanel4);
        jPanel3.repaint();
        jPanel3.revalidate();
        notificationsShow();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void notificationsShow()
    {
        NotificationFeed instance=NotificationFeed.getNotificationFeed();
        List<Notification> notificationList=instance.getNotifications();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        
        
        for(int i=0;i<notificationList.size();i++)
        {
            Notification currentNotification=notificationList.get(i);
            
            Category catogory=currentNotification.getCategory();
           
            
                    
            boolean isRescueNotification=catogory.equals(Category.Ambulance)|| catogory.equals(Category.FireBrigade)
                    ||catogory.equals(Category.Suicide) || catogory.equals(Category.Murder) 
                    || catogory.equals(Category.Other);        
            
            
            if(isRescueNotification  ){
                
            notificationIds.add(currentNotification.getId());    
            String Status;
            String phone=currentNotification.getPhone();
            if(phone==null)
                phone="Safecity Depatment";
            
            if(currentNotification.getStatus()==0)
                 Status="Not Resolved Yet";
            else if (currentNotification.getStatus()== 1)
                 Status="Ongoing..";
            else 
                 Status="Resolved";
            
            model.addRow(new Object[]{catogory,currentNotification.getDescription()
            , currentNotification.getLocation(),phone,Status});
            
        }
        
        }
    
    }
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
       HomePageUI ui= new HomePageUI();
        
        ui.getCardPanel().removeAll();
        ui.getCardPanel().repaint();
        ui.getCardPanel().revalidate();

        ui.getCardPanel().add(ui.getloginPanel());
        ui.getCardPanel().repaint();
        ui.getCardPanel().revalidate();
        
        ui.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        javax.swing.JTable source=(javax.swing.JTable)evt.getSource();
        int rowAtClick =source.rowAtPoint(evt.getPoint());
        ///
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
       
        if(rowAtClick!=-1){
            
        Category catogory=(Category)model.getValueAt(rowAtClick, 0);
        String description=(String)model.getValueAt(rowAtClick, 1);
        String location =(String)model.getValueAt(rowAtClick, 2);
        String repoter=(String)model.getValueAt(rowAtClick, 3);
        String status=(String)model.getValueAt(rowAtClick, 4);
        
        JtableInfoOrganization infoForm=new JtableInfoOrganization(catogory,description,repoter,status,location,notificationIds.get(rowAtClick),this,2);
        infoForm.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.add(jPanel6);
        jPanel3.repaint();
        jPanel3.revalidate();
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
            java.util.logging.Logger.getLogger(rescuePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rescuePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rescuePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rescuePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rescuePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}