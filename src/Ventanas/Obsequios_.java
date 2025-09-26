package Ventanas;

import clases.obsequiosDatos;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author FRANCIS
 */
public class Obsequios_ extends javax.swing.JFrame {   
    
    // se crea dos variables paera almacenar la info del mouse cuando haga clic sobre el panel (header)
    int xMouse, yMouse;    
    public Obsequios_() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(logo, "src/images/logo_empresa.jpeg");
        setIconImage(getIconImage());
        cargarObsequiosGuardados();
    }
        @Override
        public final  Image getIconImage () {
        Image retValue = Toolkit.getDefaultToolkit().getImage
                                (ClassLoader.getSystemResource("images/logo_empresa.jpeg"));
        return retValue;}
    
// cargar obsequios previamente guardados
    private void cargarObsequiosGuardados (){
        if(obsequiosDatos.osequiosConfigurados()){
            txtObsequio1.setText(obsequiosDatos.getObsequio1());
            txtObsequio2.setText(obsequiosDatos.getObsequio2());
            txtObsequio3.setText(obsequiosDatos.getObsequio3());
            
        }
             
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtObsequio1 = new javax.swing.JTextField();
        txtObsequio2 = new javax.swing.JTextField();
        txtObsequio3 = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(14, 26, 36));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1 unidad");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2 a 5 unidades");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("6 a más unidades");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 30));

        txtObsequio1.setForeground(new java.awt.Color(0, 0, 0));
        txtObsequio1.setText("Obsequio 1");
        txtObsequio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtObsequio1MousePressed(evt);
            }
        });
        fondo.add(txtObsequio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        txtObsequio2.setForeground(new java.awt.Color(0, 0, 0));
        txtObsequio2.setText("Obsequio 2");
        txtObsequio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtObsequio2MousePressed(evt);
            }
        });
        fondo.add(txtObsequio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 30));

        txtObsequio3.setForeground(new java.awt.Color(0, 0, 0));
        txtObsequio3.setText("Obsequio 3");
        txtObsequio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtObsequio3MousePressed(evt);
            }
        });
        fondo.add(txtObsequio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 202, 170, 30));

        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAceptar.setText("Guardar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        fondo.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 100, 30));

        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 100, 30));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 50));

        titulo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Configurar Obsequios");
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Almacenar la pocision del mouse en eje x - eje y
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed
 
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen(), y =evt.getYOnScreen();
        this.setLocation( x- xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

  
    private void txtObsequio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObsequio1MousePressed
        // TODO add your handling code here:
                if(txtObsequio1.getText().equals(obsequiosDatos.getObsequio1())){
                txtObsequio1.setText("");
                txtObsequio1.setForeground(Color.black);
        }
                if(txtObsequio2.getText().isEmpty()){
                txtObsequio2.setText(obsequiosDatos.getObsequio2());
                txtObsequio2.setForeground(Color.gray);
       }
                if(txtObsequio3.getText().isEmpty()){
                txtObsequio3.setText(obsequiosDatos.getObsequio3());
                txtObsequio3.setForeground(Color.gray);
        }           
    }//GEN-LAST:event_txtObsequio1MousePressed

    private void txtObsequio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObsequio2MousePressed
        // TODO add your handling code here:
                if(txtObsequio2.getText().equals(obsequiosDatos.getObsequio2())){
                txtObsequio2.setText("");
                txtObsequio2.setForeground(Color.black);
        }
                if(txtObsequio1.getText().isEmpty()){
                txtObsequio1.setText(obsequiosDatos.getObsequio1());
                txtObsequio1.setForeground(Color.gray);
       }
                if(txtObsequio3.getText().isEmpty()){
                txtObsequio3.setText(obsequiosDatos.getObsequio3());
                txtObsequio3.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtObsequio2MousePressed

    private void txtObsequio3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObsequio3MousePressed
        // TODO add your handling code here:
                if(txtObsequio3.getText().equals(obsequiosDatos.getObsequio3())){
                txtObsequio3.setText("");
                txtObsequio3.setForeground(Color.black);
        }
                if(txtObsequio2.getText().isEmpty()){
                txtObsequio2.setText(obsequiosDatos.getObsequio2());
                txtObsequio2.setForeground(Color.gray);
       }
                if(txtObsequio1.getText().isEmpty()){
                txtObsequio1.setText(obsequiosDatos.getObsequio1());
                txtObsequio1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtObsequio3MousePressed
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        //validar que los campos esten completos xdd
        String obs1 = txtObsequio1.getText().trim();
        String obs2 = txtObsequio2.getText().trim();
        String obs3 = txtObsequio3.getText().trim();
        
        if(obs1.isEmpty() || obs2.isEmpty() || obs3.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Por favor, complete todos los obsequios antes de guardar.",
                "Campos vacíos",
                JOptionPane.WARNING_MESSAGE);
        }else{
              obsequiosDatos.setTodosObsequios(obs1, obs2, obs3);
        JOptionPane.showMessageDialog(this, """
                                            \u00a1Obsequios guardados correctamente!
                                            
                                            Obsequio 1 unidad: """ + obs1 + "\n" +
            "Obsequio 2-5 unidades: " + obs2 + "\n" +
            "Obsequio +5 unidades: " + obs3, "Obsequios Guardados",
            JOptionPane.INFORMATION_MESSAGE);
        dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Obsequios_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obsequios_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obsequios_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obsequios_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obsequios_().setVisible(true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtObsequio1;
    private javax.swing.JTextField txtObsequio2;
    private javax.swing.JTextField txtObsequio3;
    // End of variables declaration//GEN-END:variables
}
