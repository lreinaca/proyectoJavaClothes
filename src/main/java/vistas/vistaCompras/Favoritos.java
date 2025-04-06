
package vistas.vistaCompras;

import javax.swing.JOptionPane;
import modelo.Usuario;
import vistas.vistaCliente.VistaPrincipalCliente;

/**
 *
 * @author juanv
 */
public class Favoritos extends javax.swing.JFrame {
    Usuario usuarioLogueado;
    public Favoritos(Usuario usuarioLogueado) {
        initComponents();
        setLocationRelativeTo(this);
        this.usuarioLogueado = usuarioLogueado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCarrito = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistorialProductos = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCarrito.setBackground(new java.awt.Color(255, 255, 255));

        tbHistorialProductos.setBackground(new java.awt.Color(204, 204, 255));
        tbHistorialProductos.setForeground(new java.awt.Color(51, 51, 51));
        tbHistorialProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Urban Polo Femenino", "Negro", "s", "1", "49.900"},
                {"Blusa Puffy Lemon", "Amarillo lima", "s", "1", "86.000"},
                {"Vintage Ligth", "Azul claro", "m", "1", "145.900"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto:", "Color:", "Talla:", "Cantidad:", "Precio:"
            }
        ));
        jScrollPane1.setViewportView(tbHistorialProductos);

        btnMenu.setBackground(new java.awt.Color(102, 102, 255));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Continuar Comprando");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Producto al carrito");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mis favoritos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Historial de productos añadidos a favoritos:");

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("(selecciona el producto que deseas eliminar)");

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("(selecciona el producto que deseas añadir al carrito)");

        javax.swing.GroupLayout panelCarritoLayout = new javax.swing.GroupLayout(panelCarrito);
        panelCarrito.setLayout(panelCarritoLayout);
        panelCarritoLayout.setHorizontalGroup(
            panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarritoLayout.createSequentialGroup()
                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCarritoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCarritoLayout.createSequentialGroup()
                                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelCarritoLayout.setVerticalGroup(
            panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMenu)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
      VistaPrincipalCliente vista = new VistaPrincipalCliente(usuarioLogueado);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JOptionPane.showMessageDialog(null, "EL PRODUCTO FUE ELIMINADO DE TUS FAVORITOS");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       JOptionPane.showMessageDialog(null, "EL PRODUCTO FUE AGREGADO AL CARRITO");
    }//GEN-LAST:event_btnAgregarActionPerformed

//  // /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Favoritos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCarrito;
    private javax.swing.JTable tbHistorialProductos;
    // End of variables declaration//GEN-END:variables
}
