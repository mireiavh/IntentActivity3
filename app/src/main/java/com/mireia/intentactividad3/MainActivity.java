package com.mireia.intentactividad3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText tvEdad;
    EditText tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void btnOnclick(View view) {

        tvEdad = findViewById(R.id.edadMain);
        tvNombre = findViewById(R.id.nombreMain);

        Intent intent = new Intent(this, Actividad2.class);
        String edad = tvEdad.getText().toString();
        String nombre = tvNombre.getText().toString();
        intent.putExtra("edad", edad);
        intent.putExtra("nombre", nombre);
        Log.i("EJEMPLO", "BLALALA");
        startActivity(intent);

    }
}