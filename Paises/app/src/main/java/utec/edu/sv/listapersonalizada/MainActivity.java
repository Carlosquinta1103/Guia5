package utec.edu.sv.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] paises={"EL Salvador","Guatemala", "Honduras", "Nicaragua","Costa Rica "};
    ListView lvstPais;
    Integer[]ImgPais={

            R.drawable.elsalvador,
            R.drawable.guatemala,
            R.drawable.honduras,
            R.drawable.nicaragua,
            R.drawable.costarica,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais(this, paises, ImgPais);
        lvstPais = findViewById(R.id.lsPaises);
        lvstPais.setAdapter (adaptador);
    }
}