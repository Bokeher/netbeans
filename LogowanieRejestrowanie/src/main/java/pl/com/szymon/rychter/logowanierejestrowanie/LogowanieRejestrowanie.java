/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.logowanierejestrowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Szymon
 */

public class LogowanieRejestrowanie extends javax.swing.JFrame {

    /**
     * Creates new form LogowanieRejestrowanie
     */
    public LogowanieRejestrowanie() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabPane_main = new javax.swing.JTabbedPane();
        jPanel_login = new javax.swing.JPanel();
        jLabel_login_title = new javax.swing.JLabel();
        jLabel_login_email = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_login_password = new javax.swing.JLabel();
        jButton_log_in = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jPanel_register = new javax.swing.JPanel();
        jLabel_register_title = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jTextField_register_username = new javax.swing.JTextField();
        jLabel_register_email = new javax.swing.JLabel();
        jTextField_register_email = new javax.swing.JTextField();
        jLabel_password1 = new javax.swing.JLabel();
        jLabel_password2 = new javax.swing.JLabel();
        jButton_register = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel_error1 = new javax.swing.JLabel();
        jLabel_error2 = new javax.swing.JLabel();
        jLabel_error3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_login_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_login_title.setText("Logowanie");

        jLabel_login_email.setText("Email");

        jLabel_login_password.setText("Password");

        jButton_log_in.setText("Zaloguj");
        jButton_log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_log_inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_email)
                    .addGroup(jPanel_loginLayout.createSequentialGroup()
                        .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_login_title)
                            .addComponent(jLabel_login_email)
                            .addComponent(jLabel_login_password)
                            .addComponent(jButton_log_in))
                        .addGap(0, 308, Short.MAX_VALUE))
                    .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_login_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_login_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_login_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_log_in)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabPane_main.addTab("Logowanie", jPanel_login);

        jLabel_register_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_register_title.setText("Rejestracja");

        jLabel_username.setText("Username");

        jLabel_register_email.setText("Email");

        jLabel_password1.setText("Password");

        jLabel_password2.setText("Confirm password");

        jButton_register.setText("Rejestracja");
        jButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registerActionPerformed(evt);
            }
        });

        jLabel_error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_error1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel_error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_error2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel_error3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_error3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel_registerLayout = new javax.swing.GroupLayout(jPanel_register);
        jPanel_register.setLayout(jPanel_registerLayout);
        jPanel_registerLayout.setHorizontalGroup(
            jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField2)
                    .addComponent(jTextField_register_username)
                    .addComponent(jTextField_register_email)
                    .addComponent(jPasswordField1)
                    .addGroup(jPanel_registerLayout.createSequentialGroup()
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_register_title)
                            .addComponent(jLabel_username)
                            .addComponent(jLabel_register_email)
                            .addComponent(jLabel_password1)
                            .addComponent(jLabel_password2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_registerLayout.createSequentialGroup()
                        .addComponent(jButton_register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_error1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_error2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jLabel_error3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel_registerLayout.setVerticalGroup(
            jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_register_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_register_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_register_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_register_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_password1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_password2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_registerLayout.createSequentialGroup()
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButton_register))
                    .addComponent(jLabel_error2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_error3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabPane_main.addTab("Rejestrowanie", jPanel_register);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPane_main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPane_main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
        clear();
        if(checkRegisterData()) {
            FileUtils fu = new FileUtils();
            
            String username = jTextField_register_username.getText();
            String email = jTextField_register_email.getText();
            String pass = String.valueOf(jPasswordField1.getPassword());
            
            fu.savePasswordToFile(username, email, pass, f);
        }
    }//GEN-LAST:event_jButton_registerActionPerformed

    private void jButton_log_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_log_inActionPerformed
        checkLogin();
    }//GEN-LAST:event_jButton_log_inActionPerformed

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
            java.util.logging.Logger.getLogger(LogowanieRejestrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogowanieRejestrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogowanieRejestrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogowanieRejestrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogowanieRejestrowanie().setVisible(true);
            }
        });
    }
    
    private void clear(){
        jLabel_error1.setText("");
        jLabel_error2.setText("");
        jLabel_error3.setText("");
    }
    
    private boolean checkRegisterData(){
        boolean username_err = false;
        boolean email_err = false;
        boolean password_err = false;
        
        //valid username (only letters, min length 2, max length 20)
        String username = jTextField_register_username.getText();
        if(!(username.length() >= 2 && username.length() <= 20)) username_err = true;
        else {
            for(int i=0; i<username.length(); i++){
                char ch = username.charAt(i);
                if(!((ch >= 'A' && ch<= 'Z') || (ch <= 'z' && ch>= 'a'))) username_err = true; 
            }
        }
        
        //valid email (only one '.', only one '@', only letters)
        String email = jTextField_register_email.getText();
        if(email.contains("@") && email.indexOf("@") > 0){
            if(email.indexOf("@")+1<email.length()){
                String tab[] = email.split("@");
                if(tab[1].contains(".")){
                    if(tab[1].indexOf(".")+1<tab[1].length()){
                        int dots = 0;
                        int ats = 0;
                        for(int i=0; i<email.length(); i++){
                            char ch = email.charAt(i);
                            if(ch == '.') dots++;
                            else if(ch == '@') ats++;
                            else if(!((ch >= 'A' && ch<= 'Z') || (ch <= 'z' && ch>= 'a'))) email_err = true;
                        }
                        if(ats > 1 || dots > 1) email_err = true;
                    }else email_err = true;
                }else email_err = true;
            }else email_err = true;
        }else email_err = true;
        
        //valid password (both passwords are the same, only letters and numbers)
        String password1 = String.valueOf(jPasswordField1.getPassword());
        String password2 = String.valueOf(jPasswordField2.getPassword());
        
        if(password1.length() >= 4 && password1.equals(password2)){
            for(int i=0; i<password1.length(); i++){
                char ch = password1.charAt(i);
                if(!((ch >= 'A' && ch<= 'Z') || (ch <= 'z' && ch>= 'a') || (ch >= '0' && ch <= '9'))) password_err = true; 
            }
        }else password_err = true;
        
        //Errors
        if(username_err == true) jLabel_error1.setText("Nieprawidłowa nazwa użytkownika");
        if(email_err == true) jLabel_error2.setText("Nieprawidłowy email");
        if(password_err == true) jLabel_error3.setText("Nieprawidłowe hasło");
        
        if(username_err == true || email_err == true || password_err == true) return false;
        else return true;
    }
    
