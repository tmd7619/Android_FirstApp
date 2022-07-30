package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면에 무엇을 보여줄지 결정하는 메서드
        setContentView(R.layout.activity_main);

    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
    }

    public void onButton1Clicked2(View v) {
        // Intent :어떤 기능을 실행할 것인지 지정할 때 사용
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton1Clicked3(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }
    
}