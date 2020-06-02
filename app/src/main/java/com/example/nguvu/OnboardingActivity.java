package com.example.nguvu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class OnboardingActivity extends AppCompatActivity {

    private Button btnOpenSheet;
    private TextView textComm;
    BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_onboarding);

        btnOpenSheet = findViewById(R.id.btn_openSheet);
        textComm = findViewById(R.id.text_comm);
        bottomSheetDialog = new BottomSheetDialog();

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.show(getSupportFragmentManager(), "Tag");
            }
        });
    }

    public void openTherapist(View view) {
        Intent intent = new Intent(OnboardingActivity.this, TherapistActivity.class);
        startActivity(intent);
    }

    public void openUser(View view) {
        Intent intent = new Intent(OnboardingActivity.this, UserActivity.class);
        startActivity(intent);
    }
}
