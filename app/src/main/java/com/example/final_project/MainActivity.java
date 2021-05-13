package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv_jinwoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 1;
        String c = "김가연";
        String s = "송대관의네박자";

        String n = "남진의 둥쥐";
        String jjy = "전준엽";
        String idea = "소스코드 -> vcs -> commit -> 바꾼 파일 선택 -> 왼쪽하단 파란커밋 버튼 누르기 -> vcs -> git -> push";
        String oo = "잘가나요";

        String cc = "아 왜안돼";
        String zz = "sadsadsa";

        tv_jinwoo = findViewById(R.id.tv_jinwoo);




    }
}