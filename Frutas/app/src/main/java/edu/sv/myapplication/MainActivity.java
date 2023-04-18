package edu.sv.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
String[]Nombrefruta={"Aguacate",
        "Arandano",
        "Cereza",
        "Ciruela",
        "Coco",
        "Durazno",
        "Frambueza",
        "Fresa",
        "Granada",
        "Guayaba",
        "Jocote"
        ,"Kiwi",
        "limon",
        "Mango",
        "Manzana",
        "Maracuya",
        "Melon",
        "Naranaja",
        "Pera",
        "Piña",
        "Platano",
        "Sandia",
        "Tomate",
        "Uva Morada",
        "Uva Verde"
};
String[]Descripcion={"aguacate es el fruto del árbol del mismo nombre, de hoja perenne de la familia de las lauráceas"
            ,"arándano es un fruto carnoso que crece silvestre en casi todo el hemisferio norte",
            "La cereza es el fruto del cerezo, árbol de la familia de las rosáceas que alcanza hasta 20 m de altura.",
            "La ciruela es el fruto del ciruelo, árbol de la familia de las rosáceas, que alcanza hasta 5 m de altura.",
            "El Coco es una fruta exótica cuyo jugo tiene la propiedad de refrescar e hidratar de manera inmediata a la persona más sedienta, además de sus sustancias nutritivas como el hierro, potasio y sales minerales",
            "El durazno tiene forma semejante a un globo. Mide de cinco a siete centímetros y medio y es de color amarillento",
            "Es una fruta pequeña, cónica o redondeada con una piel aterciopelada de color rojo o amarillento",
            "La fresa es una fruta de forma cónica o casi redonda, de tamaño variable según la especie (de 15 a 22 mm de diámetro)",
            "ruto del granado, de forma globosa, con diámetro de unos diez centímetros, y coronado por un tubo corto y con dientecitos",
            "Su fruto es del tipo baya, de hasta de 8 cm de diámetro, con formas semiesférica,",
            "Es una planta arbórea perenne, con múltiples ramificaciones. Dependiendo del cultivar de jocote,"
            ,"El kiwi es una baya con forma de elipse y cubierta de una piel repleta de vellosidades.",
            "Fruta cítrica pequeña y amarilla que es una fuente de ácido cítrico y ácido ascórbico (vitamina C).",
            " el mango es una drupa que consta de una piel exterior, una porción carnosa comestible y un hueso central que encierra una sola semilla",
            " manzano, árbol de la familia de las rosáceas.",
            "Es una fruta redonda y pequeña de piel resistente que se arruga cuando está madur",
            "melón es una planta herbácea de porte rastrero o trepador de nombre científico Cucumis melo L",
            "La naranja es el fruto del naranjo dulce, árbol que pertenece al género Citrusde la familia de las rutáceas",
            "La pera (Pyrus communis) es una fruta en forma de bombilla;",
            "La piña o ananá (Ananas sativus) es una planta de la familia de las bromeliáceas.",
            "El plátano es una fruta tropical procedente de la planta herbácea que recibe el mismo nombre o banano",
            "Es una trepadora anual, dicotiledónea, herbácea, áspera, con tallo rastrer",
            "Tiene hojas fuertemente aromáticas con bordes dentados. Florece con abundancia y sus flores pequeñas y amarillas",
            "Uva Morada destaca por su atractivo color.",
            "Uva Verde destaca por su atractivo color."
};
ListView lvsFruits;
        Integer[]imgfrutas={
        R.drawable.aguacate,
        R.drawable.arandano,
        R.drawable.cereza,
        R.drawable.ciruela,
        R.drawable.coco,
        R.drawable.durazno,
        R.drawable.franbuesa,
        R.drawable.fresas,
        R.drawable.granada,
        R.drawable.guayaba,
        R.drawable.jocote,
        R.drawable.kiwi,
        R.drawable.limon,
        R.drawable.mango,
        R.drawable.manzana,
        R.drawable.maracuya,
        R.drawable.melon,
        R.drawable.naranja,
        R.drawable.pera,
        R.drawable.pina,
        R.drawable.platano,
        R.drawable.sandia,
        R.drawable.tomate,
        R.drawable.uva,
        R.drawable.uvaverde,
};

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapFruta adapter = new AdapFruta(this, Nombrefruta,Descripcion, imgfrutas);
        lvsFruits= findViewById(R.id.lvfrutas);
        lvsFruits.setAdapter(adapter);



    }

    }
