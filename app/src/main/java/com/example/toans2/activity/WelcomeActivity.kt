package com.example.toans2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.toans2.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val textS:TextView=findViewById(R.id.text_s)
        val number2:TextView=findViewById(R.id.number_2)
        val slogun1 :TextView=findViewById(R.id.slogun1)
        val slogun2 :TextView=findViewById(R.id.slogun2)
        val slogun3 :TextView=findViewById(R.id.slogun3)
        val slogun4 :TextView=findViewById(R.id.slogun4)
        val slogun5 :TextView=findViewById(R.id.slogun5)

        val aniLeftRight = AnimationUtils.loadAnimation(this,R.anim.left_right)
        val aniRightLeft = AnimationUtils.loadAnimation(this,R.anim.right_left)
        val aniScale = AnimationUtils.loadAnimation(this,R.anim.stb)
        val aniSlogun1 = AnimationUtils.loadAnimation(this,R.anim.bottom_top1)
        val aniSlogun2 = AnimationUtils.loadAnimation(this,R.anim.bottom_top2)
        val aniSlogun3 = AnimationUtils.loadAnimation(this,R.anim.bottom_top3)
        val aniSlogun4 = AnimationUtils.loadAnimation(this,R.anim.bottom_top4)
        val aniSlogun5 = AnimationUtils.loadAnimation(this,R.anim.bottom_top5)

        slogun1.startAnimation(aniSlogun1)
        slogun2.startAnimation(aniSlogun2)
        slogun3.startAnimation(aniSlogun3)
        slogun4.startAnimation(aniSlogun4)
        slogun5.startAnimation(aniSlogun5)
        textS.startAnimation(aniLeftRight)
        number2.startAnimation(aniRightLeft)

        lifecycleScope.launch {
            delay(5500)
            MainActivity.starter(this@WelcomeActivity)
            finish()
        }
    }
}