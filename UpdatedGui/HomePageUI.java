/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safecity;

import Classes.RescueStation;
import Classes.PoliceStation;
import Classes.Employee;
import javax.swing.JOptionPane;
import validation.EmailValidation;

/**
 *
 * @author wmall
 */
public class HomePageUI extends javax.swing.JFrame {

    /**
     * Creates new form HomePageUI
     */
    public HomePageUI() {
        super("Safe City");
        initComponents();
        this.setResizable(false);
         this.setLocationRelativeTo(null);
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
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LoginPane = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        emailAdminLogin = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        passwordAdminLogin = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        PublicPortalPane = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        repot = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resqueRequest = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CheckRoute = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FeedBack = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(955, 650));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        btn_1.setBackground(new java.awt.Color(0, 37, 55));
        btn_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("Login");
        btn_1.setPreferredSize(new java.awt.Dimension(73, 33));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(0, 37, 55));
        btn_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("Public Portal");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 37, 55));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Azonix", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SafeCity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(735, 650));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safecity/images/traffic-cctv-catching-drivers-main-2.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel8.setText("\"your safety is our first priority\"");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jPanel3.add(jPanel6, "card4");

        LoginPane.setBackground(new java.awt.Color(255, 204, 102));

        jLabel33.setFont(new java.awt.Font("SketchFlow Print", 0, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(54, 33, 89));
        jLabel33.setText("User Login");

        jLabel35.setFont(new java.awt.Font("SketchFlow Print", 2, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(54, 33, 89));
        jLabel35.setText("Email  ");

        emailAdminLogin.setBackground(new java.awt.Color(255, 255, 204));
        emailAdminLogin.setForeground(new java.awt.Color(54, 33, 89));
        emailAdminLogin.setToolTipText("");
        emailAdminLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        emailAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAdminLoginActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("SketchFlow Print", 2, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(54, 33, 89));
        jLabel36.setText("Password  ");

        passwordAdminLogin.setBackground(new java.awt.Color(255, 255, 204));
        passwordAdminLogin.setFont(new java.awt.Font("SketchFlow Print", 0, 18)); // NOI18N
        passwordAdminLogin.setForeground(new java.awt.Color(54, 33, 89));
        passwordAdminLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        passwordAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordAdminLoginActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("SketchFlow Print", 2, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(54, 33, 89));
        jLabel37.setText("User Type  ");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setForeground(new java.awt.Color(54, 33, 89));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee", "Police", "Rescue" }));

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setForeground(new java.awt.Color(54, 33, 89));
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPaneLayout = new javax.swing.GroupLayout(LoginPane);
        LoginPane.setLayout(LoginPaneLayout);
        LoginPaneLayout.setHorizontalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))
                        .addGap(26, 26, 26)
                        .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel33)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        LoginPaneLayout.setVerticalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel33)
                .addGap(136, 136, 136)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(40, 40, 40)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(passwordAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel37)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel3.add(LoginPane, "card3");

        PublicPortalPane.setBackground(new java.awt.Color(255, 204, 102));
        PublicPortalPane.setPreferredSize(new java.awt.Dimension(735, 650));

        jLabel34.setFont(new java.awt.Font("SketchFlow Print", 0, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(54, 33, 89));
        jLabel34.setText("Public Portal");

        jPanel4.setBackground(new java.awt.Color(54, 33, 89));

        repot.setBackground(new java.awt.Color(255, 255, 204));
        repot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repotMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setText("Report Incident");

        javax.swing.GroupLayout repotLayout = new javax.swing.GroupLayout(repot);
        repot.setLayout(repotLayout);
        repotLayout.setHorizontalGroup(
            repotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repotLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        repotLayout.setVerticalGroup(
            repotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repotLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        resqueRequest.setBackground(new java.awt.Color(255, 255, 153));
        resqueRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resqueRequestMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 33, 89));
        jLabel2.setText("Rescue Request");

        javax.swing.GroupLayout resqueRequestLayout = new javax.swing.GroupLayout(resqueRequest);
        resqueRequest.setLayout(resqueRequestLayout);
        resqueRequestLayout.setHorizontalGroup(
            resqueRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resqueRequestLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resqueRequestLayout.setVerticalGroup(
            resqueRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resqueRequestLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        CheckRoute.setBackground(new java.awt.Color(255, 255, 204));
        CheckRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckRouteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 33, 89));
        jLabel3.setText("Check Route");

        javax.swing.GroupLayout CheckRouteLayout = new javax.swing.GroupLayout(CheckRoute);
        CheckRoute.setLayout(CheckRouteLayout);
        CheckRouteLayout.setHorizontalGroup(
            CheckRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckRouteLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CheckRouteLayout.setVerticalGroup(
            CheckRouteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckRouteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        FeedBack.setBackground(new java.awt.Color(255, 255, 153));
        FeedBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedBackMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 33, 89));
        jLabel4.setText("Give Feedback");

        javax.swing.GroupLayout FeedBackLayout = new javax.swing.GroupLayout(FeedBack);
        FeedBack.setLayout(FeedBackLayout);
        FeedBackLayout.setHorizontalGroup(
            FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedBackLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedBackLayout.setVerticalGroup(
            FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedBackLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 85));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("Give Suggestion");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(repot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resqueRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CheckRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FeedBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(repot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resqueRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FeedBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PublicPortalPaneLayout = new javax.swing.GroupLayout(PublicPortalPane);
        PublicPortalPane.setLayout(PublicPortalPaneLayout);
        PublicPortalPaneLayout.setHorizontalGroup(
            PublicPortalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicPortalPaneLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(PublicPortalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        PublicPortalPaneLayout.setVerticalGroup(
            PublicPortalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicPortalPaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel34)
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.add(PublicPortalPane, "card2");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));

        setSize(new java.awt.Dimension(962, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAdminLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAdminLoginActionPerformed

    private void passwordAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordAdminLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordAdminLoginActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        
        
         jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        jPanel3.add(LoginPane);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        jPanel3.add(PublicPortalPane);
        jPanel3.repaint();
        jPanel3.revalidate();
        
    }//GEN-LAST:event_btn_3ActionPerformed

    private void repotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repotMouseClicked
        // TODO add your handling code here:
        ReportQueryPublicUser reportForm=new ReportQueryPublicUser();
        reportForm.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_repotMouseClicked

    private void resqueRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resqueRequestMouseClicked
        // TODO add your handling code here:
        RescueRequestPublicUser resqueForm=new RescueRequestPublicUser();
        resqueForm.setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_resqueRequestMouseClicked

    private void CheckRouteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckRouteMouseClicked
             // TODO add your handling code here:
             
              new GoogleMapsSample().setVisible(true);
        
    }//GEN-LAST:event_CheckRouteMouseClicked

    private void FeedBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedBackMouseClicked
        // TODO add your handling code here:
        
        new FeedbackForm().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_FeedBackMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        suggeionForm suggestionForm=new suggeionForm();
        suggestionForm.setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String email= emailAdminLogin.getText();
        String password= passwordAdminLogin.getText();
        String usertype=(String)jComboBox1.getSelectedItem();
        
         boolean success=true;
        StringBuilder errorMessage=new StringBuilder("Kindly enter ");
       
       // displaying error(s) or information
       
       
      
      if(usertype.equals("Employee"))
               errorMessage=errorMessage.append("Your ");
       else
               errorMessage=errorMessage.append("Organization's ");
      
      if(email.isEmpty()){
           
         errorMessage=errorMessage.append("Email");       
         success=false;
       }
       
       if(password.isEmpty()){
           if(!success)
               errorMessage=errorMessage.append(", ");
         errorMessage=errorMessage.append("Passoword");       
         success=false;
       }
        
       if(!password.isEmpty())
      {
      boolean passwordValid=password.length()>=6;
      
      if(!passwordValid)
      {
          if(success)
          {
              //errorMessage=errorMessage.delete(0, errorMessage.length()-1);
              errorMessage=new StringBuilder("Password should be atleast six characters");        
          }
          
          else 
          {
               
               errorMessage=errorMessage.append("\nPassword should be atleast six characters");
          }
          
          success=false;
      }
      }
       
       if(!email.isEmpty())
      {
      boolean emailValid=EmailValidation .validate(email);
      
      if(!emailValid)
      {
          if(success)
          {
              //errorMessage=errorMessage.delete(0, errorMessage.length()-1);
              errorMessage=new StringBuilder("Enter a Valid Email");        
          }
          
          else 
          {
               
               errorMessage=errorMessage.append("\nEnter a Valid Email");
          }
          
          success=false;
      }
      }
       
       int index=errorMessage.lastIndexOf(",");
       if(index!=-1)
           errorMessage.insert(index, " and");
       
      errorMessage.append(".");
        
     if(success )
       {
         String dbPassword="no";
         if(usertype.equals("Employee"))
             dbPassword=Employee.getInstance().login(email);
         else if(usertype.equals("Police"))
             dbPassword=PoliceStation.getInstance().login(email);
         else if(usertype.equals("Rescue"))
             dbPassword=RescueStation.getInstance().login(email);
           if(dbPassword.equals("no"))
                JOptionPane.showMessageDialog(this,"Incorrect Email");
           else
           {
               if(dbPassword.equals(password)){
                   this.dispose();
                   if(usertype.equals("Employee"))
                        new employeePortal().setVisible(true);
                   else if(usertype.equals("Police"))
                       new policePortal().setVisible(true);
                   else if(usertype.equals("Rescue"))
                       new rescuePortal().setVisible(true);
                           
               }
               else
                   JOptionPane.showMessageDialog(this,"Incorrect Password");
           }
       }
     else
         JOptionPane.showConfirmDialog(null,errorMessage,"Insufficient Information",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        jPanel3.add(jPanel6);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    
    public javax.swing.JPanel getCardPanel()
    {
            return jPanel3;
    }
    
    
    public javax.swing.JPanel getloginPanel()
    {
            return LoginPane;
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
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CheckRoute;
    private javax.swing.JPanel FeedBack;
    private javax.swing.JPanel LoginPane;
    private javax.swing.JPanel PublicPortalPane;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_3;
    private javax.swing.JTextField emailAdminLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passwordAdminLogin;
    private javax.swing.JPanel repot;
    private javax.swing.JPanel resqueRequest;
    // End of variables declaration//GEN-END:variables
}
