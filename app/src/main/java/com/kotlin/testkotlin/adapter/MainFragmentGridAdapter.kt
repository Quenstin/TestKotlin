package com.kotlin.testkotlin.adapter

import android.content.Context
import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.kotlin.testkotlin.R
import com.kotlin.testkotlin.bean.HomeFragmentGridBean

/**
 * Created by zhgq on 2020/3/14
 * Describe：
 */
class MainFragmentGridAdapter(data: MutableList<HomeFragmentGridBean>) : BaseQuickAdapter<HomeFragmentGridBean,BaseViewHolder>(
    R.layout.mian_fragment_grid_item,data) {

    override fun convert(helper: BaseViewHolder, item: HomeFragmentGridBean) {
        helper.getView<TextView>(R.id.aaaaa).text=item.title

    }
}