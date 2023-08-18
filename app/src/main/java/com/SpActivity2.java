package com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.vito.teaapp.R;

import code.sdk.VestInspectCallback;
import code.sdk.VestSDK;

//启动页方式2
public class SpActivity2 extends Activity {

    private static final String TAG = SpActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        VestSDK.getInstance().inspect(this, new VestInspectCallback() {
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
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        VestSDK.getInstance().onDestroy();
    }

}
