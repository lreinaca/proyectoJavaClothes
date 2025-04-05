package modelo.ENUMs;

/**
 *
 * @author lreinac
 */
public enum RolUsuario {
    Cliente(3),
    Vendedor(2),
    Administrador(1);
    
    private Integer rolId;

    private RolUsuario(Integer rolId) {
        this.rolId = rolId;
    }

    public Integer getRolId() {
        return rolId;
    }
    
    
    
    
    
    
}
