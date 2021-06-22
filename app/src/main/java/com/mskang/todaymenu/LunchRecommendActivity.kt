package com.mskang.todaymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.mskang.todaymenu.databinding.ActivityLunchRecommendBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LunchRecommendActivity : AppCompatActivity() {
    lateinit var binding: ActivityLunchRecommendBinding
    private val viewModel by viewModels<LunchRecommendViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLunchRecommendBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.randomMenu.observe(this) {
            binding.recommendation.text = it
        }
    }
}