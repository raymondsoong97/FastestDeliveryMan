/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliveryman;
import Deliveryman.*;
import static Deliveryman.staff1.juser1;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Jing
 */
public class Checkin extends javax.swing.JFrame {
    String available;
    /**
     * Creates new form StatusChange
     */
    public Checkin() {
        setTitle("Check In");
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

        JSTATUS1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcheckout = new javax.swing.JButton();
        jattendance1 = new javax.swing.JLabel();
        jstaff1 = new javax.swing.JLabel();
        juser2 = new javax.swing.JLabel();
        jchangestatus = new javax.swing.JComboBox();
        jstatus1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(777, 330));

        JSTATUS1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JSTATUS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JSTATUS1.setText("Status");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jing\\Desktop\\BAIT3343 Agili Software Development\\Deliveryman1\\green2.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));

        jcheckout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcheckout.setText("Check Out");
        jcheckout.setActionCommand("Clock Out");
        jcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckoutActionPerformed(evt);
            }
        });

        jattendance1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jattendance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jattendance1.setText("Attendance Check in");

        jstaff1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jstaff1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jstaff1.setText("StaffID");

        juser2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        juser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juser2MouseClicked(evt);
            }
        });

        jchangestatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jchangestatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Delivery", "Break" }));
        jchangestatus.setSelectedItem(null);
        jchangestatus.setToolTipText("");
        jchangestatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jchangestatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchangestatusActionPerformed(evt);
            }
        });

        jstatus1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jstatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jstatus1.setText("Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jstaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jattendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSTATUS1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(juser2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jchangestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(343, 343, 343))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSTATUS1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jattendance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jstaff1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jchangestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(juser2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void close(){
        WindowEvent winclose =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
    private void jcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckoutActionPerformed
         String jid=(String)juser1.getText();
        
        LoginAcc login =new LoginAcc();
       
        
         staff1 dm1 =new staff1();
         staff1.juser1.setText(jid);
         login.setVisible(true);
        close();
    }//GEN-LAST:event_jcheckoutActionPerformed

    private void juser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juser2MouseClicked

    }//GEN-LAST:event_juser2MouseClicked

    private void jchangestatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchangestatusActionPerformed
            
        String status1=(String)jchangestatus.getSelectedItem();
   
        if(jchangestatus.getSelectedIndex()==0){
            jstatus1.setBackground(Color.green);
            jstatus1.setOpaque(true);
            jstatus1.setText(status1);

        }else if(jchangestatus.getSelectedIndex()==1){
            jstatus1.setBackground(Color.GRAY);
            jstatus1.setOpaque(true);
            jstatus1.setText(status1);
        }else if(jchangestatus.getSelectedIndex()==2){
            jstatus1.setBackground(Color.red);
            jstatus1.setOpaque(true);
            jstatus1.setBackground(Color.yellow);
            jstatus1.setText(status1);
        }
         
    }//GEN-LAST:event_jchangestatusActionPerformed

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JSTATUS1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jattendance1;
    public static javax.swing.JComboBox jchangestatus;
    private javax.swing.JButton jcheckout;
    private javax.swing.JLabel jstaff1;
    public static javax.swing.JLabel jstatus1;
    public static javax.swing.JLabel juser2;
    // End of variables declaration//GEN-END:variables
}
