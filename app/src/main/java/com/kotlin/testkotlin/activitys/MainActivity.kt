package com.kotlin.testkotlin.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.adapter.MainPageAdapter
import com.kotlin.testkotlin.fragments.HomeFragment
import com.kotlin.testkotlin.fragments.UserFragment
import kotlinx.android.synthetic.main.activity_main.*
import me.majiajie.pagerbottomtabstrip.NavigationController

class MainActivity : AppCompatActivity() {
    private var mNavigationController: NavigationController? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewPagers()
    }

    private fun setViewPagers() {
        val mList = mutableListOf<Fragment>()
        mList.add(HomeFragment())
        mList.add(UserFragment())
        val mainAdapter = MainPageAdapter(
            supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT,
            mList
        )
        main_vp.offscreenPageLimit = 1
        main_vp.adapter = mainAdapter
        mNavigationController = main_page_nv.material()
            .addItem(R.mipmap.ic_launcher,
                "首页")
            .addItem(R.mipmap.ic_launcher,
                "社区")
            .enableAnimateLayoutChanges()
            .build()
        mNavigationController!!.setHasMessage(1, true)
        mNavigationController!!.setMessageNumber(1, 6)
        mNavigationController!!.setupWithViewPager(main_vp)

    }
}
