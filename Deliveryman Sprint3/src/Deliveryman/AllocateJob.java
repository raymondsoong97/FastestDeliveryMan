/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliveryman;

import static Deliveryman.Checkin.jchangestatus;
import static Deliveryman.Checkin.jstatus1;
import static Deliveryman.Deliveryman.JID1;
import static Deliveryman.Deliveryman.*;
import static Deliveryman.LoginAcc.Jtxtuser;
import static Deliveryman.staff1.juser1;
import java.awt.Color;
import javax.swing.JOptionPane;
import static Deliveryman.CustomerDetail.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jing
 */
public class AllocateJob extends javax.swing.JFrame {

    /**
     * Creates new form AllocateJob
     */
    public AllocateJob() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JSTAFFID = new javax.swing.JLabel();
        JSTAFFNAME = new javax.swing.JLabel();
        JPHONENUMBER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JSTAFFID1 = new javax.swing.JLabel();
        JSTAFFID2 = new javax.swing.JLabel();
        JSTAFFID3 = new javax.swing.JLabel();
        JSTAFFID4 = new javax.swing.JLabel();
        JSTAFFID5 = new javax.swing.JLabel();
        JSTAFFID6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JDELIVERYMAN1 = new javax.swing.JLabel();
        JDELIVERYMAN2 = new javax.swing.JLabel();
        JDELIVERYMAN3 = new javax.swing.JLabel();
        JDELIVERYMAN4 = new javax.swing.JLabel();
        JDELIVERYMAN5 = new javax.swing.JLabel();
        JDELIVERYMAN6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JPHONENUMBER1 = new javax.swing.JLabel();
        JPHONENUMBER2 = new javax.swing.JLabel();
        JPHONENUMBER3 = new javax.swing.JLabel();
        JPHONENUMBER4 = new javax.swing.JLabel();
        JPHONENUMBER5 = new javax.swing.JLabel();
        JPHONENUMBER6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JSTAFFSTATUS = new javax.swing.JLabel();
        JSTAFFSTATUS1 = new javax.swing.JLabel();
        JSTAFFSTATUS2 = new javax.swing.JLabel();
        JSTAFFSTATUS3 = new javax.swing.JLabel();
        JSTAFFSTATUS4 = new javax.swing.JLabel();
        JSTAFFSTATUS5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jtxtallocate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JSHOW = new javax.swing.JTextArea();
        JTXTORDER = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        JSTAFFID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JSTAFFID.setText("Staff ID");

        JSTAFFNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JSTAFFNAME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JSTAFFNAME.setText("Deliveryman Name");

        JPHONENUMBER.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JPHONENUMBER.setText("Phone Number");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Task Allocate");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        JSTAFFID1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFID2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFID3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFID4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFID5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFID6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSTAFFID2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(JSTAFFID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JSTAFFID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JSTAFFID5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JSTAFFID6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JSTAFFID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JSTAFFID1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFID2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFID3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFID4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFID5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSTAFFID6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JDELIVERYMAN1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JDELIVERYMAN2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JDELIVERYMAN3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JDELIVERYMAN4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JDELIVERYMAN5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JDELIVERYMAN6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDELIVERYMAN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDELIVERYMAN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDELIVERYMAN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDELIVERYMAN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JDELIVERYMAN2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(JDELIVERYMAN6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JDELIVERYMAN1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDELIVERYMAN2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDELIVERYMAN3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDELIVERYMAN4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDELIVERYMAN5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JDELIVERYMAN6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPHONENUMBER1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JPHONENUMBER2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JPHONENUMBER3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JPHONENUMBER4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JPHONENUMBER5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JPHONENUMBER6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPHONENUMBER1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER6, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPHONENUMBER1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPHONENUMBER2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPHONENUMBER3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPHONENUMBER4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPHONENUMBER5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPHONENUMBER6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JSTAFFSTATUS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFSTATUS1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFSTATUS2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFSTATUS3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFSTATUS4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JSTAFFSTATUS5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSTAFFSTATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JSTAFFSTATUS1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(JSTAFFSTATUS2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(JSTAFFSTATUS3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(JSTAFFSTATUS4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(JSTAFFSTATUS5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSTAFFSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFSTATUS1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFSTATUS2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFSTATUS3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSTAFFSTATUS4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JSTAFFSTATUS5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setText("Allocate Deliveryman");

