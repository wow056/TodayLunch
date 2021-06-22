package com.mskang.todaymenu.api

import com.mskang.todaymenu.api.model.LunchResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LunchAPI {
    /*
    pIndex: 페이지 인덱스
    pSize: 한 페이지당 사이즈
    */
    @GET("/PlaceThatDoATasteyFoodSt")
    suspend fun getPlaceThatDoATastyFoodSt(
        @Query("pIndex") pIndex: Int,
        @Query("pSize") pSize: Int,
        @Query("KEY") key: String = "e987e966e2fd4b3eadb85db82bcac329",
        @Query("Type") type: String = "json"
    ): Response<LunchResponse>
}