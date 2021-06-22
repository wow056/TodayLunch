package com.mskang.todaymenu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LunchRecommendViewModel @Inject constructor(private val lunchRecommender: LunchRecommender) :
    ViewModel() {
        val randomMenu = liveData<String> {
            emit(lunchRecommender.getRandomLunch())
        }
}