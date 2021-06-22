package com.mskang.todaymenu

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
class RandomLunchTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var lunchRecommender: LunchRecommender

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun randomRecommendTest(): Unit = runBlocking {
        assertTrue(lunchRecommender.getRandomLunch().isNotBlank())
    }

}