package com.giri.mytodoapp.Utility;

import android.content.res.Resources;

import com.giri.mytodoapp.R;

public class PreferenceKeys {
    public final String night_mode_pref_key;

    public PreferenceKeys(Resources resources) {
        night_mode_pref_key = resources.getString(R.string.night_mode_pref_key);
    }
}
