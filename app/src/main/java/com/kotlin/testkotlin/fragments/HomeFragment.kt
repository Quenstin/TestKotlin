package com.kotlin.testkotlin.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.adapter.MainFragmentGridAdapter
import com.kotlin.testkotlin.adapter.MainPageAdapter
import com.kotlin.testkotlin.basic.BaseFragment
import com.kotlin.testkotlin.bean.HomeFragmentGridBean
import kotlinx.android.synthetic.main.home_fragment_layout.*
import java.util.*

/**
 * Created by zhgq on 2020/3/13
 * Describe：
 */
class HomeFragment : BaseFragment() {



    override fun getLayoutId(): Int {
       return R.layout.home_fragment_layout
    }

    override fun setView() {

    }

    override fun setData() {
        setHomeGrid()
        setTab()
    }

    private fun setTab(){
        val tabTitle= listOf("超市","菜市场","台球场","网吧","游戏厅","奶茶店")
        val fragments= mutableListOf<Fragment>()
        for (i in tabTitle.indices ){
            fragments.add(TabFragment())
        }
        main_fragment_view_pager.adapter=MainPageAdapter(childFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT,fragments)
        main_fragment_tab.setViewPager(main_fragment_view_pager, tabTitle.toTypedArray())




    }

    private fun setHomeGrid() {
        val homeFragmentGridBeans: MutableList<HomeFragmentGridBean> =
            ArrayList()
        for (i in 0..3) {
            val homeFragmentGridBean = HomeFragmentGridBean("333", "222")
            homeFragmentGridBeans.add(homeFragmentGridBean)
        }
        val mainFragmentGridFragment =
            MainFragmentGridAdapter(homeFragmentGridBeans)
        main_fragment_glid.layoutManager = GridLayoutManager(activity, 2) as RecyclerView.LayoutManager?
        main_fragment_glid.adapter = mainFragmentGridFragment
    }


}