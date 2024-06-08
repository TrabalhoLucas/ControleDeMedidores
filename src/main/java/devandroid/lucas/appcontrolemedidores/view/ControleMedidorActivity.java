package devandroid.lucas.appcontrolemedidores.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.lucas.appcontrolemedidores.R;

public class ControleMedidorActivity extends AppCompatActivity {

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

        editNumeroMedidor = findViewById(R.id.editNumeroMedidor);
        editNumeroDaNota = findViewById(R.id.editNumeroDaNota);
        editEndereco = findViewById(R.id.editEndereco);

        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
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
