/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlAdmin;
import Controlers.CtrlUser;
import Entities.Categorie;
import Entities.User;
import Tools.ConnexionBDD;
import Vues.FrmConnexion;
import static Vues.FrmRespSommaire.leUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class FrmRespCategorie extends javax.swing.JFrame {
        CtrlAdmin leCtrlA;
        CtrlUser ctrlUser;
        ConnexionBDD cnx;
        Categorie unCategorie;
        
    /**
     * Creates new form FrmRespSommaire
     */
    public FrmRespCategorie(User unUser) {
        initComponents();
        leUser = unUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeco = new javax.swing.JButton();
        btnResp = new javax.swing.JButton();
        btnVehicule = new javax.swing.JButton();
        btnMoniteur = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnLecon = new javax.swing.JButton();
        btnCategorie = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        txtLibelle = new javax.swing.JTextField();
        lblLibelle = new javax.swing.JLabel();
        lblPrix = new javax.swing.JLabel();
        txtPrix = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblModifier = new javax.swing.JLabel();
        lblLibelle1 = new javax.swing.JLabel();
        lblPrix1 = new javax.swing.JLabel();
        txtLibelleModif = new javax.swing.JTextField();
        txtPrixModif = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCategorie = new javax.swing.JList<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDeco.setText("Déconnexion");
        btnDeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecoActionPerformed(evt);
            }
        });

        btnResp.setBackground(new java.awt.Color(0, 255, 100));
        btnResp.setText("Responsable");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        btnVehicule.setText("Véhicule");
        btnVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculeActionPerformed(evt);
            }
        });

        btnMoniteur.setText("Moniteur");
        btnMoniteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoniteurActionPerformed(evt);
            }
        });

        btnStats.setText("Statstiques");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        btnLecon.setText("Visualiser le planning des leçons");
        btnLecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeconActionPerformed(evt);
            }
        });

        btnCategorie.setText("Catégorie");
        btnCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorieActionPerformed(evt);
            }
        });

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        lblLibelle.setText("Libelle :");

        lblPrix.setText("Prix :");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setText("Ajouter une catégorie");

        lblModifier.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblModifier.setText("Modifier une catégorie");

        lblLibelle1.setText("Libelle :");

        lblPrix1.setText("Prix :");

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        lstCategorie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCategorieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstCategorie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(btnResp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnLecon, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoniteur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLibelle)
                            .addComponent(lblPrix))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrix)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtLibelle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModifier)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLibelle1)
                            .addComponent(lblPrix1))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrixModif)
                            .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLibelleModif, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeco)
                    .addComponent(btnResp))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVehicule)
                    .addComponent(btnMoniteur)
                    .addComponent(btnStats)
                    .addComponent(btnCategorie))
                .addGap(18, 18, 18)
                .addComponent(btnLecon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLibelle))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrix))
                        .addGap(85, 85, 85)
                        .addComponent(btnAjouter))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModifier)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLibelleModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLibelle1))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrixModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrix1))
                                .addGap(85, 85, 85)
                                .addComponent(btnModifier))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecoActionPerformed
        this.dispose();//ferme le frmEleve
    }//GEN-LAST:event_btnDecoActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
        this.dispose();
        FrmRespCategorie frm = new FrmRespCategorie(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRespActionPerformed

    private void btnVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculeActionPerformed
        this.dispose();
        FrmRespVehicule frm = new FrmRespVehicule(leUser);
        frm.setVisible(true);    
    }//GEN-LAST:event_btnVehiculeActionPerformed

    private void btnMoniteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoniteurActionPerformed
        this.dispose();
        FrmRespMoniteur frm = new FrmRespMoniteur(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMoniteurActionPerformed

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed
        this.dispose();
        FrmRespStats frm = new FrmRespStats(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnStatsActionPerformed

    private void btnLeconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeconActionPerformed
        this.dispose();
        FrmRespLecon frm = new FrmRespLecon(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnLeconActionPerformed

    private void btnCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorieActionPerformed
        this.dispose();
        FrmRespCategorie frm = new FrmRespCategorie(leUser);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCategorieActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
         if (txtLibelle.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une nom pour la catégorie","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtPrix.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un prix","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else {
        leCtrlA.AjoutCategorie(txtLibelle.getText(),Double.parseDouble(txtPrix.getText()));
        JOptionPane.showMessageDialog(this, "Vos informations ont bien été ajouté","Ok",JOptionPane.CANCEL_OPTION);
        }
        
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        leCtrlA = new CtrlAdmin();
        ctrlUser = new CtrlUser();
        txtLibelleModif.setEnabled(false);
        txtPrixModif.setEnabled(false);

        try {
            lstCategorie.setModel(leCtrlA.getCategorie());
        } catch (SQLException ex) {
            Logger.getLogger(FrmRespSommaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        if (txtLibelleModif.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une nom pour la catégorie","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtPrixModif.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un prix","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else {
        leCtrlA.ModifCategorie(unCategorie.getCodeCategorie(), txtLibelleModif.getText(), Double.parseDouble(txtPrixModif.getText()));
        JOptionPane.showMessageDialog(this, "Vos informations ont bien été modifié","Ok",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void lstCategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCategorieMouseClicked
        cnx = new ConnexionBDD();
        txtLibelleModif.setEnabled(true);
        txtPrixModif.setEnabled(true);
        unCategorie = leCtrlA.getInfoCategorie(lstCategorie.getSelectedIndex());
        txtLibelleModif.setText(unCategorie.getLibelle());
        txtPrixModif.setText(String.valueOf(unCategorie.getPrix()));
        lstCategorie.setSelectedIndex(unCategorie.getCodeCategorie());

    }//GEN-LAST:event_lstCategorieMouseClicked

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
            java.util.logging.Logger.getLogger(FrmRespCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRespCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRespCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRespCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRespCategorie(leUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnCategorie;
    private javax.swing.JButton btnDeco;
    private javax.swing.JButton btnLecon;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnMoniteur;
    private javax.swing.JButton btnResp;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton btnVehicule;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLibelle;
    private javax.swing.JLabel lblLibelle1;
    private javax.swing.JLabel lblModifier;
    private javax.swing.JLabel lblPrix;
    private javax.swing.JLabel lblPrix1;
    private javax.swing.JList<String> lstCategorie;
    private javax.swing.JTextField txtLibelle;
    private javax.swing.JTextField txtLibelleModif;
    private javax.swing.JTextField txtPrix;
    private javax.swing.JTextField txtPrixModif;
    // End of variables declaration//GEN-END:variables
}
