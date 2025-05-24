package clienteApi;

import dto.UsuarioLoginDTO;
import java.io.IOException;
import modelo.Usuario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.UsuarioApiService;

/**
 *
 *
 */
public class UsuarioCliente {

    private static final String BASE_URL = "http://localhost:8089";
    private static UsuarioApiService apiService;

    public UsuarioCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(UsuarioApiService.class);

    }

    // METODO PARA CREAR UN USUARIO 
    public void createUser(Usuario usuario) {
        try {
            Response<Usuario> response = apiService.createUsuario(usuario).execute();
            if (response.isSuccessful()) {
                System.out.println("Usuario creado: " + response.body());
            } else {
                System.out.println("Error al crear usuario: " + response.code());
                throw new RuntimeException("Error del servidor: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error de conexión: " + e.getMessage());
        }
    }

    // METODO PARA LOGUEO DE USUARIOS, LANZA UNA EXCEPCIÓN 
    public UsuarioLoginDTO LoginUser(UsuarioLoginDTO usuarioLogin) throws Exception {

        // el metodo loginUsuario recibe un dto llamado usuarioLogin, que solo tienen usuario , clave y rol . 
        Response<UsuarioLoginDTO> response = apiService.loginUsuario(usuarioLogin).execute();
        if (response.isSuccessful()) {
            System.out.println("Usuario loguedao" + response.body());
            return response.body();
        } else {
            System.out.println("Datos ingresados incorrectos" + response.code());
            throw new Exception("Datos ingresados incorrectos");
        }

    }

    // METODO PARA EDITAR UN USUARIO 
    public void updateUser(Integer idUsuario, Usuario usuario) throws Exception{
        Response<Usuario> response = apiService.updateUsuario(idUsuario, usuario).execute();
        if (response.isSuccessful()) {
            System.out.println("Usuario actualizado: " + response.body());
        } else {
            System.out.println("Error al actualizar usuario: " + response.code());
            throw new Exception("Error al actualizar usuario");
        }

    }

    // METODO PARA BUSCAR UN USUARIO POR ID 
    public Usuario buscarUsuarioPorId(Integer id, String token) throws Exception {
        String authToken = "Bearer "+token;
        Response<Usuario> response = apiService.getUsuarioById(id,authToken).execute();
        if (response.isSuccessful()) {
            System.out.println(response.body());
            return response.body();
        } else {
            System.out.println("Usuario no encontrado: " + response.code());
            throw new Exception("Usuario no Encontrado");
        }

    }

}
