package com.example.shahrytask.data.local.ds

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefersStoreImp @Inject constructor(@ApplicationContext var context: Context) : PrefersStore {


    private object PreferencesKeys {

    }

    val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_data")

}