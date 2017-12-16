/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliverymanepice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Kyrios
 */
public class SOList extends javax.swing.JFrame {

    /**
     * Creates new form SOList
     */
    public SOList() {
        initComponents();
        Show_SO_in_Jtable();
        
        jPanel1.setVisible(false);
        jXDatePicker1.getEditor().setEditable(false);
        jXDatePicker1.setFormats(new String[]{"yyyy-MM-dd"});
    }
    
    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/fastdeliveryDB",null,null);
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<listSO> getListSO(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<listSO> soList = new ArrayList<listSO>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM  scheduleorderso WHERE DELIVERY_DATE >= '"+sdf.format(Calendar.getInstance().getTime())+"' ORDER BY Delivery_Date ASC,Delivery_Time ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            listSO listso;
            while(rs.next()){
                listso = new listSO(rs.getInt("Schedule_OrderID"),rs.getDate("Delivery_Date"),rs.getString("Delivery_Time"),rs.getString("Total_Price"),rs.getString("Status"),rs.getInt("CustomerID"));
                soList.add(listso);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return soList;
    }
    public ArrayList<listSO> getTodayListSO(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<listSO> soList = new ArrayList<listSO>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM  scheduleorderso WHERE DELIVERY_DATE = '"+sdf.format(Calendar.getInstance().getTime())+"' ORDER BY Delivery_Date ASC,Delivery_Time ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            listSO listso;
            while(rs.next()){
                listso = new listSO(rs.getInt("Schedule_OrderID"),rs.getDate("Delivery_Date"),rs.getString("Delivery_Time"),rs.getString("Total_Price"),rs.getString("Status"),rs.getInt("CustomerID"));
                soList.add(listso);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return soList;
    }
    
    public void Show_SO_in_Jtable(){
        ArrayList<listSO> list = getListSO();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[6];
        for(int i =0; i<list.size();i++){
            row[0] = list.get(i).getSchedule_OrderID();
            row[1] = list.get(i).getDelivery_Date();
            row[2] = list.get(i).getDelivery_Time();
            row[3] = list.get(i).getTotal_Price();
            row[4] = list.get(i).getStatus();
            row[5] = list.get(i).getCustomerID();
            
            model.addRow(row);
        }
    }
    public void Show_Today_SO_in_Jtable(){
        ArrayList<listSO> list = getTodayListSO();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[6];
        for(int i =0; i<list.size();i++){
            row[0] = list.get(i).getSchedule_OrderID();
            row[1] = list.get(i).getDelivery_Date();
            row[2] = list.get(i).getDelivery_Time();
            row[3] = list.get(i).getTotal_Price();
            row[4] = list.get(i).getStatus();
            row[5] = list.get(i).getCustomerID();
            
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Schedule Order Detail");

        jLabel2.setText("Delivery Date :");

        jLabel3.setText("Delivery Time :");

        jLabel5.setText("Order ID :");

        jLabel6.setText("Customer Name :");

        jLabel7.setText("Contact No  :");

        jLabel8.setText("Address  :");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("Total Price :");

        jLabel16.setText("jLabel16");

        jTable4.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
            }
        ));
        jTable4.setEnabled(false);
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(35);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(30, 30, 30))
        );

        jXDatePicker1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXDatePicker1MouseClicked(evt);
            }
        });
        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jButton1.setText("Show All Remaining Orders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Schedule Order List ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Delivery  Date", "Delivery Time", "Total Price", "Status", "Customer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        }
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);

        jButton2.setText("Show Today's Orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--){
            model.removeRow(i); 
        } 
        Show_SO_in_Jtable();
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        jPanel1.setVisible(true);
        
        TableModel model = jTable1.getModel();
        
        jLabel9.setText(model.getValueAt(i, 0).toString());
        jLabel10.setText(model.getValueAt(i, 1).toString());
        jLabel11.setText(model.getValueAt(i, 2).toString());
        String tp = "RM " + model.getValueAt(i, 3).toString() + ":00";
        jLabel16.setText(tp);
        
        Connection connection = getConnection();
        
        String query = "SELECT * FROM  customers WHERE ID = "+model.getValueAt(i, 5);
        String query2 = "SELECT * FROM scheduleorderitemso WHERE Schedule_OrderID = "+ model.getValueAt(i, 0);
        Statement st;
        ResultSet rs;
        customer cus;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            if(rs.next()){
              cus = new customer(rs.getInt("ID"),rs.getString("CustomerName"),rs.getString("ContactNo"),rs.getString("Address"));
              jLabel12.setText(cus.getCustomerName());
              jLabel13.setText(cus.getAddress());
              jLabel14.setText(cus.getContactno());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        ArrayList<Item> itemList = new ArrayList<Item>();
         try{
            st = connection.createStatement();
            rs = st.executeQuery(query2);
            Item items;
            while(rs.next()){
                items = new Item(rs.getString("ItemName"),rs.getInt("Schedule_Quantity"));
                itemList.add(items);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
         
        DefaultTableModel model4 =(DefaultTableModel)jTable4.getModel();
        
        int rows = model4.getRowCount(); 
        for(int g = rows - 1; g >=0; g--){
            model4.removeRow(g); 
        } 
        
        Object[] row = new Object[2];
        for(int n=0; n<itemList.size();n++){
            row[0] = itemList.get(n).getItemName();
            row[1] = itemList.get(n).getSchedule_Quantity();
            model4.addRow(row);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jXDatePicker1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXDatePicker1MouseClicked
     
    }//GEN-LAST:event_jXDatePicker1MouseClicked

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
      Date oldDate = jXDatePicker1.getDate();        
      //DateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String dDate = new SimpleDateFormat("yyyy-MM-dd").format(oldDate);
      
      
     DefaultTableModel model =(DefaultTableModel)jTable1.getModel(); 
     
     int rows = model.getRowCount(); 
     for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }

        ArrayList<listSO> soList2 = new ArrayList<listSO>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM  scheduleorderso WHERE DELIVERY_DATE = '"+dDate+"' ORDER BY Delivery_Date ASC,Delivery_Time ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            listSO listso;
            while(rs.next()){
                listso = new listSO(rs.getInt("Schedule_OrderID"),rs.getDate("Delivery_Date"),rs.getString("Delivery_Time"),rs.getString("Total_Price"),rs.getString("Status"),rs.getInt("CustomerID"));
                soList2.add(listso);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        ArrayList<listSO> list =  soList2;
        
        Object[] row = new Object[6];
        for(int i =0; i<list.size();i++){
            row[0] = list.get(i).getSchedule_OrderID();
            row[1] = list.get(i).getDelivery_Date();
            row[2] = list.get(i).getDelivery_Time();
            row[3] = list.get(i).getTotal_Price();
            row[4] = list.get(i).getStatus();
            row[5] = list.get(i).getCustomerID();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--){
            model.removeRow(i); 
        } 
        Show_Today_SO_in_Jtable();
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SOList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SOList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SOList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SOList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SOList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
