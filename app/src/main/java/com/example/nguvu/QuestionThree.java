package com.example.nguvu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class QuestionThree extends AppCompatActivity {

    ImageButton btn;
    RadioGroup rg1, rg2, rg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_question_three);

        Button buttonOne = findViewById(R.id.next_button);
        buttonOne.setOnClickListener(v -> {
            // your handler code here
            Intent activity2Intent = new Intent(getApplicationContext(), QuestionFour.class);
            startActivity(activity2Intent);
        });

        btn = findViewById(R.id.cancel_button);
        btn.setOnClickListener(v -> showDialog());

        rg1  = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg1.clearCheck(); // this is so we can start fresh, with no selection on both RadioGroups
        rg2.clearCheck();
        rg3.clearCheck();
        rg1.setOnCheckedChangeListener(listener1);
        rg2.setOnCheckedChangeListener(listener2);
        rg3.setOnCheckedChangeListener(listener3);
    }

    private RadioGroup.OnCheckedChangeListener listener1 = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != -1) {
                rg2.setOnCheckedChangeListener(null);
                rg3.setOnCheckedChangeListener(null);// remove the listener before clearing so we don't throw that stackoverflow exception(like Vladimir Volodin pointed out)
                rg2.clearCheck();
                rg3.clearCheck();// clear the second RadioGroup!
                rg2.setOnCheckedChangeListener(listener2);
                rg3.setOnCheckedChangeListener(listener3); //reset the listener
                Log.e("XXX2", "do the work");
            }
        }
    };


    private RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != -1) {
                rg1.setOnCheckedChangeListener(null);
                rg3.setOnCheckedChangeListener(null);
                rg1.clearCheck();
                rg3.clearCheck();
                rg1.setOnCheckedChangeListener(listener1);
                rg3.setOnCheckedChangeListener(listener3);
                Log.e("XXX2", "do the work");
            }
        }
    };

    private RadioGroup.OnCheckedChangeListener listener3 = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != -1) {
                rg1.setOnCheckedChangeListener(null);
                rg2.setOnCheckedChangeListener(null);
                rg1.clearCheck();
                rg2.clearCheck();
                rg1.setOnCheckedChangeListener(listener1);
                rg2.setOnCheckedChangeListener(listener2);
                Log.e("XXX2", "do the work");
            }
        }
    };

    public void goBack(View view) {
        Intent intent = new Intent(QuestionThree.this, QuestionTwo.class);
        startActivity(intent);
    }

    public void showDialog(){
        Dialog dialog = new Dialog(QuestionThree.this);
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
