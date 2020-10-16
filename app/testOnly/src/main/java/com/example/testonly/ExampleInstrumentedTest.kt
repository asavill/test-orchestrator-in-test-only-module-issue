package com.example.testonly

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.testonlyorchestrator.MainActivity
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var rule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule<MainActivity>(MainActivity::class.java)


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.testonlyorchestrator", appContext.packageName)
    }

    @Test
    fun checkForHelloWorld() {
        Espresso.onView(ViewMatchers.withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun checkForHelloAndroidTestTeam() {
        Espresso.onView(ViewMatchers.withText("Hello Android Test Team"))
            .check(matches(isDisplayed()))
    }
}