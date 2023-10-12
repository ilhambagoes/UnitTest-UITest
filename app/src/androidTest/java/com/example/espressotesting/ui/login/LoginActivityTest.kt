package com.example.espressotesting.ui.login

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.espressotesting.R
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @get:Rule
    lateinit var activityRule : ActivityScenario<LoginActivity>

    @After
    fun cleanUp() {
        activityRule.close()
    }

    @Test
    fun intentToLogin() {
        val intent = Intent(ApplicationProvider.getApplicationContext(), LoginActivity::class.java)
        activityRule = ActivityScenario.launch(intent)
        Espresso.onView(ViewMatchers.withId(R.id.username)).perform(ViewActions.typeText("radenAjeng"))
        Espresso.onView(ViewMatchers.withId(R.id.password)).perform(ViewActions.typeText("iGustiWayan"))
        Thread.sleep(2000)
        Espresso.onView(ViewMatchers.withId(R.id.login)).perform(ViewActions.click())
    }

}