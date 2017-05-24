package vistas;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Inicio extends javax.swing.JFrame {
    
    private JFrame registro;
    private JFrame recorrido;
    ArrayList<String> ubicacion;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);//pone en el centro la pantalla
        this.setResizable(false);//desabilita el maximizar
        this.setTitle("FastDelivery-Inicio-");//pone el titulo de la pantalla
        Image iconoMenu = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LogoEmpresaCF.png"));
        this.setIconImage(iconoMenu);
    }
    public void correPantalla(JFrame registro,JFrame recorrido){
        this.registro=registro;
        this.recorrido=recorrido;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMapa = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMapa.setBackground(new java.awt.Color(255, 255, 255));
        botonMapa.setForeground(new java.awt.Color(255, 255, 255));
        botonMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recorre1.png"))); // NOI18N
        botonMapa.setText("Recorrido");
        botonMapa.setToolTipText("");
        botonMapa.setBorder(null);
        botonMapa.setBorderPainted(false);
        botonMapa.setContentAreaFilled(false);
        botonMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMapa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMapa.setIconTextGap(-30);
        botonMapa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recorre3.png"))); // NOI18N
        botonMapa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recorre2.png"))); // NOI18N
        botonMapa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMapaActionPerformed(evt);
            }
        });
        getContentPane().add(botonMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, 150));

        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar1.png"))); // NOI18N
        botonRegistro.setText("Registro");
        botonRegistro.setToolTipText("");
        botonRegistro.setActionCommand("botonRegitro");
        botonRegistro.setBorder(null);
        botonRegistro.setBorderPainted(false);
        botonRegistro.setContentAreaFilled(false);
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonRegistro.setDisplayedMnemonicIndex(3);
        botonRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistro.setIconTextGap(-30);
        botonRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar3.png"))); // NOI18N
        botonRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar2.png"))); // NOI18N
        botonRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoFinal.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 170, 120));

        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir1.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalir.setIconTextGap(-30);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir3.png"))); // NOI18N
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir2.png"))); // NOI18N
        botonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 130, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenca-ecuador-1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        registro.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_botonRegistroActionPerformed
    
    private void botonMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMapaActionPerformed
        recorrido.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMapaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMapa;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
