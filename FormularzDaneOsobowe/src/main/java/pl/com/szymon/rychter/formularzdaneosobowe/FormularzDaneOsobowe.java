/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.formularzdaneosobowe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Szymon
 */
public class FormularzDaneOsobowe extends javax.swing.JFrame {

    /**
     * Creates new form FormularzDaneOsobowe
     */
    public FormularzDaneOsobowe() {
        initComponents();
        addKeyListenerTojTFLogin();
        addKeyListenerTojTFHeight();
        addKeyListenerTojTFEmail();
        addKeyListenerTojTFWeight();
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
        jC_birthDate = new com.toedter.calendar.JDateChooser();
        jTF_login = new javax.swing.JTextField();
        jL_login = new javax.swing.JLabel();
        jL_title = new javax.swing.JLabel();
        jL_email = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jL_height = new javax.swing.JLabel();
        jTF_height = new javax.swing.JTextField();
        jL_birthDate = new javax.swing.JLabel();
        jTF_weight = new javax.swing.JTextField();
        jL_weight = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jL_err2 = new javax.swing.JLabel();
        jL_err = new javax.swing.JLabel();
        jL_err3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jC_birthDate.setDateFormatString("dd-MM-yyyy");

        jL_login.setText("Login:");

        jL_title.setText("Formularz");

        jL_email.setText("Email:");

        jTF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_emailActionPerformed(evt);
            }
        });

        jL_height.setText("Wzrost:");

        jTF_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_heightActionPerformed(evt);
            }
        });

        jL_birthDate.setText("Data urodzenia");

        jTF_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_weightActionPerformed(evt);
            }
        });

        jL_weight.setText("Waga:");

        jButton1.setText("Zapisz dane");
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_email)
                            .addComponent(jL_login)
                            .addComponent(jL_height)
                            .addComponent(jL_weight))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_login)
                            .addComponent(jTF_height)
                            .addComponent(jTF_weight)
                            .addComponent(jTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jL_err2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jL_birthDate)
                                .addGap(18, 18, 18)
                                .addComponent(jC_birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(jL_err, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jL_title)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(163, Short.MAX_VALUE)
                    .addComponent(jL_err3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_title)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_login))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_email)
                            .addComponent(jTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jL_err2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_height)
                    .addComponent(jTF_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_weight)
                    .addComponent(jTF_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jC_birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_birthDate))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jL_err, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jL_err3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_heightActionPerformed

    private void jTF_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_weightActionPerformed

    private void jTF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jL_err2.setText("");
        jL_err3.setText("");
        jL_err.setText("");
        
        String date = ""+jC_birthDate.getDate();
        
        
        if(jTF_height.getText().length()>3 || jTF_weight.getText().length()>3) jL_err3.setText("Nieprawidłowa wartość");
        
        if(!jTF_email.getText().contains("@") && !jTF_email.getText().contains(".") && jTF_email.getText().length()>0) jL_err3.setText("Nieprawidłowa wartość");
        
        if(jTF_email.getText().equals("") || jTF_height.getText().equals("")|| jTF_weight.getText().equals("") || jTF_login.getText().equals("") || jC_birthDate.getDate() == null) jL_err2.setText("Nie może być pustych pól!");
        else{
            try {
                validateDate();
            } catch (ParseException ex) {
                Logger.getLogger(FormularzDaneOsobowe.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(jL_err.getText() == "" && jL_err2.getText() == "") saveToFile(f);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void saveToFile(File f){
        try{
            FileWriter fw = new FileWriter(f, true);
            
            String login = jTF_login.getText();
            String email = jTF_email.getText();
            String wzrost = jTF_height.getText();
            String waga = jTF_weight.getText();
            String data_urodzenia = ""+jC_birthDate.getDate();
            
            fw.write(login+";"+email+";"+wzrost+";"+waga+";"+data_urodzenia+"\n");
            fw.close();
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
    
    private void addKeyListenerTojTFHeight(){
        jTF_height.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if ((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE)) jTF_height.setEditable(true);
                else jTF_height.setEditable(false);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void addKeyListenerTojTFWeight(){
        jTF_weight.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if ((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE)) jTF_weight.setEditable(true);
                else jTF_weight.setEditable(false);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void addKeyListenerTojTFEmail(){
        jTF_email.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String text = jTF_email.getText();
                char ch = e.getKeyChar();
                
                if(ch == '@'){
                    if(text.contains("@") || text.length()<1) jTF_email.setEditable(false);
                    else jTF_email.setEditable(true);
                }else if(ch == '.'){
                    if(text.contains(".") || !text.contains("@") || text.charAt(text.length()-1) == '@') jTF_email.setEditable(false);
                    else jTF_email.setEditable(true);
                }else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch==KeyEvent.VK_BACK_SPACE) {
                    jTF_email.setEditable(true);
                }else jTF_email.setEditable(false);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void addKeyListenerTojTFLogin(){
        jTF_login.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch==KeyEvent.VK_BACK_SPACE) jTF_login.setEditable(true);
                else jTF_login.setEditable(false);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private void validateDate() throws ParseException{
        Date date = jC_birthDate.getDate();  
        boolean date_err = false;
        if(date.after(Calendar.getInstance().getTime())) date_err = true;
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdformat.parse("1900-01-01");
        if(date.compareTo(date2) <= 0) date_err = true;
        
        if(date_err) jL_err.setText("Nieprawidllowa data");
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
            java.util.logging.Logger.getLogger(FormularzDaneOsobowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularzDaneOsobowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularzDaneOsobowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularzDaneOsobowe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularzDaneOsobowe().setVisible(true);
            }
        });
    }
    
    File f = new File("data.txt");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jC_birthDate;
    private javax.swing.JLabel jL_birthDate;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_err;
    private javax.swing.JLabel jL_err2;
    private javax.swing.JLabel jL_err3;
    private javax.swing.JLabel jL_height;
    private javax.swing.JLabel jL_login;
    private javax.swing.JLabel jL_title;
    private javax.swing.JLabel jL_weight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_email;
    private javax.swing.JTextField jTF_height;
    private javax.swing.JTextField jTF_login;
    private javax.swing.JTextField jTF_weight;
    // End of variables declaration//GEN-END:variables
}
