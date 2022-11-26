package com.fjavmvazquez.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    private String[] frutas = { "Uvas", "Peras", "Mango", "Papaya",
            "Sandia", "Melon", "Duraznos", "Platanos", "Ciruelas", "Piña" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter< >(this,android.R.layout.simple_list_item_1,frutas);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,lv1.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}