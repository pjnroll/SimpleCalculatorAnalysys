package org.farfallettalaviano.simplecalculator;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
/**
 * Created by stefa on 14/12/2017.
 */

@RunWith(AndroidJUnit4.class)
/**
 * Test that an operator is shown when an Operation button is pressed
 */
public class OpTextViewTest {

    @Rule
    /**
     * Create an instance of the Activity under test
     */
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickAddBtnTest () throws Exception{
        onView(withId(R.id.btnAdd)).perform(click());

        onView(withId(R.id.txtOp))
                .check(matches(withText("+")));

    }

    @Test
    public void clickSubBtnTest () throws Exception{
        onView(withId(R.id.btnSubtract)).perform(click());

        onView(withId(R.id.txtOp))
                .check(matches(withText("-")));

    }

    @Test
    public void clickMulBtnTest () throws Exception{
        onView(withId(R.id.btnMultiply)).perform(click());

        onView(withId(R.id.txtOp))
                .check(matches(withText("x")));

    }

    @Test
    public void clickDivBtnTest () throws Exception{
        onView(withId(R.id.btnDivide)).perform(click());

        onView(withId(R.id.txtOp))
                .check(matches(withText("/")));

    }

}
