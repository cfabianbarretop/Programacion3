package vistas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Guardar extends javax.swing.JFrame {
    
    private JFrame registro;
    
    public Guardar(JFrame registro) {
        initComponents();
        this.setLocationRelativeTo(null);//pone en el centro la pantalla
        this.setResizable(false);//desabilita el maximizar
        this.setTitle("FastDelivery-Informacion-");//pone el titulo de la pantalla
        Image iconoMenu = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LogoEmpresaCF.png"));
        this.setIconImage(iconoMenu);
        this.registro=registro;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        botonAcepatar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save2.png"))); // NOI18N
        jLabel2.setText("Datos Guardados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 60));

        botonAcepatar.setText("Aceptar");
        botonAcepatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcepatarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAcepatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAcepatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcepatarActionPerformed
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAcepatarActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcepatar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
