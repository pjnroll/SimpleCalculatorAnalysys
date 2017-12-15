package org.farfallettalaviano.simplecalculator.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import static java.lang.Math.E;

/**
 * Created by Pj94 on 07/12/2017.
 */

public class Utils {
    /**
     * this method let to avoid casting every time the Views to their specific sub-classes;
     * @param act the activity that contains the View
     * @param viewId the id of the view to be returned
     * @param <T> the class parameter to be returned
     * @return the casted view
     */
    public static <T extends View> T findViewById(Activity act, int viewId) {
        View containerView = act.getWindow().getDecorView();
        View toRet = containerView.findViewById(viewId);

        return (T) toRet;
    }

    public static void letsGoOverflow() {
        Log.e("STARTED", "GO");
        double saveMe = 0.0d;
        try {
            for (double i = E+9999999; ; i=i+10000) {
                saveMe = i;
                Log.e("NUMBER", String.valueOf(saveMe));
            }
        } catch (NumberFormatException e) {
            Log.e("OVERFLOOOW?", String.valueOf(saveMe));
        }
    }
}
