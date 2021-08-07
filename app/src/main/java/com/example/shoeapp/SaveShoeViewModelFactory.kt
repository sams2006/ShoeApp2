package com.example.shoeapp

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SaveShoeViewModelFactory(
    private val dataSource : ShoeDao ,
    private val application: Application): ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(SaveShoeViewModel::class.java)) {
            return SaveShoeViewModel(dataSource , application) as T
        }

        throw IllegalArgumentException("UnKnow ViewModel Class")
    }
}