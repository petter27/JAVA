/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.ArrayList;
import sorteo.participantes;
/**
 *
 * @author pedro
 */
public class ganadores extends javax.swing.JFrame {
ArrayList<participantes> ganadores=new ArrayList<participantes>();
    /**
     * Creates new form ganadores
     */
    public ganadores() {
        initComponents();
    }
    
    public ganadores(ArrayList ls) {
        initComponents();
        
        ganadores=ls;
        
        
        this.lblJoke.setText("Descalificados :'C");
        this.lblGan1.setText(this.ganadores.get(0).Nombre);
        this.lblfoto1.setIcon(this.ganadores.get(0).imagen);
              
        this.lblGan2.setText(this.ganadores.get(1).Nombre);
        this.lblFoto2.setIcon(this.ganadores.get(1).imagen);
        
        this.lblGan3.setText(this.ganadores.get(2).Nombre);
        this.lblFoto3.setIcon(this.ganadores.get(2).imagen);
        if (ganadores.size()>3){
        this.lblJoke.setText("Ganadores =D"); 
        this.lblGan1.setText(this.ganadores.get(3).Nombre);
        this.lblfoto1.setIcon(this.ganadores.get(3).imagen);
              
        this.lblGan2.setText(this.ganadores.get(4).Nombre);
        this.lblFoto2.setIcon(this.ganadores.get(4).imagen);
        
        this.lblGan3.setText(this.ganadores.get(5).Nombre);
        this.lblFoto3.setIcon(this.ganadores.get(5).imagen);
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

        lblJoke = new javax.swing.JLabel();
        lblGan3 = new javax.swing.JLabel();
        lblFoto3 = new javax.swing.JLabel();
        lblfoto1 = new javax.swing.JLabel();
        lblFoto2 = new javax.swing.JLabel();
        lblGan1 = new javax.swing.JLabel();
        lblGan2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJoke.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblJoke.setText("FELICIDADES!!!!!!!!");
        getContentPane().add(lblJoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        lblGan3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGan3.setText("Ganador 2");
        getContentPane().add(lblGan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        lblFoto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblFoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 190, 190));

        lblfoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfoto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblfoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 190));

        lblFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblFoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 200, 190));

        lblGan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGan1.setText("Ganador 1");
        getContentPane().add(lblGan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        lblGan2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGan2.setText("Ganador 2");
        getContentPane().add(lblGan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ganadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblFoto3;
    private javax.swing.JLabel lblGan1;
    private javax.swing.JLabel lblGan2;
    private javax.swing.JLabel lblGan3;
    private javax.swing.JLabel lblJoke;
    private javax.swing.JLabel lblfoto1;
    // End of variables declaration//GEN-END:variables
}