package com.example.nguvu

import ViewPagerAdapter
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_select_therapist.*

class SelectTherapist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_select_therapist)

        val buttonOne = findViewById<Button>(R.id.select)
        buttonOne.setOnClickListener {
            // your handler code here
            val activity2Intent = Intent(applicationContext, SelectPlan::class.java)
            startActivity(activity2Intent)
        }

        view_pager2.adapter = ViewPagerAdapter()

    }

    fun goBack(view: View?) {
        val intent = Intent(this@SelectTherapist, QuestionnaireActivity::class.java)
        startActivity(intent)
    }
}