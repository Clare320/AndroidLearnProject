package com.example.kede.myapplication1

import android.app.Activity
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kede.myapplication1.User;

class TestBindingDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_binding_data)

//        val binding: ActivityTestBindingDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_test_binding_data)
//        val user = User()
//        user.firstName = "Clare320"
//        user.lastName = "Li"
//        binding.user = user
    }
}
