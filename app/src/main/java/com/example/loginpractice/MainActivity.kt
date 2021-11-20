package com.example.loginpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val getId = idContent.text.toString()
            val getPw = pwContent.text.toString()
            
            if (getId == "kevin960831@naver.com" && getPw == "jae0831"){
                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "아이디와 비밀번호를 다시 확인해주세요", Toast.LENGTH_SHORT).show()
            }
        }

    }
}