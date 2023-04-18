package edu.sv.myapplication;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapFruta extends ArrayAdapter<String> {
    Activity Contexto;
    String[] Frutas;

    String[] Descripcion;
    Integer [] imgfruta;
    ImageView imgFoto;
    TextView txvDescricpcion;
    TextView txvNombre;

    public AdapFruta(Activity Contexto, String[]Frutas,String[]Descripcion, Integer[]imgfruta) {
        super(Contexto, R.layout.frutas,Frutas);
        this.Contexto = Contexto;
        this.Frutas = Frutas;
        this.Descripcion= Descripcion;
        this.imgfruta = imgfruta;

    }
    public View getView(int posicion, View v, ViewGroup parent) {
        LayoutInflater inflater = Contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.frutas, null, true);
        txvNombre = rowView.findViewById(R.id.txvNombre);
        txvDescricpcion= rowView.findViewById(R.id.txvDescripcion);
        imgFoto = rowView.findViewById(R.id.imgFrutas);
        txvNombre.setText(Frutas[posicion]);
        txvDescricpcion.setText(Descripcion[posicion]);
        imgFoto.setImageResource(imgfruta[posicion]); return rowView;
    }

}
