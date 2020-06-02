package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        overridePendingTransition(0, 0);



        BottomNavigationView navigation = findViewById(R.id.navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_settings:
                    break;

                case R.id.navigation_home:
                    Intent a = new Intent(SettingsActivity.this, HomeActivity.class);
                    startActivity(a);
                    break;

                case R.id.navigation_profile:
                    Intent b = new Intent(SettingsActivity.this, ProfileActivity.class);
                    startActivity(b);
                    break;

                case R.id.navigation_session:
                    Intent c = new Intent(SettingsActivity.this, SessionActivity.class);
                    startActivity(c);
                    break;
            }
            return false;
        });
    }
}
