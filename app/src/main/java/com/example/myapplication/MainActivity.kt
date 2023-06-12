package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.myapplication.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private val splashScreen=5000
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()
        val animasyon1 = AnimationUtils.loadAnimation(this,R.anim.animasyon1)
        val animasyon2 = AnimationUtils.loadAnimation(this,R.anim.animasyon2)
        val animasyon3 = AnimationUtils.loadAnimation(this,R.anim.animasyon3)

        val imageView = binding.imageView
        val baslik = binding.baslik
        val aciklama = binding.aciklama
        imageView.animation=animasyon2
        baslik.animation=animasyon3
        aciklama.animation=animasyon3

        Handler().postDelayed({

        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
            finish()
        },splashScreen.toLong())

    }
}