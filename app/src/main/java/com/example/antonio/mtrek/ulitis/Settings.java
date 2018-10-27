package com.example.antonio.mtrek.ulitis;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by antonio on 10/26/18.
 */

public class Settings {
    public static String languageId = "2";

    Context _context;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    static Settings inistance;
    private static final String PREF_NAME = "MTERK";
    int PRIVATE_MODE = 0;

    public Settings(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public static Settings init(Context context) {
        if (inistance == null) {
            inistance = new Settings(context);
        }

        return inistance;
    }
    public String getLang() {
        return pref.getString("LANG", "ar");
    }

    public void savelang(String language) {
        editor.putString("LANG", language);
        editor.commit();
    }


    public static void setUpLanguage(Context context) {
        if (context == null)
            return;
        if (Settings.init(context).getLang().equals("en")) {
            Locale locale = new Locale("en");
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            context.getResources().updateConfiguration(config,
                    context.getResources().getDisplayMetrics());

        }else {
            Locale locale = new Locale("ar");
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            context.getResources().updateConfiguration(config,
                    context.getResources().getDisplayMetrics());
        }

    }
}
