
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class NewJFrame extends javax.swing.JFrame {
    DefaultTableModel model;
    public NewJFrame() throws SQLException {
        initComponents();
        populateTable();
    }
    
    public void populateTable(){
        
        model = (DefaultTableModel)tblCities.getModel();
       model.setRowCount(0);
        try {
            ArrayList<City> cities = getCities();            
            for(City city : cities){
                Object[] row = {
                    city.getId(),
                    city.getName(),
                    city.getCountryCode(),
                    city.getDistrict(),
                    city.getPopulation()};
            model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCountryCode = new javax.swing.JLabel();
        lblDist = new javax.swing.JLabel();
        lblPop = new javax.swing.JLabel();
        tbxName = new javax.swing.JTextField();
        tbxCountryCode = new javax.swing.JTextField();
        tbxDist = new javax.swing.JTextField();
        tbxPop = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "CountryCode", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(0).setResizable(false);
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setText("Arama ifadesi");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name : ");

        lblCountryCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCountryCode.setText("Country Code : ");

        lblDist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDist.setText("District :");

        lblPop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPop.setText("Population :");

        btnAdd.setText("Yeni Sehir Ekle");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblCountryCode)
                            .addComponent(lblDist)
                            .addComponent(lblPop))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbxPop)
                            .addComponent(tbxDist)
                            .addComponent(tbxCountryCode)
                            .addComponent(tbxName, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountryCode)
                            .addComponent(tbxCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDist)
                            .addComponent(tbxDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPop)
                            .addComponent(tbxPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
        
        
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet result;
        try {
            conn = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, tbxName.getText());
            statement.setString(2, tbxCountryCode.getText());
            statement.setString(3,tbxDist.getText());
            statement.setInt(4,Integer.valueOf(tbxPop.getText()));
            int myResult;
            myResult = statement.executeUpdate();
            populateTable();
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }finally{
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                helper.showErrorMessage(ex);
            }
        }






    }//GEN-LAST:event_btnAddActionPerformed
    public static ArrayList<City> getCities() throws SQLException{
        Connection conn = null;
        DbHelper helper = new DbHelper();
        Statement statement;
        ResultSet result;
        ArrayList<City> cities = new ArrayList<>();
        try{
            conn = helper.getConnection();
            statement = conn.createStatement();
            result = statement.executeQuery("select * from city");

                while(result.next()){
                    cities.add(
                        new City(
                                result.getInt("Id"),
                                result.getString("Name"),
                                result.getString("CountryCode"),
                                result.getString("District"),
                                result.getInt("Population")
                        )
                    );
                }
        }catch(SQLException exception){
          helper.showErrorMessage(exception); 
        }
        return cities;
    }
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountryCode;
    private javax.swing.JLabel lblDist;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPop;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField tbxCountryCode;
    private javax.swing.JTextField tbxDist;
    private javax.swing.JTextField tbxName;
    private javax.swing.JTextField tbxPop;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
