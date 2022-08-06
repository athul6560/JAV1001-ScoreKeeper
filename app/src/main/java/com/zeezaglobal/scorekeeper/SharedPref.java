package com.zeezaglobal.scorekeeper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPref {
    //this class is used to handle the shared preference methods and variables
    private static final String SCOREA = "Scorea";
    private static final String SCOREB = "Scoreb";

    public static void StoreScoreA(Context context, int score) {
        if (Settings.STORE_STATUS) {
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
            Boolean statusLocked = prefs.edit().putInt(SCOREA, score).commit();
        }
    }

    public static int GetScoreA(Context context) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getInt(SCOREA, 0);

    }

    public static void StoreScoreB(Context context, int score) {
        if (Settings.STORE_STATUS) {
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
            Boolean statusLocked = prefs.edit().putInt(SCOREB, score).commit();
        }
    }

    public static int GetScoreB(Context context) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getInt(SCOREB, 0);

    }
}
