package com.kotlin.testkotlin.activitys

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.adapter.MainPageAdapter
import com.kotlin.testkotlin.basic.BaseActivity
import com.kotlin.testkotlin.fragments.HomeFragment
import com.kotlin.testkotlin.fragments.UserFragment
import kotlinx.android.synthetic.main.activity_main.*
import me.majiajie.pagerbottomtabstrip.NavigationController

class MainActivity : BaseActivity() {
    private var mNavigationController: NavigationController? = null

    override fun getLayoutId(): Int {
       return R.layout.activity_main
    }

    override fun setView() {
    }

    override fun setData() {
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
            .addItem(R.mipmap.main,
                "首页")
            .addItem(R.mipmap.user,
                "社区")
            .enableAnimateLayoutChanges()
            .build()
        mNavigationController!!.setHasMessage(1, true)
        mNavigationController!!.setMessageNumber(1, 6)
        mNavigationController!!.setupWithViewPager(main_vp)

    }
}
