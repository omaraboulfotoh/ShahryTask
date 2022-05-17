package com.example.shahrytask

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import com.shahrytask.core.localization.LocalizationManager
import com.shahrytask.core.localization.MyContextWrapper
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class app : Application() {


    private var _baseContext: Context? = null

    override fun attachBaseContext(base: Context?) {
        base?.let { _baseContext = it }
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        _baseContext?.let { MyContextWrapper.wrap(it, "ar") }
        setUpAppLocalization(this)
        //Set Default Theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

    }

    private fun setUpAppLocalization(context: Context?) {
        if (context != null) {
            LocalizationManager.changeAppLocale(context, "ar")
        }
    }

}
