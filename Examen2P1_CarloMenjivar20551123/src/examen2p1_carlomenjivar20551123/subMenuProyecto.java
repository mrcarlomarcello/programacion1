/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2p1_carlomenjivar20551123;

/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class subMenuProyecto extends javax.swing.JFrame {

    
    public subMenuProyecto() {
        initComponents();
    }
    public miscellaneous misc = new miscellaneous();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ejercicioUno = new javax.swing.JButton();
        ejercicioDos = new javax.swing.JButton();
        ejercicioTres = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ejercicioUno.setText("Ejercicio 1");
        ejercicioUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ejercicioUnoMouseClicked(evt);
            }
        });

        ejercicioDos.setText("Ejercicio 2");
        ejercicioDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ejercicioDosMouseClicked(evt);
            }
        });

        ejercicioTres.setText("Ejercicio 3");
        ejercicioTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicioTresActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ejercicioTres)
                    .addComponent(ejercicioDos)
                    .addComponent(ejercicioUno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(ejercicioUno)
                .addGap(18, 18, 18)
                .addComponent(ejercicioDos)
                .addGap(18, 18, 18)
                .addComponent(ejercicioTres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejercicioUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejercicioUnoMouseClicked
        // TODO add your handling code here:
        int numero = misc.dialogLeerEntero();
        int numero2 = misc.dialogLeerEntero();
        
        ejercicioUno execute1 = new ejercicioUno();
        execute1.setNumero(numero);
        execute1.setNumero2(numero2);
        execute1.setFrameAnterior(this);
        execute1.setVisible(true);        
        this.setVisible(false);
        
    }//GEN-LAST:event_ejercicioUnoMouseClicked

    private void ejercicioTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicioTresActionPerformed
        // TODO add your handling code here:
        ejercicioTres execute3 = new ejercicioTres();
        execute3.setFrameAnterior(this);
        execute3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ejercicioTresActionPerformed

    private void ejercicioDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejercicioDosMouseClicked
        // TODO add your handling code here:
        int numero = misc.dialogLeerEntero();
        
        
        ejercicioDos execute2 = new ejercicioDos();
        execute2.setNumero(numero);
        execute2.setFrameAnterior(this);
        execute2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ejercicioDosMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(subMenuProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subMenuProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subMenuProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subMenuProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subMenuProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejercicioDos;
    private javax.swing.JButton ejercicioTres;
    private javax.swing.JButton ejercicioUno;
    private javax.swing.JButton exitButton;
    // End of variables declaration//GEN-END:variables
}
