package com.akhileshgoit.photographytips.ui.Tutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TutorialViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lightroom Preset Setting"
    }
    val text: LiveData<String> = _text
}