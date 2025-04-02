
package vistas.vistaPrincipal;

import java.awt.BorderLayout;
import vistas.vistaCliente.ExplorarCalzaFem;
import vistas.vistaCliente.ExplorarCalzaMasc;
import vistas.vistaCliente.ExplorarCamisaFem;
import vistas.vistaCliente.ExplorarCamisaMasc;
import vistas.vistaCliente.ExplorarPantFem;
import vistas.vistaCliente.ExplorarPantMasc;

/**
 *
 * @author ibarr
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("  ..: HOME JAVA CLOTHES :..");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPerfil = new javax.swing.JMenu();
        loginMenuIt = new javax.swing.JMenuItem();
        signUpMenuIt = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        camisasFMenuIt = new javax.swing.JMenuItem();
        pantFMenuIt = new javax.swing.JMenuItem();
        calzaFMenuIt = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        camisasMMenuIt = new javax.swing.JMenuItem();
        pantMMenult = new javax.swing.JMenuItem();
        calzaMMenuIt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setPreferredSize(new java.awt.Dimension(930, 521));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagenPrincipal.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoTitulo.jpeg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BIENVENIDO A");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(182, 182, 182))
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

        menuPerfil.setBackground(new java.awt.Color(153, 153, 255));
        menuPerfil.setForeground(new java.awt.Color(60, 63, 65));
        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconPerfil.png"))); // NOI18N
        menuPerfil.setFocusPainted(true);
        menuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        menuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilActionPerformed(evt);
            }
        });

        loginMenuIt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginMenuIt.setText("Iniciar sesión");
        loginMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItActionPerformed(evt);
            }
        });
        menuPerfil.add(loginMenuIt);

        signUpMenuIt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUpMenuIt.setText("Registrarme");
        signUpMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpMenuItActionPerformed(evt);
            }
        });
        menuPerfil.add(signUpMenuIt);

        jMenuBar1.add(menuPerfil);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 204, 255));
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

        pantMMenult.setText("Pantalones");
        pantMMenult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantMMenultActionPerformed(evt);
            }
        });
        jMenu6.add(pantMMenult);

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
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilActionPerformed

    }//GEN-LAST:event_menuPerfilActionPerformed

    private void signUpMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpMenuItActionPerformed
        //REGISTRO
        VistaRegistro vista = new VistaRegistro();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpMenuItActionPerformed

    private void loginMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItActionPerformed
        //INICIO SESIÓN
        VistaInicioSesion vista = new VistaInicioSesion();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMenuItActionPerformed

    private void camisasFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camisasFMenuItActionPerformed
        ExplorarCamisaFem vr = new ExplorarCamisaFem();
        vr.setSize(900,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_camisasFMenuItActionPerformed

    private void pantFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantFMenuItActionPerformed
        ExplorarPantFem vr = new ExplorarPantFem();
        vr.setSize(900,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_pantFMenuItActionPerformed

    private void calzaFMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzaFMenuItActionPerformed
        ExplorarCalzaFem vr = new ExplorarCalzaFem();
        vr.setSize(900,500);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_calzaFMenuItActionPerformed

    private void camisasMMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camisasMMenuItActionPerformed
        ExplorarCamisaMasc vr = new ExplorarCamisaMasc();
        vr.setSize(950,550);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_camisasMMenuItActionPerformed

    private void pantMMenultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantMMenultActionPerformed
        ExplorarPantMasc vr = new ExplorarPantMasc();
        vr.setSize(950,550);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_pantMMenultActionPerformed

    private void calzaMMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzaMMenuItActionPerformed
        ExplorarCalzaMasc vr = new ExplorarCalzaMasc();
        vr.setSize(950,550);
        vr.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(vr, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_calzaMMenuItActionPerformed


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem calzaFMenuIt;
    private javax.swing.JMenuItem calzaMMenuIt;
    private javax.swing.JMenuItem camisasFMenuIt;
    private javax.swing.JMenuItem camisasMMenuIt;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem loginMenuIt;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenuItem pantFMenuIt;
    private javax.swing.JMenuItem pantMMenult;
    private javax.swing.JMenuItem signUpMenuIt;
    // End of variables declaration//GEN-END:variables
}
