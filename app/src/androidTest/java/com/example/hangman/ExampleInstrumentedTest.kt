package com.example.hangman

import android.widget.ImageView
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Assert.*

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.espresso.matcher.ViewMatchers.withDrawable
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import com.example.hangman.stateHelper


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.hangman", appContext.packageName)
    }
    private lateinit var scene: ActivityScenario<MainActivity>
    @Test
    fun setUp() {
        // set up the scene
        scene = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun tearDown() {
        // close the scene and clean up
        scene.close()
    }

    @Test
    fun TestdisplayImage() {
        // Set up the state by setting timesGuessedWrong to 0
        stateHelper.timesGuessedWrong = 0

        // Perform the action by calling the displayImage function
        scene.onActivity { activity ->
            activity.displayImage()
        }

        // Assert the expected outcome by checking the displayed image
        scene.onActivity { activity ->
            val expectedImageResource = R.drawable.hangman0
            val imageView = activity.findViewById<ImageView>(R.id.imageView)
            assertThat(imageView, withDrawable(expectedImageResource))
        }
    }
}