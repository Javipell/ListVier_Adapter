package com.javi.pell.listvier_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    // fuente : http://www.proyectosimio.com/es/programacion-android-listview-adapter-personalizado-i/
    // http://www.proyectosimio.com/es/programacion-android-listview-adapter-personalizado-ii/

    ArrayList<Animal> animales;
    AnimalesAdapter adapter;
    ListView lvAnimales;
    TextView tvItemField, tvItemContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAnimales = findViewById(R.id.lvItems);
        tvItemField = findViewById(R.id.tvItemField);
        tvItemContent = findViewById(R.id.tvItemContent);

        animales = new ArrayList<>();

        rellenarArrayList();
        adapter = new AnimalesAdapter(this, animales);
        lvAnimales.setAdapter(adapter);

        lvAnimales.setOnItemClickListener(this);
    }

    private void rellenarArrayList()
    {
        animales.add(new Animal("aguila", R.drawable.aguila));
        animales.add(new Animal("ballena", R.drawable.ballena));
        animales.add(new Animal("caballo", R.drawable.caballo));
        animales.add(new Animal("camaleon", R.drawable.camaleon));
        animales.add(new Animal("canario", R.drawable.canario));
        animales.add(new Animal("cerdo", R.drawable.cerdo));
        animales.add(new Animal("delfin", R.drawable.delfin));
        animales.add(new Animal("gato", R.drawable.gato));
        animales.add(new Animal("iguana", R.drawable.iguana));
        animales.add(new Animal("lince", R.drawable.lince));
        animales.add(new Animal("lobo", R.drawable.lobo_9));
        animales.add(new Animal("morena", R.drawable.morena));
        animales.add(new Animal("orca", R.drawable.orca));
        animales.add(new Animal("perro", R.drawable.perro));
        animales.add(new Animal("vaca", R.drawable.vaca));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long ID)
    {
        tvItemContent.setText(animales.get(posicion).getNombre());
        tvItemField.setText(String.valueOf(posicion));
    }
}
