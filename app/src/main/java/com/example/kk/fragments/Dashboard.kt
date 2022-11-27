package com.example.kk.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kk.R

class Dashboard: Fragment(R.layout.fragment_dashboard) {

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editText)
        button = view.findViewById(R.id.button)

        button.setOnClickListener{


            val amount = editText.text.toString().toInt()

            val action = DashboardDirections.actionDashboardFragmentToNotificationFragment(amount)


            findNavController().navigate(action)
    }
    }
}


