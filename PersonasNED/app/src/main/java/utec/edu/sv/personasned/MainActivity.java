package utec.edu.sv.personasned;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    List<String> nombres;
    List<String> edad;
    List<String> direc;
    int []img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lstPersona);

        nombres = new ArrayList<String>();
        nombres.add("Carlos Quintanilla");
        nombres.add("Daniel Ramos");
        nombres.add("Hazel Zelaya");
        nombres.add("Juan Castro");
        nombres.add("Marcos Roncero");
        nombres.add("Maria Beltran");
        nombres.add("Rafael Montenegro");
        nombres.add("Susana Monterroza");

        edad= new ArrayList<String>();
        edad.add("24 años");
        edad.add("30 años");
        edad.add("25 años");
        edad.add("70 años");
        edad.add("45 años");
        edad.add("28 años");
        edad.add("24 años");
        edad.add("20 años");

        direc= new ArrayList<String>();
        direc.add("San Marcos, Urba");
        direc.add("San Salvador, San Salvador");
        direc.add("Santa Tecla, Santa Telca");
        direc.add("San Salvador, Santo Tomas");
        direc.add("Usulutan, Berlin");
        direc.add("San Miguel, El Transito");
        direc.add("Sal salvador, Soyapango");
        direc.add("San Marcos, La 10 de octubre");

        int [] pictures={
                R.drawable.carlos,
                R.drawable.daniel,
                R.drawable.hazel,
                R.drawable.juan,
                R.drawable.marcos,
                R.drawable.maria,
                R.drawable.rafael,
                R.drawable.susana
        };


        AdaptadorPersona adaptador = new AdaptadorPersona(this, R.layout.infopersona,nombres,edad,direc,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Selecciono: "+nombres.get(position),Toast.LENGTH_SHORT).show();
            }
        });



    }
}