/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Chapter5;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Sophea Roth
 */
public class TransferData extends javax.swing.JFrame {
 
     String[] strings = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla",
         "Antigua & Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", 
         "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan",
         "Bolivia", "Bosnia & Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", 
         "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
         "Central African Republic", "Chad", "Chile", "China", "China - Hong Kong / Macau", "Colombia", 
         "Comoros", "Congo", "Congo, Democratic Republic of (DRC)", "Cook Islands", "Costa Rica", "Croatia",
         "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
         "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini",
         "Ethiopia", "Faroe Islands", "Federated States of Micronesia", "Fiji", "Finland",
         "France", "French Guiana", "Gabon", "Gambia, Republic of The", "Georgia", "Germany", "Ghana",
         "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guatemala", "Guinea", "Guinea-Bissau",
         "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
         "Indonesia", "Iran", "Iraq", "Israel and the Occupied Territories", "Italy",
         "Ivory Coast (Cote d'Ivoire)", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya",
         "Kiribati", "Korea, Democratic Republic of (North Korea)", "Korea, Republic of (South Korea)",
         "Kosovo", "Kuwait", "Kyrgyz Republic (Kyrgyzstan)", "Laos", "Latvia", "Lebanon", "Lesotho",
         "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia",
         "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte",
         "Mexico", "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco",
         "Mozambique", "Myanmar/Burma", "Namibia", "Nauru", "Nepal", "New Zealand", "Nicaragua", "Niger", "Nigeria",
         "Niue", "North Macedonia, Republic of", "Norway", "Oman", "Pakistan", "Palau", "Panama", 
         "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar",
         "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
         "Saint Vincent and the Grenadines", "Samoa", "Sao Tome and Principe", "Saudi Arabia", "Senegal", 
         "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovak Republic (Slovakia)", "Slovenia",
         "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan",
         "Suriname", "Sweden", "Switzerland", "Syria", "Türkiye (Turkey)", "Taiwan", "Tajikistan", "Tanzania",
         "Thailand", "Netherlands", "Timor Leste", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia",
         "Turkmenistan", "Turks & Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates",
         "United States of America (USA)", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", 
         "Virgin Islands (UK)", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe" };
   
