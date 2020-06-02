package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        overridePendingTransition(0, 0);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_profile:
                    break;

                case R.id.navigation_home:
                    Intent a = new Intent(ProfileActivity.this, HomeActivity.class);
                    startActivity(a);
                    break;

                case R.id.navigation_settings:
                    Intent b = new Intent(ProfileActivity.this, SettingsActivity.class);
                    startActivity(b);
                    break;

                case R.id.navigation_session:
                    Intent c = new Intent(ProfileActivity.this, SessionActivity.class);
                    startActivity(c);
                    break;
            }
            return false;
        });
    }
}
