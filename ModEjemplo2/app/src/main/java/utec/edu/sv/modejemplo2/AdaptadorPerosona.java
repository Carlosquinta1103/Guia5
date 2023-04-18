package utec.edu.sv.modejemplo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorPerosona extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> nombre;

    int[]imagenes;

    public AdaptadorPerosona(Context contexto, int layout, List<String> nombre, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;

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
        v=layoutInflater.inflate(R.layout.elemento,null);

        TextView txtnom = v.findViewById(R.id.txtNombre);
        txtnom.setText(nombre.get(position));

        ImageView img=  v.findViewById(R.id.imgFoto);
        img.setImageResource(imagenes[position]);
        return v;
    }
}