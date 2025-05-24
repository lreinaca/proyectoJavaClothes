package vistas.vistaPrincipal;

import clienteApi.UsuarioCliente;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author ibarr
 */
public class VistaRegistro extends javax.swing.JFrame {

    // Atributos 
    private final UsuarioCliente usuarioCliente;

    // Constructor 
    public VistaRegistro() {
        this.setTitle("Registro");
        initComponents();
        setLocationRelativeTo(this);
        this.usuarioCliente = new UsuarioCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tgVerContraseña = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnIrALogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(222, 222, 222));
        jPanel5.setPreferredSize(new java.awt.Dimension(430, 500));

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Java Clothes");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Número telefónico");

        tgVerContraseña.setBackground(new java.awt.Color(204, 204, 204));
        tgVerContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        tgVerContraseña.setForeground(new java.awt.Color(102, 102, 102));
        tgVerContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconOjo.png"))); // NOI18N
        tgVerContraseña.setToolTipText("");
        tgVerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgVerContraseñaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Registro");

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarme");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("¿Ya tienes una cuenta? Inicia sesión");

        btnIrALogin.setBackground(new java.awt.Color(51, 51, 51));
        btnIrALogin.setForeground(new java.awt.Color(255, 255, 255));
        btnIrALogin.setText("Iniciar sesión");
        btnIrALogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrALoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnIrALogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIrALogin))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("<--ver contraseña");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Email");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Cédula");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Contraseña");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));

        txtIdUsuario.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(222, 222, 222));
        btnVolver.setForeground(new java.awt.Color(222, 222, 222));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/volver.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtClave.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClave)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tgVerContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tgVerContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/referencia.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo para limpiar los campos 
    private void emptyField() {
        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtClave.setText("");
    }

    // Metodo para mostrar la Contraseña
    private void tgVerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgVerContraseñaActionPerformed
        if (tgVerContraseña.isSelected()) {
            //mostrar la contraseña
            txtClave.setEchoChar((char) 0);
        } else {
            txtClave.setEchoChar('•'); //ocultar
        }
    }//GEN-LAST:event_tgVerContraseñaActionPerformed

    // Metodo para Registrar un nuevo Usuario 
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!validarCamposUsuario()) {
            return; // Sale del método si hay errores
        }
        
        // Si pasa las validaciones, continuar con el registro
        Integer idUsuario = Integer.valueOf(txtIdUsuario.getText());
        String nombre = txtNombre.getText();
        String email = txtEmail.getText();
        String numeroDeTelefono = txtTelefono.getText();
        String clave = String.valueOf(txtClave.getPassword());
        try {
            Usuario usuario = new Usuario(idUsuario, 3, nombre, email, numeroDeTelefono, clave);
            usuarioCliente.createUser(usuario);
            JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
            emptyField();
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "No se puede crear");

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Metodo para ir a la Vista de login 
    private void btnIrALoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrALoginActionPerformed
        VistaInicioSesion vista = new VistaInicioSesion();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIrALoginActionPerformed

    // Metodo para regresar a la Vista Principal
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaPrincipal vista = new VistaPrincipal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Método principal de validación de campos 
    private boolean validarCamposUsuario() {
        try {
            // Validar ID Usuario
            if (!validarIdUsuario()) {
                return false;
            }

            // Validar Nombre
            if (!validarNombre()) {
                return false;
            }

            // Validar Email
            if (!validarEmail()) {
                return false;
            }

            // Validar Teléfono
            if (!validarTelefono()) {
                return false;
            }
            // Validar Clave
            return validarClave();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en validación: " + e.getMessage());
            return false;
        }
    }

    // Validación de ID Usuario
    private boolean validarIdUsuario() {
        String idTexto = txtIdUsuario.getText().trim();

        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El ID de usuario es obligatorio");
            txtIdUsuario.requestFocus();
            return false;
        }

        try {
            int id = Integer.parseInt(idTexto);
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número positivo");
                txtIdUsuario.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número válido");
            txtIdUsuario.requestFocus();
            return false;
        }

        return true;
    }

    // Validación de Nombre
    private boolean validarNombre() {
        String nombre = txtNombre.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
            txtNombre.requestFocus();
            return false;
        }

        if (nombre.length() < 2) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener al menos 2 caracteres");
            txtNombre.requestFocus();
            return false;
        }

        if (nombre.length() > 50) {
            JOptionPane.showMessageDialog(null, "El nombre no puede exceder 50 caracteres");
            txtNombre.requestFocus();
            return false;
        }

        // Solo letras, espacios y acentos
        if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras y espacios");
            txtNombre.requestFocus();
            return false;
        }

        return true;
    }

    // Validación de Email
    private boolean validarEmail() {
        String email = txtEmail.getText().trim();

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El email es obligatorio");
            txtEmail.requestFocus();
            return false;
        }

        // Patrón para email
        String patronEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(patronEmail)) {
            JOptionPane.showMessageDialog(null, "Formato de email inválido");
            txtEmail.requestFocus();
            return false;
        }

        if (email.length() > 100) {
            JOptionPane.showMessageDialog(null, "El email no puede exceder 100 caracteres");
            txtEmail.requestFocus();
            return false;
        }

        return true;
    }

    // Validación de Teléfono
    private boolean validarTelefono() {
        String telefono = txtTelefono.getText().trim();

        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El teléfono es obligatorio");
            txtTelefono.requestFocus();
            return false;
        }

        // Solo números, espacios, guiones y paréntesis
        if (!telefono.matches("^[0-9\\s\\-\\(\\)\\+]+$")) {
            JOptionPane.showMessageDialog(null, "El teléfono solo puede contener números, espacios, guiones y paréntesis");
            txtTelefono.requestFocus();
            return false;
        }

        // Extraer solo números para validar longitud
        String soloNumeros = telefono.replaceAll("[^0-9]", "");
        if (soloNumeros.length() < 7 || soloNumeros.length() > 15) {
            JOptionPane.showMessageDialog(null, "El teléfono debe tener entre 7 y 15 dígitos");
            txtTelefono.requestFocus();
            return false;
        }

        return true;
    }

    // Validación de Clave
    private boolean validarClave() {
        String clave = String.valueOf(txtClave.getPassword());

        if (clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La clave es obligatoria");
            txtClave.requestFocus();
            return false;
        }

        if (clave.length() < 6) {
            JOptionPane.showMessageDialog(null, "La clave debe tener al menos 6 caracteres");
            txtClave.requestFocus();
            return false;
        }

        if (clave.length() > 20) {
            JOptionPane.showMessageDialog(null, "La clave no puede exceder 20 caracteres");
            txtClave.requestFocus();
            return false;
        }

        // Validar que tenga al menos una letra y un número
        if (!clave.matches(".*[a-zA-Z].*") || !clave.matches(".*[0-9].*")) {
            JOptionPane.showMessageDialog(null, "La clave debe contener al menos una letra y un número");
            txtClave.requestFocus();
            return false;
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrALogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton tgVerContraseña;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
