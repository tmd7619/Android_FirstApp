package com.example.myfirstapp;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SampleEvent extends AppCompatActivity {

    TextView textView;
    GestureDetector detector; // 제스처 디텍터 객체 선언


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

        // 제스처 코드 작성
        detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                println("onDown() 호출됨");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                println("onShowPress() 호출됨");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                println("onSingleTapUp 호출됨");

                return true;
            }

            // 손가락으로 드래그 -> 이동한 거리 값이 중요하게 처리됨
            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onScroll() 호출됨 " + v + ", " + v1);
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                println("onLongPress() 호출됨");

            }

            // 빠른 속도로 스크롤 하는 것 -> 이동한 속도값이 중요하게 처리 됨
            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onFling() 호출됨 " + v + ", " + v1);
                return true;
            }
        });

        View view2 = findViewById(R.id.view2);
        view2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                detector.onTouchEvent(motionEvent);
                return true;
            }
        });


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(this, "시스템 [back] 버튼이 눌렸다", Toast.LENGTH_LONG).show();

            return true;
        } else
            return false;

    }

    public void println(String data) {
        textView.append(data + "\n");
    }


}
