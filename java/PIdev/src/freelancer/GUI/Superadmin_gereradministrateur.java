/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freelancer.GUI;

import freelancer.connection.DataSource;
import freelancer.dao.classes.AdministrateurDAO;
import freelancer.entities.Administrateur;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;


/**
 *
 * @author ASUS
 */
public class Superadmin_gereradministrateur extends javax.swing.JFrame {
ArrayList<Administrateur> A_Administrateur;
       String pseudo;
    /**
    * Creates new form AffichageAdministrateur
    */
       
public Superadmin_gereradministrateur(String pseudo) {
        
        initComponents();
        setTitle("Gestion Des Administrateurs");
    setSize(800,600);
    setResizable(false);this.setLocationRelativeTo(null);
        AdministrateurDAO admin = new AdministrateurDAO();
  A_Administrateur=(ArrayList<Administrateur>) admin.DisplayAllAdministrateurs();
    this.pseudo=pseudo;
        tf_pseudo.setText(pseudo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_supprimer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_supprimer = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        tf_pseudo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bt_logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bt_pdf = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        bt_supprimer1.setText("supprimer");
        bt_supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_supprimer1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable1.setModel(new ModelAdministrateur()

        );
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 190, 580, 227);

        bt_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_supprimer);
        bt_supprimer.setBounds(90, 490, 250, 60);

        Message.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(Message);
        Message.setBounds(148, 342, 328, 43);

        tf_pseudo.setEditable(false);
        tf_pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pseudoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pseudo);
        tf_pseudo.setBounds(90, 110, 123, 20);

        jLabel9.setText("Interface Superadmin ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 90, 107, 14);

        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(bt_logout);
        bt_logout.setBounds(670, 10, 120, 40);

        jButton1.setText("retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(976, 427, 63, 23);

        bt_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pdfActionPerformed(evt);
            }
        });
        getContentPane().add(bt_pdf);
        bt_pdf.setBounds(450, 490, 240, 60);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(603, 0, 40, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freelancer/Images/SuperAdmin_gererAdminstrateur.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supprimerActionPerformed
 AdministrateurDAO adDAO = new AdministrateurDAO();
 if(jTable1.getSelectedRow()==-1){
     if(A_Administrateur.size()==0){
      Message.setText("Table vide");
     }else
  Message.setText("Selectionner un Administrateur");
  }
 else{
 adDAO.deleteAdministrateur((String)jTable1.getValueAt(jTable1.getSelectedRow(),4));
 Superadmin_gereradministrateur a1 = new Superadmin_gereradministrateur(pseudo);
        setVisible(false);//Masquer la JFrame actuelle
        a1.setVisible(true);//Afficher la JFrame Résultat r1 
        
  }  
    }//GEN-LAST:event_bt_supprimerActionPerformed

    private void bt_supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supprimer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_supprimer1ActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void tf_pseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pseudoActionPerformed

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
        Jhome a = new Jhome();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Superadmin_profil s = new Superadmin_profil(pseudo);
        setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pdfActionPerformed
       try{
        Connection connection;
            connection =DataSource.getInstance().getConnection();
            System.out.println("1");
            JasperDesign Jasperdesign = JRXmlLoader.load("classic\\classic.jrxml");
            
            
            System.out.println("2");
            JasperReport Jasperreport = JasperCompileManager.compileReport(Jasperdesign);
            System.out.println("3");
            Map parameters = new HashMap();
            parameters.put("Titre","Titre");
            System.out.println("4");
            JasperPrint jasperPrint = JasperFillManager.fillReport(Jasperreport,null,connection);
            System.out.println("5");
            JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\Amine\\Desktop\\PIdev\\ListeAdministrateur.pdf" );
                    System.out.println("pdf généré");
        } catch (JRException ex) {
            Logger.getLogger(Superadmin_gereradministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_pdfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Superadmin_profil s = new Superadmin_profil(pseudo);
        setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      bt_logout.setBorderPainted(false); 
bt_logout.setContentAreaFilled(false); 
bt_logout.setFocusPainted(false); 
bt_logout.setOpaque(false);

jButton2.setBorderPainted(false); 
jButton2.setContentAreaFilled(false); 
jButton2.setFocusPainted(false); 
jButton2.setOpaque(false);

bt_pdf.setBorderPainted(false); 
bt_pdf.setContentAreaFilled(false); 
bt_pdf.setFocusPainted(false); 
bt_pdf.setOpaque(false);

bt_supprimer.setBorderPainted(false); 
bt_supprimer.setContentAreaFilled(false); 
bt_supprimer.setFocusPainted(false); 
bt_supprimer.setOpaque(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Superadmin_gereradministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Superadmin_gereradministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Superadmin_gereradministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Superadmin_gereradministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Message;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_pdf;
    private javax.swing.JButton bt_supprimer;
    private javax.swing.JButton bt_supprimer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_pseudo;
    // End of variables declaration//GEN-END:variables
}