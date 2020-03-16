package com.kotlin.testkotlin.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.bean.TabFragmentListBean

/**
 * Created by zhgq on 2020/3/16
 * Describe：
 */
class TabFragmentAdapter(datas:MutableList<TabFragmentListBean>) : BaseQuickAdapter<TabFragmentListBean, BaseViewHolder>(
    R.layout.tab_fragment_item,datas) {


    override fun convert(helper: BaseViewHolder, item: TabFragmentListBean) {


    }
}