package devandroid.lucas.appcontrolemedidores.controller;

import android.content.ContentValues;
import android.content.Context;

import devandroid.lucas.appcontrolemedidores.database.ControleMedidorDB;
import devandroid.lucas.appcontrolemedidores.model.Medidor;
import devandroid.lucas.appcontrolemedidores.view.ControleMedidorActivity;

public class MedidorController extends ControleMedidorDB {


    public MedidorController(ControleMedidorActivity activity) {
        super(activity);
    }

    public void salvar(Medidor medidor){

        ContentValues dados = new ContentValues();

        dados.put("numeroMedidor", medidor.getNumeroMedidor());
        dados.put("numeroDaNota", medidor.getNumeroDaNota());
        dados.put("endereco", medidor.getEndereco());

        salvarObjeto("Medidores", dados);

    }
}
