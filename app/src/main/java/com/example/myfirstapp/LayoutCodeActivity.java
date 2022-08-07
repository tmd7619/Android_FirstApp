package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

/**
 * new 연산자를 사용해서 뷰 객체를 만들 때에는 항상 Context 객체가 전달되야 함 -> 표준 자바에는 없고, 안드로이드에만 있는 특징
 * AppCompatActivity 클래스는 Context를 상속하므로 이 클래스 안에서는 this를 Context로 사용 가능
 */


public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // new 연산자로 리니어 레이아웃을 만들고, 방향 설정 // this : Context 객체가 전달된 것
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        // new 연산자로 레이아웃 안에 추가될 뷰들에 설정할 파라미터 생성
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );


        // 버튼에 파라미터 설정하고 레이아웃에 추가 // 버튼 뷰 객체를 만드는 과정이기에, this 사용
        Button button11 = new Button(this);
        button11.setText("Button11");
        button11.setLayoutParams(params); // 레이아웃 설정
        mainLayout.addView(button11);

        // 새로 만든 레이아웃을 화면에 설정
        setContentView(mainLayout);


    }


}