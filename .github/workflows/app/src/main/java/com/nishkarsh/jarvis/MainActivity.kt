package com.nishkarsh.jarvis

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// TEMPORARY skeleton screen. Replaced by the real JARVIS UI in Batch 2.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#050B1A"))
        }

        val title = TextView(this).apply {
            text = "NISHKARSH JARVIS"
            textSize = 26f
            setTextColor(Color.parseColor("#00D4FF"))
            gravity = Gravity.CENTER
        }

        val sub = TextView(this).apply {
            text = "Build OK - skeleton v" + BuildConfig.VERSION_NAME
            textSize = 14f
            setTextColor(Color.parseColor("#7FA8C9"))
            gravity = Gravity.CENTER
        }

        root.addView(title)
        root.addView(sub)
        setContentView(root)
    }
}
