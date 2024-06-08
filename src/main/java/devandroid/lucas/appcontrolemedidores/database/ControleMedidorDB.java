package devandroid.lucas.appcontrolemedidores.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ControleMedidorDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "controlemedidor.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public ControleMedidorDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTabelaMedidores
                = "CREATE TABLE Medidores (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "numeroMedidor TEXT, " +
                "numeroDaNota TEXT, " +
                "endereco TEXT)";

        db.execSQL(sqlTabelaMedidores);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
