package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TherapistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_therapist);
    }
}
