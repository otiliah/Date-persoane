package persoana;

/*author: otiliaH*/
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PersoaneGUI extends javax.swing.JFrame {

    private ListaPersoane persoane = new ListaPersoane();

    private DefaultListModel numePersoane = new DefaultListModel();
    private String[] sexPers = {"alege sexul", "feminin", "masculin"};
    private DefaultComboBoxModel sexPersoane = new DefaultComboBoxModel(sexPers);

    public PersoaneGUI() {
        initComponents();
        jlPersoane.setModel(numePersoane);
        cbSex.setModel(sexPersoane);
        btnGrAngajatNeangajat.add(rbAngajat);
        btnGrAngajatNeangajat.add(rbNeangajat);
        btnGrAngajatNeangajat.add(rbPensionar);
        btnGrStareCivila.add(cbCasatorit);
        btnGrStareCivila.add(cbNecasatorit);
        btnGrStareCivila.add(cbDivortat);
        btnGrStareCivila.add(cbVaduv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrAngajatNeangajat = new javax.swing.ButtonGroup();
        btnGrStareCivila = new javax.swing.ButtonGroup();
        tfNume = new javax.swing.JTextField();
        tfVarsta = new javax.swing.JTextField();
        cbSex = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlPersoane = new javax.swing.JList<>();
        btnExit = new javax.swing.JButton();
        btnAdaugaPersoana = new javax.swing.JButton();
        btnStergePersoana = new javax.swing.JButton();
        btnStergeLista = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbAngajat = new javax.swing.JRadioButton();
        rbNeangajat = new javax.swing.JRadioButton();
        rbPensionar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbNecasatorit = new javax.swing.JCheckBox();
        cbCasatorit = new javax.swing.JCheckBox();
        cbVaduv = new javax.swing.JCheckBox();
        cbDivortat = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nume:");

        jLabel2.setText("Varsta:");

        jLabel3.setText("Sex:");

        jlPersoane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPersoaneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlPersoane);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdaugaPersoana.setText("Adauga persoana");
        btnAdaugaPersoana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaPersoanaActionPerformed(evt);
            }
        });

        btnStergePersoana.setText("Sterge persoana");
        btnStergePersoana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergePersoanaActionPerformed(evt);
            }
        });

        btnStergeLista.setText("Sterge lista");
        btnStergeLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergeListaActionPerformed(evt);
            }
        });

        jLabel4.setText("Angajat/Neangajat:");

        rbAngajat.setText("Angajat");

        rbNeangajat.setText("Neangajat");

        rbPensionar.setText("Pensionar");

        jLabel5.setText("Stare civila:");

        cbNecasatorit.setText("Necasatorit");

        cbCasatorit.setText("Casatorit");
        cbCasatorit.setMaximumSize(new java.awt.Dimension(81, 23));
        cbCasatorit.setPreferredSize(new java.awt.Dimension(81, 23));

        cbVaduv.setText("Vaduv");

        cbDivortat.setText("Divortat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnAdaugaPersoana, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnStergePersoana, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btnStergeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbPensionar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbNeangajat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbAngajat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCasatorit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbVaduv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDivortat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNecasatorit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfNume))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfVarsta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStergePersoana)
                            .addComponent(btnAdaugaPersoana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStergeLista)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfVarsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNecasatorit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCasatorit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVaduv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDivortat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbAngajat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNeangajat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPensionar)))
                        .addGap(75, 75, 75)))
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdaugaPersoanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaPersoanaActionPerformed
        String nume = tfNume.getText().trim();
        String varsta = tfVarsta.getText().trim();
        String sex = cbSex.getSelectedIndex() > 0 ? (String) cbSex.getSelectedItem() : null;
        String angajat = rbAngajat.isSelected() ? "Angajat/a"
                : rbNeangajat.isSelected() ? "Neangajat/a"
                : rbPensionar.isSelected() ? "Pensionar/a"
                : null;
        String stareCivila = cbCasatorit.isSelected() ? "Casatorit/a"
                : cbNecasatorit.isSelected() ? "Necasatorit/a"
                : cbDivortat.isSelected() ? "Divortat/a"
                : cbVaduv.isSelected() ? "Vaduv/a"
                : null;
        if (Persoana.getInstance(nume, varsta, sex, stareCivila, angajat) == null || sex == null || angajat == null || stareCivila == null) {
            JOptionPane.showMessageDialog(this, "Persoana NU a fost creata! \nCompletati toate campurile si asigurati-va ca datele sunt valide!");
            return;
        }
        persoane.adaugarePersoana(Persoana.getInstance(nume, varsta, sex, stareCivila, angajat));
        String[] n = nume.split(" ");
        if (n.length == 1) {
            numePersoane.addElement(nume.substring(0, 1).toUpperCase() + nume.substring(1).toLowerCase());
        } else {
            numePersoane.addElement(n[0].substring(0, 1).toUpperCase() + n[0].substring(1).toLowerCase() + " " + n[1].substring(0, 1).toUpperCase() + n[1].substring(1).toLowerCase());
        }

        reseteazaCampuri();
    }//GEN-LAST:event_btnAdaugaPersoanaActionPerformed

    private void btnStergePersoanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergePersoanaActionPerformed
        int idx = jlPersoane.getSelectedIndex();
        if (idx >= 0) {
            numePersoane.remove(idx);
            persoane.stergePersoana(idx);
        }
    }//GEN-LAST:event_btnStergePersoanaActionPerformed

    private void btnStergeListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergeListaActionPerformed
        numePersoane.removeAllElements();
        persoane.golesteLista();
    }//GEN-LAST:event_btnStergeListaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jlPersoaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPersoaneMouseClicked
        if (evt.getClickCount() == 2) {
            int index = jlPersoane.getSelectedIndex();
            String detaliiPersoana = persoane.getPersoana(index).toString();
            JOptionPane.showMessageDialog(this, detaliiPersoana);
        }
    }//GEN-LAST:event_jlPersoaneMouseClicked

    private void reseteazaCampuri() {
        tfNume.setText("");
        tfVarsta.setText("");
        cbSex.setSelectedIndex(0);
        btnGrAngajatNeangajat.clearSelection();
        btnGrStareCivila.clearSelection();
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
            java.util.logging.Logger.getLogger(PersoaneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersoaneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersoaneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersoaneGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersoaneGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdaugaPersoana;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrAngajatNeangajat;
    private javax.swing.ButtonGroup btnGrStareCivila;
    private javax.swing.JButton btnStergeLista;
    private javax.swing.JButton btnStergePersoana;
    private javax.swing.JCheckBox cbCasatorit;
    private javax.swing.JCheckBox cbDivortat;
    private javax.swing.JCheckBox cbNecasatorit;
    private javax.swing.JComboBox<String> cbSex;
    private javax.swing.JCheckBox cbVaduv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlPersoane;
    private javax.swing.JRadioButton rbAngajat;
    private javax.swing.JRadioButton rbNeangajat;
    private javax.swing.JRadioButton rbPensionar;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfVarsta;
    // End of variables declaration//GEN-END:variables
}
