package com.example.kede.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_test_basic_control.*


class TestBasicControlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_basic_control)

        var builder: StringBuilder = StringBuilder()
        for (i in 0..20) {
           builder.append("好友$i,")
        }

        likeTextView.setText(builder.toString())

        val likeUsers = builder.substring(0, builder.length - 1).toString()
        likeTextView.setMovementMethod(LinkMovementMethod.getInstance())

    }

    private fun addClickPart(str: String) : SpannableStringBuilder {
        var builder: SpannableStringBuilder = SpannableStringBuilder(SpannableString("👍"))

        builder.append(str)

        val likers: List<String> = str.split(",")

        for (i in likers) {
//            val
        }


        return builder
    }
}
