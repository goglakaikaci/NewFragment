package com.example.kk.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


import androidx.fragment.app.Fragment


import com.example.kk.R

class NotificationFragment: Fragment(R.layout.fragment_notification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.Textview).text =
            NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()


    }
}