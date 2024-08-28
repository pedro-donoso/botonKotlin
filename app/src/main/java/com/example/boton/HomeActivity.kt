package com.example.boton

//Importaciones
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//Clase principal que hereda de AppCompatActivity
class HomeActivity : AppCompatActivity() {
    //Declaración de la variable btnHome de tipo Button
    private lateinit var btnHome: Button
    //Sobreescritura del método onCreate() que se llama cuando se crea la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        //Llamada al método onCreate() de la clase padre
        super.onCreate(savedInstanceState)
        //Establecimiento del layout de la actividad
        setContentView(R.layout.activity_home)
        //Inicialización de la variable btnHome con el botón con id "btn_home"
        btnHome = findViewById(R.id.btn_home)
        //Configuración del listener del botón para mostrar un mensaje al hacer clic
        btnHome.setOnClickListener {
            Toast.makeText(this, "¡Has hecho clic en el botón!", Toast.LENGTH_SHORT).show()
        }
    }
}