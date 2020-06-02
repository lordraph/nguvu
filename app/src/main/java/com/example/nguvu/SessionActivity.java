package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_session);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_session:
                    break;

                case R.id.navigation_home:
                    Intent a = new Intent(SessionActivity.this, HomeActivity.class);
                    startActivity(a);
                    break;

                case R.id.navigation_profile:
                    Intent b = new Intent(SessionActivity.this, ProfileActivity.class);
                    startActivity(b);
                    break;

                case R.id.navigation_settings:
                    Intent c = new Intent(SessionActivity.this, SettingsActivity.class);
                    startActivity(c);
                    break;
            }
            return false;
        });
    }

    public void openQuestionnaire(View view) {
    }

    public void openChat(View view) {
        Intent c = new Intent(SessionActivity.this, ChatActivity.class);
        startActivity(c);
    }
}
