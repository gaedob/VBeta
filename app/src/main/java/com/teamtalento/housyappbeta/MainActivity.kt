package com.teamtalento.housyappbeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teamtalento.housyappbeta.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, MainFragment())
                .commitNow()
        }
        val actionBar = supportActionBar
        actionBar?.hide()

    }
}
