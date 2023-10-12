package com.example.espressotesting

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.espressotesting.ui.login.LoginActivityTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickLoginButton_opensLoginUi() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_login))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        //Use Thread Sleep for delay the next action, but it is not recommended for UI testing
        Thread.sleep(1000)

        LoginActivityTest().intentToLogin()
    }

}