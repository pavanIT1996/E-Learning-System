/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  project;

import DBconnect.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Pubudu_Malith_Mihiran
 */
public class login extends javax.swing.JFrame {
   
    //db conection
   Connection con = null;
   PreparedStatement pst = null;
   
   ResultSet rs =null;
   
   int timeRun=0;
   public login() 
   {
        initComponents();
        
        //CurrentDate();
        CurrentDate d1=new CurrentDate();
        date.setText(d1.year+"/"+d1.month+"/"+d1.day);
        
        con = DBconnect.connect();
        new Thread()
        {
            public void run()
            {
                while(timeRun==0)
                {
            
                    Calendar cal=new GregorianCalendar();
                    int hour=cal.get(Calendar.HOUR);
                    if(hour==0)
                    {
                         hour=hour+12;
                    }
                    int min=cal.get(Calendar.MINUTE);
                    int sec=cal.get(Calendar.SECOND);
                    int AM_PM=cal.get(Calendar.AM_PM);
            
            
                    String day_night=""; 
                    if(AM_PM==1)
                    {
                        day_night="PM";
                    }
                    else
                    {
                        day_night="AM";
                    }
            
                    String time =hour+":"+min+":"+sec+""+day_night;
            
                    Clock.setText(time);
                }
        
            }
        }.start();
        
    }
     
 /*public void CurrentDate()
 {
    
    Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    date.setText(year+"/"+(month+1)+"/"+day);
 }*/

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        unamebox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        typebox = new javax.swing.JComboBox();
        pwordbox = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Clock = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel2.setText("Pass Word");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jButton2.setText("Creat a New Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));
        getContentPane().add(unamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 144, 31));

        jLabel3.setText("User Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, -1));

        typebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----Select type-----", "Admin_User", "Nomal_User" }));
        getContentPane().add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 144, 35));
        getContentPane().add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 144, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 280, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2993.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/community-users-icon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Clock.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N
        Clock.setForeground(new java.awt.Color(0, 102, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("jLabel6");

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Clock))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(date)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Clock)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 230, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-4-xxl.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        setSize(new java.awt.Dimension(646, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
 
        try{
            String sql="Select * From members Where UserName=?  and PassWord=? and Type=?" ;
            pst=con.prepareStatement(sql);
              pst.setString(1, unamebox.getText());
              pst.setString(2, pwordbox.getText());
              
              
            pst.setInt(3, typebox.getSelectedIndex());
            rs=pst.executeQuery();
           
            
            if(rs.next())
               { 
                   //if user type is admin user open admin user home page 
                  if(typebox.getSelectedIndex() == 1 ){
                        admin a = new admin();
                        a.setVisible(true);
                        this.dispose();
                   }
                   else{
                        useryear n = new useryear();
                        n.setVisible(true);
                        this.dispose();
                   
                   }
                 
               }
                //if not select user type sen a msg to user 
               else if (typebox.getSelectedIndex() == 0){
                   
                     JOptionPane.showMessageDialog(null, "Please select a User Type");
               }
                        else{
                        JOptionPane.showMessageDialog(null, "Entered UserName or PassWord or User_type is Incorrect");
               
                            }
               
               
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Unsuccesfully Login");
        }
            
            
            
        unamebox.setText("");
        pwordbox.setText("");
        typebox.setSelectedIndex(0);
        
        

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //click create new account button open the sign up page
        Sign_up s1 = new Sign_up();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MY_Home mh = new MY_Home();
        mh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pwordbox;
    private javax.swing.JComboBox typebox;
    private javax.swing.JTextField unamebox;
    // End of variables declaration//GEN-END:variables
}
