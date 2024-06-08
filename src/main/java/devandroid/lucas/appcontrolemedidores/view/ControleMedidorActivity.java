package devandroid.lucas.appcontrolemedidores.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.lucas.appcontrolemedidores.R;
import devandroid.lucas.appcontrolemedidores.controller.MedidorController;
import devandroid.lucas.appcontrolemedidores.model.Medidor;

public class ControleMedidorActivity extends AppCompatActivity {

    MedidorController controller;

    Medidor medidor;

    EditText editNumeroMedidor;
    EditText editNumeroDaNota;
    EditText editEndereco;

    Button btnSalvar;
    Button btnLimpar;
    Button btnFinalizar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_controlemedidores);

        controller = new MedidorController(ControleMedidorActivity.this);

        medidor = new Medidor();

        editNumeroMedidor = findViewById(R.id.editNumeroMedidor);
        editNumeroDaNota = findViewById(R.id.editNumeroDaNota);
        editEndereco = findViewById(R.id.editEndereco);

        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnSalvar.setOnClickListener(v -> {

            medidor.setNumeroMedidor(editNumeroMedidor.getText().toString());
            medidor.setNumeroDaNota(editNumeroDaNota.getText().toString());
            medidor.setEndereco(editEndereco.getText().toString());

            Toast.makeText(ControleMedidorActivity.this,"Salvo com sucesso!",Toast.LENGTH_LONG).show();


            controller.salvar(medidor);


        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNumeroMedidor.setText("");
                editNumeroDaNota.setText("");
                editEndereco.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ControleMedidorActivity.this,"Cuide dos seus medidores!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
