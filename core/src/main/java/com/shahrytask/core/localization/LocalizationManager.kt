package com.shahrytask.core.localization

import android.content.Context
import java.util.*

object LocalizationManager {


//    fun setAppLocale(context: Context) {
//        if (AppSharedPreference.getInstance(context)
//                ?.getString(AppSharedPreference.SELECTED_LANGUAGE) != null
//        ) {
//            changeAppLocale(
//                context,
//                AppSharedPreference.getInstance(context)
//                    ?.getString(AppSharedPreference.SELECTED_LANGUAGE)!!
//            )
//        } else {
//            AppSharedPreference.getInstance(context).putString(
//                AppSharedPreference.SELECTED_LANGUAGE,
//                Locale.getDefault().language.toLowerCase()
//            )
//            changeAppLocale(
//                context,
//                Locale.getDefault().language.toLowerCase()
//            )
//        }
//    }

    fun changeAppLocale(context: Context, language: String) {
        val resources = context.resources
        val dm = resources.displayMetrics
        val config = resources.configuration
        var locale = Locale(language)
        Locale.setDefault(locale)
        config.setLocale(locale)
        resources.updateConfiguration(config, dm)
    }
}