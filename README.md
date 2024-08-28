![boton](https://github.com/user-attachments/assets/1865e23c-1c62-4869-a8eb-4d701e780370)

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

3. En res -> New Directory -> layout -> New Layout Resource File -> activity_home:

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">

    <Button
        android:id="@+id/btn_home"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="¡Haz clic!" />
</LinearLayout>
```

4. En AndroidManifest cambio nombre a .HomeActivity (Principal) y tema: Theme.AppCompat:

```
 <activity
            android:name=".HomeActivity"
            android:exported="true"
            android:label="@string/app_name"
            android:theme="@style/Theme.AppCompat">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```
