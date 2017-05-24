package vistas;

import datos.Cliente;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import maps.StaticMaps;

public class Registro extends javax.swing.JFrame {
    
    private int zoom;
    private JFrame inicio;
    Cliente cliente = new Cliente();
    
    public Registro(JFrame inicio) {
        initComponents();
        this.setLocationRelativeTo(null);//pone en el centro la pantalla
        this.setResizable(false);//desabilita el maximizar
        this.setTitle("FastDelivery-Recorrido-");//pone el titulo de la pantalla
        Image iconoMenu = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LogoEmpresaCF.png"));
        this.setIconImage(iconoMenu);
        this.zoom = 14;
        this.inicio=inicio;
    }
    
    private void crearMapa() throws MalformedURLException, UnsupportedEncodingException {
        StaticMaps ObjStaticMaps = new StaticMaps();
        if (!textoUbicacion.getText().isEmpty()) {
            this.etiquetaMapa.setText("");
            Image imagenMapa = ObjStaticMaps.getStaticMap(textoUbicacion.getText(),
                    Integer.valueOf(zoom), new Dimension(497,277),
                    Integer.valueOf(1),StaticMaps.Format.png,
                    StaticMaps.Maptype.roadmap);
            if (imagenMapa != null) {
                ImageIcon imgIcon = new ImageIcon(imagenMapa);
                Icon iconImage = (Icon) imgIcon;
                etiquetaMapa.setIcon(iconImage);
            }
        }else{
            Informacion informacion=new Informacion(this);
            informacion.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonZoomMenor = new javax.swing.JButton();
        botonZoomMayor = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        textoUbicacion = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        javax.swing.JButton botonGenerar = new javax.swing.JButton();
        etiquetaUbicacion = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaMapa = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();

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
        getContentPane().add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 120, 140));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRO DE DATOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        botonZoomMenor.setForeground(new java.awt.Color(255, 255, 255));
        botonZoomMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMenor1.png"))); // NOI18N
        botonZoomMenor.setText("zoom");
        botonZoomMenor.setToolTipText("");
        botonZoomMenor.setActionCommand("ZOOM");
        botonZoomMenor.setBorder(null);
        botonZoomMenor.setBorderPainted(false);
        botonZoomMenor.setContentAreaFilled(false);
        botonZoomMenor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonZoomMenor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonZoomMenor.setIconTextGap(-40);
        botonZoomMenor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMenor3.png"))); // NOI18N
        botonZoomMenor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMenor2.png"))); // NOI18N
        botonZoomMenor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonZoomMenor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonZoomMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZoomMenorActionPerformed(evt);
            }
        });
        getContentPane().add(botonZoomMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 120, 130));

        botonZoomMayor.setForeground(new java.awt.Color(255, 255, 255));
        botonZoomMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMayor1.png"))); // NOI18N
        botonZoomMayor.setText("zoom");
        botonZoomMayor.setBorder(null);
        botonZoomMayor.setBorderPainted(false);
        botonZoomMayor.setContentAreaFilled(false);
        botonZoomMayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonZoomMayor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonZoomMayor.setIconTextGap(-40);
        botonZoomMayor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMayor3.png"))); // NOI18N
        botonZoomMayor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ZoomMayor2.png"))); // NOI18N
        botonZoomMayor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonZoomMayor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonZoomMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZoomMayorActionPerformed(evt);
            }
        });
        getContentPane().add(botonZoomMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, 130));

        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar1.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardar.setIconTextGap(-30);
        botonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar3.png"))); // NOI18N
        botonGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar2.png"))); // NOI18N
        botonGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 120, 140));

        textoUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(textoUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 370, -1));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 370, -1));

        botonGenerar.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run1.png"))); // NOI18N
        botonGenerar.setText("Generar");
        botonGenerar.setToolTipText("");
        botonGenerar.setBorder(null);
        botonGenerar.setBorderPainted(false);
        botonGenerar.setContentAreaFilled(false);
        botonGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGenerar.setIconTextGap(-30);
        botonGenerar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run3.png"))); // NOI18N
        botonGenerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Run2.png"))); // NOI18N
        botonGenerar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonGenerar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 120, 140));

        etiquetaUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUbicacion.setText("Ubicacion:");
        getContentPane().add(etiquetaUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, -1));

        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Nombre:");
        getContentPane().add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoFinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 180, 140));

        etiquetaMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenRegistro.png"))); // NOI18N
        etiquetaMapa.setToolTipText("");
        etiquetaMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        etiquetaMapa.setName(""); // NOI18N
        etiquetaMapa.setPreferredSize(new java.awt.Dimension(497, 277));
        getContentPane().add(etiquetaMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenca-ecuador-1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 500, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonZoomMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZoomMenorActionPerformed
        if (this.zoom > 1) {
            zoom--;
        }
        try {
            this.crearMapa();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_botonZoomMenorActionPerformed

    private void botonZoomMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZoomMayorActionPerformed
        if (this.zoom < 20) {
            zoom++;
        }
        try {
            this.crearMapa();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_botonZoomMayorActionPerformed

    private void textoUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUbicacionActionPerformed
        
    }//GEN-LAST:event_textoUbicacionActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        try {
            this.crearMapa();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_botonGenerarActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        
    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(!textoNombre.getText().equals("") && !textoUbicacion.getText().equals("")){
            cliente.ingresarRegistro(textoNombre.getText(),"Ecuador Cuenca "+textoUbicacion.getText());  
            textoNombre.setText(null);
            textoUbicacion.setText(null);
            Guardar guardar=new Guardar(this);
            guardar.setVisible(true);
        }else{
            Informacion informacion=new Informacion(this);
            informacion.setVisible(true);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonZoomMayor;
    private javax.swing.JButton botonZoomMenor;
    private javax.swing.JLabel etiquetaMapa;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaUbicacion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
