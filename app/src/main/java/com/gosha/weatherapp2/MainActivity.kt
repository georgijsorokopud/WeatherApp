package com.gosha.weatherapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gosha.weatherapp2.Fragment.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction().replace(R.id.placeHolder,MainFragment.newInstance()).commit()
    }
}