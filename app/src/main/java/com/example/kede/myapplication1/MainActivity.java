package com.example.kede.myapplication1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    String mGameState;

    public static final String EXTRA_MESSAGE = "com.kede.myapplication1.MESSAGE";
    public static final String GAME_STATE_KEY = "gameState";

    //1. 必须实现 在系统创建activity时触发 初始化activity必须部分
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mGameState = savedInstanceState.getString(GAME_STATE_KEY);
            System.out.println("Test ------> " + mGameState);
        }

        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);

        // 执行在activity整个周期中只发生一次的基础创建
        // savedInstanceState 包含之前保存的状态，刚初始化时为null 这里说了只会执行一次，拿这个savedInstanceState干什么用

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

    // 4。 触发场景 点了返回按钮，不应该在这个方法里处理数据和状态操作
    @Override
    protected void onPause() {
        super.onPause();

    }

    // pause ==> stop 需要一段时间
    // 不再显示时触发  马上要销毁、开启一个新的activity，一个paused状态的activity即将进入resume状态并将覆盖一个要暂停activity上
    @Override
    protected void onStop() {
        super.onStop();
    }

    // 由stoped状态activity将要重启时调用 恢复之前暂停时存储的状态
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    // activity被销毁 --》保证这个activity所占用的资源或线程被销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    // 只有当有一个已存在的instance时才会被触发，在onCreat()执行结束之后开始执行
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        mTextView.setText(savedInstanceState.getString(GAME_STATE_KEY));
    }

    // Activity被突然销毁时，调用这个方法，保存对象状态
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(GAME_STATE_KEY, mTextView.getText().toString());
        super.onSaveInstanceState(outState);
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