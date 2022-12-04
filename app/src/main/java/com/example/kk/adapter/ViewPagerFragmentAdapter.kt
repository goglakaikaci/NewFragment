package com.example.kk.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kk.fragments.CardFragment
import com.example.kk.fragments.Dashboard
import com.example.kk.fragments.HomeFragment
import com.example.kk.fragments.NotificationFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return HomeFragment()
        } else if(position == 1) {
            return Dashboard()
        } else if (position == 2){
            return NotificationFragment()
        } else{
            return CardFragment()
        }
    }
}
