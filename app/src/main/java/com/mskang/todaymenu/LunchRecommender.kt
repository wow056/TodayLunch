package com.mskang.todaymenu

import com.mskang.todaymenu.repository.LunchRepository
import javax.inject.Inject

class LunchRecommender @Inject constructor(
    private val lunchRepository: LunchRepository
) {

    suspend fun getRandomLunch(): String {
        return lunchRepository.getLunchList().random()
    }
}