        Jtxtallocate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jtxtallocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtallocateActionPerformed(evt);
            }
        });

        JSHOW.setColumns(20);
        JSHOW.setRows(5);
        jScrollPane1.setViewportView(JSHOW);

        jLabel4.setText("Order ID");

        jButton1.setText("AllocateTask");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSTAFFID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JSTAFFNAME)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPHONENUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Jtxtallocate)
                                .addComponent(JTXTORDER, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSTAFFID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSTAFFNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPHONENUMBER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(346, 346, 346))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jtxtallocate)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTXTORDER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Staff information", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "LKC", "KFC", "18,taman,wilayah persekutuan,56000", null},
                {"0002", "LSW", "DOmino", "2,taman bungaya raya, 56000", null},
                {"0003", "KAri", "Kari Shop", "3, taman abc,45000,Kedah", null},
                {"0004", "Donald", "Mcdonald", "18,kampung,07000,Langkawi", null},
                {"0005", "Trump", "Trump D", "35,taman DSA,abc,aba", null}
            },
            new String [] {
                "Order ID", "Customer Name", "Restaurant", "Customer Address", "Deliveryman"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTabbedPane1.addTab("Customer Order", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
             double staffid;
        staffid=  1001;
        String stfid1 =String.format("%.0f", staffid+1);
        JSTAFFID1.setText(stfid1);
        
        String stfid2=String.format("%.0f", staffid+2);
        JSTAFFID2.setText(stfid2);
        
        String stfid3=String.format("%.0f",staffid+3 );
        JSTAFFID3.setText(stfid3);
        
        String stfid4=String.format("%.0f", staffid+4);
        JSTAFFID4.setText(stfid4);
        
        String stfid5=String.format("%.0f", staffid+5);
        JSTAFFID5.setText(stfid5);
        
        String stfid6=String.format("%.0f",staffid+6);
        JSTAFFID6.setText(stfid6);
        
         JDELIVERYMAN1.setText("albert");
        JDELIVERYMAN2.setText("aaron");
        JDELIVERYMAN3.setText("andrew");
        JDELIVERYMAN4.setText("ervin");
        JDELIVERYMAN5.setText("tommy");
        JDELIVERYMAN6.setText("Anthony");
        
        JPHONENUMBER1.setText("016-1234567");
        JPHONENUMBER2.setText("016-9876501");
        JPHONENUMBER3.setText("012-9876320");
        JPHONENUMBER4.setText("016-1239211");
        JPHONENUMBER5.setText("011-1231231");
        JPHONENUMBER6.setText("016-9876321");
        
       
       JSTAFFSTATUS.setText("AVAILABLE");
        
        JSTAFFSTATUS1.setText("Available");
        JSTAFFSTATUS2.setText("Deliverying");
        JSTAFFSTATUS3.setText("Break");
        JSTAFFSTATUS4.setText("AVAILABLE");
        JSTAFFSTATUS5.setText("AVAILABLE");
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         String staff,status;
       
        staff=Jtxtallocate.getText();
        status=JSTAFFSTATUS.getText();
        String status1 = JSTAFFSTATUS2.getText();
        String status2 = JSTAFFSTATUS3.getText();
        
        
       DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
       int selectedRowIndex =jTable1.getSelectedRow();
       int selectedColumnIndex =jTable1.getSelectedColumn();
       JTXTORDER.setText(model.getValueAt(selectedColumnIndex,0).toString());
    //    JTXTORDER.setText(model.getValueAt(selectedRowIndex,0).toString());
        
    
      String abc= (String)Jtxtallocate.getText();
    
      
        
        
        if(staff.equalsIgnoreCase("albert")&&status.equalsIgnoreCase("AVAILABLE")){
              JSHOW.setText("The Task have been allocated to the Deliveryman");
              model.setValueAt(abc,selectedRowIndex ,4);
              
        }
        else if(staff.equals("aaron")&&status.equalsIgnoreCase("Available")){
            JSHOW.setText("The Task have been allocated to the Deliveryman");
             model.setValueAt(abc,selectedRowIndex ,4);
        }
                else if(staff.equals("andrew")&&status.equalsIgnoreCase("Deliverying")){
            JSHOW.setText("The Deliveryman currently on Anohter task");
            
        }
                else if(staff.equals("ervin")&&status.equalsIgnoreCase("Break")){
            JSHOW.setText("The Deliveryman is on break");
        }
                else if(staff.equals("tommy")&&status.equalsIgnoreCase("Available")){
            JSHOW.setText("\"The Task have been allocated to the Deliveryman\"");
            model.setValueAt(abc,selectedRowIndex ,4);
        }
                else if(staff.equals("Anthony")&&status.equalsIgnoreCase("Available")){
            JSHOW.setText("\"The Task have been allocated to the Deliveryman\"");
            model.setValueAt(abc,selectedRowIndex ,4);
        }

                
                else {
                    JOptionPane.showMessageDialog(null,"Please Key in Correct Deliveryman Name\n or The Deliveryman on task or on Break");
                }
        
  
        
     
      

      // new CustomerDetail();
     
     //   int row;
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtxtallocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtallocateActionPerformed

    }//GEN-LAST:event_JtxtallocateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
       int selectedRowIndex =jTable1.getSelectedRow();
   
      JTXTORDER.setText(model.getValueAt(selectedRowIndex,0).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

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
            java.util.logging.Logger.getLogger(AllocateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllocateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllocateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllocateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllocateJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JDELIVERYMAN1;
    private javax.swing.JLabel JDELIVERYMAN2;
    private javax.swing.JLabel JDELIVERYMAN3;
    private javax.swing.JLabel JDELIVERYMAN4;
    private javax.swing.JLabel JDELIVERYMAN5;
    private javax.swing.JLabel JDELIVERYMAN6;
    private javax.swing.JLabel JPHONENUMBER;
    private javax.swing.JLabel JPHONENUMBER1;
    private javax.swing.JLabel JPHONENUMBER2;
    private javax.swing.JLabel JPHONENUMBER3;
    private javax.swing.JLabel JPHONENUMBER4;
    private javax.swing.JLabel JPHONENUMBER5;
    private javax.swing.JLabel JPHONENUMBER6;
    private javax.swing.JTextArea JSHOW;
    private javax.swing.JLabel JSTAFFID;
    private javax.swing.JLabel JSTAFFID1;
    private javax.swing.JLabel JSTAFFID2;
    private javax.swing.JLabel JSTAFFID3;
    private javax.swing.JLabel JSTAFFID4;
    private javax.swing.JLabel JSTAFFID5;
    private javax.swing.JLabel JSTAFFID6;
    private javax.swing.JLabel JSTAFFNAME;
    public static javax.swing.JLabel JSTAFFSTATUS;
    private javax.swing.JLabel JSTAFFSTATUS1;
    private javax.swing.JLabel JSTAFFSTATUS2;
    private javax.swing.JLabel JSTAFFSTATUS3;
    private javax.swing.JLabel JSTAFFSTATUS4;
    private javax.swing.JLabel JSTAFFSTATUS5;
    public static javax.swing.JTextField JTXTORDER;
    private javax.swing.JTextField Jtxtallocate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}