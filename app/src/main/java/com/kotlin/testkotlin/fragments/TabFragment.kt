package com.kotlin.testkotlin.fragments

import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.adapter.TabFragmentAdapter
import com.kotlin.testkotlin.basic.BaseFragment
import com.kotlin.testkotlin.bean.TabFragmentListBean
import kotlinx.android.synthetic.main.tab_fragment_layout.*

/**
 * Created by zhgq on 2020/3/16
 * Describe：
 */
class TabFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.tab_fragment_layout
    }

    override fun setView() {
    }

    override fun setData() {
        val datas= mutableListOf<TabFragmentListBean>()
        for (i in 0..10){
            datas.add(TabFragmentListBean("店名","我是一个店小二,这工作不太行",R.mipmap.dianpu))
        }

        tab_rv.layoutManager=LinearLayoutManager(activity)
        tab_rv.adapter=TabFragmentAdapter(datas)

    }
}