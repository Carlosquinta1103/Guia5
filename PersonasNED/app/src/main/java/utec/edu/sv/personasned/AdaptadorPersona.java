package utec.edu.sv.personasned;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorPersona extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> nombre;
    List<String> edad;
    List<String> direc;
    int[]imagenes;

    public AdaptadorPersona(Context contexto, int layout, List<String> nombre, List<String> edad,List<String> direc, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;
        this.edad = edad;
        this.direc = direc;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return nombre.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(contexto);
        v=layoutInflater.inflate(R.layout.infopersona,null);

        TextView txtnom = v.findViewById(R.id.txtnomb);
        txtnom.setText(nombre.get(position));
        TextView txted = v.findViewById(R.id.txtedad);
        txted.setText(edad.get(position));
        TextView txtdi = v.findViewById(R.id.txtdirec);
        txtdi.setText(direc.get(position));
        ImageView img=  v.findViewById(R.id.imgFoto);
        img.setImageResource(imagenes[position]);
        return v;
    }
}