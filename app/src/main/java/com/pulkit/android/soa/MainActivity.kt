package com.pulkit.android.soa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pulkit.feature.registry.features.IHomeFeature
import com.pulkit.feature.registry.getOfType

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            featureRegistry(this).getOfType<IHomeFeature>().firstOrNull()?.show(this)
        }
    }
}
