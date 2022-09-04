package com.example.myfirstapp;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SampleEvent extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.activity_event);

        textView = findViewById(R.id.textView7);

        View view = findViewById(R.id.view);

        // 리스너 등록 setOnTouchListener 호출 시, 파라미터로 리스너 객체를 전달 -> 뷰가 터치 되었을 때 이 리스너 객채의
        // onTouch 메서드가 자동으로 호출됨
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) { // MotionEvent 객채 : 액션정보, 터치 좌표 등 정보
                int action = motionEvent.getAction();
                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                if (action == MotionEvent.ACTION_DOWN) {
                    println("손가락 눌림 : " + curX + " " + curY);
                } else if (action == MotionEvent.ACTION_MOVE) {
                    println("손가락 움직임 : " + curX + " " + curY);
                } else if (action == MotionEvent.ACTION_UP) {
                    println("손가락 뗌 : " + curX + " " + curY);
                }

                return true;
            }

        });

    }

    public void println(String data) {
        textView.append(data + "\n");
    }


}