     DefaultListModel<String> modOne = new DefaultListModel<>();
      DefaultListModel<String> modTwo = new DefaultListModel<>();
     
     
    public TransferData() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listTwo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOne = new javax.swing.JList<>();
        btnTranOne = new javax.swing.JButton();
        btnTranAll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBackAll = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listTwo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listTwo);

        listOne.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listOne.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua & Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia & Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "China - Hong Kong / Macau", "Colombia", "Comoros", "Congo", "Congo, Democratic Republic of (DRC)", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Faroe Islands", "Federated States of Micronesia", "Fiji", "Finland", "France", "French Guiana", "Gabon", "Gambia, Republic of The", "Georgia", "Germany", "Ghana", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Israel and the Occupied Territories", "Italy", "Ivory Coast (Cote d'Ivoire)", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic Republic of (North Korea)", "Korea, Republic of (South Korea)", "Kosovo", "Kuwait", "Kyrgyz Republic (Kyrgyzstan)", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar/Burma", "Namibia", "Nauru", "Nepal", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "North Macedonia, Republic of", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovak Republic (Slovakia)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Türkiye (Turkey)", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Netherlands", "Timor Leste", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkmenistan", "Turks & Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United States of America (USA)", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (UK)", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listOne);

        btnTranOne.setBackground(new java.awt.Color(153, 255, 255));
        btnTranOne.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTranOne.setForeground(new java.awt.Color(0, 0, 0));
        btnTranOne.setText(">");
        btnTranOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranOneActionPerformed(evt);
            }
        });

        btnTranAll.setBackground(new java.awt.Color(153, 255, 255));
        btnTranAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTranAll.setForeground(new java.awt.Color(0, 0, 0));
        btnTranAll.setText(">>");
        btnTranAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranAllActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 153));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBackAll.setBackground(new java.awt.Color(204, 255, 153));
        btnBackAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBackAll.setForeground(new java.awt.Color(0, 0, 0));
        btnBackAll.setText("<<");
        btnBackAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackAllActionPerformed(evt);
            }
        });

        btnDefault.setBackground(new java.awt.Color(255, 102, 51));
        btnDefault.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDefault.setForeground(new java.awt.Color(255, 255, 255));
        btnDefault.setText("Default");
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transfer Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBackAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTranAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTranOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTranOne, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTranAll)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnBackAll)
                        .addGap(18, 18, 18)
                        .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTranOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranOneActionPerformed

        
        
        if (listOne.getSelectedValuesList().size() > 0){
            
             ArrayList <String> items =  (ArrayList <String>) listOne.getSelectedValuesList();
             for (String tem : items){
             modTwo.addElement(tem);
            }
        
        while(!listOne.isSelectionEmpty()){
            int i = listOne.getSelectedIndex();
            modOne.remove(i);
        }
        
        listTwo.setModel(modTwo);
        }else{  
          
            if (modOne.size() <= 0){
                  JOptionPane.showMessageDialog(this,("Data Is Empty."));
         
            }else{
                  JOptionPane.showMessageDialog(this,("Is Selection Empty."));
         
            }
            
          
        }
        
        
        
    }//GEN-LAST:event_btnTranOneActionPerformed

    private void btnTranAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranAllActionPerformed

        if (modOne.size() <= 0){
             JOptionPane.showMessageDialog(this,("Data is empty."));
        }else{

            for  ( int i = 0 ; i< modOne.size(); i++){
               modTwo.addElement(modOne.get(i));
            }
               listTwo.setModel(modTwo);
               modOne.removeAllElements(); 
        }
        
        
    }//GEN-LAST:event_btnTranAllActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     
        
        if (!listTwo.getSelectedValuesList().isEmpty()){
             ArrayList <String> items =  (ArrayList <String>) listTwo.getSelectedValuesList();

        for (String tem : items){
           modOne.addElement(tem);
        }
        while(!listTwo.isSelectionEmpty()){
            int i = listTwo.getSelectedIndex();
            modTwo.remove(i);
        }
        
        listTwo.setModel(modTwo);
        }else{
            
            if (modTwo.size() <= 0){
                  JOptionPane.showMessageDialog(this,("Data Is Empty."));
         
            }else{
                  JOptionPane.showMessageDialog(this,("Is Selection Empty."));
         
            }
//             JOptionPane.showMessageDialog(this,("Is Selection Empty."));
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackAllActionPerformed
         
        if (modTwo.size() <= 0){
             JOptionPane.showMessageDialog(this,("Data is empty."));
        }else{
             for  ( int i = 0 ; i< modTwo.size(); i++){
                 modOne.addElement(modTwo.get(i));
            }
      
            listOne.setModel(modOne);
            modTwo.removeAllElements(); 
        }
    }//GEN-LAST:event_btnBackAllActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
             for(String  tem: strings){
                 modOne.addElement(tem);
             }
              listOne.setModel(modOne);
    }//GEN-LAST:event_formWindowOpened

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
      modOne.removeAllElements();
      modTwo.removeAllElements();
        for(String  tem: strings){
            modOne.addElement(tem);
        } 
        listOne.setModel(modOne);
    }//GEN-LAST:event_btnDefaultActionPerformed

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatMaterialDarkerIJTheme());
            UIManager.put( "Button.arc", 999 );
            UIManager.put( "Component.arc", 999 );
            UIManager.put( "ProgressBar.arc", 999 );
            UIManager.put( "TextComponent.arc", 999 );
        } catch (Exception e) {
        }
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackAll;
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnTranAll;
    private javax.swing.JButton btnTranOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listOne;
    private javax.swing.JList<String> listTwo;
    // End of variables declaration//GEN-END:variables
}
