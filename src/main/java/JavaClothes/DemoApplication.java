
package JavaClothes;

import vistas.vistaPrincipal.VistaPrincipal;

/**
 *
 * 
 */
public class DemoApplication {
    
    // Esta clase inicializa la aplicación 
     public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

}
