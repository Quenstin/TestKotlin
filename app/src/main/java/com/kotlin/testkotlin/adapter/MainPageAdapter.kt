package com.kotlin.testkotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.*

/**
 * Created by zhgq on 2020/3/13
 * Describe：
 */
class MainPageAdapter(fm:FragmentManager, behavior:Int, private val fragments: MutableList<Fragment>) : FragmentPagerAdapter(fm,behavior) {



    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }


}