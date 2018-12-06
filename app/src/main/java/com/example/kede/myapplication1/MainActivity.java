package com.example.kede.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.kede.myapplication1.MESSAGE";

    //1. 必须实现 在系统创建activity时触发 初始化activity必须部分
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //2. 将要显示给用户 包含了变为活跃之前最终准备
    @Override
    protected void onStart() {
        super.onStart();
    }

    //3. 仅在用户交互之前调用 此时界面已经显示在屏幕最上面 在这个方法里面处理大多数功能逻辑
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // 点击发送操作
        System.out.println("点击了 发送按钮");

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

// Intent