
package vistas.vistaCliente;

import java.awt.BorderLayout;
import modelo.Usuario;
import vistas.vistaCompras.CarritoDeCompras;
import vistas.vistaCompras.Favoritos;
import vistas.vistaCompras.HistorialPedidosClientes;
import vistas.vistaPrincipal.VistaPrincipal;

/**
 *
 * @author ibarr
 */

public class VistaPrincipalCliente extends javax.swing.JFrame {
    
    // ATRIBUTOS
    private final Usuario usuarioLogueado; 
    
    //CONSTRUCTOR 
    public VistaPrincipalCliente(Usuario usuarioLogueado) {
        initComponents();
        setLocationRelativeTo(this);
        this.usuarioLogueado = usuarioLogueado;
        LlenarNombreUsuario(usuarioLogueado);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNuevo = new javax.swing.JMenu();
        perfilMenu = new javax.swing.JMenuItem();
        CarritoMenu = new javax.swing.JMenuItem();
        FavoritosMenu = new javax.swing.JMenuItem();
        pedidosMenu = new javax.swing.JMenuItem();
        cerrarSesionMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        camisasFMenuIt = new javax.swing.JMenuItem();
        pantFMenuIt = new javax.swing.JMenuItem();
        calzaFMenuIt = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        camisasMMenuIt = new javax.swing.JMenuItem();
        pantH = new javax.swing.JMenuItem();
        calzaMMenuIt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setPreferredSize(new java.awt.Dimension(930, 521));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagenPrincipal.jpeg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoTitulo.jpeg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("BIENVENIDO(A)");

        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreCliente.setText("Paula Hernández");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(txtNombreCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(178, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconPerfil.png"))); // NOI18N
        jMenuNuevo.setText("Menu");

        perfilMenu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        perfilMenu.setText("Mi info");
        perfilMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilMenuActionPerformed(evt);
            }
        });
        jMenuNuevo.add(perfilMenu);

        CarritoMenu.setText("Mi carrito");
        CarritoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuNuevo.add(CarritoMenu);

        FavoritosMenu.setText("Mis favoritos");
        FavoritosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavoritosMenuActionPerformed(evt);
            }
        });
        jMenuNuevo.add(FavoritosMenu);

        pedidosMenu.setText("Mis pedidos");
        pedidosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuNuevo.add(pedidosMenu);

        cerrarSesionMenu.setText("Cerrar sesión");
        cerrarSesionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionMenuActionPerformed(evt);
            }
        });
        jMenuNuevo.add(cerrarSesionMenu);

        jMenuBar1.add(jMenuNuevo);
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Mujer");

        camisasFMenuIt.setText("Camisas");
        camisasFMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camisasFMenuItActionPerformed(evt);
            }
        });
        jMenu5.add(camisasFMenuIt);

        pantFMenuIt.setText("Pantalones");
        pantFMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantFMenuItActionPerformed(evt);
            }
        });
        jMenu5.add(pantFMenuIt);

        calzaFMenuIt.setText("Calzado");
        calzaFMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calzaFMenuItActionPerformed(evt);
            }
        });
        jMenu5.add(calzaFMenuIt);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Hombre");

        camisasMMenuIt.setText("Camisas");
        camisasMMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camisasMMenuItActionPerformed(evt);
            }
        });
        jMenu6.add(camisasMMenuIt);

        pantH.setText("Pantalones");
        pantH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantHActionPerformed1(evt);
            }
        });
        jMenu6.add(pantH);

        calzaMMenuIt.setText("Calzado");
        calzaMMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calzaMMenuItActionPerformed(evt);
            }
        });
        jMenu6.add(calzaMMenuIt);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>                        
// </editor-fold>                        
// </editor-fold>     
    
    // METODO PARA DILIGENCIAR INFORMACIÓN DEL USUARIO LOGUEADO 
    private void LlenarNombreUsuario(Usuario usuarioLogueado){
        txtNombreCliente.setText(usuarioLogueado.getNombre());   
    }
    
    private void signUpMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpMenuItActionPerformed
        //REGISTRO
        Favoritos vista = new Favoritos(usuarioLogueado);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpMenuItActionPerformed

    // IR A LA VISTA DONDE ESTA LA INFORMACIÓN DEL CLIENTE 
    private void perfilMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilMenuActionPerformed
        CuentaInfoCliente vr = new CuentaInfoCliente(usuarioLogueado);
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_perfilMenuActionPerformed

    private void camisasFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camisasFMenuItActionPerformed
        ExplorarCamisaFem vr = new ExplorarCamisaFem();
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_camisasFMenuItActionPerformed

    private void pantFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantFMenuItActionPerformed
        ExplorarPantFem vr = new ExplorarPantFem();
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_pantFMenuItActionPerformed

    private void calzaFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzaFMenuItActionPerformed
        ExplorarCalzaFem vr = new ExplorarCalzaFem();
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_calzaFMenuItActionPerformed
    
    // METODO PARA CERRAR SESIÓN 
    private void cerrarSesionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionMenuActionPerformed
        VistaPrincipal vista = new VistaPrincipal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionMenuActionPerformed

    private void camisasMMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camisasMMenuItActionPerformed
        ExplorarCamisaMasc vr = new ExplorarCamisaMasc(this.usuarioLogueado);
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_camisasMMenuItActionPerformed

    private void calzaMMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzaMMenuItActionPerformed
        ExplorarCalzaMasc vr = new ExplorarCalzaMasc();
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_calzaMMenuItActionPerformed
    
    // IR AL CARRITO DE COMPRAS 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        CarritoDeCompras vr = new CarritoDeCompras(usuarioLogueado);
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        HistorialPedidosClientes vista = new HistorialPedidosClientes(usuarioLogueado);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pantHActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantHActionPerformed1
        ExplorarPantMasc vr = new ExplorarPantMasc();
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_pantHActionPerformed1

    private void FavoritosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavoritosMenuActionPerformed
        Favoritos vr = new Favoritos(usuarioLogueado);
        vr.setSize(950, 550);
        vr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();              
    }//GEN-LAST:event_FavoritosMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CarritoMenu;
    private javax.swing.JMenuItem FavoritosMenu;
    private javax.swing.JMenuItem calzaFMenuIt;
    private javax.swing.JMenuItem calzaMMenuIt;
    private javax.swing.JMenuItem camisasFMenuIt;
    private javax.swing.JMenuItem camisasMMenuIt;
    private javax.swing.JMenuItem cerrarSesionMenu;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuNuevo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem pantFMenuIt;
    private javax.swing.JMenuItem pantH;
    private javax.swing.JMenuItem pedidosMenu;
    private javax.swing.JMenuItem perfilMenu;
    private javax.swing.JLabel txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
