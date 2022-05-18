package com.example.shahrytask.ui.base

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.shahrytask.R
import com.example.shahrytask.data.local.ds.PrefersStore
import com.example.shahrytask.utils.NetworkHelper
import com.google.android.material.snackbar.Snackbar
import com.shahrytask.core.localization.LocalizationManager
import com.shahrytask.core.localization.MyContextWrapper
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var networkHelper: NetworkHelper

    @Inject
    lateinit var prefersStore: PrefersStore

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let { MyContextWrapper.wrap(it, "ar") })
        setUpAppLocalization(baseContext)
    }

    fun showNoNetworkError() {
        showSnackBar(getString(R.string.no_internet_connection))
    }

    fun showSnackBar(text: String) {
        val snackbar = Snackbar.make(findViewById(android.R.id.content), text, Snackbar.LENGTH_LONG)
        val tv =
            snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        tv.layoutDirection = View.LAYOUT_DIRECTION_LOCALE
//        val font = Typeface.createFromAsset(assets, "fonts/ibm_arabic_reg")
//        tv.setTypeface(font)
        tv.setTextColor(ContextCompat.getColor(this, R.color.white))
        val sbView = snackbar.view
        sbView.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        snackbar.show()
    }

    private fun setUpAppLocalization(context: Context?) {
        if (context != null) {
            LocalizationManager.changeAppLocale(context, "en")
        }
    }
}