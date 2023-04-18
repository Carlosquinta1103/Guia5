package utec.edu.sv.modejemplo2;

import androidx.appcompat.app.AppCompatActivity;

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
    int []img;
    List<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lstLista);

        nombres = new ArrayList<String>();
        nombres.add("ana");
        nombres.add ("carlos");
        nombres.add("adriana");
        nombres.add("andrea");
        nombres.add("erick");
        nombres.add("jose");
        nombres.add("josue");
        nombres.add("juan");
        nombres.add ("maria");


        int [] pictures={
                R.drawable.abby,
                R.drawable.carlos,
                R.drawable.adriana,
                R.drawable.andrea,
                R.drawable.erick,
                R.drawable.jose,
                R.drawable.josue,
                R.drawable.juan,
                R.drawable.maria,
        };

        //ArrayAdapter<String> adaotador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        AdaptadorPerosona adaptador = new AdaptadorPerosona(this, R.layout.elemento,nombres,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Selecciono: "+nombres.get(position),Toast.LENGTH_SHORT).show();
            }
        });



    }
}