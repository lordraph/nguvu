package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_select_plan);

        Button buttonOne = findViewById(R.id.checkout);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), Checkout.class);
            startActivity(activity2Intent);
        });
    }

    public void goBack(View view) {

        Intent intent = new Intent(SelectPlan.this, SelectTherapist.class);
        startActivity(intent);
    }
}
