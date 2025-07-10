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
        bt = new javax.swing.JPanel();
        txtX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(90, 15, 142));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("1 a 5 unidades");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        txtDescuento1.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuento1.setText("Descuento 1");
        txtDescuento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento1MousePressed(evt);
            }
        });
        fondo.add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 30));

        jLabel2.setText("6 a 10 unidades");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 30));

        txtDescuento2.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuento2.setText("Descuento 2");
        txtDescuento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento2MousePressed(evt);
            }
        });
        fondo.add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, 30));

        jLabel3.setText("11 a 15 unidades");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 20));

        txtDescuento3.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuento3.setText("Descuento 3");
        txtDescuento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuento3MousePressed(evt);
            }
        });
        fondo.add(txtDescuento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        fondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 80, 30));
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 70));

        header.setBackground(new java.awt.Color(90, 15, 142));
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

        bt.setBackground(new java.awt.Color(90, 15, 142));

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
            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btLayout.setVerticalGroup(
            btLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 481, Short.MAX_VALUE)
                .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setText("Configurar Descuentos");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtXMouseClicked

    private void txtXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseEntered
        // TODO add your handling code here:
        bt.setBackground(Color.red);
        txtX.setForeground(Color.white);
    }//GEN-LAST:event_txtXMouseEntered

    private void txtXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXMouseExited
        // TODO add your handling code here:
        bt.setBackground(Color.white);
        txtX.setForeground(Color.black);
    }//GEN-LAST:event_txtXMouseExited

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
    }//GEN-LAST:event_txtDescuento3MousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        double desc1 = Double.parseDouble(txtDescuento1.getText().trim());
        double desc2 = Double.parseDouble(txtDescuento2.getText().trim());
        double desc3 = Double.parseDouble(txtDescuento3.getText().trim());
       
        if(desc1 <=0 || desc2 <= 0 || desc3<= 0){
                    JOptionPane.showMessageDialog(this,
                "Por favor, complete todos los descuentos antes de guardar.",
                "Campos vacíos",
                JOptionPane.WARNING_MESSAGE);
        } else {
            descuento.setTodoDescuento(desc1, desc2, desc3);
            JOptionPane.showMessageDialog(this, """
                                            \u00a1Descuentos guardados correctamente!
                                            
                                           1° Descuento (1 - 5 unidades): """ + desc1 + "\n" +
            "2° Descuento (6 - 10 unidades): " + desc2 + "\n" +
            "3° Descuento (11 -15 unidades): " + desc3, "Descuentos Guardados",
            JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    private javax.swing.JPanel bt;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtDescuento1;
    private javax.swing.JTextField txtDescuento2;
    private javax.swing.JTextField txtDescuento3;
    private javax.swing.JLabel txtX;
    // End of variables declaration//GEN-END:variables
}
