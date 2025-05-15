package dto;

public class UsuarioLoginDTO {
    // ATRIBUTOS 
    private Integer idUsuario;
    private String clave;
    private Integer rolUsuario;
    private String token;

    // CONSTRUCTOR PARA LOGUEO
     public UsuarioLoginDTO(Integer idUsuario ,String clave) {
        this.idUsuario = idUsuario;
        this.clave = clave;
    }
    
    // GETTERS AND SETTERS 
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Integer rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    

}
