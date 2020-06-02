package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class QuestionNine extends AppCompatActivity {

    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_question_nine);

       Spinner spinnerCountry = findViewById(R.id.country);
        ArrayAdapter<String> spinnerCountryArrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.countries_array));
        spinnerCountry.setAdapter(spinnerCountryArrayAdapter);

        Button buttonOne = findViewById(R.id.next_button);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), QuestionTen.class);
            startActivity(activity2Intent);
        });

        btn = findViewById(R.id.cancel_button);
        btn.setOnClickListener(v -> showDialog());
    }


    public void goBack(View view) {
        Intent intent = new Intent(QuestionNine.this, QuestionEight.class);
        startActivity(intent);
    }

    public void showDialog(){
        Dialog dialog = new Dialog(QuestionNine.this);
        dialog.setContentView(R.layout.question_dialog);
        dialog.setCancelable(true);
        /*   dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);*/

        Button btnYes = dialog.findViewById(R.id.btn_yes);
        btnYes.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(), QuestionnaireActivity.class);
            startActivity(activity2Intent);
        });

        Button btnNo = dialog.findViewById(R.id.btn_no);
        btnNo.setOnClickListener(v -> {
            // If user click no
            // then dialog box is canceled.
            dialog.cancel();
        });

        dialog.show();
    }

}
