package Ventanas;


import interfaces_Paneles.Ayuda;

import interfaces_Paneles.consulta;
import interfaces_Paneles.lista;
import interfaces_Paneles.venta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FRANCIS
 */
public final class inicio extends javax.swing.JFrame {

        int xMouse, yMouse;

    public inicio() {
        initComponents();
        //setear el logo
        this.setLocationRelativeTo(this);
        SetImageLabel(logo, "src/images/logo_empresa.jpeg");
        //setear el logo en la barra d tareas
        setIconImage(getIconImage());
        lista lista = new lista();
        mostrarPanel(lista);
    }
    
    //Icono de Jframe form
    @Override
        public final Image getIconImage () {
        Image retValue = Toolkit.getDefaultToolkit().getImage
                                (ClassLoader.getSystemResource("images/logo_empresa.jpeg"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        panelConsultar = new javax.swing.JPanel();
        labelConsultar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        bt = new javax.swing.JPanel();
        txtX = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();
        labelLista = new javax.swing.JLabel();
        panelAyuda = new javax.swing.JPanel();
        labelAyuda = new javax.swing.JLabel();
        panelVenta1 = new javax.swing.JPanel();
        labelVenta1 = new javax.swing.JLabel();
        panelDescuento1 = new javax.swing.JPanel();
        labelDescuento1 = new javax.swing.JLabel();
        panelObsequios1 = new javax.swing.JPanel();
        labelObsequios1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(14, 26, 36));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("LEFT4TECH");
        fondo.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, 40));

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        fondo.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 80));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        fondo.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 400, 430));

        panelConsultar.setBackground(new java.awt.Color(0, 65, 86));

        labelConsultar.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelConsultar.setForeground(new java.awt.Color(255, 255, 255));
        labelConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultar.setText("Consultar");
        labelConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelConsultarLayout = new javax.swing.GroupLayout(panelConsultar);
        panelConsultar.setLayout(panelConsultarLayout);
        panelConsultarLayout.setHorizontalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelConsultarLayout.setVerticalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(panelConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 30));

        header.setBackground(new java.awt.Color(26, 46, 63));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        bt.setBackground(new java.awt.Color(26, 46, 63));

        txtX.setForeground(new java.awt.Color(255, 255, 255));
        txtX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtX.setText("X");
        txtX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btLayout = new javax.swing.GroupLayout(bt);
        bt.setLayout(btLayout);
        btLayout.setHorizontalGroup(
            btLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        btLayout.setVerticalGroup(
            btLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 488, Short.MAX_VALUE)
                .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        panelLista.setBackground(new java.awt.Color(0, 65, 86));

        labelLista.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelLista.setForeground(new java.awt.Color(255, 255, 255));
        labelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLista.setText("Lista");
        labelLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo.add(panelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 30));

        panelAyuda.setBackground(new java.awt.Color(0, 65, 86));

        labelAyuda.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelAyuda.setForeground(new java.awt.Color(255, 255, 255));
        labelAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAyuda.setText("Ayuda");
        labelAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAyudaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAyudaLayout = new javax.swing.GroupLayout(panelAyuda);
        panelAyuda.setLayout(panelAyudaLayout);
        panelAyudaLayout.setHorizontalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAyudaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAyudaLayout.setVerticalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAyudaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(panelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 80, 30));

        panelVenta1.setBackground(new java.awt.Color(0, 65, 86));

        labelVenta1.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelVenta1.setForeground(new java.awt.Color(255, 255, 255));
        labelVenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVenta1.setText("Venta");
        labelVenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVenta1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVenta1Layout = new javax.swing.GroupLayout(panelVenta1);
        panelVenta1.setLayout(panelVenta1Layout);
        panelVenta1Layout.setHorizontalGroup(
            panelVenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelVenta1Layout.setVerticalGroup(
            panelVenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fondo.add(panelVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 30));

        panelDescuento1.setBackground(new java.awt.Color(0, 65, 86));

        labelDescuento1.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelDescuento1.setForeground(new java.awt.Color(255, 255, 255));
        labelDescuento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescuento1.setText("Descuento");
        labelDescuento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDescuento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDescuento1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDescuento1Layout = new javax.swing.GroupLayout(panelDescuento1);
        panelDescuento1.setLayout(panelDescuento1Layout);
        panelDescuento1Layout.setHorizontalGroup(
            panelDescuento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescuento1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDescuento1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDescuento1Layout.setVerticalGroup(
            panelDescuento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescuento1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDescuento1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(panelDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, 30));

        panelObsequios1.setBackground(new java.awt.Color(0, 65, 86));

        labelObsequios1.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        labelObsequios1.setForeground(new java.awt.Color(255, 255, 255));
        labelObsequios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelObsequios1.setText("Obsequios");
        labelObsequios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelObsequios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelObsequios1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelObsequios1Layout = new javax.swing.GroupLayout(panelObsequios1);
        panelObsequios1.setLayout(panelObsequios1Layout);
        panelObsequios1Layout.setHorizontalGroup(
            panelObsequios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelObsequios1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelObsequios1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelObsequios1Layout.setVerticalGroup(
            panelObsequios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelObsequios1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelObsequios1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(panelObsequios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPanel(JPanel p){
        p.setSize(400, 430);
        p.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido. repaint(); 
}
    private void txtXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtXMouseClicked

    private void txtXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseEntered
        // TODO add your handling code here:
        bt.setBackground(Color.red);
        txtX.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtXMouseEntered

    private void txtXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseExited
        // TODO add your handling code here:
        bt.setBackground(new Color(26,46,63));
        txtX.setForeground(Color.white);
        
    }//GEN-LAST:event_txtXMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        // sirve para mover la ventana a donde queramos con el mouse
        int x = evt.getXOnScreen(), y =evt.getYOnScreen();
        this.setLocation( x- xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    //un metodo que para el pane tenga un evento como un boton
    private void labelConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultarMouseClicked
        // TODO add your handling code here:
       consulta consulta = new consulta();
       mostrarPanel(consulta);
    }//GEN-LAST:event_labelConsultarMouseClicked

    private void labelListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaMouseClicked
        // TODO add your handling code here:
        lista lista = new lista();
//        c.setVisible(true);
        mostrarPanel(lista);

    }//GEN-LAST:event_labelListaMouseClicked

    private void labelVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVenta1MouseClicked
        // TODO add your handling code here:
        venta venta = new venta();
        mostrarPanel(venta);
    }//GEN-LAST:event_labelVenta1MouseClicked

    private void labelAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAyudaMouseClicked
        // TODO add your handling code here:
        Ayuda ayuda = new Ayuda();
        mostrarPanel(ayuda);
    }//GEN-LAST:event_labelAyudaMouseClicked

    private void labelDescuento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDescuento1MouseClicked
        // TODO add your handling code here:
        Descuentos descuento = new Descuentos();
        descuento.setVisible(true);
    }//GEN-LAST:event_labelDescuento1MouseClicked

    private void labelObsequios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelObsequios1MouseClicked
        // TODO add your handling code here:
        Obsequios_ obsequios = new Obsequios_();
        obsequios.setVisible(true);
    }//GEN-LAST:event_labelObsequios1MouseClicked


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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel label, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                           image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bt;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelAyuda;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelDescuento1;
    private javax.swing.JLabel labelLista;
    private javax.swing.JLabel labelObsequios1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVenta1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelAyuda;
    private javax.swing.JPanel panelConsultar;
    private javax.swing.JPanel panelDescuento1;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelObsequios1;
    private javax.swing.JPanel panelVenta1;
    private javax.swing.JLabel txtX;
    // End of variables declaration//GEN-END:variables

}
