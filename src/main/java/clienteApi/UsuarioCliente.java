package clienteApi;

import dto.UsuarioLogin;
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

    private static final String BASE_URL = "http://localhost:8080";
    private static UsuarioApiService apiService;

    public UsuarioCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(UsuarioApiService.class);

    }

    public void createUser(Usuario usuario) {
        try {
            Response<Usuario> response = apiService.createUsuario(usuario).execute();
            if (response.isSuccessful()) {
                System.out.println("Usuario creado: " + response.body());
            } else {
                System.out.println("Error al crear usuario: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // METODO PARA LOGUEO DE USUARIOS, LANZA UNA EXCEPCIÓN 
    public Usuario LoginUser(UsuarioLogin usuarioLogin) throws Exception{
         
            // el metodo loginUsuario recibe un dto llamado usuarioLogin, que solo tienen usuario y clave. 
            Response<Usuario> response = apiService.loginUsuario(usuarioLogin).execute();
            
            if (response.isSuccessful()) {
                System.out.println("Usuario loguedao" + response.body());
                return response.body();
            } else {
                System.out.println("Datos ingresados incorrectos" + response.code());
                throw new Exception("Datos ingresados incorrectos");
            }
      
    }

}
