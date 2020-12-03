package com.example.myapplication

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    lateinit var IV : ImageView
    lateinit var tv :TextView
    lateinit var tv1 :TextView
     val animationduration: Long =1200
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        IV = findViewById<ImageView>(R.id.img)
        tv = findViewById<TextView>(R.id.tv)
        tv1 = findViewById<TextView>(R.id.tv2)

        val animatorx = ObjectAnimator.ofFloat(IV,"x",1020f)
        animatorx.setDuration(1500)
        val animatorSet = AnimatorSet()
        animatorSet.playTogether(animatorx)
        animatorSet.start()

        val animatorx1 = ObjectAnimator.ofFloat(tv,"y",150f)
        animatorx1.setDuration(animationduration)
        val animatorSet1 = AnimatorSet()
        animatorSet.playTogether(animatorx1)
        animatorSet.start()


        val animatorx2 = ObjectAnimator.ofFloat(tv2,"x",300f)
        animatorx1.setDuration(animationduration)
        val animatorSet2 = AnimatorSet()
        animatorSet.playTogether(animatorx2)
        animatorSet.start()

        Handler().postDelayed(
            {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }, 1900)



    }
}
