package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionnaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_questionnaire);

        Button buttonOne = findViewById(R.id.btn_start);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), QuestionOne.class);
            startActivity(activity2Intent);
        });
    }


    public void goBack(View view) {
        Intent intent = new Intent(QuestionnaireActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
