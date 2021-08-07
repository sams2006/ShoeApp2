package com.example.shoeapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class SaveShoeViewModel(
    val datatbase: ShoeDao ,
     application: Application): AndroidViewModel(application) {

}