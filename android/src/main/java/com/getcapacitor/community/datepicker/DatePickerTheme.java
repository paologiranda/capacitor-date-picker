package com.getcapacitor.community.datepicker;

import android.content.Context;

public class DatePickerTheme {

    public static int get(String theme, Context context) {

        Integer result = context.getResources().getIdentifier(theme, "style", context.getPackageName());

        if (result != 0) return result;

        switch (theme) {
            case "dark":
                result = R.style.MateriaDarkTheme;
                break;
            case "light":
                result = R.style.MaterialLightTheme;
                break;
            case "legacyDark":
                result = R.style.SpinnerDarkTheme;
                break;
            case "legacyLight":
                result = R.style.SpinnerLightTheme;
                break;
            case "MorningCapitalDatePicker":
                result = R.style.MorningCapitalDatePicker;
                break;
            case "LaserwallDatePicker":
                result = R.style.MorningCapitalDatePicker;
                break;
            default:
                result = R.style.MaterialLightTheme;
                break;
        }

        return result;
    }
}
