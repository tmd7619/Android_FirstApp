package com.example.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SampleWidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        // layout 불러오기
        setContentView(R.layout.button);


    }


}
