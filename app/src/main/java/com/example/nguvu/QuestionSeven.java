package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class QuestionSeven extends AppCompatActivity {
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_question_seven);

        Button buttonOne = findViewById(R.id.next_button);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), QuestionEight.class);
            startActivity(activity2Intent);
        });

        btn = findViewById(R.id.cancel_button);
        btn.setOnClickListener(v -> showDialog());
    }

    public void goBack(View view) {
        Intent intent = new Intent(QuestionSeven.this, QuestionSix.class);
        startActivity(intent);
    }

    public void showDialog(){
        Dialog dialog = new Dialog(QuestionSeven.this);
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
