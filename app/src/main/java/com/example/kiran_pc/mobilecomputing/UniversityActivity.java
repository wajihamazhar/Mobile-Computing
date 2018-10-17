package com.example.kiran_pc.mobilecomputing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UniversityActivity extends AppCompatActivity {

    TextView tvUniversity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        tvUniversity=findViewById(R.id.tv_university);
        Intent intent=getIntent();
        if(intent != null){
            String msg = intent.getStringExtra("message");
            tvUniversity.setText(msg);
        }
    }
}
