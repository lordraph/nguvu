package com.example.nguvu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode((navigation));
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    break;

                case R.id.navigation_session:
                    Intent a = new Intent(HomeActivity.this, SessionActivity.class);
                    startActivity(a);
                    break;

                case R.id.navigation_profile:
                    Intent b = new Intent(HomeActivity.this, ProfileActivity.class);
                    startActivity(b);
                    break;

                case R.id.navigation_settings:
                    Intent c = new Intent(HomeActivity.this, SettingsActivity.class);
                    startActivity(c);
                    break;

            }
            return false;
        });
    }

    public void openQuestionnaire(View view) {
        Intent intent = new Intent(HomeActivity.this, QuestionnaireActivity.class);
        startActivity(intent);


    }
}


