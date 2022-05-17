package com.example.shahrytask.ui.home

import androidx.lifecycle.ViewModel
import com.example.shahrytask.data.local.ds.PrefersStore
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
//    var homeUseCase: GetHomeUseCase,
    var prefersStore: PrefersStore
) : ViewModel() {
    

}
