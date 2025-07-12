package Ventanas;

import clases.descuento;
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
public class Descuentos extends javax.swing.JFrame {
  
    int xMouse, yMouse;
    public Descuentos() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());
        SetImageLabel(logo, "src/images/logo_empresa.jpeg");
        cargarDescuentos();
    }

        @Override
        public final Image getIconImage () {
        Image retValue = Toolkit.getDefaultToolkit().getImage
                                (ClassLoader.getSystemResource("images/logo_empresa.jpeg"));
        return retValue;
    }
    private void cargarDescuentos(){
       txtDescuento1.setText(String.valueOf(descuento.getPrimerDescuento()));
       txtDescuento2.setText(String.valueOf(descuento.getSegundoDescuento()));
       txtDescuento3.setText(String.valueOf(descuento.getTercerDescuento()));
       txtDescuento4.setText(String.valueOf(descuento.getCuartoDescuento()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescuento1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescuento2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescuento3 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescuento4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(14, 26, 36));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1 a 5 unidades");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 30));

        txtDescuento1.setForeground(new java.awt.Color(0, 0, 0));
        txtDescuento1.setText("Descuento 1");
        txtDescuento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento1MousePressed(evt);
            }
        });
        fondo.add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("6 a 10 unidades");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 30));

        txtDescuento2.setForeground(new java.awt.Color(0, 0, 0));
        txtDescuento2.setText("Descuento 2");
        txtDescuento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento2MousePressed(evt);
            }
        });
        fondo.add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("11 a 15 unidades");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, 30));

        txtDescuento3.setForeground(new java.awt.Color(0, 0, 0));
        txtDescuento3.setText("Descuento 3");
        txtDescuento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento3MousePressed(evt);
            }
        });
        fondo.add(txtDescuento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        fondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 90, 30));
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 60));

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
            .addGap(0, 560, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Configurar Descuentos");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 160, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("más de 15 unidades");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 120, 30));

        txtDescuento4.setForeground(new java.awt.Color(0, 0, 0));
        txtDescuento4.setText("Descuento 4");
        txtDescuento4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento4MousePressed(evt);
            }
        });
        fondo.add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen(), y =evt.getYOnScreen();
        this.setLocation( x- xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void txtDescuento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuento1MousePressed
        // TODO add your handling code here:        
                if(txtDescuento1.getText().equals(String.valueOf(descuento.getPrimerDescuento()))){
                    txtDescuento1.setText("");
                    txtDescuento1.setForeground(Color.black);
                } 
                if(txtDescuento2.getText().isEmpty()){
                txtDescuento2.setText(String.valueOf(descuento.getSegundoDescuento()));
                txtDescuento2.setForeground(Color.gray);
       }
                if(txtDescuento3.getText().isEmpty()){
                txtDescuento3.setText(String.valueOf(descuento.getTercerDescuento()));
                txtDescuento3.setForeground(Color.gray);
        }
                if(txtDescuento4.getText().isEmpty()){
                txtDescuento4.setText(String.valueOf(descuento.getCuartoDescuento()));
                txtDescuento4.setForeground(Color.gray);
        }  
    }//GEN-LAST:event_txtDescuento1MousePressed

    private void txtDescuento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuento2MousePressed
        // TODO add your handling code here:
                if(txtDescuento2.getText().equals(String.valueOf(descuento.getSegundoDescuento()))){  
                txtDescuento2.setText("");  
                txtDescuento2.setForeground(Color.black);
        }
                if(txtDescuento1.getText().isEmpty()){
                txtDescuento1.setText(String.valueOf(descuento.getPrimerDescuento()));
                txtDescuento1.setForeground(Color.gray);
       }
                if(txtDescuento3.getText().isEmpty()){
                txtDescuento3.setText(String.valueOf(descuento.getTercerDescuento()));
                txtDescuento3.setForeground(Color.gray);
        }
                 if(txtDescuento4.getText().isEmpty()){
                txtDescuento4.setText(String.valueOf(descuento.getCuartoDescuento()));
                txtDescuento4.setForeground(Color.gray);
        }  
    }//GEN-LAST:event_txtDescuento2MousePressed

    private void txtDescuento3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuento3MousePressed
        // TODO add your handling code here:
               if(txtDescuento3.getText().equals(String.valueOf(descuento.getTercerDescuento()))){
                txtDescuento3.setText("");  
                txtDescuento3.setForeground(Color.black);
        }
 
                if(txtDescuento2.getText().isEmpty()){
                txtDescuento2.setText(String.valueOf(descuento.getSegundoDescuento()));
                txtDescuento2.setForeground(Color.gray);
       }
                if(txtDescuento1.getText().isEmpty()){
                txtDescuento1.setText(String.valueOf(descuento.getPrimerDescuento()));
                txtDescuento1.setForeground(Color.gray);
        }
                if(txtDescuento4.getText().isEmpty()){
                txtDescuento4.setText(String.valueOf(descuento.getCuartoDescuento()));
                txtDescuento4.setForeground(Color.gray);
        }
 
    }//GEN-LAST:event_txtDescuento3MousePressed

    private void txtDescuento4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuento4MousePressed
        // TODO add your handling code here:
                if(txtDescuento4.getText().equals(String.valueOf(descuento.getCuartoDescuento()))){
                txtDescuento4.setText("");  
                txtDescuento4.setForeground(Color.black);
        }
                 if(txtDescuento3.getText().isEmpty()){
                txtDescuento3.setText(String.valueOf(descuento.getTercerDescuento()));
                txtDescuento3.setForeground(Color.gray);
        }
               if(txtDescuento2.getText().isEmpty()){
                txtDescuento2.setText(String.valueOf(descuento.getSegundoDescuento()));
                txtDescuento2.setForeground(Color.gray);
       }
                if(txtDescuento1.getText().isEmpty()){
                txtDescuento1.setText(String.valueOf(descuento.getPrimerDescuento()));
                txtDescuento1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDescuento4MousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //         TODO add your handling code here:
        double desc1 = Double.parseDouble(txtDescuento1.getText().trim());
        double desc2 = Double.parseDouble(txtDescuento2.getText().trim());
        double desc3 = Double.parseDouble(txtDescuento3.getText().trim());
        double desc4 = Double.parseDouble(txtDescuento4.getText().trim());
       
        if(desc1 <=0 || desc2 <= 0 || desc3 <= 0 || desc4 <= 0){
                    JOptionPane.showMessageDialog(this,
                "Por favor, complete todos los descuentos antes de guardar.",
                "Campos vacíos",
                JOptionPane.WARNING_MESSAGE);
        } else {
            descuento.setTodoDescuento(desc1, desc2, desc3, desc4);
            JOptionPane.showMessageDialog(this, """
                                            \u00a1Descuentos guardados correctamente!
                                            
                                           1° Descuento (1 - 5 unidades): """ + desc1 + "\n" +
            "2° Descuento (6 - 10 unidades): " + desc2 + "\n" +
            "3° Descuento (11 -15 unidades): " + desc3 + "\n" +
                    "4 Descuento (más de 15 unidades): " + desc4 , "Descuentos Guardados",
            JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descuentos().setVisible(true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtDescuento1;
    private javax.swing.JTextField txtDescuento2;
    private javax.swing.JTextField txtDescuento3;
    private javax.swing.JTextField txtDescuento4;
    // End of variables declaration//GEN-END:variables
}
