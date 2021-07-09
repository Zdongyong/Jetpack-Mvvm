package com.zs.zs_jetpack.common

import androidx.recyclerview.widget.DiffUtil
import com.zs.base_wa_lib.article.ArticleListBean

/**
 * des diff扩展函数
 * @author zs
 * @date 2020/9/10
 */


/**
 * 默认diff，item数据不可能改变
 */
fun<T> getDefaultDiff(): DiffUtil.ItemCallback<T> {
    return object : DiffUtil.ItemCallback<T>() {
        override fun areItemsTheSame(
            oldItem: T,
            newItem: T
        ): Boolean {
            //判断是否为同一个对象，不是直接触发刷新
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem:T,
            newItem: T
        ): Boolean {
            //同一个对象的数据不可能改变
            return true
        }

    }
}