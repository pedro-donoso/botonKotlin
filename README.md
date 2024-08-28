1. Configurar gradle(Module:app) para utilizar viewBinding:

```  
  buildFeatures {
        compose = true
        viewBinding = true
    }
    dataBinding {
        enable = true
    }
```

2. Crear HomeActivity -> en la carpeta raiz -> New Kotlin Class/File:

```
package com.example.boton

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnHome = findViewById(R.id.btn_home)
        btnHome.setOnClickListener {
            Toast.makeText(this, "¡Has hecho clic en el botón!", Toast.LENGTH_SHORT).show()
        }
    }
}
```   

Paso 1: Declarar variables y métodos
Declaramos una variable private lateinit var btnHome: Button para almacenar una referencia al botón que se encuentra en el archivo de layout activity_home.xml.

Paso 2: Sobreescribir el método onCreate
Sobreescribimos el método onCreate que se llama cuando se crea la actividad. En este método, llamamos al método super.onCreate para inicializar la actividad y luego establecemos el contenido de la pantalla con setContentView(R.layout.activity_home).

Paso 3: Encontrar el botón
Utilizamos el método findViewById para encontrar el botón con el id R.id.btn_home y lo asignamos a la variable btnHome.

Paso 4: Establecer el listener de clics
Establecemos un listener de clics en el botón con btnHome.setOnClickListener. Cuando se hace clic en el botón, se ejecutará el código dentro de la lambda.

Paso 5: Mostrar el mensaje de toast personalizado
Dentro del listener de clics, obtenemos el texto del botón con btnHome.text.toString() y lo utilizamos para mostrar un mensaje de toast personalizado con Toast.makeText. El mensaje de toast se muestra con el texto "¡Has hecho clic en el botón '$buttonText'!".
