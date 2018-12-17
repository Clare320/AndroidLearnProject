package com.example.kede.myapplication1

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test_linear_layout.*

class TestLinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_linear_layout)
    }

    public fun onClickCancelButton(view: View) {
        val msg = "WuWu, Cancel";
        this.showToast(msg);
        textView5.setText(msg)
    }

    public fun onClickLoginButton(view: View) {
        val msg = "HaHa, Login";
        textView5.setText(msg);
        this.showToast("HaHa, Login");
    }

    public fun onClickConstraintAnimationButton(view: View) {
      //TODO: 约束动画 keyframe animation 没玩转， 莫名其妙崩溃
    }

    private fun showToast(msg: String) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        // 设置显示位置
        toast.setGravity(Gravity.CENTER, 0, -100);
        // 设置显示字体颜色
        var textView = toast.view.findViewById<TextView>(android.R.id.message);
        textView.setTextColor(Color.BLACK);
        toast.show();
    }
}


/**
 * alt + enter 自动导包
 * */

/**
 *  LinearLayout中子空间的layout_weight设置时依据当前View的layout_width设置，当其设置为0dp(match-contraints)时直接显示效果比例设置即可
 *  当layout_width设置为wrap_content时 layout_weight设置为 （总的布局分割比例和 - 此视图应占的比例数）
 * */

/**
 *  constrain to a barrier --> 没搞明白
 *
 *  Match Contstraints 比 Wrap Content更精细一点，两者都是根据内容来决定，但是前者可以通过设置参数让view显示小于实际内容所需要的。
 *
 *  多用Chains
 * */