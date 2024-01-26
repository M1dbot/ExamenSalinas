package com.example.examenpractico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etPrimerParcial, etSegundoParcial;
    private Button btnCalcularPromedio;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrimerParcial = findViewById(R.id.etPrimerParcial);
        etSegundoParcial = findViewById(R.id.etSegundoParcial);
        btnCalcularPromedio = findViewById(R.id.btnCalcularPromedio);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcularPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        try {
            double primerParcial = Double.parseDouble(etPrimerParcial.getText().toString());
            double segundoParcial = Double.parseDouble(etSegundoParcial.getText().toString());

            double promedio = (primerParcial + segundoParcial) / 2;

            // Puedes mostrar el resultado en un TextView
            tvResultado.setText("Promedio: " + promedio);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el usuario no ingresa números válidos
            tvResultado.setText("Ingrese números válidos");
        }
    }
}
