package com.zunzum.kotlinbassic01_zun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            // 코드에 메모 남기 - 주석
//            ctrl + / : 커서가 있는 줄을 주석처리
//            이 { } 안에 있는 코드만, 버튼이 눌렸을때 실행됨

            Log.d("메인화면", "클릭용 버튼 눌림")
        }
   }

}