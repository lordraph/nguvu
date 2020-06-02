package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_user_login);

        Button buttonOne = findViewById(R.id.login_button);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(activity2Intent);
        });

    }

    public void openSignUp(View view) {
        Intent intent = new Intent(UserLogin.this, UserActivity.class);
        startActivity(intent);
    }


}


