import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Supongamos que tienes un objeto UserProfile con los datos del usuario
        val userProfile = UserProfile(
            name = "Nombre del Usuario",
            email = "correo@example.com",
            profileImage = R.drawable.user_profile_image // Debes tener una imagen de perfil
        )

        // Vincula los datos del usuario con la interfaz
        nameTextView.text = userProfile.name
        emailTextView.text = userProfile.email
        profileImageView.setImageResource(userProfile.profileImage)
    }
}
