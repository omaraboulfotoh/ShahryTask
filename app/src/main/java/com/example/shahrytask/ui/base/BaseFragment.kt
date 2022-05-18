package com.example.shahrytask.ui.base

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.shahrytask.R
import com.example.shahrytask.utils.NetworkHelper
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

open class BaseFragment :Fragment() {

    @Inject
    lateinit var networkHelper: NetworkHelper



    open fun showNoNetworkError() {
        showSnackBar(getString(R.string.no_internet_connection))
    }

    fun showSnackBar(text:String){
        val snackbar = Snackbar.make(requireView(), text, Snackbar.LENGTH_LONG)
        val tv = snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        tv.layoutDirection = View.LAYOUT_DIRECTION_LOCALE
//        val font = Typeface.createFromAsset(assets, "fonts/ibm_arabic_reg")
//        tv.setTypeface(font)
        tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        val sbView = snackbar.view
        sbView.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
        snackbar.show()
    }
}