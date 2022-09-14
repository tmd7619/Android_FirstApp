package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SampleOrientation extends AppCompatActivity {
    /**
     * @NonNull : null을 허용하지 않을 경우
     * @Nullable : null을 허용할 경우
     */
    String name;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
        showToast("onCreate 호출됨");


        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                name = editText.getText().toString(); // 버튼을 클릭했을 때 사용자가 입력한 값을 name 변수에 할당
                showToast("입력된 값을 변수에 저장했습니다 : " + name);
            }
        });

        if (savedInstanceState != null) { // 이 화면이 초기화될 때 name 변수의 값 복원
            name = savedInstanceState.getString("name");
            showToast("값을 복원했습니다 : " + name);

        }

    }

    // 단말 방향을 바꾸어 액티비티가 소멸되었다가 다시 만들어질 때 이 메서드가 동작함
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("name", name); // name 변수의 값 저장
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop() 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy() 호출됨");
    }

    public void showToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
