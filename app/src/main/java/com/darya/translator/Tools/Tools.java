package com.darya.translator.Tools;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Tools {
    public static void hideKyboardWhenClicked(View mainLayout, Context context) {

// Then just use the following:
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
    }
}
