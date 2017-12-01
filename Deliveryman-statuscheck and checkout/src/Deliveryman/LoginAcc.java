
package Deliveryman;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import Deliveryman.Deliveryman;

/**
 *
 * @author Jing
 */
public class LoginAcc extends javax.swing.JFrame {
 

    /**
     * Creates new form LoginAcc
     */
    public LoginAcc() {
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
        Jpass = new javax.swing.JLabel();
        Juser = new javax.swing.JLabel();
        Jtxtuser = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        Jtxtpass = new javax.swing.JPasswordField();
        JCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff login");
        jLabel1.setToolTipText("");

        Jpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jpass.setText("Password");

        Juser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Juser.setText("Username");

        Jtxtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtuserActionPerformed(evt);
            }
        });

        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        JCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JCancel.setText("Cancel");
        JCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(Juser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Juser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtxtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtuserActionPerformed
       
        
    }//GEN-LAST:event_JtxtuserActionPerformed
    private void systemExit(){
        WindowEvent closewindow =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
    
    public void close(){
        WindowEvent winclose =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
         String user,pass;
        
        user=Jtxtuser.getText();
        pass=Jtxtpass.getText();
        
        if(user.equals("albert")&&pass.equals("12345")){
              
             
              systemExit();
             
             staff1 dm1 =new staff1();
             staff1.juser1.setText(this.Jtxtuser.getText());
             dm1.setVisible(true);
             close();
        }else if(user.equalsIgnoreCase("aaron")&&pass.equals("12345")){
          
           
              systemExit();
              
               staff1 dm1 =new staff1();
             staff1.juser1.setText(this.Jtxtuser.getText());
             dm1.setVisible(true);
             close();
        }else if(user.equalsIgnoreCase("andrew")&&pass.equals("12345")){
             
            
              systemExit();
              
             staff1 dm1 =new staff1();
             staff1.juser1.setText(this.Jtxtuser.getText());
             dm1.setVisible(true);
             close();
        }
        else if(user.equalsIgnoreCase("ervin")&&pass.equals("12345")){
             
            
              systemExit();
              
             staff1 dm1 =new staff1();
             staff1.juser1.setText(this.Jtxtuser.getText());
             dm1.setVisible(true);
             close();
        }
        else if(user.equalsIgnoreCase("tommy")&&pass.equals("12345")){
             
            
              systemExit();
              
             staff1 dm1 =new staff1();
             staff1.juser1.setText(this.Jtxtuser.getText());
             dm1.setVisible(true);
             close();
        }
        
        else{
            JOptionPane.showMessageDialog(null,"invalid username or password");
            Jtxtuser.setText("");
            Jtxtpass.setText("");
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void JCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JCancelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JCancel;
    private javax.swing.JLabel Jpass;
    private javax.swing.JPasswordField Jtxtpass;
    private javax.swing.JTextField Jtxtuser;
    private javax.swing.JLabel Juser;
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
