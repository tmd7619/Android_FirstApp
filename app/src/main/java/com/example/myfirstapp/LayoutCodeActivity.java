package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL); // new 연산자로 리니어 레이아웃을 만들고, 방향 설정

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);


        Button button11 = new Button(this);
        button11.setText("Button11");
        button11.setLayoutParams(params);
        mainLayout.addView(button11);


    }


}