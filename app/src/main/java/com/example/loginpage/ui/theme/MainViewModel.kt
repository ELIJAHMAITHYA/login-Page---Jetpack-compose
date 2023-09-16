package com.example.loginpage.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var isDialogShown by mutableStateOf(false)
        private set

    fun signUp() {
        isDialogShown = true
    }
    fun onDismissDialog (){
        isDialogShown= false
    }
}

