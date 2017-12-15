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
 * Test that a number is shown in the second value TextView, when a Number button is pressed
 */
public class SecondTextViewTest {

    @Rule
    /**
     * Create an instance of the Activity under test
     */
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void click0BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn0)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("0")));
    }

    @Test
    public void click1BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn1)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("1")));
    }

    @Test
    public void click2BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn2)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("2")));
    }

    @Test
    public void click3BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn3)).perform(click());

        onView(ViewMatchers.withId(R.id.txtVal2))
                .check(matches(withText("3")));
    }

    @Test
    public void click4BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn4)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("4")));
    }

    @Test
    public void click5BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn5)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("5")));
    }

    @Test
    public void click6BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn6)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("6")));
    }

    @Test
    public void click7BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn7)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("7")));
    }

    @Test
    public void click8BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn8)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("8")));
    }

    @Test
    public void click9BtnTest () throws Exception {
        //trying to navigate on the second TextView
        onView(withId(R.id.txtVal2)).perform(click());
        onView(withId(R.id.txtVal2)).perform(click());

        onView(withId(R.id.btn9)).perform(click());

        onView(withId(R.id.txtVal2))
                .check(matches(withText("9")));
    }
}
