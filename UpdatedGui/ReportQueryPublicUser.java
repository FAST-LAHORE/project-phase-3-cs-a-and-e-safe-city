package safecity;

import Classes.Notification;
import Classes.Category;
import Classes.NotificationFeed;
import Classes.ProxyNotificationFeed;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import validation.CnicValidation;
import validation.PhoneValidation;

public class ReportQueryPublicUser extends javax.swing.JFrame {

    public ReportQueryPublicUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QueryTypes = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kidnapping = new javax.swing.JRadioButton();
        murder = new javax.swing.JRadioButton();
        lostPerson = new javax.swing.JRadioButton();
        Suicide = new javax.swing.JRadioButton();
        theft = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(54, 33, 89));
        jLabel9.setText("Report Incident");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 22, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setText("Choose Incident Type:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 51, -1, -1));

        kidnapping.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(kidnapping);
        kidnapping.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kidnapping.setForeground(new java.awt.Color(54, 33, 89));
        kidnapping.setText("Kidnapping");
        jPanel1.add(kidnapping, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        murder.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(murder);
        murder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        murder.setForeground(new java.awt.Color(54, 33, 89));
        murder.setText("Murder");
        jPanel1.add(murder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        lostPerson.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(lostPerson);
        lostPerson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lostPerson.setForeground(new java.awt.Color(54, 33, 89));
        lostPerson.setText("Lost Person");
        jPanel1.add(lostPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        Suicide.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(Suicide);
        Suicide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Suicide.setForeground(new java.awt.Color(54, 33, 89));
        Suicide.setText("Suicide");
        jPanel1.add(Suicide, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        theft.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(theft);
        theft.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        theft.setForeground(new java.awt.Color(54, 33, 89));
        theft.setText("Theft");
        jPanel1.add(theft, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        other.setBackground(new java.awt.Color(0, 102, 204));
        QueryTypes.add(other);
        other.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        other.setForeground(new java.awt.Color(54, 33, 89));
        other.setText("Other");
        jPanel1.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 33, 89));
        jLabel2.setText("Description:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(54, 33, 89));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 358, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 33, 89));
        jLabel3.setText("Location:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setForeground(new java.awt.Color(54, 33, 89));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 358, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(54, 33, 89));
        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("Enter Your Credencials:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 33, 89));
        jLabel6.setText("CNIC:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 33, 89));
        jLabel7.setText("Phone:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 20));

        jTextField3.setBackground(new java.awt.Color(255, 255, 204));
        jTextField3.setForeground(new java.awt.Color(54, 33, 89));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setForeground(new java.awt.Color(54, 33, 89));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 33, 89));
        jLabel8.setText("Information of Incident:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Category category = null;
        if (kidnapping.isSelected()) {
            category = Category.Kidnapping;
        } else if (lostPerson.isSelected()) {
            category = Category.LostPerson;
        } else if (murder.isSelected()) {
            category = Category.Murder;
        } else if (theft.isSelected()) {
            category = Category.Theft;
        } else if (Suicide.isSelected()) {
            category = Category.Suicide;
        } else if (other.isSelected()) {
            category = Category.Other;
        }
        
        String reportDescription = jTextArea1.getText();
        String reportLocation = jTextField2.getText();
        String reporterCNIC = jTextField3.getText();
        String reporterPhone = jTextField4.getText();

        // THIS BOOLEAN IS FOR CONFIRMING NO FIELDS REMAIN EMPTY
        boolean success = true;
        
        StringBuilder errorMessage = new StringBuilder("Kindly enter ");

        // displaying error(s) or information
        if (reporterCNIC.isEmpty()) {
            errorMessage = errorMessage.append(" your CNIC");
            success = false;
        }

        if (reporterPhone.isEmpty()) {
            if (!success) {
                errorMessage = errorMessage.append(", ");
            }
            errorMessage = errorMessage.append("your Phone Number");
            success = false;
        }
        if (reportDescription.isEmpty()) {
            if (!success) {
                errorMessage = errorMessage.append(", ");
            }
            errorMessage = errorMessage.append("Description about the Incident");
            success = false;
        }

        if (reportLocation.isEmpty()) {
            if (!success) {
                errorMessage = errorMessage.append(", ");
            }
            errorMessage = errorMessage.append("incident Location");
            success = false;
        }

        if (category == (null)) {
            if (!success) {
                errorMessage = errorMessage.append(", ");
            } else {
                errorMessage = new StringBuilder("Kindly; ");
            }
            errorMessage = errorMessage.append("Choose an Incident catogory \n");
            success = false;
        }

        if (!reporterPhone.isEmpty()) {
            boolean phoneValid = PhoneValidation.validate(reporterPhone);

            if (!phoneValid) {
                if (success) {
                    errorMessage = new StringBuilder("Enter a Valid Phone Number");
                } else {

                    errorMessage = errorMessage.append("\nEnter a Valid Phone Number \n");
                }

                success = false;
            }
        }

        if (!reporterCNIC.isEmpty()) {
            boolean cnicValid = CnicValidation.validate(reporterCNIC);

            if (!cnicValid) {
                if (success) {
                    errorMessage = new StringBuilder("Enter a Valid CNIC");
                } else {

                    errorMessage = errorMessage.append("\nEnter a Valid CNIC \n");
                }

                success = false;
            }
        }

        int index = errorMessage.lastIndexOf(",");
        if (index != -1) {
            errorMessage.insert(index, " and");
        }

        errorMessage.append(".");
      
       if(success )
       {
       
           Notification notificationObj=new Notification();
           notificationObj.setCategory(category);
           notificationObj.setCnic(reporterCNIC);
           notificationObj.setPhone(reporterPhone);
           notificationObj.setDescription(reportDescription);
           notificationObj.setLocation(reportLocation);
           notificationObj.setStatus(0);
           
           NotificationFeed instance = ProxyNotificationFeed.getInstance();
           instance.setNotifications();
           
           boolean reportStatus = instance.addNotification(notificationObj);
           
           if(reportStatus)
                JOptionPane.showMessageDialog(this,"Incident Reported Successfully!");
           else if(!reportStatus)
                JOptionPane.showMessageDialog(this,"Could not report the incident!");
       }
       
       else
            JOptionPane.showConfirmDialog(null, errorMessage, "Insufficient Information", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ReportQueryPublicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportQueryPublicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportQueryPublicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportQueryPublicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportQueryPublicUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup QueryTypes;
    private javax.swing.JRadioButton Suicide;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton kidnapping;
    private javax.swing.JRadioButton lostPerson;
    private javax.swing.JRadioButton murder;
    private javax.swing.JRadioButton other;
    private javax.swing.JRadioButton theft;
    // End of variables declaration//GEN-END:variables
}
