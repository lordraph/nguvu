package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_user);

        Button buttonOne = findViewById(R.id.get_started);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(activity2Intent);
        });

    }

    public void openLogin(View view) {
        Intent intent = new Intent(UserActivity.this, UserLogin.class);
        startActivity(intent);
    }
}
