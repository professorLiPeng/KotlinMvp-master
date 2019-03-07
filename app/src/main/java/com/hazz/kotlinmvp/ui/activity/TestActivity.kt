package com.hazz.kotlinmvp.ui.activity

import android.view.View
import com.hazz.kotlinmvp.R
import com.hazz.kotlinmvp.base.BaseActivity

/**
 * Author: LP
 * Time: 2019/3/7 16:06
 * Description:This is TestActivity
 */
class TestActivity : BaseActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when {
            v?.id == R.id.bt_test -> {
                str()
                maxOf(1, 2)

            }
        }
    }

    override fun layoutId(): Int {
        return R.layout.activity_test
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //字符串模板
    private fun str() {
        var a = 1
        // 模板中的简单名称：
        val s1 = "a is $a"

        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"
    }

    //条件表达式
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
//fun maxOf(a: Int, b: Int) = if (a > b) a else b


    //Kotlin 双冒号 :: 使用
    fun main() {
        foo1(this::bar1)
    }

    fun foo1(body: () -> Unit) {
        body()
    }

    fun bar1() {
        print("bar1")
    }

    fun parseInt(str: String): Int? {
        return null
    }
}