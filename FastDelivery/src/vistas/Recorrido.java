package vistas;

import logica.Ruta;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Recorrido extends javax.swing.JFrame {

    private JFrame inicio;
    
    public Recorrido(JFrame inicio) {
        initComponents();
        this.setLocationRelativeTo(null);//pone en el centro la pantalla
        this.setResizable(false);//desabilita el maximizar
        this.setTitle("FastDelivery-Recorrido-");//pone el titulo de la pantalla
        Image iconoMenu = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LogoEmpresaCF.png"));
        this.setIconImage(iconoMenu);
        this.inicio=inicio;
    }

    private void crearMapa() throws MalformedURLException, UnsupportedEncodingException, IOException {
        Image imagenMapa = Ruta.dibujarRuta();
        if (imagenMapa != null) {
            ImageIcon imgIcon = new ImageIcon(imagenMapa);
            Icon iconImage = (Icon) imgIcon;
            EtiquetaMapa.setIcon(iconImage);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton botonRecorrido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EtiquetaMapa = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal1.png"))); // NOI18N
        botonInicio.setText("Inicio");
        botonInicio.setBorder(null);
        botonInicio.setBorderPainted(false);
        botonInicio.setContentAreaFilled(false);
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonInicio.setIconTextGap(-30);
        botonInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal3.png"))); // NOI18N
        botonInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal2.png"))); // NOI18N
        botonInicio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 120, 140));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RUTAS DE ENTREGA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        botonRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        botonRecorrido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run1.png"))); // NOI18N
        botonRecorrido.setText("Iniciar Recorrido");
        botonRecorrido.setToolTipText("");
        botonRecorrido.setBorder(null);
        botonRecorrido.setBorderPainted(false);
        botonRecorrido.setContentAreaFilled(false);
        botonRecorrido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRecorrido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRecorrido.setIconTextGap(-30);
        botonRecorrido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run3.png"))); // NOI18N
        botonRecorrido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run2.png"))); // NOI18N
        botonRecorrido.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonRecorrido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecorridoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoFinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 180, 140));

        EtiquetaMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SA-EC2003-Cuenca-NewCathedral-640.jpg"))); // NOI18N
        EtiquetaMapa.setToolTipText("");
        jScrollPane3.setViewportView(EtiquetaMapa);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenca-ecuador-1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecorridoActionPerformed
        try {
            this.crearMapa();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Revise la conexion a internet");
        }
    }//GEN-LAST:event_botonRecorridoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaMapa;
    private javax.swing.JButton botonInicio;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
