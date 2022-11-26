package com.fjavmvazquez.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    private String[] cancion = { "Canción 1", "Canción 2", "Canción 3", "Canción 4",
            "Canción 5", "Canción 5"};
    private String[] enlace = { "https://youtu.be/mZxbQhPdal4", "https://youtu.be/P9FN6xpk-ZA", "https://youtu.be/Q04iqoRYMcQ", "https://youtu.be/J6qIzKxmW8Y",
            "https://youtu.be/8yfACv9Tp4w", "https://youtu.be/QW8nrxUUxdY"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter< >(this,android.R.layout.simple_list_item_1,cancion);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data = enlace[i];
                Toast.makeText(MainActivity.this,"Seleccionaste: " + lv1.getItemAtPosition(i).toString() +" "+ data,Toast.LENGTH_SHORT).show();
                lanzarActividad(data);
            }
        });
    }

    public void lanzarActividad(String data){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("data",data);
        startActivity(intent);
    }
}