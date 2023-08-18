package com;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.vito.teaapp.R;

import code.core.MainActivity;

//启动页方式1
public class SpActivity extends MainActivity {

    private static final String TAG = SpActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * custom your layout here, return 0 to use default
     */
    @Override
    public int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @Override
    public void onShowVestGame() {
        Log.d(TAG, "进入A面回调");
        //这里写自己的A面代码
        Intent intent = new Intent(getBaseContext(), SlotsCasinoWeb.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onShowOfficialGame() {
        Log.d(TAG, "进入B面回调，sdk自动处理，不需要写任何代码");
    }
}
