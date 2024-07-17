package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


import android.os.Bundle;

import com.example.gridview.GridAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.gridView);


        String[] flowerName = {"Rose","Lotus","Lily","Jasmine",
                "Tulip","Orchid","Levender","RoseMarry","Sunflower","Carnation"};
        int[] flowerImages = {R.drawable.a,R.drawable.b, R.drawable.a,R.drawable.b,R.drawable.a,R.drawable.b,R.drawable.a,
                R.drawable.b,R.drawable.a,R.drawable.b};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,flowerName,flowerImages);
        gridview.setAdapter(gridAdapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You Clicked on "+ flowerName[position],Toast.LENGTH_SHORT).show();

            }
        });

    }
}