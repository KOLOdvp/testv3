/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;
import connection.Connect;
/**
 *
 * @author Jonat
 */
public class panel2 extends javax.swing.JFrame {

    int contador;
    /**
     * Creates new form panel2
     */
    public panel2() {
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

        cancelarpaga = new javax.swing.JButton();
        txtrecibi = new javax.swing.JLabel();
        resultadodelpago1 = new javax.swing.JLabel();
        txtrecibi2 = new javax.swing.JLabel();
        confirmarPaga = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelarpaga.setBackground(new java.awt.Color(216, 178, 178));
        cancelarpaga.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cancelarpaga.setForeground(new java.awt.Color(255, 255, 255));
        cancelarpaga.setText("Volver");
        cancelarpaga.setBorder(null);
        cancelarpaga.setBorderPainted(false);
        cancelarpaga.setContentAreaFilled(false);
        cancelarpaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarpagaActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarpaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 524, 250, 60));

        txtrecibi.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        txtrecibi.setForeground(new java.awt.Color(255, 255, 255));
        txtrecibi.setText("0");
        getContentPane().add(txtrecibi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 210, 60));

        resultadodelpago1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        resultadodelpago1.setForeground(new java.awt.Color(255, 255, 255));
        resultadodelpago1.setText("S/");
        getContentPane().add(resultadodelpago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 40, 70));

        txtrecibi2.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        txtrecibi2.setForeground(new java.awt.Color(255, 255, 255));
        txtrecibi2.setText("0");
        getContentPane().add(txtrecibi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 190, 70));

        confirmarPaga.setBackground(new java.awt.Color(178, 216, 193));
        confirmarPaga.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        confirmarPaga.setForeground(new java.awt.Color(255, 255, 255));
        confirmarPaga.setText("Confirmar");
        confirmarPaga.setBorder(null);
        confirmarPaga.setBorderPainted(false);
        confirmarPaga.setContentAreaFilled(false);
        confirmarPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarPagaActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarPaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 524, 240, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/unknown1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1146, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarpagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarpagaActionPerformed
        this.setVisible(false);
        programa v=new programa();
        v.setVisible(true);
    }//GEN-LAST:event_cancelarpagaActionPerformed

    private void confirmarPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarPagaActionPerformed
        // TODO: si se confirma. procesa la transaccion, la agrega a la ddbb y luego regresa a por otro pasajero 
        int cantidadPasajeros = programa.contador;
        float pasajeEstandar = programa.pasajeEstandar;
        Connect.insertPasaje(cantidadPasajeros, pasajeEstandar);
        this.setVisible(false);
        programa v=new programa();
        v.setVisible(true);
    }//GEN-LAST:event_confirmarPagaActionPerformed

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
            java.util.logging.Logger.getLogger(panel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel2().setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarpaga;
    private javax.swing.JButton confirmarPaga;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel resultadodelpago1;
    public static javax.swing.JLabel txtrecibi;
    public static javax.swing.JLabel txtrecibi2;
    // End of variables declaration//GEN-END:variables
}
