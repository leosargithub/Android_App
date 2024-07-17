package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userlist;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(sgitavedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        intData();
        initRecyclerView();
    }
   private void initRecyclerView(){
        mrecyclerView = findViewById(R.id.RecycleView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(userlist);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
   }
   private void  intData(){
        userlist = new ArrayList<>();
        userlist.add(new ModelClass(R.drawable.girl,"Anjali", "How are you? ", "10:45 am ", " ......................."));
       userlist.add(new ModelClass(R.drawable.girl,"Anjali", "Hello What's up? ", "10:45 am ", " ......................."));
       userlist.add(new ModelClass(R.drawable.girl,"Anjali", "Hey  ", "10:45 am ", " ......................."));
       userlist.add(new ModelClass(R.drawable.girl,"Anjali", "What happend? ", "10:45 am ", " ......................."));
   }
}