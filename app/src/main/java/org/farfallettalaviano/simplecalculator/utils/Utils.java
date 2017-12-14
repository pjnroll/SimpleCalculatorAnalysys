package org.farfallettalaviano.simplecalculator.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

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

    /**
     * Util method that allows to hide the keyboard after the user presses a Button
     * @param v the current View
     */
    public static void hideKeyboard(Context ctx, View v) {
        if (v != null) {
            InputMethodManager imm;
            imm = (InputMethodManager) ctx.getSystemService(Context.INPUT_METHOD_SERVICE);
            assert imm != null;
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }
}
