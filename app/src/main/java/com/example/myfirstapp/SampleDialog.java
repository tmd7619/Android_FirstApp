package com.example.myfirstapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 알림 대화상자 보여주기
 * 버튼을 눌렀을때 대화상자를 보여주는 코드
 */
public class SampleDialog extends AppCompatActivity {

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog);

        textView = findViewById(R.id.textView9);

        Button button = findViewById(R.id.button22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage();
            }
        });

    }

    private void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this); // 대화상자를 만들기 위한 빌더 객체 생성
        builder.setTitle("안내");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);


        //버튼 추가 메서드 생성
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "예 버튼이 눌렸습니다. ";
                textView.setText(message);
            }
        });

        builder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "취소 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = "아니오 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        AlertDialog dialog = builder.create(); // 대화상자 객체 생성 후 보여주기
        dialog.show();


    }


}
