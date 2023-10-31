import android.os.Bundle
import androidx.appcompat.lista_hotel.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.lista_hotel.*

class lista_hotel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Simulación de datos de hoteles
        val lista_hotel = listOf(
            Hotel("Hotel 1", "Ubicación 1", R.drawable.hotel_image_1),
            Hotel("Hotel 2", "Ubicación 2", R.drawable.hotel_image_2),
            Hotel("Hotel 3", "Ubicación 3", R.drawable.hotel_image_3)
            // Agrega más hoteles según sea necesario
        )

        val adapter = HotelAdapter(lista_hotel)
        hotelRecyclerView.layoutManager = LinearLayoutManager(this)
        hotelRecyclerView.adapter = adapter
    }
}
