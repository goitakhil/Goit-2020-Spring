package com.akhileshgoit.photographytips.ui.Tutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.akhileshgoit.photographytips.R

class TutorialFragment : Fragment() {

    private lateinit var tutorialViewModel: TutorialViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tutorialViewModel =
                ViewModelProviders.of(this).get(TutorialViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tutorial, container, false)
        val textView: TextView = root.findViewById(R.id.text_tutorial)
        tutorialViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
