package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button addButton;
    EditText editText;

    String[] program_lan = new String[]{"java","php","python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);
        addButton = findViewById(R.id.button1);
        editText = findViewById(R.id.editText1);

        final List<String> prog_lan_arraylist = new ArrayList<>(Arrays.asList(program_lan));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,prog_lan_arraylist);
    listView.setAdapter(adapter);

    addButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            prog_lan_arraylist.add(editText.getText().toString());
            adapter.notifyDataSetChanged();
        }

    });

    }
}