import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        buttonlogin.setOnClickListener {
            val editTextUsername
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Validar el nombre de usuario y la contraseña aquí.
            if (isValidCredentials(username, password)) {
                // Inicio de sesión exitoso, redirige a la siguiente actividad.
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Muestra un mensaje de error si las credenciales son incorrectas.
                // Por ejemplo, puedes mostrar un Toast o un TextView en la interfaz de usuario.
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // lógica de validación de las credenciales.
        // comparar con credenciales almacenadas en base de datos o servidor.
        return username == "usuario" && password == "contraseña"
    }
}



