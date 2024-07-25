package com.example.mymenus;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.mymenus.R;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_settings) {
            openSettings();
            return true;
        } else if (id == R.id.menu_help) {
            showAbout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openSettings() {
        // Handle the settings action
        Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
    }

    private void showAbout() {
        // Handle the about action
        Toast.makeText(this, "About selected", Toast.LENGTH_SHORT).show();
    }
}