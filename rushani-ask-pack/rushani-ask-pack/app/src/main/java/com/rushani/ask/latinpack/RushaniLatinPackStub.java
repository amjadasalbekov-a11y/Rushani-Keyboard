package com.rushani.ask.latinpack;

import android.app.Activity;
import android.os.Bundle;

/**
 * Stub Activity required by AnySoftKeyboard's add-on discovery mechanism.
 *
 * ASK scans installed apps for activities that handle the
 * KEYBOARD_PACK_KEYBOARD_DOES_NOT_EXIST intent. This stub satisfies
 * that requirement without doing anything visible to the user.
 *
 * In practice the user never sees or launches this activity directly;
 * ASK uses the manifest meta-data to load the keyboard layouts.
 */
public class RushaniLatinPackStub extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Nothing to do — this is just a discovery stub.
        finish();
    }
}
