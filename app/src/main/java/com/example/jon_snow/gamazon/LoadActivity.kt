package com.example.jon_snow.gamazon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.jon_snow.gamazon.Controller.MainActivity

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)
        var gotoMain = Intent(this,MainActivity::class.java)
        var handler = Handler()
        handler.postDelayed({startActivity(gotoMain)},3000)
    }
}
