package com.example.myfirstapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SampleProgress extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);
        Button button = findViewById(R.id.button23); // 보여주기 button
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dialog = new ProgressDialog(SampleProgress.this); // 프로그레스 대화상자 객체 만들고 설정
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // 멈추지 않는 프로그레스 바 생성
                dialog.setMessage("데이터를 확인하는 중입니다.");

                dialog.show();
            }
        });

        Button button2 = findViewById(R.id.button24);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dialog != null) { // 프로그레스 대화상자 없애기
                    dialog.dismiss();
                }
            }
        });

    }
}
