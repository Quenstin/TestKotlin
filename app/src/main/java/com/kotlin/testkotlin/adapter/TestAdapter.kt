package com.kotlin.testkotlin.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.bean.HomeFragmentGridBean

/**
 * Created by zhgq on 2020/3/14
 * Describe：
 */
class TestAdapter(data: List<HomeFragmentGridBean?>?) : BaseQuickAdapter<HomeFragmentGridBean?, BaseViewHolder>(
        R.layout.mian_fragment_grid_item,
    data as MutableList<HomeFragmentGridBean?>?
    ) {
    override fun convert(baseViewHolder: BaseViewHolder, homeFragmentGridBean: HomeFragmentGridBean?) {

    }
}