package com.akhileshgoit.photographytips.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Photography Tips \t\t\t\t\t\t\t\t\t\tv1.0\n" +
                "\n" +
                "© 2020 Photography Tips. All right reserved.\n" +
                "\n" +
                "Photography Tips is made for beginners’ photography. We mention all the necessary information, that all the photographer should know. My goal is to provide as much ideas as I can. This application also contains lightroom editing tutorial.\n" +
                "\n" +
                "Contact: aki.goit7@gmail.com\n "
    }
    val text: LiveData<String> = _text}
