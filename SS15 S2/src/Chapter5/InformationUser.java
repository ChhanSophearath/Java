/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Chapter5;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sophea Roth
 */
public class InformationUser extends javax.swing.JFrame {

   
    public InformationUser() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        btnGoToEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnOrther = new javax.swing.JRadioButton();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        tableList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Viya", "Male", "KPT"},
                {"2", "ABC", "Male", "PP"},
                {"3", "BB", "Female", "BTB"}
            },
            new String [] {
                "ID", "Name", "Gender", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableList.setShowGrid(false);
        tableList.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tableList);

        btnGoToEdit.setBackground(new java.awt.Color(102, 255, 102));
        btnGoToEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoToEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnGoToEdit.setText("Go To Edit");
        btnGoToEdit.setActionCommand("Add ");
        btnGoToEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEditActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        buttonGroup1.add(btnMale);
        btnMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMale.setSelected(true);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnFemale);
        btnFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnOrther);
        btnOrther.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrther.setText("Orther");
        btnOrther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrtherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrther)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMale)
                    .addComponent(btnFemale)
                    .addComponent(btnOrther))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        btnAdd.setBackground(new java.awt.Color(0, 102, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setActionCommand("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("List customer information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGoToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(btnGoToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnGoToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEditActionPerformed
       
         DefaultTableModel model =  (DefaultTableModel)tableList.getModel();
        
            EditInformation secondFrame = new EditInformation();
            secondFrame.tableEdit.setModel(model);
            secondFrame.setVisible(true);
        
        
    }//GEN-LAST:event_btnGoToEditActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnOrtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrtherActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

          DefaultTableModel model =  (DefaultTableModel)tableList.getModel();
          
          String gender = "Male";
          
          
          if (btnMale.isSelected()){
              gender = "Male";
          }else if (btnFemale.isSelected()){
              gender = "Female";
          }else{
              gender = "Orther";  
          }
          boolean idExists = false;
       
        if (txtId.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this,("Please enter id!"));
        }else if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,("Please enter name!"));
        }else if ( txtAddress.getText().isEmpty()){
             JOptionPane.showMessageDialog(this,("Please enter address!"));
        }else{

            String idValue = txtId.getText();
            
                for (int list = 0; list < tableList.getRowCount();list++){
                String value = tableList.getValueAt(list, 0).toString();
                if (idValue.equals(value)) {
                    idExists = true;
                    JOptionPane.showMessageDialog(this,("Id alredy exists."));
                    break;
                }else{
                    
                    
                }
            }
            
            try {
                int number = Integer.parseInt(idValue);
                if (!idExists){
                    String row[] =  {txtId.getText(),txtName.getText(),gender ,txtAddress.getText() };
                    model.addRow(row);
                    txtId.setText("");
                    txtName.setText("");
                    txtAddress.setText("");
                    btnMale.setSelected(true);
                }
                
            } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(this,("Please specify a valid id."));
            }
   
        }
      
    }//GEN-LAST:event_btnAddActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatGitHubDarkContrastIJTheme());
            UIManager.put( "Button.arc", 999 );
            UIManager.put( "Component.arc", 999 );
            UIManager.put( "ProgressBar.arc", 999 );
            UIManager.put( "TextComponent.arc", 999 );
        } catch (Exception e) {
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationUser().setVisible(true);
            }
        });
    }
    
  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JButton btnGoToEdit;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOrther;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
