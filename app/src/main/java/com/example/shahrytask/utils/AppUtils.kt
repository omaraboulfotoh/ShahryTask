package com.example.shahrytask.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.provider.Settings
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.textfield.TextInputLayout

object AppUtils {


    /**
     * This method is used to validate a user Email
     */
    fun isValidMail(email: String?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun setInputFieldError(view: View, message: String) {
        (view as TextInputLayout).error = message
        if (!view.isErrorEnabled) view.isErrorEnabled = true
    }

    /**
     * this  method is used for hide soft keyboard
     */
    fun hideKeyboard(pActivity: Activity?) {
        if (pActivity != null) {
            if (pActivity.currentFocus != null) {
                val inputMethodManager =
                    pActivity.applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager?.hideSoftInputFromWindow(pActivity.currentFocus!!.windowToken, 0)
            }
        }
    }


    @SuppressLint("HardwareIds")
    fun getAndroidId(context: Context): String =
        Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)


}