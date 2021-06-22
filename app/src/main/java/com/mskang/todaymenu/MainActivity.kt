package com.mskang.todaymenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.mskang.todaymenu.databinding.ActivityMainBinding
import jp.wasabeef.glide.transformations.BlurTransformation
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            while (isActive) {
                binding.ivBackground.setImageResource(R.drawable.main_background)
                binding.ivBackground.animate().setDuration(20000).translationX(300f)
                delay(20000)
                binding.ivBackground.setImageResource(R.drawable.main_background2)
                binding.ivBackground.animate().setDuration(20000).translationX(-300f)
                delay(20000)
            }
        }

        binding.btnCheck.setOnClickListener {
            startActivity(Intent(this, LunchRecommendActivity::class.java))
        }
    }
}