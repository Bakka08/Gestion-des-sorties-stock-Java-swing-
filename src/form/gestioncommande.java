/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import services.CommandeService;
import entities.Commande;
import entities.Produit;
import services.ClientService;
import entities.Client;
import entities.Sortie;
import entities.LigneCommande;
import entities.stock;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.LigneCommandeService;
import services.ProduitService;
import services.StockService;
import services.SortieService;
/**
 *
 * @author computer
 */
public class gestioncommande extends javax.swing.JInternalFrame {
    private ClientService cs;
    private CommandeService cms;
    private ProduitService ps;
    private SortieService sts;
    private LigneCommandeService lcs;
    private DefaultTableModel model;
    private DefaultTableModel model2;
    private static int id;
    private static int commandesta;
    private static  int produitsta;
    private StockService ss;
    private static  int quantitesta;
    
 
    public gestioncommande() {
        initComponents();
          this.setTitle("Gestion des commandes");
        cs = new ClientService();
        cms = new  CommandeService();
        lcs = new LigneCommandeService();
        ps = new ProduitService();
        ss = new StockService();
        sts = new SortieService();
        
        loadclient();
        loadcommande2();
        loadproduit();
       
        model = (DefaultTableModel) listcommande.getModel();
        model2 = (DefaultTableModel) listlignecommande.getModel();
        loadlignecommande();
        loadcommande();
        
    }

    
  private void loadcommande() {
        model.setRowCount(0);
        for (Commande c : cms.findAll()) {
            model.addRow(new Object[]{
                c.getId(),
                c.getDate(),
               c.getClient().getId()
                });
        }
    }

    private void loadclient() {
        for (Client s : cs.findAll()) {
            listclient.addItem(s.getId());
        }
    }
    private void loadlignecommande() {
        model2.setRowCount(0);
        for (LigneCommande l : lcs.findAll()) {
            model2.addRow(new Object[]{
                l.getCommand().getId(),
                l.getProduit().getId(),
                l.getPrix(),
                l.getQuantite()
                });
        }
    }

    private void loadproduit() {
        for (Produit s : ps.findAll()) {
            listproduit.addItem(s.getId());
        }
    }
    private void loadcommande2() {
        for (Commande s : cms.findAll()) {
            listcommande2.addItem(s.getId());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        Ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        listclient = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listcommande = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listcommande2 = new javax.swing.JComboBox();
        listproduit = new javax.swing.JComboBox();
        txtquantite = new javax.swing.JTextField();
        txtprix = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listlignecommande = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("information commande"));

        jLabel1.setText("date");

        jLabel2.setText("client");

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        listclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listclientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(listclient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajouter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(listclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modifier))
                .addGap(18, 18, 18)
                .addComponent(supprimer)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("list des commande"));

        listcommande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "date", "client"
            }
        ));
        listcommande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listcommandeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listcommande);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("information ligne commande"));

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("quantite");

        jLabel4.setText("prix");

        jLabel5.setText("commande");

        jLabel6.setText("produit");

        txtquantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtprix, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(listcommande2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listproduit, 0, 112, Short.MAX_VALUE)
                    .addComponent(txtquantite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(listcommande2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(listproduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtquantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("list des lignes de commande"));

        listlignecommande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "commande", "produit", "prix", "quantite"
            }
        ));
        listlignecommande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listlignecommandeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listlignecommande);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
         
        
        Date date = txtDate.getDate();
        int c = (int) listclient.getSelectedItem();
        if (cms.update(new Commande(id, date ,cs.findById(c)))) {
            JOptionPane.showMessageDialog(this, "Bien modifi??");
            loadcommande();           
            
            
            
        
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void listclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listclientActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed

       Date date = txtDate.getDate();
       int answer = 0;
        int c =  (int) listclient.getSelectedItem();
        
        if (cms.create(new Commande(date,cs.findById(c)))) {
            JOptionPane.showMessageDialog(this, "Bien ajout??");
            loadcommande();
            loadcommande2();
          answer=1;
        }
        if(answer==1){
            sts.create(new Sortie(0, cms.findByClient(cs.findById(c))));
        }
    }//GEN-LAST:event_AjouterActionPerformed

    private void listcommandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listcommandeMouseClicked
         id = Integer.parseInt(model.getValueAt(listcommande.getSelectedRow(), 0).toString());
        txtDate.setDate((Date) model.getValueAt(listcommande.getSelectedRow(), 1));
        listclient.setSelectedItem((int)model.getValueAt(listcommande.getSelectedRow(), 2));
    }//GEN-LAST:event_listcommandeMouseClicked

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
          int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous bien supprimer cette commande ?");
        if (reponse == 0 && id != 0) {  

            cms.delete(cms.findById(id));
            JOptionPane.showMessageDialog(this, "Bien supprim??");
            loadcommande();
            loadcommande2();
            
           
        }
    }//GEN-LAST:event_supprimerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int answer=0;
        int quantite = Integer.parseInt(txtquantite.getText());
        Double prix = Double.parseDouble(txtprix.getText());
        int p =  (int) listproduit.getSelectedItem();
        int cm =  (int) listcommande2.getSelectedItem();
        int q= ss.findById(p).getQuantite();
        int newq =q-quantite;
        if(q<quantite){
                answer=1;
            JOptionPane.showMessageDialog(this, "insuffisant quantit?? dans le stock ");}
        if(answer==0){
             if(lcs.create(new LigneCommande(quantite, prix, cms.findById(cm), ps.findById(p)))) {
            JOptionPane.showMessageDialog(this, "Bien ajout??");
            loadlignecommande();
            ss.update(new stock(ps.findById(p), newq));
            
            
            
          
        }
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listlignecommandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listlignecommandeMouseClicked
       commandesta= Integer.parseInt(model2.getValueAt(listlignecommande.getSelectedRow(), 0).toString());
       produitsta= Integer.parseInt(model2.getValueAt(listlignecommande.getSelectedRow(), 1).toString());
    
       quantitesta= Integer.parseInt(model2.getValueAt(listlignecommande.getSelectedRow(), 3).toString());
       
       listcommande2.setSelectedItem((int)model2.getValueAt(listlignecommande.getSelectedRow(), 0));
       listproduit.setSelectedItem((int)model2.getValueAt(listlignecommande.getSelectedRow(), 1));
         txtquantite.setText(model2.getValueAt(listlignecommande.getSelectedRow(), 3).toString());
         txtprix.setText(model2.getValueAt(listlignecommande.getSelectedRow(), 2).toString());
       
    }//GEN-LAST:event_listlignecommandeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous bien supprimer cette commande ?");
        if (reponse == 0 ) {
            int p =  (int) listproduit.getSelectedItem();
            int q= ss.findById(p).getQuantite();
            int newq =q+quantitesta;
            ss.update(new stock(ps.findById(p), newq));
           lcs.delete(new LigneCommande(quantitesta, 0, cms.findById(commandesta), ps.findById(produitsta)));
           JOptionPane.showMessageDialog(this, "Bien supprim??");
            loadlignecommande();
           
        }
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtquantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantiteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox listclient;
    private javax.swing.JTable listcommande;
    private javax.swing.JComboBox listcommande2;
    private javax.swing.JTable listlignecommande;
    private javax.swing.JComboBox listproduit;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supprimer;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtquantite;
    // End of variables declaration//GEN-END:variables
}
