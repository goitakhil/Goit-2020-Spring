package com.akhileshgoit.photographytips.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Tips for Beginners\n" +
                "Following are the great tips on how to begins your photography journey. These are the tips that helps me get over my photography mistakes.\n" +
                "1.\tMaster your Phone Camera.\n" +
                "Beginners can use their phone to capture the best scene. All you need is to capture a greater number of pictures and show them to your friends and try to get their feedback because feedback is the most important key to fix your mistakes. Try to capture from the better angles.\n" +
                "\n" +
                "2.\tBuy Camera in your Budget.\n" +
                "Going for the expensive camera at the beginning is not worthen. You can find lots of camera under \$800 which is better for taking photos. \n" +
                "\n" +
                "3.\tGet a Tripod.\n" +
                "If you have a shaky hand, then getting a tripod is great ideas. Tripod basically helps to prevent the camera movement and gives you a better stability for taking photos. I do not have shaky hand but when I go for 300mm lens then tripod is a great help. \n" +
                "\n" +
                "4.\tKeep your Camera with you all the Time.\n" +
                "Photo ops often come when you least expect it. If you can keep your equipment relatively simple – just a small camera bag and a tripod – you might be able to take advantage of some of those unexpected opportunities. Or, if your phone has a camera, use it to take “notes” on scenes you’d like to return to with your regular camera.\n"
    }
    val text: LiveData<String> = _text
}