package com.example.nguvu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static androidx.core.os.LocaleListCompat.create;

public class LastQuestion extends AppCompatActivity {

    ImageButton btn;
    Button buttonPick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_last_question);

        btn = findViewById(R.id.cancel_button);
        btn.setOnClickListener(v -> showDialog());

        buttonPick = findViewById(R.id.finish_button);
        buttonPick.setOnClickListener(v -> showPickDialog());

    }

    public void goBack(View view) {
        Intent intent = new Intent(LastQuestion.this, QuestionTen.class);
        startActivity(intent);
    }

    public void showDialog(){
        Dialog dialog = new Dialog(LastQuestion.this);
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



    public void showPickDialog(){
        Dialog dialog = new Dialog(LastQuestion.this);
        dialog.setContentView(R.layout.question_done_dialog);
        dialog.setCancelable(true);
        /*   dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);*/

        Button btnPick = dialog.findViewById(R.id.btn_pick);
        btnPick.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(),SelectTherapist.class);
            startActivity(activity2Intent);
        });

        dialog.show();
    }

}



