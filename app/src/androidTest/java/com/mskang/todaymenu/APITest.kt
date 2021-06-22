package com.mskang.todaymenu

import android.util.Log
import com.mskang.todaymenu.repository.LunchRepository
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class APITest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var lunchRepository: LunchRepository

    @Before
    fun init() {
        hiltRule.inject()
    }


    @Test
    fun showLunchTest(): Unit = runBlocking {
        val result = lunchRepository.getLunchList()
        Log.d(TAG, "showLunchTest: $result")
        assertTrue(true)
    }

    companion object {
        private const val TAG = "APITest"
    }
}