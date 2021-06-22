package com.mskang.todaymenu.repository

import com.mskang.todaymenu.api.LunchAPI
import okio.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LunchRepository @Inject constructor(
    private val lunchAPI: LunchAPI
) {
    suspend fun getLunchList(): List<String> {
        try {
            val body = lunchAPI.getPlaceThatDoATastyFoodSt(1, 1000).body()
            return body?.PlaceThatDoATasteyFoodSt?.get(1)?.row?.map {
                it.REPRSNT_FOOD_NM
            } ?: emptyList()
        } catch (e: IOException) {
            return emptyList()
        }
    }
}