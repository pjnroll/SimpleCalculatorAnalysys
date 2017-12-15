package org.farfallettalaviano.simplecalculator;

import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stefa on 12/12/2017.
 */
public class MainActivityTest {

    @Rule
    /**
     * Create an instance of the Activity under test
     */
    public ActivityTestRule<MainActivity> mActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityActivityTestRule.getActivity();
    }

    @Test
    public void sumTest(){

        TextView mTextSum1 = mActivity.findViewById(R.id.txtVal1);
        TextView mTextSum2 = mActivity.findViewById(R.id.txtVal2);

        mTextSum1.setText(2);
        mTextSum2.setText(2);

        assertEquals(4, mActivity.addValues());
    }


    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}