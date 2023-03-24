/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;
import Controlers.CtrlAdmin;
import Controlers.CtrlUser;
import Entities.User;
import Entities.Vehicule;
import Tools.ConnexionBDD;
import Tools.ModelJTable;
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
public class FrmRespModifVehicule extends javax.swing.JFrame {
    ModelJTable mdl;
    CtrlUser ctrlUser;
    ConnexionBDD cnx;
    Vehicule unVehicule;
    CtrlAdmin leCtrlA;
    /**
     * Creates new form FrmRespAjoutVehicule
     */
    public FrmRespModifVehicule(User unUser) {
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

        txtImmatriculation = new javax.swing.JTextField();
        txtMarque = new javax.swing.JTextField();
        txtModele = new javax.swing.JTextField();
        lblImmatriculation = new javax.swing.JLabel();
        lblMarque = new javax.swing.JLabel();
        lblModele = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategorie = new javax.swing.JList<>();
        lblModele1 = new javax.swing.JLabel();
        txtAnnee = new javax.swing.JTextField();
        lblAnnee = new javax.swing.JLabel();
        btnValider = new javax.swing.JButton();
        lbLAjouterTitre = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVehicule = new javax.swing.JList<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtImmatriculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImmatriculationActionPerformed(evt);
            }
        });

        txtMarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarqueActionPerformed(evt);
            }
        });

        txtModele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeleActionPerformed(evt);
            }
        });

        lblImmatriculation.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblImmatriculation.setText("Immatriculation:");

        lblMarque.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblMarque.setText("Marque :");

        lblModele.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblModele.setText("Modele :");

        lstCategorie.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(lstCategorie);

        lblModele1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblModele1.setText("Catégorie :");

        txtAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnneeActionPerformed(evt);
            }
        });

        lblAnnee.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblAnnee.setText("Année du vehicule :");

        btnValider.setText("VALIDER");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        lbLAjouterTitre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbLAjouterTitre.setText("MODIFIER UN VEHICULE EXISTANT");

        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        lstVehicule.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstVehicule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVehiculeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstVehicule);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lbLAjouterTitre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(btnRetour)))
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImmatriculation)
                            .addComponent(lblMarque)
                            .addComponent(lblModele))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModele, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModele1)
                                    .addComponent(lblAnnee))
                                .addGap(25, 25, 25)
                                .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMarque, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(btnValider)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbLAjouterTitre)
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblImmatriculation)
                                    .addComponent(lblModele1)
                                    .addComponent(txtImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMarque)
                                    .addComponent(txtMarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModele)
                                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnnee)
                                    .addComponent(txtModele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnValider)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addComponent(btnRetour)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtImmatriculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImmatriculationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImmatriculationActionPerformed

    private void txtMarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarqueActionPerformed

    private void txtModeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeleActionPerformed

    private void txtAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnneeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        leCtrlA = new CtrlAdmin();
        ctrlUser = new CtrlUser();
        try {
            lstCategorie.setModel(leCtrlA.getCategorie());
            lstVehicule.setModel(leCtrlA.getImma());
        } catch (SQLException ex) {
            Logger.getLogger(FrmRespSommaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        if (txtImmatriculation.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une plaque d'immatriculation","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtMarque.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une marque","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtModele.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir un modèle","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtAnnee.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une Annee","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else if (txtMarque.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this, "Saisir une marque","Erreur de Saisie",JOptionPane.ERROR_MESSAGE);
        }
        else {
        try {
            unVehicule = leCtrlA.getInfoVehicule(lstVehicule.getSelectedValue());
            leCtrlA.ModifVehicule(txtImmatriculation.getText(), txtMarque.getText(), txtModele.getText(), Integer.parseInt(txtAnnee.getText()), Integer.parseInt(leCtrlA.getCategorieId(lstCategorie.getSelectedValue())),unVehicule.getImmatriculation());
        } catch (SQLException ex) {
            Logger.getLogger(FrmRespModifVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Vos informations ont bien été modifié","Ok",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void lstVehiculeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVehiculeMouseClicked
        cnx = new ConnexionBDD();
        unVehicule = leCtrlA.getInfoVehicule(lstVehicule.getSelectedValue());
        txtImmatriculation.setText(unVehicule.getImmatriculation());
        txtMarque.setText(unVehicule.getMarque());
        txtModele.setText(unVehicule.getModele());
        txtAnnee.setText(String.valueOf(unVehicule.getAnnee()));
        lstCategorie.setSelectedIndex(unVehicule.getCodeCategorie());
        
    }//GEN-LAST:event_lstVehiculeMouseClicked

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
            java.util.logging.Logger.getLogger(FrmRespModifVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRespModifVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRespModifVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRespModifVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRespModifVehicule(leUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnValider;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbLAjouterTitre;
    private javax.swing.JLabel lblAnnee;
    private javax.swing.JLabel lblImmatriculation;
    private javax.swing.JLabel lblMarque;
    private javax.swing.JLabel lblModele;
    private javax.swing.JLabel lblModele1;
    private javax.swing.JList<String> lstCategorie;
    private javax.swing.JList<String> lstVehicule;
    private javax.swing.JTextField txtAnnee;
    private javax.swing.JTextField txtImmatriculation;
    private javax.swing.JTextField txtMarque;
    private javax.swing.JTextField txtModele;
    // End of variables declaration//GEN-END:variables
}