//    private void savePasswordToFile(){
//        String username = jTextField_register_username.getText();
//        String email = jTextField_register_email.getText();
//        String pass = String.valueOf(jPasswordField1.getPassword());
//        
//        try{
//            FileWriter fw = new FileWriter(new File(f), true);
//            fw.write(username+":"+email+":"+pass);
//            fw.close();
//        }catch(IOException ex){
//            System.out.println(ex.toString());
//        }
//    }
    
    private void checkLogin(){
        String email = jTextField_email.getText();
        String pass = String.valueOf(jPasswordField.getPassword());
        
        FileUtils fu = new FileUtils();
        String data = fu.loadData("sekretnehasla.csv");
        System.out.println(data);
        if(data.indexOf(";")+1 > email.length()){
            String users[] = data.split(";");
            
            int i = data.indexOf(";");
            int count = 0;
            while (i != -1) {
                count++;
                data = data.substring(i+1);
                i = data.indexOf(";");
            }
            
            
            System.out.println("Count: "+count);
            
            for(i = 0; i<count; i++){
                String []temp = users[i].split(":");
                System.out.println(email+" - "+temp[1]+" | "+pass+" - "+temp[2]);
                if(email.equals(temp[1]) && pass.equals(temp[2])){
                    JOptionPane.showMessageDialog(null, ("Witaj "+temp[0]), "", JOptionPane.PLAIN_MESSAGE);
                }
            }
            
        }
    }
    
    String f = "sekretnehasla.csv";
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_log_in;
    private javax.swing.JButton jButton_register;
    private javax.swing.JLabel jLabel_error1;
    private javax.swing.JLabel jLabel_error2;
    private javax.swing.JLabel jLabel_error3;
    private javax.swing.JLabel jLabel_login_email;
    private javax.swing.JLabel jLabel_login_password;
    private javax.swing.JLabel jLabel_login_title;
    private javax.swing.JLabel jLabel_password1;
    private javax.swing.JLabel jLabel_password2;
    private javax.swing.JLabel jLabel_register_email;
    private javax.swing.JLabel jLabel_register_title;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_register;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTabbedPane jTabPane_main;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_register_email;
    private javax.swing.JTextField jTextField_register_username;
    // End of variables declaration//GEN-END:variables
}
